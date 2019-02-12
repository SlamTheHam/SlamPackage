package com.slamtheham.slampackage.utils;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemBuilder {
	private ItemStack is;

	public ItemBuilder(Material m) {
		this(m, 1);
	}

	public ItemBuilder(ItemStack is) {
		this.is = is;
	}

	public ItemBuilder(Material m, int amount) {
		is = new ItemStack(m, amount);
	}

	public ItemBuilder(Material m, int amount, byte durability) {
		is = new ItemStack(m, amount, durability);
	}

	public ItemBuilder setDurability(short dur) {
		is.setDurability(dur);
		return this;
	}

	public ItemBuilder setDisplayName(String name) {
		ItemMeta ism = is.getItemMeta();
		ism.setDisplayName(name);
		is.setItemMeta(ism);
		return this;
	}

	public ItemBuilder addUnsafeEnch(Enchantment ench, int level) {
		is.addUnsafeEnchantment(ench, level);
		return this;
	}

	public ItemBuilder removeEnch(Enchantment ench) {
		is.removeEnchantment(ench);
		return this;
	}

	public ItemBuilder addEnchant(Enchantment ench, int level) {
		ItemMeta im = is.getItemMeta();
		im.addEnchant(ench, level, true);
		is.setItemMeta(im);
		return this;
	}

	public ItemBuilder setLore1(List<String> lore) {
		ItemMeta im = is.getItemMeta();
		im.setLore(lore);
		is.setItemMeta(im);
		return this;
	}

	
	public ItemBuilder removeLoreLine(int index){
	     ItemMeta im = is.getItemMeta();
	     List<String> lore = new ArrayList<>(im.getLore());
	     if(index<0||index>lore.size())return this;
	     lore.remove(index);
	     im.setLore(lore);
	     is.setItemMeta(im);
	     return this;
	   }
	public ItemBuilder addLoreLine(String line){
	     ItemMeta im = is.getItemMeta();
	     List<String> lore = new ArrayList<>();
	     if(im.hasLore())lore = new ArrayList<>(im.getLore());
	     lore.add(line);
	     im.setLore(lore);
	     is.setItemMeta(im);
	     return this;
	   }
	public ItemBuilder setLoreLine(String line, int pos) {
		List<String> lore = new ArrayList<String>();
		lore.set(pos, line);
		ItemMeta ism = is.getItemMeta();
		ism.setLore(lore);
		is.setItemMeta(ism);
		return this;
	}
	
	public ItemStack toItemStack() {
		return is;
	}
}
