package com.slamtheham.slampackage.menus;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.slamtheham.slampackage.utils.Utils;

public class EnchanterMenu {
	
	public static  Inventory enchanter = Bukkit.createInventory(null, 9, Utils.cc("&6&lEnchanter"));	
	public static void createMenu() {
		
		List<String> lore1 = new ArrayList<String>();
		List<String> lore2 = new ArrayList<String>();
		List<String> lore3 = new ArrayList<String>();
		List<String> lore4 = new ArrayList<String>();
		List<String> lore5 = new ArrayList<String>();
		
		
		ItemStack simple = new ItemStack(Material.STAINED_GLASS_PANE, 1 , (byte) 0);
		ItemStack unique = new ItemStack(Material.STAINED_GLASS_PANE, 1 , (byte) 5);
		ItemStack elite = new ItemStack(Material.STAINED_GLASS_PANE, 1 , (byte) 3);
		ItemStack ultimate = new ItemStack(Material.STAINED_GLASS_PANE, 1 , (byte) 4);
		ItemStack legendary = new ItemStack(Material.STAINED_GLASS_PANE, 1 , (byte) 1);
		
		ItemMeta simplemeta = simple.getItemMeta();
		ItemMeta uniquemeta = unique.getItemMeta();
		ItemMeta elitemeta = elite.getItemMeta();
		ItemMeta ultimatemeta = ultimate.getItemMeta();
		ItemMeta legendarymeta = legendary.getItemMeta();
		
		simplemeta.setDisplayName(Utils.cc("&f&lSimple Enchantment Book &7(Right Click)"));
		uniquemeta.setDisplayName(Utils.cc("&a&lUnique Enchantment Book &7(Right Click)"));
		elitemeta.setDisplayName(Utils.cc("&b&lElite Enchantment Book &7(Right Click)"));
		ultimatemeta.setDisplayName(Utils.cc("&e&lUltimate Enchantment Book &7(Right Click)"));
		legendarymeta.setDisplayName(Utils.cc("&6&lLegendary Enchantment Book &7(Right Click)"));
		
		lore1.add(Utils.cc("&7Examine to recive a random"));
		lore1.add(Utils.cc("&fsimple &7enchantment book."));
		lore1.add(Utils.cc(" "));
		lore1.add(Utils.cc("&7Use &f/sp help simple &7to view a list"));
		lore1.add(Utils.cc("&7of possible enchantments you could unlock"));
		lore1.add(Utils.cc(" "));
		lore1.add(Utils.cc("&b&lCOST &f400 EXP"));
		
		lore2.add(Utils.cc("&7Examine to recive a random"));
		lore2.add(Utils.cc("&aunique &7enchantment book."));
		lore2.add(Utils.cc(" "));
		lore2.add(Utils.cc("&7Use &a/sp help unique &7to view a list"));
		lore2.add(Utils.cc("&7of possible enchantments you could unlock"));
		lore2.add(Utils.cc(" "));
		lore2.add(Utils.cc("&b&lCOST &f800 EXP"));
		
		lore3.add(Utils.cc("&7Examine to recive a random"));
		lore3.add(Utils.cc("&belite &7enchantment book."));
		lore3.add(Utils.cc(" "));
		lore3.add(Utils.cc("&7Use &b/sp help elite &7to view a list"));
		lore3.add(Utils.cc("&7of possible enchantments you could unlock"));
		lore3.add(Utils.cc(" "));
		lore3.add(Utils.cc("&b&lCOST &f2,500 EXP"));
		
		lore4.add(Utils.cc("&7Examine to recive a random"));
		lore4.add(Utils.cc("&eultimate &7enchantment book."));
		lore4.add(Utils.cc(" "));
		lore4.add(Utils.cc("&7Use &e/sp help ultimate &7to view a list"));
		lore4.add(Utils.cc("&7of possible enchantments you could unlock"));
		lore4.add(Utils.cc(" "));
		lore4.add(Utils.cc("&b&lCOST &f5,000 EXP"));
		
		lore5.add(Utils.cc("&7Examine to recive a random"));
		lore5.add(Utils.cc("&6&llegendary &7enchantment book."));
		lore5.add(Utils.cc(" "));
		lore5.add(Utils.cc("&7Use &6/sp help legendary &7to view a list"));
		lore5.add(Utils.cc("&7of possible enchantments you could unlock"));
		lore5.add(Utils.cc(" "));
		lore5.add(Utils.cc("&b&lCOST &f25,000 EXP"));
		
		simplemeta.setLore(lore1);
		uniquemeta.setLore(lore2);
		elitemeta.setLore(lore3);
		ultimatemeta.setLore(lore4);
		legendarymeta.setLore(lore5);
		
		simple.setItemMeta(simplemeta);
		unique.setItemMeta(uniquemeta);
		elite.setItemMeta(elitemeta);
		ultimate.setItemMeta(ultimatemeta);
		legendary.setItemMeta(legendarymeta);
		
		enchanter.setItem(2, simple);		
		enchanter.setItem(3, unique);		
		enchanter.setItem(4, elite);		
		enchanter.setItem(5,ultimate);		
		enchanter.setItem(6, legendary);
	}
}














