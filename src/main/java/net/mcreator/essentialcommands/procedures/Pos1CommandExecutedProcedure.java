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

public class Pos1CommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(EssentialCommandsModGameRules.ENABLEWORLDEDIT) == true) {
			if (world instanceof Level _level)
				_level.getGameRules().getRule(EssentialCommandsModGameRules.POS1X).set((int) x, _level.getServer());
			if (world instanceof Level _level)
				_level.getGameRules().getRule(EssentialCommandsModGameRules.POS1Y).set((int) y, _level.getServer());
			if (world instanceof Level _level)
				_level.getGameRules().getRule(EssentialCommandsModGameRules.POS1Z).set((int) z, _level.getServer());
			EssentialCommandsMod.LOGGER.info("Set pos1x, pos1y, and pos1z to the current position");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"tellraw @p {\"text\":\"Set Position 1 To " + _level.getGameRules().getRule(EssentialCommandsModGameRules.POS1X) + ", " + _level.getGameRules().getRule(EssentialCommandsModGameRules.POS1Y) + ", " + _level.getGameRules().getRule(EssentialCommandsModGameRules.POS1Z) + "\",\"color\":\"light_purple\",\"italic\":\"false\",\"bold\":\"false\"}");
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						"tellraw @p {\"text\":\"Worldedit is currently disabled, do /gamerule enableWorldEdit true to enable it\",\"color\":\"red\",\"italic\":\"false\",\"bold\":\"true\"}");
		}
	}
}
