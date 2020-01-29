package me.b1vth420.strategawkaItems.Enchantments;

import me.b1vth420.strategawkaApi.Utils.ChatUtil;
import me.b1vth420.strategawkaItems.Main;
import me.b1vth420.strategawkaItems.Utils.VeinMinerUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Set;

public class VeinminerEnchantment extends Enchantment implements Listener {

    public VeinminerEnchantment() {
        super(new NamespacedKey(Main.getInst(), "veinminer"));
    }

    @EventHandler
    public void onMine(BlockBreakEvent e) {
        ItemStack is = e.getPlayer().getInventory().getItemInMainHand();
        ItemMeta im = is.getItemMeta();
        if (!is.hasItemMeta() || is == null || !im.hasLore()) return;
        if (e.getBlock().getType().toString().endsWith("_ORE")) {
            if (im.getLore().contains(ChatUtil.chat("&7Veinminer I"))) {
                Set<Block> blocks = VeinMinerUtil.getConnectedblocks(e.getBlock());
                for (Block b : blocks) {
                    b.breakNaturally();
                }
            }
        }
    }

    @Override
    public String getName() {
        return "Veinminer";
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getStartLevel() {
        return 1;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        return EnchantmentTarget.TOOL;
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
        if(enchantment.getName().equals("Fortune")) return true;
        return false;
    }

    @Override
    public boolean canEnchantItem(ItemStack itemStack) {
        return false;
    }
}
