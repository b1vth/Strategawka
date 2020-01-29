package me.b1vth420.strategawkaItems.Utils;

import me.b1vth420.strategawkaApi.Utils.ChatUtil;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EnchantUtil {

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
    public static ItemStack addCustomEnchantedItem(ItemStack is, Collection<Enchantment> customEnch, Collection<Enchantment> normal, int level, String name) {
        List<String> lore;
        String levelI = "";
        for (int i = 0; i < level; i++) {
            levelI = ChatUtil.arabic2roman(level);
        }
        for(Enchantment enchantment : normal) {
            ItemMeta im = is.getItemMeta();
            im.addEnchant(enchantment, level, true);
            is.setItemMeta(im);
        }
        for (Enchantment enchantment : customEnch) {
            List<String> lore2 = new ArrayList<>();
            ItemMeta im = is.getItemMeta();
            lore = im.getLore();
            String s = ChatUtil.chat("&7" + enchantment.getName() + " " + levelI);
            lore2.add(s);
            for(String sx : lore) lore2.add(sx);
            im.setLore(lore2);
            is.setItemMeta(im);
            is.addUnsafeEnchantment(enchantment, level);
        }
        return is;
    }
}
