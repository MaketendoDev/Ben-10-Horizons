package net.maketendo.ben_ten.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.maketendo.ben_ten.network.Ben10ModVariables;
import net.maketendo.ben_ten.init.Ben10ModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NoFacePlateProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_NUGGET) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Ben10ModItems.OMNITRIX.get()) {
				{
					boolean _setval = true;
					entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.OmnitrixNoFaceplate = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Ben10ModItems.OMNITRIX_FACEPLATE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}
