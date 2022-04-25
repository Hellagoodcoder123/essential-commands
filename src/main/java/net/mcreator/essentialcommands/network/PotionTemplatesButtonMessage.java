
package net.mcreator.essentialcommands.network;

import net.minecraftforge.fmllegacy.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.essentialcommands.world.inventory.PotionTemplatesMenu;
import net.mcreator.essentialcommands.procedures.GiveLevitationSplashPotion1Procedure;
import net.mcreator.essentialcommands.procedures.GiveLevitationPotion1Procedure;
import net.mcreator.essentialcommands.procedures.GiveInstantKillPotionProcedure;
import net.mcreator.essentialcommands.EssentialCommandsMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PotionTemplatesButtonMessage {
	private final int buttonID, x, y, z;

	public PotionTemplatesButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public PotionTemplatesButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(PotionTemplatesButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(PotionTemplatesButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = PotionTemplatesMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GiveInstantKillPotionProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			GiveLevitationSplashPotion1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			GiveLevitationPotion1Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EssentialCommandsMod.addNetworkMessage(PotionTemplatesButtonMessage.class, PotionTemplatesButtonMessage::buffer,
				PotionTemplatesButtonMessage::new, PotionTemplatesButtonMessage::handler);
	}
}
