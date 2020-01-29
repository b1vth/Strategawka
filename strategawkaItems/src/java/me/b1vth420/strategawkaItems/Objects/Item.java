package me.b1vth420.strategawkaItems.Objects;

import me.b1vth420.strategawkaApi.Utils.ChatUtil;
import me.b1vth420.strategawkaApi.Utils.ItemUtil;
import me.b1vth420.strategawkaItems.Main;
import me.b1vth420.strategawkaItems.Managers.ItemManager;
import me.b1vth420.strategawkaItems.Utils.EnchantUtil;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import me.b1vth420.strategawkaApi.Utils.Enchantments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Item {

    private String name;
    private ItemStack is;
    private String time;
    private Collection<String> itemsNeeded;
    //private Map<Integer, Map.Entry<Enchantment, ItemStack>> enchantmentMap;

    public Item(String name, String time, Material m, Collection<String> enchantments, Collection<String> lore, Collection<String> neededItems) {
        this.name = ChatUtil.chat(name);
        this.time = time;
        ItemStack is = new ItemStack(m);
        ItemMeta im = is.getItemMeta();
        im.setLore((List<String>) lore);
        im.setDisplayName(ChatUtil.chat(name));
        is.setItemMeta(im);
        for (String s : enchantments) {
            String ss[] = s.split(" ");
            Collection<Enchantment> customEnch = new ArrayList<>();
            Collection<Enchantment> normalEnch = new ArrayList<>();
            for (Enchantment ench : Main.custom_enchants) {
                if (ench.getName().equalsIgnoreCase(ss[0]))
                    customEnch.add(ench);
            }
            for(Map.Entry<String, Enchantment> e : Enchantments.entrySet()) {
                if(e.getKey().equalsIgnoreCase(ss[0]))
                    normalEnch.add(Enchantments.getByName(ss[0]));
            }
            EnchantUtil.addCustomEnchantedItem(is, customEnch, normalEnch, Integer.parseInt(ss[1]), ss[0]);
        }
        this.is = is;
        this.itemsNeeded = neededItems;
        //this.enchantmentMap = enchantmentMap;
        ItemManager.addItem(this);
    }

    public String getName() {
        return name;
    }

    public ItemStack getIs() {
        return is;
    }

    public Collection<String> getItemsNeeded() {
        return itemsNeeded;
    }

    public String getTime() { return time; }
}
