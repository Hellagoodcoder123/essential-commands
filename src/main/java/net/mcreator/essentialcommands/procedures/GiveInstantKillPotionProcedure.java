package net.mcreator.essentialcommands.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class GiveInstantKillPotionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					"give @p splash_potion{CustomPotionEffects:[{Id:6,Amplifier:125}],CustomPotionColor:11141120,HideFlags:127,display:{Name:\"{\\\"text\\\":\\\"\u00A70\u00A7k1\u00A7r\u00A74Potion Of Instant Death\u00A70\u00A7k1\\\",\\\"bold\\\":\\\"false\\\",\\\"italic\\\":\\\"false\\\"}\", Lore:['{\\\"text\\\":\\\"Will instantly kill anything it is thrown upon\\\",\\\"bold\\\":\\\"false\\\",\\\"italic\\\":\\\"false\\\"}']}}");
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
