package me.b1vth420.strategawkaFrakcje;

import me.b1vth420.strategawkaApi.Api;
import me.b1vth420.strategawkaApi.Utils.RegisterUtil;
import me.b1vth420.strategawkaFrakcje.Commands.DolaczCommand;
import me.b1vth420.strategawkaFrakcje.Commands.StworzFrakcjeCommand;
import me.b1vth420.strategawkaFrakcje.Commands.ZaprosCommand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public final class Main extends JavaPlugin {

    private static Map<Player, String> invidedPlayers;

    @Override
    public void onEnable() {
        init();
        registerCommands();

    }

    @Override
    public void onDisable() {

    }

    private void init() {
        invidedPlayers = new HashMap<>();
    }

    private void registerCommands() {
        RegisterUtil.registerCommand(new DolaczCommand());
        RegisterUtil.registerCommand(new StworzFrakcjeCommand());
        RegisterUtil.registerCommand(new ZaprosCommand());
    }

    public static Map<Player, String> getInvitedPlayers() {
        return new HashMap<>(invidedPlayers);
    }

    public static void addInvite(Player p, String s) {
        invidedPlayers.put(p, s);
    }

    public static void removeInvite(Player p) {
        if(invidedPlayers.containsKey(p)) getInvitedPlayers().remove(p);
    }
}
