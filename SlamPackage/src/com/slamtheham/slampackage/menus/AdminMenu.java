package com.slamtheham.slampackage.menus;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import com.slamtheham.slampackage.Main;
import com.slamtheham.slampackage.utils.Utils;

public class AdminMenu implements Listener {
	
	
	public void newInventory(Player player) {
		Inventory adminmenup1 = Main.getPlugin().getServer().createInventory(null, 27, Utils.cc("&8Admin Menu - Page 1"));
		
		ItemStack blackPane = new ItemStack(Material.STAINED_GLASS_PANE, 1,(byte) 15);
		
		adminmenup1.setItem(0, blackPane);
		adminmenup1.setItem(1, blackPane);
		adminmenup1.setItem(2, blackPane);
		adminmenup1.setItem(3, blackPane);
		adminmenup1.setItem(4, blackPane);
		adminmenup1.setItem(5, blackPane);
		adminmenup1.setItem(6, blackPane);
		adminmenup1.setItem(7, blackPane);
		adminmenup1.setItem(8, blackPane);
		adminmenup1.setItem(9, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 4));
		adminmenup1.setItem(17, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 4));
		adminmenup1.setItem(18, blackPane);
		adminmenup1.setItem(19, blackPane);
		adminmenup1.setItem(20, blackPane);
		adminmenup1.setItem(21, new ItemStack(Material.ARROW));
		adminmenup1.setItem(22, new ItemStack(Material.BARRIER));
		adminmenup1.setItem(23, new ItemStack(Material.ARROW));
		adminmenup1.setItem(24, blackPane);
		adminmenup1.setItem(25, blackPane);
		adminmenup1.setItem(26, blackPane);
		
		
		
		
		
	}
	
	
}