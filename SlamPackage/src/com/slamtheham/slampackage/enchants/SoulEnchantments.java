package com.slamtheham.slampackage.enchants;

import java.util.HashMap;
import java.util.List;

import com.slamtheham.slampackage.utils.Utils;

public enum SoulEnchantments {
	PHOENIX("Phoenix", EnchantmentType.BOOTS,"Passive soul enchantment. An attack that would normally kill you will instead heal you to full HP. \n Can only be activated once every couple minutes.", "Soul"),
	TELEBLOCK("Teleblock", EnchantmentType.BOW, "Active soul enchant. Your bow is enchanted with enderpearl blocking magic, \n damaged players will be unable to use enderpearls for up to 20 seconds, \n and will lose up to 15 enderpearls from their inventory.", "Soul"),
	IMMORTAL("Immortal", EnchantmentType.ARMOR, "Passive soul enchant. Prevents your armor from taking durability damage in exchange for souls.", "Soul"),
	NATURE_WRATH("Natures_Wrath", EnchantmentType.ARMOR, "Passive Soul Enchantment. Temporarily \n freeze all enemies in a massive area around you, \n pushing them back and dealing massive nature damage.", "Soul"),
	PARADOX("Paradox", EnchantmentType.ARMOR, "Passive soul enchantment. Heals all nearby allies \n in a massive area around you for a portion of all damage dealt to you", "Soul"),
	SOUL_TRAP("Soul_Trap", EnchantmentType.AXE, "Active soul enchant. Your axe is imbued with sealing magic, \n and has a chance to disable/negate \n all soul enchantments of  your enemies on hit for (level x 4) seconds.", "Soul");

	String Name;
	EnchantmentType Type;
	String Desc;
	String Level;
	private static HashMap<CEnchantments, String> customNames = new HashMap<CEnchantments, String>();
	private static HashMap<CEnchantments, String> bookColors = new HashMap<CEnchantments, String>();
	private static HashMap<CEnchantments, String> enchantColors = new HashMap<CEnchantments, String>();
	private static HashMap<CEnchantments, Boolean> active = new HashMap<CEnchantments, Boolean>();
	private static HashMap<CEnchantments, List<String>> enchantDesc = new HashMap<CEnchantments, List<String>>();
	
	private SoulEnchantments(String name, EnchantmentType type, String desc, String level) {
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
