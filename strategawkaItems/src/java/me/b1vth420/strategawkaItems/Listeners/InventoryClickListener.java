package me.b1vth420.strategawkaItems.Listeners;

import me.b1vth420.strategawkaApi.Utils.ChatUtil;
import me.b1vth420.strategawkaApi.Utils.DataUtil;
import me.b1vth420.strategawkaApi.Utils.ItemUtil;
import me.b1vth420.strategawkaItems.Data.MySQL;
import me.b1vth420.strategawkaItems.Managers.InventoryManager;
import me.b1vth420.strategawkaItems.Managers.ItemManager;
import me.b1vth420.strategawkaItems.Managers.UserManager;
import me.b1vth420.strategawkaItems.Objects.Item;
import me.b1vth420.strategawkaItems.Objects.User;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if(e.getCurrentItem() == null) return;

        if(e.getView().getTitle().contains(ChatUtil.chat("&aCraftingi"))) {

            e.setCancelled(true);

            if (ItemUtil.checkItem(e.getCurrentItem(), ItemUtil.BuildItem(Material.RED_WOOL, ChatUtil.chat("&cWroc"))))
                if (InventoryManager.getInventories().indexOf(e.getInventory()) - 1 >= 0)
                    p.openInventory(InventoryManager.getInventories().get(InventoryManager.getInventories().indexOf(e.getInventory()) - 1));

            if (ItemUtil.checkItem(e.getCurrentItem(), ItemUtil.BuildItem(Material.GREEN_WOOL, ChatUtil.chat("&aDalej"))))
                if (InventoryManager.getInventories().indexOf(e.getInventory()) +1 < InventoryManager.getInventories().size())
                    p.openInventory(InventoryManager.getInventories().get(InventoryManager.getInventories().indexOf(e.getInventory()) + 1));

            Item i = ItemManager.getItem(e.getCurrentItem().getItemMeta().getDisplayName());

            if(i == null) return;

            for(String s : i.getItemsNeeded()) {
                String[] ss = s.split(" ");
                ItemStack is = new ItemStack(Material.getMaterial(ss[0].toUpperCase()), Integer.parseInt(ss[1]), Short.parseShort(ss[2]));
                if(!p.getInventory().containsAtLeast(is, Integer.parseInt(ss[1]))) {
                    p.closeInventory();
                    p.sendMessage(ChatUtil.chat("&4Blad! &cNie masz odpowiecnich itemów!"));
                    return;
                }
            }

            User u = UserManager.getUser(p.getUniqueId());
            if(u == null) u = new User(p);

            if(!u.canCraft(i)) {
                p.sendMessage(ChatUtil.chat("&4Blad! &cNastepny raz ten item mozesz zcraftowac " + DataUtil.getDate(u.getItemTimeHashMap().get(i))));
                return;
            }

            for (String s : i.getItemsNeeded()) {
                String[] ss = s.split(" ");
                ItemStack is = new ItemStack(Material.getMaterial(ss[0].toUpperCase()), Integer.parseInt(ss[1]), Short.parseShort(ss[2]));
                p.getInventory().removeItem(is);
            }

            u.addTime(i, i.getTime());
            MySQL.saveData(u);


            p.getInventory().addItem(i.getIs());
            p.sendMessage(ChatUtil.chat("&aUdalo ci sie zcraftowac nowy item!"));
            p.sendMessage(ChatUtil.chat("&4Blad! &cNastepny raz ten item mozesz zcraftowac " + DataUtil.getDate(u.getItemTimeHashMap().get(i))));
        }
    }
}
