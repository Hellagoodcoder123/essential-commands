
package net.mcreator.essentialcommands.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.essentialcommands.procedures.AdminPickaxeLivingEntityIsHitWithToolProcedure;

public class AdminPickaxeItem extends PickaxeItem {
	public AdminPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 100138;
			}

			public float getSpeed() {
				return 50f;
			}

			public float getAttackDamageBonus() {
				return 111109f;
			}

			public int getLevel() {
				return 20;
			}

			public int getEnchantmentValue() {
				return 50;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.COMMAND_BLOCK), new ItemStack(Blocks.REPEATING_COMMAND_BLOCK),
						new ItemStack(Blocks.CHAIN_COMMAND_BLOCK), new ItemStack(Items.COMMAND_BLOCK_MINECART), new ItemStack(Blocks.BARRIER),
						new ItemStack(Items.DEBUG_STICK));
			}
		}, 1, 96f, new Item.Properties().tab(null).fireResistant());
		setRegistryName("admin_pickaxe");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		AdminPickaxeLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}

	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
