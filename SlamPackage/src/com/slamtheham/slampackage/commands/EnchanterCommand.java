package com.slamtheham.slampackage.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import com.slamtheham.slampackage.Main;
import com.slamtheham.slampackage.menus.EnchanterMenu;
import com.slamtheham.slampackage.utils.Utils;

public class EnchanterCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof ConsoleCommandSender) {
			return true;
		}
		
		if (label.equalsIgnoreCase("enchanter")) {
			Player player = (Player) sender;
			player.sendMessage(Utils.cc(" &6&lEnchanter &bopened"));
			player.openInventory(EnchanterMenu.enchanter);
		}
		return true;
		
	}	
}
