package me.b1vth420.strategawkaItems.Commands;

import me.b1vth420.strategawkaApi.Commands.Command;
import me.b1vth420.strategawkaItems.Managers.InventoryManager;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CraftingCommand extends Command {
    public CraftingCommand() {
        super("crafting", null, "strategawka.Crafting", "/crafting", true, 0, new String[0]);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player p = (Player) sender;
        p.openInventory(InventoryManager.getInventory(0));
    }
}
