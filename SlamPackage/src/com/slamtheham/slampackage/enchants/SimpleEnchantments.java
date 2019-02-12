package com.slamtheham.slampackage.enchants;

import java.util.HashMap;
import java.util.List;

import com.slamtheham.slampackage.utils.Utils;

public enum SimpleEnchantments {
	LIGHTNING("Lightning", EnchantmentType.BOW, "A chance to strike lightning where you strike.", "Simple"),
	TARGET_TRACKING("Target_Tracking", EnchantmentType.BOW, "Automatically /f focus any target you hit.", "Simple"),
	HEALING("Healing", EnchantmentType.BOW, "Heals friendly players hit with arrow shot by this bow. Also has a chance to increase durability of armor and give absorption/health boost.", "Simple"),
	//	----------------Helmets----------------  \\
	
	AQUATIC("Aquatic", EnchantmentType.HELMET, "Gives permanent water breathing.", "Simple"),
	GLOWING("Glowing", EnchantmentType.HELMET, "Gives permanent night vision.", "Simple"),
	//	----------------Swords----------------  \\

	HEADLESS("Headless", EnchantmentType.SWORD, "Victims have a chance of dropping their head on death.", "Simple"),
	INSOMNIA("Insomnia", EnchantmentType.SWORD, "Gives slowness, slow swinging and confusion.", "Simple"),
	THUNDERING_BLOW("Thundering_Blow", EnchantmentType.SWORD, "Can cause smite effect on your enemy.", "Simple"),
	EPICNESS("Epicness", EnchantmentType.SWORD, "Gives particles and sound effects.", "Simple"),
	//	----------------Armor----------------  \\
		//	----------------Axes----------------  \\
	
	CONFUSION("Confusion", EnchantmentType.AXE, "A chance to deal nausea to your victim.", "Simple"),
	DECAPITATION("Decapitation", EnchantmentType.AXE, "Victims have a chance of dropping their head on death.", "Simple"),
	// Weapons
	OBLITERATE("Obliterate", EnchantmentType.WEAPONS, "Extreme knockback.", "Simple"),
	//	----------------PickAxes----------------  \\
	AUTOSMELT("Auto Smelt", EnchantmentType.PICKAXE, "Ores are automatically smelted when mined.", "Simple"),
	//	----------------Tools----------------  \\
	EXPERIENCE("Experience", EnchantmentType.TOOL, "Gives more exp when mining blocks.", "Simple"),
	HASTE("Haste", EnchantmentType.TOOL, "Allows you to swing your tools faster.", "Simple"),
	OXYGENATE("Oxygenate", EnchantmentType.TOOL,"Refills oxygen levels when breaking blocks under water.", "Simple");
	
	String Name;
	EnchantmentType Type;
	String Desc;
	String Level;
	private static HashMap<CEnchantments, String> customNames = new HashMap<CEnchantments, String>();
	private static HashMap<CEnchantments, String> bookColors = new HashMap<CEnchantments, String>();
	private static HashMap<CEnchantments, String> enchantColors = new HashMap<CEnchantments, String>();
	private static HashMap<CEnchantments, Boolean> active = new HashMap<CEnchantments, Boolean>();
	private static HashMap<CEnchantments, List<String>> enchantDesc = new HashMap<CEnchantments, List<String>>();
	
	private SimpleEnchantments(String name, EnchantmentType type, String desc, String level) {
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
