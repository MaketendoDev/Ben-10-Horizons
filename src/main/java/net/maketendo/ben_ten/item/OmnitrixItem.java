
package net.maketendo.ben_ten.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OmnitrixItem extends Item {
	public OmnitrixItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
