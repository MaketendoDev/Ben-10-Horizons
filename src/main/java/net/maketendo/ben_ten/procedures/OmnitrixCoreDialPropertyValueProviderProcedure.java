package net.maketendo.ben_ten.procedures;

import net.minecraft.world.entity.Entity;

import net.maketendo.ben_ten.network.Ben10ModVariables;

public class OmnitrixCoreDialPropertyValueProviderProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 1) {
			return 1;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 2) {
			return 2;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 3) {
			return 3;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 4) {
			return 4;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 5) {
			return 5;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 6) {
			return 6;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 7) {
			return 7;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 8) {
			return 8;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 9) {
			return 9;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 10) {
			return 10;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 11) {
			return 11;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 12) {
			return 12;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 13) {
			return 13;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 14) {
			return 14;
		} else if ((entity.getCapability(Ben10ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ben10ModVariables.PlayerVariables())).OmnitrixDial == 15) {
			return 15;
		}
		return 1;
	}
}
