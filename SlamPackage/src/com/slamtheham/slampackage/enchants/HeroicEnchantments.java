package com.slamtheham.slampackage.enchants;

import java.util.HashMap;
import java.util.List;

import com.slamtheham.slampackage.utils.Utils;

public enum HeroicEnchantments {
	MASTER_INQUISITIVE("Master_Inquisitive", EnchantmentType.SWORD, "Massively increases EXP drops from mobs. Requires Inquisitive IV enchant on item to apply. Cannot be black-scrolled.", "Heroic"),
	GODLY_OVERLOAD("Godly_Overload", EnchantmentType.ARMOR, "A very large permanent increase in hearts. Requires Overload III enchant on item to apply. Cannot be black-scrolled.", "Heroic"),
	PLANETARY_DEATHRBINGER("Planetary_Deathbringer", EnchantmentType.ARMOR, "An increased chance to deal 2.5x damage. Requires Deathbringer III enchant on item to apply. Cannot be black-scrolled.", "Heroic"),
	DIVINE_ENLIGHTENED("Divine_Enlightened", EnchantmentType.ARMOR, "High chance of healing lots of HP while taking damage. Requires Enlighted III enchant on item to apply. Cannot be black-scrolled.", "Heroic");
	
	
	String Name;
	EnchantmentType Type;
	String Desc;
	String Level;
	private static HashMap<HeroicEnchantments, String> customNames = new HashMap<HeroicEnchantments, String>();
	private static HashMap<HeroicEnchantments, String> bookColors = new HashMap<HeroicEnchantments, String>();
	private static HashMap<HeroicEnchantments, String> enchantColors = new HashMap<HeroicEnchantments, String>();
	private static HashMap<HeroicEnchantments, Boolean> active = new HashMap<HeroicEnchantments, Boolean>();
	private static HashMap<HeroicEnchantments, List<String>> enchantDesc = new HashMap<HeroicEnchantments, List<String>>();
	
	private HeroicEnchantments(String name, EnchantmentType type, String desc, String level) {
		Name = name;
		Type = type;
		Desc = desc;
		Level = level;
	}
	public String getName() {
		return Name;
	}
	/**
	 * 
	 * @return The description of the enchantment.
	 */
	public String getDesc() {
		return Desc;
	}
	/**
	 *
	 * @return The custom name in the Enchantment.yml.
	 */
	public String getCustomName() {
		return customNames.get(this);
	}

	/**
	 *
	 * @return The description of the enchantment in the Enchantments.yml.
	 */
	public List<String> getDescription() {
		return enchantDesc.get(this);
	}

	/**
	 *
	 * @return Return the color that goes on the Enchantment Book.
	 */
	public String getBookColor() {
		
		return Utils.cc(bookColors.get(this));
	}

	/**
	 *
	 * @return Returns the color that goes on the Enchanted Item.
	 */
	public String getEnchantmentColor() {
		return Utils.cc(enchantColors.get(this));
	}

	/**
	 *
	 * @return The type the enchantment is.
	 */
	public EnchantmentType getType() {
		return Type;
	}
	
	
	public String getRarity() {
		return Level;
	}
	
	
	/**
	 *
	 * @return True if the enchantment is enabled and false if not.
	 */
	public Boolean isEnabled() {
		return active.get(this);
	}
}
