package net.maketendo.ben_ten.procedures;

import net.minecraft.world.entity.Entity;

import net.maketendo.ben_ten.network.Ben10ModVariables;

public class OmnitrixActivateOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).WearingOmnitrix == true) {
			if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixActive == true) {
				{
					boolean _setval = false;
					entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.OmnitrixActive = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					boolean _setval = true;
					entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.OmnitrixActive = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
