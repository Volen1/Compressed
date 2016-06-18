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







        // Dirt
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.compressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), Blocks.DIRT
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.doubleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.compressedDirt
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.tripleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.doubleCompressedDirt
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.tripleCompressedDirt
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quintupleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quadrupleCompressedDirt
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.sextupleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quintupleCompressedDirt
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.septupleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.sextupleCompressedDirt
        }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.octupleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.septupleCompressedDirt
        }));






    }
}
