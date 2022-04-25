
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialcommands.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EssentialCommandsModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> ENABLEWORLDEDIT = GameRules.register("enableworldedit", GameRules.Category.PLAYER,
			GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.IntegerValue> POS1X = GameRules.register("pos1x", GameRules.Category.PLAYER,
			GameRules.IntegerValue.create(0));
	public static final GameRules.Key<GameRules.IntegerValue> POS1Y = GameRules.register("pos1y", GameRules.Category.PLAYER,
			GameRules.IntegerValue.create(0));
	public static final GameRules.Key<GameRules.IntegerValue> POS1Z = GameRules.register("pos1z", GameRules.Category.PLAYER,
			GameRules.IntegerValue.create(0));
	public static final GameRules.Key<GameRules.IntegerValue> POS2X = GameRules.register("pos2x", GameRules.Category.PLAYER,
			GameRules.IntegerValue.create(0));
	public static final GameRules.Key<GameRules.IntegerValue> POS2Y = GameRules.register("pos2y", GameRules.Category.PLAYER,
			GameRules.IntegerValue.create(0));
	public static final GameRules.Key<GameRules.IntegerValue> POS2Z = GameRules.register("pos2z", GameRules.Category.PLAYER,
			GameRules.IntegerValue.create(0));
}
