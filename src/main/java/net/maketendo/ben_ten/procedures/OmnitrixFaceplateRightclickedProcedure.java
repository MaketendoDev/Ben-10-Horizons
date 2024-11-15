package net.maketendo.ben_ten.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.maketendo.ben_ten.network.Ben10ModVariables;
import net.maketendo.ben_ten.init.Ben10ModItems;

public class OmnitrixFaceplateRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Ben10ModItems.OMNITRIX.get()) {
			itemstack.shrink(1);
			{
				boolean _setval = false;
				entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.OmnitrixNoFaceplate = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
