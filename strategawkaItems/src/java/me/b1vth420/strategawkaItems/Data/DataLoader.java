package me.b1vth420.strategawkaItems.Data;

import me.b1vth420.strategawkaApi.Utils.ChatUtil;
import me.b1vth420.strategawkaApi.Utils.ItemUtil;
import me.b1vth420.strategawkaItems.Main;
import me.b1vth420.strategawkaItems.Managers.InventoryManager;
import me.b1vth420.strategawkaItems.Managers.ItemManager;
import me.b1vth420.strategawkaItems.Objects.Item;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class DataLoader {

    public static void loadItems() {
        Map<Integer, Map.Entry<Enchantment, ItemStack>> enchantmentMap = new HashMap<>();

        final ConfigurationSection cs = Main.getInst().getConfig().getConfigurationSection("items");
        for (final String s : cs.getKeys(false)) {
            final ConfigurationSection cs1 = cs.getConfigurationSection(s);
            List<String> lore = new ArrayList<>();
            for(String sx : cs1.getStringList("lore")) {
                lore.add(ChatUtil.chat(sx));
            }

            final ConfigurationSection cs2 = cs1.getConfigurationSection("upgrades");

            if(cs2 != null) {
                for (final String sxx : cs2.getKeys(false)) {
                    final ConfigurationSection cs3 = cs2.getConfigurationSection(sxx);

                    for (String sx : cs3.getStringList("enchant")) {
                        System.out.println(sx);
                    }
                    for (String sx : cs3.getStringList("items")) {
                        System.out.println(sx);
                    }
                }
            }

            new Item(cs1.getString("name"), cs1.getString("time"), Material.matchMaterial(cs1.getString("item").toUpperCase()), cs1.getStringList("enchant"), lore, cs1.getStringList("items"));
        }
    }
    public static void createInventories()  {
        int inventories = (ItemManager.getItems().size()/27)+1;
        Collection<Item> items = ItemManager.getItems().values();

        for(int i = 0; i<inventories; i++) {
            Inventory inv = Bukkit.createInventory(null, 27, ChatUtil.chat("&aCraftingi " + (InventoryManager.getInventories().size() + 1)));
            inv.setItem(inv.getSize()-1, ItemUtil.BuildItem(Material.GREEN_WOOL, ChatUtil.chat("&aDalej")));
            inv.setItem(inv.getSize()-9, ItemUtil.BuildItem(Material.RED_WOOL, ChatUtil.chat("&cWroc")));

            List<Item> toRemove = new ArrayList<>();

            int ix = 0;
            for(Item item : ItemManager.getItems().values()) {
                if(ix < 25) {
                    inv.addItem(item.getIs());
                    toRemove.add(item);
                    ix++;
                }
            }
            for(Item item : toRemove) items.remove(item);
            toRemove.clear();
            InventoryManager.addInventory(inv);
        }
    }
}
