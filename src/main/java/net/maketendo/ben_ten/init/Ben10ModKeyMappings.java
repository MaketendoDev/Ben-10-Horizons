
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.ben_ten.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.maketendo.ben_ten.network.OmnitrixDialRightMessage;
import net.maketendo.ben_ten.network.OmnitrixDialPressMessage;
import net.maketendo.ben_ten.network.OmnitrixDialLeftMessage;
import net.maketendo.ben_ten.network.ActivateOmnitrixKeybindsMessage;
import net.maketendo.ben_ten.Ben10Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class Ben10ModKeyMappings {
	public static final KeyMapping ACTIVATE_OMNITRIX_KEYBINDS = new KeyMapping("key.ben_10.activate_omnitrix_keybinds", GLFW.GLFW_KEY_V, "key.categories.omnitrix") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				Ben10Mod.PACKET_HANDLER.sendToServer(new ActivateOmnitrixKeybindsMessage(0, 0));
				ActivateOmnitrixKeybindsMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OMNITRIX_DIAL_LEFT = new KeyMapping("key.ben_10.omnitrix_dial_left", GLFW.GLFW_KEY_LEFT, "key.categories.omnitrix") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				Ben10Mod.PACKET_HANDLER.sendToServer(new OmnitrixDialLeftMessage(0, 0));
				OmnitrixDialLeftMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OMNITRIX_DIAL_RIGHT = new KeyMapping("key.ben_10.omnitrix_dial_right", GLFW.GLFW_KEY_RIGHT, "key.categories.omnitrix") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				Ben10Mod.PACKET_HANDLER.sendToServer(new OmnitrixDialRightMessage(0, 0));
				OmnitrixDialRightMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OMNITRIX_DIAL_PRESS = new KeyMapping("key.ben_10.omnitrix_dial_press", GLFW.GLFW_KEY_V, "key.categories.omnitrix") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				Ben10Mod.PACKET_HANDLER.sendToServer(new OmnitrixDialPressMessage(0, 0));
				OmnitrixDialPressMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(ACTIVATE_OMNITRIX_KEYBINDS);
		event.register(OMNITRIX_DIAL_LEFT);
		event.register(OMNITRIX_DIAL_RIGHT);
		event.register(OMNITRIX_DIAL_PRESS);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				ACTIVATE_OMNITRIX_KEYBINDS.consumeClick();
				OMNITRIX_DIAL_LEFT.consumeClick();
				OMNITRIX_DIAL_RIGHT.consumeClick();
				OMNITRIX_DIAL_PRESS.consumeClick();
			}
		}
	}
}