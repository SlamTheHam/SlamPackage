package com.slamtheham.slampackage.enchants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.slamtheham.slampackage.Main;
import com.slamtheham.slampackage.utils.ItemBuilder;
import com.slamtheham.slampackage.utils.Utils;

public class EnchantedBook<CEnchantments> {
	private CEnchantments enchantment;
	
	private int amount;
	private int power;
	private boolean glowing;
	private int success_rate;
	private int destroy_rate;
	private int Dmax = 100;
	private int Dmin = 0;
	private int Smax = 100;
	private int Smin = 0;
	
	public EnchantedBook(CEnchantments enchantment, Integer power) {
		this.enchantment = enchantment;
		this.amount = 1;
		this.power = power;
	
		this.destroy_rate = percentPick(Dmax, Dmin);
		this.success_rate = percentPick(Smax, Smin);
	}
	
	public CEnchantments getEnchantments() {
		return this.enchantment;
	}
	
	public int getPower() {
		return this.power;
	}
	
	private Integer percentPick(int max, int min) {
		Random i = new Random();
		if(max == min) {
			return max;
		}else {
			return min + i.nextInt(max - min);
		}
	}
	public String convertPower(Integer i) {
		if(i == 0) return "I";
		if(i == 1) return "I";
		if(i == 2) return "II";
		if(i == 3) return "III";
		if(i == 4) return "IV";
		if(i == 5) return "V";
		if(i == 6) return "VI";
		if(i == 7) return "VII";
		if(i == 8) return "VII";
		if(i == 9) return "IX";
		if(i == 10) return "X";
		return i + "";
	}
	public ItemStack buildBook() {
		
		String name = Utils.cc(Main.settings.getEnchs().getString("Enchantments." + enchantment.getName() +  ".BookColor")) + Utils.cc(Main.settings.getEnchs().getString("Enchantments." + enchantment.getName() + ".Color")) + enchantment.getName().replaceAll("_", " ") + " " + convertPower(power);
		List<String> lore = new ArrayList<String>();
		
		
		for(String l : Main.settings.getConfig().getStringList("Settings.EnchantmentBookLore")) {
			if(l.contains("%Description%") || l.contains("%description%")) {
				for(String m : enchantment.getDescription()) {
					lore.add(Utils.cc(m));
				}
			}else {
				lore.add(Utils.cc(l).replaceAll("%Destroy_Rate%", destroy_rate + "").replaceAll("%destroy_rate%", destroy_rate + "").replaceAll("%Success_Rate%", success_rate + "").replaceAll("%success_Rate%", success_rate + ""));
			}
		}
		return new ItemBuilder(Material.BOOK).setDisplayName(name).setLore1(lore).toItemStack();
	}
}
