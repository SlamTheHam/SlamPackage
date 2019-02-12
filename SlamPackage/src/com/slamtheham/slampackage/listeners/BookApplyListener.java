package com.slamtheham.slampackage.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import com.slamtheham.slampackage.utils.Utils;

public class BookApplyListener implements Listener {
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player player = (Player) e.getWhoClicked();
		if (e.getAction() == InventoryAction.SWAP_WITH_CURSOR) {
			Player clicker = (Player) e.getWhoClicked();
			if (e.getCursor().getItemMeta().hasLore() == true && e.getCursor().getItemMeta().getLore().contains(Utils.cc("&7Drag and drop onto item to enchant."))) {
				clicker.sendMessage("Test!");
				e.getCursor().setType(Material.AIR);
				clicker.updateInventory();
			}
		}
	}
}
