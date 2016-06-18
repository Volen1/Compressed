package com.volen.compressed.recipe;

import com.volen.compressed.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class _Recipes {

    public static final void init() {

        // Cobblestone
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.compressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), Blocks.COBBLESTONE
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.doubleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.compressedCobblestone
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.tripleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.doubleCompressedCobblestone
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.tripleCompressedCobblestone
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quintupleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quadrupleCompressedCobblestone
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.sextupleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quintupleCompressedCobblestone
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.septupleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.sextupleCompressedCobblestone
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.octupleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.septupleCompressedCobblestone
        }));





    }
}
