
package net.maketendo.ben_ten.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.maketendo.ben_ten.procedures.OmnitrixItemInHandTickProcedure;

public class OmnitrixItem extends Item {
	public OmnitrixItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			OmnitrixItemInHandTickProcedure.execute(world, entity);
	}
}
