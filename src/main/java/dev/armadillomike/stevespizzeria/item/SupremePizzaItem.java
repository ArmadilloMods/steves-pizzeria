
package dev.armadillomike.stevespizzeria.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SupremePizzaItem extends Item {
	public SupremePizzaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(7).saturationModifier(1.5f).build()));
	}
}
