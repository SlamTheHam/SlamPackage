package com.slamtheham.slampackage.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import com.slamtheham.slampackage.utils.Utils;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class MainCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof ConsoleCommandSender) {
			return true;
		}
						
		if (label.equalsIgnoreCase("slampackage")||(label.equalsIgnoreCase("sp"))){
			String permission = "slampackage.admin";
			if (!(sender.hasPermission(permission)));
				sender.sendMessage(Utils.cc(("&eSorry, you do not have the permission &a(" + permission + "&a) &eto use this command.")));
			} else {	
				Player player = (Player) sender;
				sender.sendMessage(Utils.cc(("--------------------------------------------------")));
				sender.sendMessage(Utils.cc(("SLAMPACKAGE - 150+ Epic Custom Enchants ")));
				sender.sendMessage(Utils.cc((" ")));
				sender.sendMessage(Utils.cc(("&eDesign, Ideas and Programming by: &aSlamTheHam")));
				sender.sendMessage(Utils.cc(("--------------------------------------------------")));
				sender.sendMessage(Utils.cc((" - How to use /slampackage properly.")));
				sender.sendMessage(Utils.cc((" ")));
				sender.sendMessage(Utils.cc(("Proper Usage: /slampackage <arg>")));
				sender.sendMessage(Utils.cc(("All possible actions. (Click the text to autofill the command)")));
				TextComponent message = new TextComponent(Utils.cc((ChatColor.GREEN + "/slampackage help" + ChatColor.YELLOW + " - Sends help message")));
				message.setClickEvent( new ClickEvent( ClickEvent.Action.SUGGEST_COMMAND, "/slampackage help" ) );
				message.setHoverEvent( new HoverEvent( HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.cc(("Click to autofill command"))).create() ) );
				player.spigot().sendMessage(message);
				TextComponent message1 = new TextComponent(Utils.cc((ChatColor.GREEN + "/slampackage admin" + ChatColor.YELLOW + " - Opens admin menu")));
				message1.setClickEvent( new ClickEvent( ClickEvent.Action.SUGGEST_COMMAND, "/slampackage admin" ) );
				message1.setHoverEvent( new HoverEvent( HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click to autofill command").create() ) );
				player.spigot().sendMessage(message1);
				TextComponent message2 = new TextComponent(Utils.cc((ChatColor.GREEN + "/slampackage info/information" + ChatColor.YELLOW + " - Sends plugin information message")));
				message2.setClickEvent( new ClickEvent( ClickEvent.Action.SUGGEST_COMMAND, "/slampackage info" ) );
				message2.setHoverEvent( new HoverEvent( HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click to autofill command").create() ) );
				player.spigot().sendMessage(message2);
				TextComponent message3 = new TextComponent(Utils.cc((ChatColor.GREEN + "/slampackage ver/version" + ChatColor.YELLOW + " - Sends version message")));
				message3.setClickEvent( new ClickEvent( ClickEvent.Action.SUGGEST_COMMAND, "/slampackage ver" ) );
				message3.setHoverEvent( new HoverEvent( HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click to autofill command").create() ) );
				player.spigot().sendMessage(message3);
				TextComponent message4 = new TextComponent(Utils.cc((ChatColor.GREEN + "/slampackage reload" + ChatColor.YELLOW + " - Reloads the plugin")));
				message4.setClickEvent( new ClickEvent( ClickEvent.Action.SUGGEST_COMMAND, "/slampackage reload" ) );
				message4.setHoverEvent( new HoverEvent( HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click to autofill command").create() ) );
				player.spigot().sendMessage(message4);
				TextComponent message5 = new TextComponent(Utils.cc((ChatColor.GREEN + "/slampackage update" + ChatColor.YELLOW + " - Updates the plugin if an update is avalible")));
	
				message5.setClickEvent( new ClickEvent( ClickEvent.Action.SUGGEST_COMMAND, "/slampackage update" ) );
				message5.setHoverEvent( new HoverEvent( HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click to autofill command").create() ) );
				player.spigot().sendMessage(message5);
				sender.sendMessage(Utils.cc((ChatColor.GREEN + "" + ChatColor.STRIKETHROUGH + "--------------------------------------------------")));
			return true;

		}
		return true;

	}

}
