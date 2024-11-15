
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.ben_ten.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.maketendo.ben_ten.procedures.OmnitrixNoFaceplatePropertyValueProviderProcedure;
import net.maketendo.ben_ten.procedures.OmnitrixNoCorePropertyValueProviderProcedure;
import net.maketendo.ben_ten.procedures.OmnitrixCoreDialPropertyValueProviderProcedure;
import net.maketendo.ben_ten.procedures.OmnitrixActivePropertyValueProviderProcedure;
import net.maketendo.ben_ten.item.OmnitrixItem;
import net.maketendo.ben_ten.item.OmnitrixFaceplateItem;
import net.maketendo.ben_ten.Ben10Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Ben10ModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Ben10Mod.MODID);
	public static final RegistryObject<Item> OMNITRIX = REGISTRY.register("omnitrix", () -> new OmnitrixItem());
	public static final RegistryObject<Item> TETRAMAND_SPAWN_EGG = REGISTRY.register("tetramand_spawn_egg", () -> new ForgeSpawnEggItem(Ben10ModEntities.TETRAMAND, -6750157, -10092544, new Item.Properties()));
	public static final RegistryObject<Item> OMNITRIX_FACEPLATE = REGISTRY.register("omnitrix_faceplate", () -> new OmnitrixFaceplateItem());

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(OMNITRIX.get(), new ResourceLocation("ben_10:omnitrix_core_dial"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) OmnitrixCoreDialPropertyValueProviderProcedure.execute(entity));
			ItemProperties.register(OMNITRIX.get(), new ResourceLocation("ben_10:omnitrix_active"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) OmnitrixActivePropertyValueProviderProcedure.execute(entity));
			ItemProperties.register(OMNITRIX.get(), new ResourceLocation("ben_10:omnitrix_no_faceplate"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) OmnitrixNoFaceplatePropertyValueProviderProcedure.execute(entity));
			ItemProperties.register(OMNITRIX.get(), new ResourceLocation("ben_10:omnitrix_no_core"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) OmnitrixNoCorePropertyValueProviderProcedure.execute(entity));
		});
	}
}
