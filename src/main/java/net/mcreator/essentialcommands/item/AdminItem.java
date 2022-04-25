
package net.mcreator.essentialcommands.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.essentialcommands.procedures.AdminLeggingsTickEventProcedure;
import net.mcreator.essentialcommands.procedures.AdminHelmetTickEventProcedure;
import net.mcreator.essentialcommands.procedures.AdminBootsTickEventProcedure;
import net.mcreator.essentialcommands.procedures.AdminBodyTickEventProcedure;

public abstract class AdminItem extends ArmorItem {
	public AdminItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1024;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1024, 1024, 1024, 1024}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 100;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.fall"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.COMMAND_BLOCK), new ItemStack(Blocks.REPEATING_COMMAND_BLOCK),
						new ItemStack(Blocks.CHAIN_COMMAND_BLOCK), new ItemStack(Items.COMMAND_BLOCK_MINECART), new ItemStack(Blocks.BARRIER),
						new ItemStack(Items.DEBUG_STICK));
			}

			@Override
			public String getName() {
				return "admin";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends AdminItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(null).fireResistant());
			setRegistryName("admin_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "essential_commands:textures/models/armor/admin_armor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			AdminHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends AdminItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(null).fireResistant());
			setRegistryName("admin_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "essential_commands:textures/models/armor/admin_armor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			AdminBodyTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends AdminItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(null).fireResistant());
			setRegistryName("admin_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "essential_commands:textures/models/armor/admin_armor_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			AdminLeggingsTickEventProcedure.execute(entity);
		}
	}

	public static class Boots extends AdminItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(null).fireResistant());
			setRegistryName("admin_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "essential_commands:textures/models/armor/admin_armor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			AdminBootsTickEventProcedure.execute(entity);
		}
	}
}
