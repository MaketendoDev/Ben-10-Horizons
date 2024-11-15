
package net.maketendo.ben_ten.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.maketendo.ben_ten.procedures.OmnitrixFaceplateRightclickedProcedure;

public class OmnitrixFaceplateItem extends Item {
	public OmnitrixFaceplateItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		OmnitrixFaceplateRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
