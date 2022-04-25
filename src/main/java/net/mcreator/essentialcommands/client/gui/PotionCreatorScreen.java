
package net.mcreator.essentialcommands.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.essentialcommands.world.inventory.PotionCreatorMenu;
import net.mcreator.essentialcommands.network.PotionCreatorButtonMessage;
import net.mcreator.essentialcommands.EssentialCommandsMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PotionCreatorScreen extends AbstractContainerScreen<PotionCreatorMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox effect;
	EditBox duration;
	EditBox amplifier;
	EditBox type;
	EditBox Color;

	public PotionCreatorScreen(PotionCreatorMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("essential_commands:textures/potion_creator.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		effect.render(ms, mouseX, mouseY, partialTicks);
		duration.render(ms, mouseX, mouseY, partialTicks);
		amplifier.render(ms, mouseX, mouseY, partialTicks);
		type.render(ms, mouseX, mouseY, partialTicks);
		Color.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (effect.isFocused())
			return effect.keyPressed(key, b, c);
		if (duration.isFocused())
			return duration.keyPressed(key, b, c);
		if (amplifier.isFocused())
			return amplifier.keyPressed(key, b, c);
		if (type.isFocused())
			return type.keyPressed(key, b, c);
		if (Color.isFocused())
			return Color.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		effect.tick();
		duration.tick();
		amplifier.tick();
		type.tick();
		Color.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Effect(s):", 0, 144, -12829636);
		this.font.draw(poseStack, "Duration:", 5, 125, -12829636);
		this.font.draw(poseStack, "Amplifier:", 0, 105, -12829636);
		this.font.draw(poseStack, "Potion Creator", 54, 6, -12829636);
		this.font.draw(poseStack, "Type:", 25, 85, -12829636);
		this.font.draw(poseStack, "Color:", 20, 65, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		effect = new EditBox(this.font, this.leftPos + 52, this.topPos + 140, 120, 20, new TextComponent(""));
		PotionCreatorMenu.guistate.put("text:effect", effect);
		effect.setMaxLength(32767);
		this.addWidget(this.effect);
		duration = new EditBox(this.font, this.leftPos + 52, this.topPos + 120, 120, 20, new TextComponent(""));
		PotionCreatorMenu.guistate.put("text:duration", duration);
		duration.setMaxLength(32767);
		this.addWidget(this.duration);
		amplifier = new EditBox(this.font, this.leftPos + 52, this.topPos + 100, 120, 20, new TextComponent(""));
		PotionCreatorMenu.guistate.put("text:amplifier", amplifier);
		amplifier.setMaxLength(32767);
		this.addWidget(this.amplifier);
		this.addRenderableWidget(new Button(this.leftPos + 42, this.topPos + 40, 93, 20, new TextComponent("Create Potion"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 53, this.topPos + 21, 72, 20, new TextComponent("Templates"), e -> {
			if (true) {
				EssentialCommandsMod.PACKET_HANDLER.sendToServer(new PotionCreatorButtonMessage(1, x, y, z));
				PotionCreatorButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		type = new EditBox(this.font, this.leftPos + 52, this.topPos + 80, 120, 20, new TextComponent(""));
		PotionCreatorMenu.guistate.put("text:type", type);
		type.setMaxLength(32767);
		this.addWidget(this.type);
		Color = new EditBox(this.font, this.leftPos + 52, this.topPos + 60, 120, 20, new TextComponent(""));
		PotionCreatorMenu.guistate.put("text:Color", Color);
		Color.setMaxLength(32767);
		this.addWidget(this.Color);
	}
}
