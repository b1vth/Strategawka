package me.b1vth420.strategawkaItems.Managers;

import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;
public class InventoryManager {

    private static List<Inventory> inventories = new ArrayList<>();

    public static List<Inventory> getInventories() { return new ArrayList<>(inventories); }

    public static void addInventory(Inventory i) {
        if(!inventories.contains(i)) inventories.add(i);
    }

    public static void removeInventory(Inventory i) {
        if(inventories.contains(i)) inventories.remove(i);
    }

    public static Inventory getInventory(int i) {
        return inventories.get(i);
    }
}
