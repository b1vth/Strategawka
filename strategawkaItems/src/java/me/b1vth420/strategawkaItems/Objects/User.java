package me.b1vth420.strategawkaItems.Objects;

import me.b1vth420.strategawkaApi.Utils.DataUtil;
import me.b1vth420.strategawkaItems.Managers.UserManager;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class User {

    private String name;
    private UUID uuid;
    private HashMap<Item, Long> itemTimeHashMap;

    public User(Player p) {
        this.name = p.getName();
        this.uuid = p.getUniqueId();
        this.itemTimeHashMap = new HashMap<>();
        UserManager.addUser(this);
    }

    public User(String name, UUID uuid, HashMap<Item, Long> itemTimeHashMap) {
        this.name = name;
        this.uuid = uuid;
        this.itemTimeHashMap = itemTimeHashMap;
        UserManager.addUser(this);
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public HashMap<Item, Long> getItemTimeHashMap() {
        return itemTimeHashMap;
    }

    public void addTime(Item i, String time) {
        this.itemTimeHashMap.put(i, DataUtil.parseDateDiff(time, true));
    }

    public boolean canCraft(Item i) {
        if(this.itemTimeHashMap.containsKey(i)) {
            if(this.itemTimeHashMap.get(i) != null && this.itemTimeHashMap.get(i) > System.currentTimeMillis()) return false;
                else this.itemTimeHashMap.remove(i);
        }

        return true;
    }
}
