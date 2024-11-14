package net.maketendo.ben_ten.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.maketendo.ben_ten.network.Ben10ModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GrayMatterRendererProcedure {
	@SubscribeEvent
	public static void onEventTriggered(net.minecraftforge.event.entity.EntityEvent.Size event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixAlien).equals("Gray Matter")) {
			if (world == null)
				return;
			net.minecraftforge.event.entity.EntityEvent.Size _sizeEvt = (net.minecraftforge.event.entity.EntityEvent.Size) event;
			_sizeEvt.setNewEyeHeight((float) 0.4);
			_sizeEvt.setNewSize(new EntityDimensions((float) 0.4, (float) 0.4, false));
			entity.setCustomName(Component.literal("Gray Matter"));
		}
		if (((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixAlien).equals("Four Arms")) {
			if (world == null)
				return;
			net.minecraftforge.event.entity.EntityEvent.Size _sizeEvt = (net.minecraftforge.event.entity.EntityEvent.Size) event;
			_sizeEvt.setNewEyeHeight((float) 3);
			_sizeEvt.setNewSize(new EntityDimensions((float) 3, (float) 3, false));
			entity.setCustomName(Component.literal("Four Arms"));
		}
	}
}
