package me.b1vth420.strategawkaFrakcje.Commands;

import me.b1vth420.strategawkaApi.Commands.Command;
import me.b1vth420.strategawkaApi.Utils.ChatUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class StworzFrakcjeCommand extends Command {


    public StworzFrakcjeCommand() {
        super("stworzfrakcje", "Tworzenie frakcji", "strategawka.StworzFrakcje", "/stworzfrakcje <nazwa> <nick_wlasciciela> <prefix>", false, 3, new String[]{"sf"});
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        String name = args[0].toLowerCase();
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        Player p = Bukkit.getPlayer(args[1]);

        if(p == null) {
            sender.sendMessage(ChatUtil.chat("&4Blad! &cTakiego gracza nie ma w tym momencie na serwerze"));
            return;
        }

        Bukkit.dispatchCommand(console, "pex group " + name + " create");
        Bukkit.dispatchCommand(console, "pex group " + name + " add strategawka.Crafting");
        Bukkit.dispatchCommand(console, "pex group " + name + " add strategawka.Dodaj");
        Bukkit.dispatchCommand(console, "pex group " + name + " prefix &7[" + args[2] + "&7]");
        Bukkit.dispatchCommand(console, "pex user " + args[1] + " group set " + name);

        sender.sendMessage(ChatUtil.chat("&aStworzyles frakcje " + name));
        p.sendMessage(ChatUtil.chat("&aZostales wlascicielem frakcji " + name));

    }
}
