package net.mcreator.essentialcommands.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class GuideCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					"give @p written_book{pages:['[\"\",{\"text\":\"/potion:\",\"bold\":true,\"underlined\":true},{\"text\":\"\\\\nIn the Type section of\\\\nthe GUI, type either\\\\n\\\\\"potion\\\\\"\\\\n\\\\\"splash_potion\\\\\"\\\\n\\\\\"lingering_potion\\\\\" or\\\\n\\\\\"tipped_arrow\\\\\"\\\\n(Don\\'t write the speech\\\\nmarks).\\\\nIn the Effect(s) section, write the names of the effects in full lowercase and the effect number will be automatically set.\",\"color\":\"reset\"}]','{\"text\":\"In the Duration section,\\\\nwrite the number of ticks\\\\n(seconds * 20), if you\\\\nare using multiple\\\\ndifferent effects,\\\\nseparate the effect\\\\ndurations by commas.\"}','{\"text\":\"In the Color section,\\\\nwrite the decimal value\\\\nof the colour (RGB, no\\\\ncommas, e.g. 255, 255,\\\\n210 would be 255255210).\"}','{\"text\":\"In the Effect(s) section,\\\\nwrite the names of the\\\\neffects in full lowercase\\\\nand the effect number\\\\nwill be automatically\\\\nset.\"}'],title:Guide,author:Eth0_0,display:{Lore:[\"A guide on how to use the commands in this mod (updated regularly)\"]}}");
	}
}
