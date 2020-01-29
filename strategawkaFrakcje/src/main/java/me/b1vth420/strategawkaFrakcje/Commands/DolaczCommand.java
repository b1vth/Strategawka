package me.b1vth420.strategawkaFrakcje.Commands;

import me.b1vth420.strategawkaApi.Commands.Command;
import me.b1vth420.strategawkaApi.Utils.ChatUtil;
import me.b1vth420.strategawkaFrakcje.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class DolaczCommand extends Command {

    public DolaczCommand() {
        super("dolacz", "Dolaczanie do frakcji", "strategawka.Dolacz", "/dolacz <frakcja>", true, 1, new String[0]);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player p = (Player) sender;


        if(Main.getInvitedPlayers().containsKey(p) && Main.getInvitedPlayers().get(p).equalsIgnoreCase(args[0])) {
            PermissionUser pu = PermissionsEx.getUser(p);
            pu.setGroups(new String[]{args[0].toLowerCase()});
            return;
        }
        p.sendMessage(ChatUtil.chat("&4Blad! &cNie jestes zaproszony do takiej frakcji!"));
    }
}
