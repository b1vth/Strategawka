package me.b1vth420.strategawkaItems.Managers;

import me.b1vth420.strategawkaItems.Objects.User;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class UserManager {

    private static ConcurrentHashMap<UUID, User> users = new ConcurrentHashMap<>();

    public static ConcurrentHashMap<UUID, User> getItems() { return new ConcurrentHashMap<>(users); }

    public static void addUser(User u) {
        if(!users.containsValue(u)) users.put(u.getUuid(), u);
    }

    public static void removeUser(User u) {
        if(users.containsValue(u)) users.remove(u);
    }

    public static User getUser(UUID uuid) {
        if(users.containsKey(uuid)) return users.get(uuid);
        return null;
    }
}
