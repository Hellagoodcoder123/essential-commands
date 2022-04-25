package net.mcreator.essentialcommands.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.essentialcommands.init.EssentialCommandsModGameRules;
import net.mcreator.essentialcommands.EssentialCommandsMod;

public class Pos2CommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(EssentialCommandsModGameRules.ENABLEWORLDEDIT) == true) {
			if (world instanceof Level _level)
				_level.getGameRules().getRule(EssentialCommandsModGameRules.POS2X).set((int) x, _level.getServer());
			if (world instanceof Level _level)
				_level.getGameRules().getRule(EssentialCommandsModGameRules.POS2Y).set((int) y, _level.getServer());
			if (world instanceof Level _level)
				_level.getGameRules().getRule(EssentialCommandsModGameRules.POS2Z).set((int) z, _level.getServer());
			EssentialCommandsMod.LOGGER.info("Set pos2x, pos2y, and pos2z to the current position");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"tellraw @p {\"text\":\"Set Position 2 To " + _level.getGameRules().getRule(EssentialCommandsModGameRules.POS2X) + ", " + _level.getGameRules().getRule(EssentialCommandsModGameRules.POS2Y) + ", " + _level.getGameRules().getRule(EssentialCommandsModGameRules.POS2Z) + "\",\"color\":\"light_purple\",\"italic\":\"false\",\"bold\":\"false\"}");
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"tellraw @p {\"text\":\"Worldedit is currently disabled, do /gamerule enableWorldEdit true to enable it\",\"color\":\"red\",\"italic\":\"false\",\"bold\":\"true\"}");
		}
	}
}
