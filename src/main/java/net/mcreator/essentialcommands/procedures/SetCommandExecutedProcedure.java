package net.mcreator.essentialcommands.procedures;


import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.HashMap;

import net.mcreator.essentialcommands.init.EssentialCommandsModGameRules;

public class SetCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, HashMap cmdparams, Entity entity) {
		if (world.getLevelData().getGameRules().getBoolean(EssentialCommandsModGameRules.ENABLEWORLDEDIT) == true) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "fill " + _level.getGameRules().getRule(EssentialCommandsModGameRules.POS1X) + " " + _level.getGameRules().getRule(EssentialCommandsModGameRules.POS1Y) + " " + _level.getGameRules().getRule(EssentialCommandsModGameRules.POS1Z) + " " + _level.getGameRules().getRule(EssentialCommandsModGameRules.POS2X) + " " + _level.getGameRules().getRule(EssentialCommandsModGameRules.POS2Y) + " " + _level.getGameRules().getRule(EssentialCommandsModGameRules.POS2Z) + " " + (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : ""));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "tellraw @p {\"text\":\"Set to " + (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + "\",\"color\":\"light_purple\",\"bold\":\"false\",\"italic\":\"false\"}");
		}
	}
}
