package com.slamtheham.slampackage.enchants;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.slamtheham.slampackage.utils.Utils;

public class Books {
	public static ItemStack simpleBook = new ItemStack(Material.BOOK);
	public static ItemStack uniqueBook = new ItemStack(Material.BOOK);
	public static ItemStack eliteBook = new ItemStack(Material.BOOK);
	public static ItemStack ultimateBook = new ItemStack(Material.BOOK);
	public static ItemStack legendaryBook = new ItemStack(Material.BOOK);

	public static List<String> lore1 = new ArrayList<String>();
	public static List<String> lore2 = new ArrayList<String>();
	public static List<String> lore3 = new ArrayList<String>();
	public static List<String> lore4 = new ArrayList<String>();
	public static List<String> lore5 = new ArrayList<String>();
	
	public static ItemMeta sm = simpleBook.getItemMeta();
	public static ItemMeta um = uniqueBook.getItemMeta();
	public static ItemMeta em = eliteBook.getItemMeta();
	public static ItemMeta ultm = ultimateBook.getItemMeta();
	public static ItemMeta lm = legendaryBook.getItemMeta();

	public static void setupBooks() {
		sm.setDisplayName(Utils.cc("&f&lSimple Enchantment Book &7(Right Click)"));
		um.setDisplayName(Utils.cc("&a&lUnique Enchantment Book &7(Right Click)"));
		em.setDisplayName(Utils.cc("&b&lElite Enchantment Book &7(Right Click)"));
		ultm.setDisplayName(Utils.cc("&e&lUltimate Enchantment Book &7(Right Click)"));
		lm.setDisplayName(Utils.cc("&6&lLegendary Enchantment Book &7(Right Click)"));
		
		lore1.add(Utils.cc("&7Examine to recieve a random"));
		lore1.add(Utils.cc("&fsimple&7 enchantment book."));
		
		lore2.add(Utils.cc("&7Examine to recieve a random"));
		lore2.add(Utils.cc("&aunique&7 enchantment book."));
		
		lore3.add(Utils.cc("&7Examine to recieve a random"));
		lore3.add(Utils.cc("&belite&7 enchantment book."));
		
		lore4.add(Utils.cc("&7Examine to recieve a random"));
		lore4.add(Utils.cc("&eultimate&7 enchantment book."));
		
		lore5.add(Utils.cc("&7Examine to recieve a random"));
		lore5.add(Utils.cc("&6legendary&7 enchantment book."));
		
		sm.setLore(lore1);
		um.setLore(lore2);
		em.setLore(lore3);
		ultm.setLore(lore4);
		lm.setLore(lore5);
		
		
		simpleBook.setItemMeta(sm);
		uniqueBook.setItemMeta(um);
		eliteBook.setItemMeta(em);
		ultimateBook.setItemMeta(ultm);
		legendaryBook.setItemMeta(lm);
		
	}
}
