package net.maketendo.ben_ten.procedures;

import net.minecraft.world.entity.Entity;

import net.maketendo.ben_ten.network.Ben10ModVariables;

public class OmnitrixActivePropertyValueProviderProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixActive == true) {
			if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixNoFaceplate == true) {
				return 2;
			} else {
				return 1;
			}
		}
		return 0;
	}
}
