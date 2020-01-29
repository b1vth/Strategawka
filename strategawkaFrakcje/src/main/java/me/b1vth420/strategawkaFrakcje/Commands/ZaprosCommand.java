package me.b1vth420.strategawkaFrakcje.Commands;

import me.b1vth420.strategawkaApi.Commands.Command;
import me.b1vth420.strategawkaApi.Utils.ChatUtil;
import me.b1vth420.strategawkaFrakcje.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class ZaprosCommand extends Command {
    public ZaprosCommand() {
        super("zapros", "Zapraszanie do frakcji", "strategawka.zapros", "/zapros <nick>", true, 1, new String[0]);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player p  = (Player) sender;
        Player invited = Bukkit.getPlayer(args[0]);

        if(invited == null) {
            p.sendMessage(ChatUtil.chat("&4Blad! &cNa serwerze nie ma takiego gracza!"));
            return;
        }

        PermissionUser pu = PermissionsEx.getUser(p);
        Main.getInvitedPlayers().put(invited, pu.getGroupNames()[0]);
    }
}
