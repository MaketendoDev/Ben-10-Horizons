package net.maketendo.ben_ten.procedures;

import net.minecraft.world.entity.Entity;

import net.maketendo.ben_ten.network.Ben10ModVariables;

public class OmnitrixDialLeftOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).WearingOmnitrix == true) {
			if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixActive == false) {
				{
					double _setval = (entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial - 1;
					entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.OmnitrixDial = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
