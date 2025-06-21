
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.armadillomike.stevespizzeria.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import dev.armadillomike.stevespizzeria.StevespizzeriaMod;

public class StevespizzeriaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StevespizzeriaMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PIZZA_INGREDIENTS_TAB = REGISTRY.register("pizza_ingredients_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.stevespizzeria.pizza_ingredients_tab")).icon(() -> new ItemStack(StevespizzeriaModItems.MOZZERELLA.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StevespizzeriaModItems.MOZZERELLA.get());
				tabData.accept(StevespizzeriaModItems.TOMATO_SEEDS.get());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PIZZAS = REGISTRY.register("pizzas",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.stevespizzeria.pizzas")).icon(() -> new ItemStack(StevespizzeriaModItems.SUPREME_PIZZA.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StevespizzeriaModItems.MARGHERITA_PIZZA.get());
				tabData.accept(StevespizzeriaModItems.SUPREME_PIZZA.get());
				tabData.accept(StevespizzeriaModItems.MEAT_LOVERS_PIZZA.get());
				tabData.accept(StevespizzeriaModItems.HAWAIIAN.get());
				tabData.accept(StevespizzeriaModItems.VEGGIE_PIZZA.get());
			}).withTabsBefore(PIZZA_INGREDIENTS_TAB.getId()).build());
}
