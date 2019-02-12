package com.slamtheham.slampackage.enchants;

import java.util.HashMap;
import java.util.List;

import com.slamtheham.slampackage.utils.Utils;

public enum LegendaryEnchantments {

	    BLOOD_LUST("Blood_Lust", EnchantmentType.CHESTPLATE, "A chance to heal you whenever an enemy player \n within 7x7 blocks is damaged by the Bleed enchantment.", "Legendary"),
	    SILENCE("Silence", EnchantmentType.BOW,"Chance to stop activation of your enemy's custom enchants.", "Legendary"),
	    DEATH_GOD("Death_God", EnchantmentType.HELMET, "Attacks that bring your HP to (level+4) hearts or lower have a chance to heal you for (level+5) hearts instead.", "Legendary"),
	    DOUBLE_STRIKE("Double_Strike", EnchantmentType.SWORD, "A chance to attack twice in one swing. All your enchantments can re-proc on this second attack, and it occurs instantly.", "Legendary"),
		LIFESTEAL("Life_Steal", EnchantmentType.SWORD, "A chance to regain health when attacking.", "Legendary"),
		INVERSION("Inversion", EnchantmentType.SWORD, "Damage dealt to you has a % chance to be blocked and heal you for 1-3 HP instead.", "Legendary"),
		ENLIGHTENED("Enlightened", EnchantmentType.ARMOR, "Can heal hearts while taking damage.", "Legendary"),
		BARBARIAN("Barbarian", EnchantmentType.AXE, "Multiplies damage against players who are wielding an AXE at the time they are hit.", "Legendary");
		String Name;
		EnchantmentType Type;
		String Desc;
		String Level;
		private static HashMap<LegendaryEnchantments, String> customNames = new HashMap<LegendaryEnchantments, String>();
		private static HashMap<LegendaryEnchantments, String> bookColors = new HashMap<LegendaryEnchantments, String>();
		private static HashMap<LegendaryEnchantments, String> enchantColors = new HashMap<LegendaryEnchantments, String>();
		private static HashMap<LegendaryEnchantments, Boolean> active = new HashMap<LegendaryEnchantments, Boolean>();
		private static HashMap<LegendaryEnchantments, List<String>> enchantDesc = new HashMap<LegendaryEnchantments, List<String>>();
		
		private LegendaryEnchantments(String name, EnchantmentType type, String desc, String level) {
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
