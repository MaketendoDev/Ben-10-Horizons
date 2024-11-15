
package net.maketendo.ben_ten.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.maketendo.ben_ten.entity.TetramandEntity;
import net.maketendo.ben_ten.client.model.Modelfour_arms;

public class TetramandRenderer extends MobRenderer<TetramandEntity, Modelfour_arms<TetramandEntity>> {
	public TetramandRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfour_arms(context.bakeLayer(Modelfour_arms.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TetramandEntity entity) {
		return new ResourceLocation("ben_10:textures/entities/four_arms.png");
	}
}
