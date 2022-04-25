
package net.mcreator.essentialcommands.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.essentialcommands.world.inventory.CalculatorMenu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CalculatorScreen extends AbstractContainerScreen<CalculatorMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CalculatorScreen(CalculatorMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("essential_commands:textures/calculator.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
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
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
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
		this.addRenderableWidget(new Button(this.leftPos + 21, this.topPos + 98, 30, 20, new TextComponent("1"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 50, this.topPos + 98, 30, 20, new TextComponent("2"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 79, this.topPos + 98, 30, 20, new TextComponent("3"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 21, this.topPos + 117, 30, 20, new TextComponent("4"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 50, this.topPos + 117, 30, 20, new TextComponent("5"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 79, this.topPos + 117, 30, 20, new TextComponent("6"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 21, this.topPos + 136, 30, 20, new TextComponent("7"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 50, this.topPos + 136, 30, 20, new TextComponent("8"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 79, this.topPos + 136, 30, 20, new TextComponent("9"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 108, this.topPos + 117, 30, 20, new TextComponent("0"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 108, this.topPos + 98, 30, 20, new TextComponent("+"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 108, this.topPos + 136, 30, 20, new TextComponent("-"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 137, this.topPos + 98, 30, 20, new TextComponent("x"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 137, this.topPos + 117, 30, 20, new TextComponent("÷"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 108, this.topPos + 79, 30, 20, new TextComponent("?"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 137, this.topPos + 79, 30, 20, new TextComponent("²"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 137, this.topPos + 136, 30, 20, new TextComponent("="), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 79, this.topPos + 79, 30, 20, new TextComponent("^"), e -> {
		}));
	}
}
