
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.ben_ten.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.maketendo.ben_ten.client.renderer.TetramandRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Ben10ModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(Ben10ModEntities.TETRAMAND.get(), TetramandRenderer::new);
	}
}
