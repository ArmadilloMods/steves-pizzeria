package dev.armadillomike.stevespizzeria.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import dev.armadillomike.stevespizzeria.init.StevespizzeriaModBlocks;

public class TomatoSeedsRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FARMLAND) {
			world.setBlock(BlockPos.containing(x, y + 1, z), StevespizzeriaModBlocks.TOMATO_VINE.get().defaultBlockState(), 3);
			(entity instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).shrink(1);
		}
	}
}
