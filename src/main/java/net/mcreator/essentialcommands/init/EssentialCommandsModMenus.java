
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialcommands.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.essentialcommands.world.inventory.PotionTemplatesMenu;
import net.mcreator.essentialcommands.world.inventory.PotionCreatorMenu;
import net.mcreator.essentialcommands.world.inventory.CalculatorMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EssentialCommandsModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CalculatorMenu> CALCULATOR = register("calculator", (id, inv, extraData) -> new CalculatorMenu(id, inv, extraData));
	public static final MenuType<PotionTemplatesMenu> POTION_TEMPLATES = register("potion_templates",
			(id, inv, extraData) -> new PotionTemplatesMenu(id, inv, extraData));
	public static final MenuType<PotionCreatorMenu> POTION_CREATOR = register("potion_creator",
			(id, inv, extraData) -> new PotionCreatorMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
