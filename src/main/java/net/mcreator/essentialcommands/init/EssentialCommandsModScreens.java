
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialcommands.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.essentialcommands.client.gui.PotionTemplatesScreen;
import net.mcreator.essentialcommands.client.gui.PotionCreatorScreen;
import net.mcreator.essentialcommands.client.gui.CalculatorScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EssentialCommandsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(EssentialCommandsModMenus.CALCULATOR, CalculatorScreen::new);
			MenuScreens.register(EssentialCommandsModMenus.POTION_TEMPLATES, PotionTemplatesScreen::new);
			MenuScreens.register(EssentialCommandsModMenus.POTION_CREATOR, PotionCreatorScreen::new);
		});
	}
}
