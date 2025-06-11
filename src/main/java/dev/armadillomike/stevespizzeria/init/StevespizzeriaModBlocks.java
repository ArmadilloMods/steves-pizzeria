
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.armadillomike.stevespizzeria.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import dev.armadillomike.stevespizzeria.block.TomatoVineBlock;
import dev.armadillomike.stevespizzeria.StevespizzeriaMod;

public class StevespizzeriaModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(StevespizzeriaMod.MODID);
	public static final DeferredBlock<Block> TOMATO_VINE = REGISTRY.register("tomato_vine", TomatoVineBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
