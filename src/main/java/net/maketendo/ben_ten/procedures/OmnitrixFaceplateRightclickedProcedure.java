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
			if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).WearingOmnitrix == true) {
				if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixNoFaceplate == false) {
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
	}
}
