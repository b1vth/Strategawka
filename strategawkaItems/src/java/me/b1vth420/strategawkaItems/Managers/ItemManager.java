package me.b1vth420.strategawkaItems.Managers;

import me.b1vth420.strategawkaItems.Objects.Item;

import java.util.concurrent.ConcurrentHashMap;

public class ItemManager {

    private static ConcurrentHashMap<String, Item> items = new ConcurrentHashMap<>();

    public static ConcurrentHashMap<String, Item> getItems() { return new ConcurrentHashMap<>(items); }

    public static void addItem(Item i) {
        if(!items.containsValue(i)) items.put(i.getName(), i);
    }

    public static void removeItem(Item i) {
        if(items.containsValue(i)) items.remove(i);
    }

    public static Item getItem(String name) {
        if(items.containsKey(name)) return items.get(name);
        return null;
    }
}
