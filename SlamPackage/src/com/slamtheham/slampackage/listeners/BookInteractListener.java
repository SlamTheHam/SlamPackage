package com.slamtheham.slampackage.listeners;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.slamtheham.slampackage.SlamPackageLegendary;
import com.slamtheham.slampackage.enchants.CEnchantments;
import com.slamtheham.slampackage.enchants.EnchantedBook;
import com.slamtheham.slampackage.utils.Utils;

public class BookInteractListener implements Listener {
	CEnchantments CE;

	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		ItemStack hand = e.getPlayer().getItemInHand();
		Random rand = new Random();
		
		if (e.getAction() == Action.RIGHT_CLICK_AIR && hand.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.cc("&f&lSimple Enchantment Book &7(Right Click)"))) {
			
			
			
			ItemStack eb = new EnchantedBook(SlamPackageLegendary.getEnchantments().get(rand.nextInt(CEnchantments.values().length)), rand.nextInt(3)).buildBook();
			
			
			player.getInventory().getItem(player.getInventory().getHeldItemSlot()).setAmount(hand.getAmount() - 1);
			player.getInventory().addItem(eb);
			
			player.updateInventory();

		} else {
			
		}
	}

}
