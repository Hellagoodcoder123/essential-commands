package net.mcreator.essentialcommands.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.HashMap;

public class GmCommandExecutedProcedure {
	public static void execute(Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("c")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("creative")) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.CREATIVE);
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("s")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("survival")) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.SURVIVAL);
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("sp")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("spectator")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("spec")) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.SPECTATOR);
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("a")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("adventure")) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.ADVENTURE);
		}
	}
}
