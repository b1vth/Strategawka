package me.b1vth420.strategawkaItems;

import me.b1vth420.strategawkaApi.Api;
import me.b1vth420.strategawkaApi.Utils.RegisterUtil;
import me.b1vth420.strategawkaItems.Commands.CraftingCommand;
import me.b1vth420.strategawkaItems.Data.DataLoader;
import me.b1vth420.strategawkaItems.Data.MySQL;
import me.b1vth420.strategawkaItems.Enchantments.RegenerationEnchantment;
import me.b1vth420.strategawkaItems.Enchantments.TreechopperEnchantment;
import me.b1vth420.strategawkaItems.Enchantments.VeinminerEnchantment;
import me.b1vth420.strategawkaItems.Listeners.ArmorListener;
import me.b1vth420.strategawkaItems.Listeners.InventoryClickListener;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

public class Main extends JavaPlugin {

    private static Main inst;
    public static VeinminerEnchantment vein;
    public static TreechopperEnchantment tree;
    public static RegenerationEnchantment regen;
    public static ArrayList<Enchantment> custom_enchants = new ArrayList<>();

    public Main() { inst = this; }

    public void onEnable() {
        vein = new VeinminerEnchantment();
        tree = new TreechopperEnchantment();
        regen = new RegenerationEnchantment();
        registerEnchantment(vein);
        registerEnchantment(tree);
        registerEnchantment(regen);
        init();
        registerCommands();
        registerListeners();
    }

    public void onDisable() {
        try {
            Field keyField = Enchantment.class.getDeclaredField("byKey");

            keyField.setAccessible(true);
            @SuppressWarnings("unchecked")
            HashMap<NamespacedKey, Enchantment> byKey = (HashMap<NamespacedKey, Enchantment>) keyField.get(null);

            for (Enchantment enchantment : custom_enchants){
                if(byKey.containsKey(enchantment.getKey())) {
                    byKey.remove(enchantment.getKey());
                }
            }

            Field nameField = Enchantment.class.getDeclaredField("byName");

            nameField.setAccessible(true);
            @SuppressWarnings("unchecked")
            HashMap<String, Enchantment> byName = (HashMap<String, Enchantment>) nameField.get(null);

            for (Enchantment enchantment : custom_enchants){
                if(byName.containsKey(enchantment.getName())) {
                    byName.remove(enchantment.getName());
                }
            }
        } catch (Exception ignored) { }

    }

    private void init() {
        this.saveDefaultConfig();
        DataLoader.loadItems();
        DataLoader.createInventories();
        MySQL.createTable();
        MySQL.loadData();
    }

    private void registerCommands() {
        RegisterUtil.registerCommand(new CraftingCommand());
    }
    private void registerListeners() {
        Bukkit.getPluginManager().registerEvents(new InventoryClickListener(), this);
        Bukkit.getPluginManager().registerEvents(new ArmorListener(new ArrayList<>()), this);
        Bukkit.getPluginManager().registerEvents(vein, this);
        Bukkit.getPluginManager().registerEvents(tree, this);
        Bukkit.getPluginManager().registerEvents(regen, this);
    }
    private void registerEnchantment(Enchantment enchantment) {
        boolean registered = true;
        try{
            Field f = Enchantment.class.getDeclaredField("acceptingNew");
            f.setAccessible(true);
            f.set(null, true);
            Enchantment.registerEnchantment(enchantment);
        } catch (Exception e) {
            registered = false;
            e.printStackTrace();
        }
        if(registered) {
            custom_enchants.add(enchantment);
        }
    }

    public static Main getInst() {
        if(inst == null) return new Main();
        return inst;
    }
}
