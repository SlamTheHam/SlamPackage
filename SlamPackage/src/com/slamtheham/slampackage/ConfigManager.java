package com.slamtheham.slampackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigManager {
	private Main plugin = Main.getPlugin(Main.class);

	public FileConfiguration playerscfg;
	public File playersfile;
	// --------------------------

	public void setup() {
		if (!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdir();
		}

		playersfile = new File(plugin.getDataFolder(), "config.yml");

		if (!playersfile.exists()) {
			try {
				playersfile.createNewFile();
				Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "The config.yml file has been created");
			} catch (IOException e) {
				Bukkit.getServer().getConsoleSender()
						.sendMessage(ChatColor.RED + "Could not create the config.yml file");
			}
		}
		
		
		playerscfg = YamlConfiguration.loadConfiguration(playersfile);
		
		playerscfg.options().copyDefaults(true);
		savePlayers();
		plugin.saveResource("config.yml", true);
	}

	public FileConfiguration getPlayers() {
		return playerscfg;
	}

	public void savePlayers() {
		try {
			playerscfg.save(playersfile);
			Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "The config.yml file has been saved");

		} catch (IOException e) {
			Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Could not save the config.yml file");
		}
	}

	public void reloadPlayers() {
		playerscfg = YamlConfiguration.loadConfiguration(playersfile);
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "The config.yml file has been reloaded");

	}
	public FileConfiguration getConfig() {
		return playerscfg;
	}
}
