
package net.maketendo.ben_ten.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.maketendo.ben_ten.entity.FourArmsEntity;
import net.maketendo.ben_ten.client.model.Modelfour_arms;

public class FourArmsRenderer extends MobRenderer<FourArmsEntity, Modelfour_arms<FourArmsEntity>> {
	public FourArmsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfour_arms(context.bakeLayer(Modelfour_arms.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FourArmsEntity entity) {
		return new ResourceLocation("ben_10:textures/entities/four_arms.png");
	}
}
