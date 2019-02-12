package com.slamtheham.slampackage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.slamtheham.slampackage.commands.EnchanterCommand;
import com.slamtheham.slampackage.commands.MainCommand;
import com.slamtheham.slampackage.enchants.Books;
import com.slamtheham.slampackage.enchants.CEnchantments;
import com.slamtheham.slampackage.listeners.BookApplyListener;
import com.slamtheham.slampackage.listeners.BookInteractListener;
import com.slamtheham.slampackage.listeners.EnchanterMenuListener;
import com.slamtheham.slampackage.menus.EnchanterMenu;

public class Main extends JavaPlugin {
	public static SlamPackageLegendary SP = SlamPackageLegendary.getInstance();
	public static Main instance;
	private Plugin plugin;
	public static SettingsManager settings = new SettingsManager();
	EnchanterMenu eCom = new EnchanterMenu();

	ConfigManager cfgm;
	public void onEnable() {
		instance = this;
		loadConfigManager();
		Books.setupBooks();
		getCommand("enchanter").setExecutor(new EnchanterCommand());
		getCommand("slampackage").setExecutor(new MainCommand());
		CEnchantments.load();
		EnchanterMenu.createMenu();
		Bukkit.getServer().getLogger().info(ChatColor.GREEN + "SlamPackage Indev-v8.21.2018-0.01" + ChatColor.YELLOW + "has been " + ChatColor.GREEN + "" + ChatColor.BOLD + "ENABLED" + ChatColor.YELLOW + "!");
		cfgm.setup();
		Bukkit.getServer().getPluginManager().registerEvents(new BookApplyListener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new BookInteractListener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new EnchanterMenuListener(), this);
		
		
	}
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info(ChatColor.GREEN + "SlamPackage Indev-v8.21.2018-0.01" + ChatColor.YELLOW + "has been " + ChatColor.RED + "" + ChatColor.BOLD + "DISABLED" + ChatColor.YELLOW + "!");
	}
	public void loadConfigManager() {
		cfgm = new ConfigManager();
		cfgm.setup();
		settings.setup(instance);
	}
	public static Main getPlugin(){
		   return instance;
	
	}
	
}
