package me.b1vth420.strategawkaItems.Enchantments;

import me.b1vth420.strategawkaApi.Utils.ChatUtil;
import me.b1vth420.strategawkaItems.Listeners.Events.ArmorEquipEvent;
import me.b1vth420.strategawkaItems.Main;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RegenerationEnchantment extends Enchantment implements Listener {

    public RegenerationEnchantment() {
        super(new NamespacedKey(Main.getInst(), "regeneration"));
    }

    @EventHandler
    public void onEquip(ArmorEquipEvent e) {
        ItemStack is = e.getNewArmorPiece();
        ItemMeta im = is.getItemMeta();
        if(is != null && is.hasItemMeta() && im.hasLore()) {
            if(im.getLore().contains(ChatUtil.chat("&7Regeneration I"))) {
                e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 999999, 0));
            } else if(im.getLore().contains(ChatUtil.chat("&7Regeneration II"))) {
                e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 999999, 1));
            } else {
                e.getPlayer().removePotionEffect(PotionEffectType.REGENERATION);
            }
        }
        if(is == null) e.getPlayer().removePotionEffect(PotionEffectType.REGENERATION);
        if(!is.hasItemMeta()) e.getPlayer().removePotionEffect(PotionEffectType.REGENERATION);
        if(!im.hasLore()) e.getPlayer().removePotionEffect(PotionEffectType.REGENERATION);
    }

    @Override
    public String getName() {
        return "Regeneration";
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public int getStartLevel() {
        return 1;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        return EnchantmentTarget.ARMOR;
    }

    @Override
    public boolean isTreasure() {
        return false;
    }

    @Override
    public boolean isCursed() {
        return false;
    }

    @Override
    public boolean conflictsWith(Enchantment enchantment) {
        return false;
    }

    @Override
    public boolean canEnchantItem(ItemStack itemStack) {
        return false;
    }
}
