
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.essentialcommands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.essentialcommands.item.AdminSwordItem;
import net.mcreator.essentialcommands.item.AdminShovelItem;
import net.mcreator.essentialcommands.item.AdminPickaxeItem;
import net.mcreator.essentialcommands.item.AdminItem;
import net.mcreator.essentialcommands.item.AdminHoeItem;
import net.mcreator.essentialcommands.item.AdminAxeItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EssentialCommandsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item ADMIN_AXE = register(new AdminAxeItem());
	public static final Item ADMIN_PICKAXE = register(new AdminPickaxeItem());
	public static final Item ADMIN_SHOVEL = register(new AdminShovelItem());
	public static final Item ADMIN_HOE = register(new AdminHoeItem());
	public static final Item ADMIN_SWORD = register(new AdminSwordItem());
	public static final Item ADMIN_HELMET = register(new AdminItem.Helmet());
	public static final Item ADMIN_CHESTPLATE = register(new AdminItem.Chestplate());
	public static final Item ADMIN_LEGGINGS = register(new AdminItem.Leggings());
	public static final Item ADMIN_BOOTS = register(new AdminItem.Boots());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
