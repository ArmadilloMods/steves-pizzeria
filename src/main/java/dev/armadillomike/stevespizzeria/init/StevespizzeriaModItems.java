
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.armadillomike.stevespizzeria.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import dev.armadillomike.stevespizzeria.item.VeggiePizzaItem;
import dev.armadillomike.stevespizzeria.item.TomatoSeedsItem;
import dev.armadillomike.stevespizzeria.item.TomatoSauceBottleItem;
import dev.armadillomike.stevespizzeria.item.TomatoItemItem;
import dev.armadillomike.stevespizzeria.item.SupremePizzaItem;
import dev.armadillomike.stevespizzeria.item.PizzaBaseSauceItem;
import dev.armadillomike.stevespizzeria.item.PizzaBaseItem;
import dev.armadillomike.stevespizzeria.item.PepperoniItem;
import dev.armadillomike.stevespizzeria.item.MozzerellaItem;
import dev.armadillomike.stevespizzeria.item.MeatLoversPizzaItem;
import dev.armadillomike.stevespizzeria.item.MargheritaPizzaItem;
import dev.armadillomike.stevespizzeria.item.HawaiianItem;
import dev.armadillomike.stevespizzeria.StevespizzeriaMod;

public class StevespizzeriaModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(StevespizzeriaMod.MODID);
	public static final DeferredItem<Item> MOZZERELLA = REGISTRY.register("mozzerella", MozzerellaItem::new);
	public static final DeferredItem<Item> PIZZA_BASE = REGISTRY.register("pizza_base", PizzaBaseItem::new);
	public static final DeferredItem<Item> MARGHERITA_PIZZA = REGISTRY.register("margherita_pizza", MargheritaPizzaItem::new);
	public static final DeferredItem<Item> SUPREME_PIZZA = REGISTRY.register("supreme_pizza", SupremePizzaItem::new);
	public static final DeferredItem<Item> MEAT_LOVERS_PIZZA = REGISTRY.register("meat_lovers_pizza", MeatLoversPizzaItem::new);
	public static final DeferredItem<Item> HAWAIIAN = REGISTRY.register("hawaiian", HawaiianItem::new);
	public static final DeferredItem<Item> VEGGIE_PIZZA = REGISTRY.register("veggie_pizza", VeggiePizzaItem::new);
	public static final DeferredItem<Item> TOMATO_ITEM = REGISTRY.register("tomato_item", TomatoItemItem::new);
	public static final DeferredItem<Item> TOMATO_SAUCE_BOTTLE = REGISTRY.register("tomato_sauce_bottle", TomatoSauceBottleItem::new);
	public static final DeferredItem<Item> PEPPERONI = REGISTRY.register("pepperoni", PepperoniItem::new);
	public static final DeferredItem<Item> PIZZA_BASE_SAUCE = REGISTRY.register("pizza_base_sauce", PizzaBaseSauceItem::new);
	public static final DeferredItem<Item> TOMATO_VINE = block(StevespizzeriaModBlocks.TOMATO_VINE);
	public static final DeferredItem<Item> TOMATO_SEEDS = REGISTRY.register("tomato_seeds", TomatoSeedsItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
