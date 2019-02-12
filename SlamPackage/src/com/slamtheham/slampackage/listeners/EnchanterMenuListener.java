package com.slamtheham.slampackage.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.slamtheham.slampackage.enchants.Books;
import com.slamtheham.slampackage.utils.Utils;

public class EnchanterMenuListener implements Listener {

	@EventHandler
	public void inventoryClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getTitle().equalsIgnoreCase(Utils.cc("&6&lEnchanter"))) {
			Player player = (Player) e.getWhoClicked();
			
			if (e.getCursor() != null) {
				e.setCancelled(true);
				
			} if (e.isShiftClick()) {
				e.setCancelled(true);
			
			} else if (e.isShiftClick() && e.getRawSlot() >= e.getInventory().getSize()) {
				e.setCancelled(true);
				
			}
			if (e.getSlot() == 2) {
				if (player.getLevel() >= 10) {
					player.getInventory().addItem(Books.simpleBook);
					e.setCancelled(true);
				} else if (player.getLevel() <= 10) {
					player.sendMessage(Utils.cc("&c&lNot enough levels!"));
					e.setCancelled(true);
				}
			}

			if (e.getSlot() == 3) {
				if (player.getLevel() >= 20) {
					player.getInventory().addItem(Books.uniqueBook);
					e.setCancelled(true);
				} else if (player.getLevel() <= 20) {
					player.sendMessage(Utils.cc("&c&lNot enough levels!"));
					e.setCancelled(true);
				}
			}

			if (e.getSlot() == 4) {
				if (player.getLevel() >= 40) {
					player.getInventory().addItem(Books.eliteBook);
					e.setCancelled(true);

				} else if (player.getLevel() <= 40) {
					player.sendMessage(Utils.cc("&c&lNot enough levels!"));
					e.setCancelled(true);
				}
			}

			if (e.getSlot() == 5) {
				if (player.getLevel() >= 50) {
					player.getInventory().addItem(Books.ultimateBook);
					e.setCancelled(true);
				} else if (player.getLevel() <= 50) {
					player.sendMessage(Utils.cc("&c&lNot enough levels!"));
					e.setCancelled(true);
				}
			}

			if (e.getSlot() == 6) {
				if (player.getLevel() >= 60) {
					player.getInventory().addItem(Books.legendaryBook);
					e.setCancelled(true);
				} else if (player.getLevel() <= 60) {
					player.sendMessage(Utils.cc("&c&lNot enough levels!"));
					e.setCancelled(true);
				}
			} 

		}
	}
}
