
package dev.armadillomike.stevespizzeria.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PizzaBaseSauceItem extends Item {
	public PizzaBaseSauceItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
