package me.b1vth420.strategawkaApi.Utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ItemUtil {

    public static void addCustomEnchantedItem(Player p, ItemStack is, Collection<Enchantment> ench, int level) {
        ItemMeta im = is.getItemMeta();
        ArrayList<String> lore = new ArrayList<String>();
        String levelI = "";
        for (int i = 0; i < level; i++) {
            levelI += "I";
        }
        for (Enchantment enchantment : ench) {
            lore.add(ChatUtil.chat("&7") + enchantment.getName() + " " + levelI);
            im.setLore(lore);
            is.setItemMeta(im);
            is.addUnsafeEnchantment(enchantment, level);
        }
            p.getInventory().addItem(is);
    }

    public static boolean checkItem(ItemStack i1, ItemStack i2) {
        if (!i1.getType().equals(i2.getType())) {
            return false;
        }
        if (i1.hasItemMeta() != i2.hasItemMeta()) {
            return false;
        }
        if ((i1.getItemMeta().getDisplayName() == null) || (i2.getItemMeta().getDisplayName() == null)) {
            return false;
        }
        if (!i1.getItemMeta().getDisplayName().equalsIgnoreCase(i2.getItemMeta().getDisplayName())) {
            return false;
        }
        return true;
    }

    public static boolean checkItem2(ItemStack i1, ItemStack i2) {
        if (!i1.getType().equals(i2.getType())) return false;
        if(i1.getDurability() != i2.getDurability()) return false;
        return true;
    }

    public static List<ItemStack> parseItemsFromString(String list){
        List<ItemStack> itemss = new ArrayList<ItemStack>();
            String[] sx = list.split(";");
            for(int i=0; i<sx.length; i++){
                String[] ss = sx[i].toString().split(" ");
                ItemStack is = new ItemStack(Material.getMaterial(ss[0].toUpperCase()), Integer.parseInt(ss[1]), Short.parseShort(ss[2]));
                if(!(ss[3].equalsIgnoreCase("brak"))){
                    ItemMeta im = is.getItemMeta();
                    String ss1 = ss[3].toString();
                    ss1.split("_");
                    im.setDisplayName(ChatUtil.chat(ss1.replace("_", " ")));
                    is.setItemMeta(im);
                }

                for(int ii =4; ii< ss.length; ii++){
                    String s1 = ss[ii].toString();
                    String ss1[] = s1.split(":");
                    is.addUnsafeEnchantment(Enchantment.getByName(ss1[0].toUpperCase()), Integer.parseInt(ss[1]));
                }
                itemss.add(is);
            }
            return itemss;
    }

    public static List<ItemStack> parseItems(List<String> items) {
        List<ItemStack> itemss = new ArrayList<ItemStack>();
        for(String s : items){
            String[] ss = s.split(" ");
            ItemStack is = new ItemStack(Material.getMaterial(ss[0].toUpperCase()), Integer.parseInt(ss[1]), Short.parseShort(ss[2]));
            if(!(ss[3].equalsIgnoreCase("brak"))){
                ItemMeta im = is.getItemMeta();
                String ss1 = ss[3].toString();
                ss1.split("_");
                im.setDisplayName(ChatUtil.chat(ss1.replace("_", " ")));
                is.setItemMeta(im);
            }

            for(int i =4; i< ss.length; i++){
                String s1 = ss[i].toString();
                String ss1[] = s1.split(":");
                is.addUnsafeEnchantment(Enchantment.getByName(ss1[0].toUpperCase()), Integer.parseInt(ss[1]));
            }
            itemss.add(is);
        }
        return itemss;
    }

    public static ItemStack BuildItem(Material m, String name, List<String> lore) {
        ItemStack is = new ItemStack(m);
        ItemMeta meta = is.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        is.setItemMeta(meta);
        return is;
    }

    public static ItemStack BuildItem(Material m, String name) {
        ItemStack is = new ItemStack(m);
        ItemMeta meta = is.getItemMeta();
        meta.setDisplayName(name);
        is.setItemMeta(meta);
        return is;
    }

    public static ItemStack BuildItem(Material m, String name, short s) {
        ItemStack is = new ItemStack(m, 1, s);
        ItemMeta meta = is.getItemMeta();
        meta.setDisplayName(name);
        is.setItemMeta(meta);
        return is;
    }

    public static ItemStack BuildItem(Material m, short s,  String name, List<String> lore) {
        ItemStack is = new ItemStack(m, 1, s);
        ItemMeta meta = is.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        is.setItemMeta(meta);
        return is;
    }
}
