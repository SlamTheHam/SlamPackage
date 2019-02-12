package com.slamtheham.slampackage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class SettingsManager {

	static SettingsManager instance = new SettingsManager();

	public static SettingsManager getInstance() {
		return instance;
	}

	Plugin p;

	FileConfiguration config;
	File cfile;

	
	FileConfiguration data;
	File dfile;

	FileConfiguration enchs;
	File efile;

	FileConfiguration msg;
	File mfile;

	FileConfiguration cenchs;
	File cefile;

	

	public void setup(Plugin p) {
		if(!p.getDataFolder().exists()) {
			p.getDataFolder().mkdir();
		}
		cfile = new File(p.getDataFolder(), "config.yml");
		if(!cfile.exists()) {
			try {
				cfile.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		config = YamlConfiguration.loadConfiguration(cfile);


		dfile = new File(p.getDataFolder(), "Data.yml");
		if(!dfile.exists()) {
			try {
				dfile.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		data = YamlConfiguration.loadConfiguration(dfile);

		efile = new File(p.getDataFolder(), "Enchantments.yml");
		if(!efile.exists()) {
			try {
				efile.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		enchs = YamlConfiguration.loadConfiguration(efile);

		mfile = new File(p.getDataFolder(), "Messages.yml");
		if(!mfile.exists()) {
			try {
			mfile.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		msg = YamlConfiguration.loadConfiguration(mfile);

		cefile = new File(p.getDataFolder(), "CustomEnchantments.yml");
		if(!cefile.exists()) {
			try {
				cefile.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		cenchs = YamlConfiguration.loadConfiguration(cefile);

		cenchs.options().copyDefaults(true);
		Main.instance.saveResource("Enchantments.yml", true);
		
	}

	
	public FileConfiguration getData() {
		return data;
	}



	public FileConfiguration getCustomEnchs() {
		return cenchs;
	}

	public FileConfiguration getEnchs() {
		return enchs;
	}

	public FileConfiguration getMessages() {
		return msg;
	}

	public void saveData() {
		try {
			data.save(dfile);
		}catch(IOException e) {
			Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not save Data.yml!");
		}
	}

	

	public void saveEnchs() {
		try {
			enchs.save(efile);
		}catch(IOException e) {
			Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not save Enchantments.yml!");
		}
	}

	

	public void reloadData() {
		data = YamlConfiguration.loadConfiguration(dfile);
	}

	
	

	public void reloadMessages() {
		msg = YamlConfiguration.loadConfiguration(mfile);
	}

	public void reloadCustomEnchs() {
		cenchs = YamlConfiguration.loadConfiguration(cefile);
	}

	public void reloadEnchs() {
		enchs = YamlConfiguration.loadConfiguration(efile);
	}

	public FileConfiguration getConfig() {
		return config;
	}

	public void saveConfig() {
		try {
			config.save(cfile);
		}catch(IOException e) {
			Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not save config.yml!");
		}
	}

	public void reloadConfig() {
		config = YamlConfiguration.loadConfiguration(cfile);
	}

	public PluginDescriptionFile getDesc() {
		return p.getDescription();
	}

	
}