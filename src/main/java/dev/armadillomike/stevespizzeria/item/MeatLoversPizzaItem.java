
package dev.armadillomike.stevespizzeria.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class MeatLoversPizzaItem extends Item {
	public MeatLoversPizzaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(1f).build()));
	}
}
