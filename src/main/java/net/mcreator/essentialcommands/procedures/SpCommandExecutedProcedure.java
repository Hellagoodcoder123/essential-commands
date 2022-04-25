package net.mcreator.essentialcommands.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SpCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack mainhandpick = ItemStack.EMPTY;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_PICKAXE) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"give @p netherite_pickaxe{Enchantments:[{id:efficiency,lvl:10},{id:fortune,lvl:10},{id:unbreaking,lvl:255},{id:mending,lvl:1}],Unbreakable:1,HideFlags:127,display:{Name:\"{\\\"text\\\":\\\"\u00A70\u00A7k1\u00A7r\u00A74Super Pickaxe\u00A70\u00A7k1\\\",\\\"italic\\\":\\\"false\\\",\\\"bold\\\":\\\"true\\\"}\",Lore:['{\\\"text\\\":\\\"Forged By The Gods Of Power\\\",\\\"color\\\":\\\"blue\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\"}','{\\\"text\\\":\\\"Efficiency X\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Fortune X\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Unbreaking CCL\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Mending\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}']}}");
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND_PICKAXE) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"give @p diamond_pickaxe{Enchantments:[{id:efficiency,lvl:10},{id:fortune,lvl:10},{id:unbreaking,lvl:255},{id:mending,lvl:1}],Unbreakable:1,HideFlags:127,display:{Name:\"{\\\"text\\\":\\\"\u00A70\u00A7k1\u00A7r\u00A74Super Pickaxe\u00A70\u00A7k1\\\",\\\"italic\\\":\\\"false\\\",\\\"bold\\\":\\\"true\\\"}\",Lore:['{\\\"text\\\":\\\"Forged By The Gods Of Power\\\",\\\"color\\\":\\\"blue\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\"}','{\\\"text\\\":\\\"Efficiency X\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Fortune X\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Unbreaking CCL\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Mending\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}']}}");
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_PICKAXE) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"give @p golden_pickaxe{Enchantments:[{id:efficiency,lvl:10},{id:fortune,lvl:10},{id:unbreaking,lvl:255},{id:mending,lvl:1}],Unbreakable:1,HideFlags:127,display:{Name:\"{\\\"text\\\":\\\"\u00A70\u00A7k1\u00A7r\u00A74Super Pickaxe\u00A70\u00A7k1\\\",\\\"italic\\\":\\\"false\\\",\\\"bold\\\":\\\"true\\\"}\",Lore:['{\\\"text\\\":\\\"Forged By The Gods Of Power\\\",\\\"color\\\":\\\"blue\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\"}','{\\\"text\\\":\\\"Efficiency X\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Fortune X\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Unbreaking CCL\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Mending\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}']}}");
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_PICKAXE) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"give @p iron_pickaxe{Enchantments:[{id:efficiency,lvl:10},{id:fortune,lvl:10},{id:unbreaking,lvl:255},{id:mending,lvl:1}],Unbreakable:1,HideFlags:127,display:{Name:\"{\\\"text\\\":\\\"\u00A70\u00A7k1\u00A7r\u00A74Super Pickaxe\u00A70\u00A7k1\\\",\\\"italic\\\":\\\"false\\\",\\\"bold\\\":\\\"true\\\"}\",Lore:['{\\\"text\\\":\\\"Forged By The Gods Of Power\\\",\\\"color\\\":\\\"blue\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\"}','{\\\"text\\\":\\\"Efficiency X\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Fortune X\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Unbreaking CCL\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Mending\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}']}}");
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.STONE_PICKAXE) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"give @p stone_pickaxe{Enchantments:[{id:efficiency,lvl:10},{id:fortune,lvl:10},{id:unbreaking,lvl:255},{id:mending,lvl:1}],Unbreakable:1,HideFlags:127,display:{Name:\"{\\\"text\\\":\\\"\u00A70\u00A7k1\u00A7r\u00A74Super Pickaxe\u00A70\u00A7k1\\\",\\\"italic\\\":\\\"false\\\",\\\"bold\\\":\\\"true\\\"}\",Lore:['{\\\"text\\\":\\\"Forged By The Gods Of Power\\\",\\\"color\\\":\\\"blue\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\"}','{\\\"text\\\":\\\"Efficiency X\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Fortune X\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Unbreaking CCL\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Mending\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}']}}");
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WOODEN_PICKAXE) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"give @p wooden_pickaxe{Enchantments:[{id:efficiency,lvl:10},{id:fortune,lvl:10},{id:unbreaking,lvl:255},{id:mending,lvl:1}],Unbreakable:1,HideFlags:127,display:{Name:\"{\\\"text\\\":\\\"\u00A70\u00A7k1\u00A7r\u00A74Super Pickaxe\u00A70\u00A7k1\\\",\\\"italic\\\":\\\"false\\\",\\\"bold\\\":\\\"true\\\"}\",Lore:['{\\\"text\\\":\\\"Forged By The Gods Of Power\\\",\\\"color\\\":\\\"blue\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\"}','{\\\"text\\\":\\\"Efficiency X\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Fortune X\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Unbreaking CCL\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}','{\\\"text\\\":\\\"Mending\\\",\\\"bold\\\":\\\"true\\\",\\\"italic\\\":\\\"false\\\",\\\"color\\\":\\\"gold\\\"}']}}");
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"tellraw @p {\"text\":\"You Need To Be Holding A Pickaxe\",\"color\":\"red\",\"italic\":\"false\",\"bold\":\"true\"}");
		}
	}
}
