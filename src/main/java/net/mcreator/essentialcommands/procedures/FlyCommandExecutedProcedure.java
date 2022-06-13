package net.mcreator.essentialcommands.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class FlyCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean Flight = false;
		if (Flight == true) {
			Flight = false;
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (Flight == true);
				_player.onUpdateAbilities();
			}
		} else {
			Flight = true;
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (Flight == true);
				_player.onUpdateAbilities();
			}
		}
	}
}
