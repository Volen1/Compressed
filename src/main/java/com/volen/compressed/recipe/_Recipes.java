package com.volen.compressed.recipe;

import com.volen.compressed.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class _Recipes {

    public static final void init() {

        // Cobblestone
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.compressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), Blocks.COBBLESTONE
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.COBBLESTONE, 9), new ItemStack(ModBlocks.compressedCobblestone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.doubleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.compressedCobblestone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.compressedCobblestone, 9), new ItemStack(ModBlocks.doubleCompressedCobblestone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.tripleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.doubleCompressedCobblestone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.doubleCompressedCobblestone, 9), new ItemStack(ModBlocks.tripleCompressedCobblestone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.tripleCompressedCobblestone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.tripleCompressedCobblestone, 9), new ItemStack(ModBlocks.quadrupleCompressedCobblestone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quintupleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quadrupleCompressedCobblestone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedCobblestone, 9), new ItemStack(ModBlocks.quintupleCompressedCobblestone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.sextupleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quintupleCompressedCobblestone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.quintupleCompressedCobblestone, 9), new ItemStack(ModBlocks.sextupleCompressedCobblestone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.septupleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.sextupleCompressedCobblestone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.sextupleCompressedCobblestone, 9), new ItemStack(ModBlocks.septupleCompressedCobblestone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.octupleCompressedCobblestone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.septupleCompressedCobblestone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.septupleCompressedCobblestone, 9), new ItemStack(ModBlocks.octupleCompressedCobblestone)));



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        // Dirt
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.compressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), Blocks.DIRT
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.DIRT, 9), new ItemStack(ModBlocks.compressedDirt)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.doubleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.compressedDirt
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.compressedDirt, 9), new ItemStack(ModBlocks.doubleCompressedDirt)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.tripleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.doubleCompressedDirt
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.doubleCompressedDirt, 9), new ItemStack(ModBlocks.tripleCompressedDirt)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.tripleCompressedDirt
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.tripleCompressedDirt, 9), new ItemStack(ModBlocks.quadrupleCompressedDirt)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quintupleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quadrupleCompressedDirt
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedDirt, 9), new ItemStack(ModBlocks.quintupleCompressedDirt)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.sextupleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quintupleCompressedDirt
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.quintupleCompressedDirt, 9), new ItemStack(ModBlocks.sextupleCompressedDirt)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.septupleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.sextupleCompressedDirt
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.sextupleCompressedDirt, 9), new ItemStack(ModBlocks.septupleCompressedDirt)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.octupleCompressedDirt), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.septupleCompressedDirt
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.septupleCompressedDirt, 9), new ItemStack(ModBlocks.octupleCompressedDirt)));



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        // Sand
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.compressedSand), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), Blocks.SAND
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.SAND, 9), new ItemStack(ModBlocks.compressedSand)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.doubleCompressedSand), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.compressedSand
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.compressedSand, 9), new ItemStack(ModBlocks.doubleCompressedSand)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.tripleCompressedSand), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.doubleCompressedSand
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.doubleCompressedSand, 9), new ItemStack(ModBlocks.tripleCompressedSand)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedSand), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.tripleCompressedSand
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.tripleCompressedSand, 9), new ItemStack(ModBlocks.quadrupleCompressedSand)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quintupleCompressedSand), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quadrupleCompressedSand
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedSand, 9), new ItemStack(ModBlocks.quintupleCompressedSand)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.sextupleCompressedSand), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quintupleCompressedSand
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.quintupleCompressedSand, 9), new ItemStack(ModBlocks.sextupleCompressedSand)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.septupleCompressedSand), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.sextupleCompressedSand
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.sextupleCompressedSand, 9), new ItemStack(ModBlocks.septupleCompressedSand)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.octupleCompressedSand), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.septupleCompressedSand
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.septupleCompressedSand, 9), new ItemStack(ModBlocks.octupleCompressedSand)));



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        // Gravel
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.compressedGravel), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), Blocks.STONE
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.GRAVEL, 9), new ItemStack(ModBlocks.compressedGravel)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.doubleCompressedGravel), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.compressedGravel
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.compressedGravel, 9), new ItemStack(ModBlocks.doubleCompressedGravel)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.tripleCompressedGravel), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.doubleCompressedGravel
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.doubleCompressedGravel, 9), new ItemStack(ModBlocks.tripleCompressedGravel)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedGravel), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.tripleCompressedGravel
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.tripleCompressedGravel, 9), new ItemStack(ModBlocks.quadrupleCompressedGravel)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quintupleCompressedGravel), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quadrupleCompressedGravel
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedGravel, 9), new ItemStack(ModBlocks.quintupleCompressedGravel)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.sextupleCompressedGravel), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quintupleCompressedGravel
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.quintupleCompressedGravel, 9), new ItemStack(ModBlocks.sextupleCompressedGravel)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.septupleCompressedGravel), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.sextupleCompressedGravel
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.sextupleCompressedGravel, 9), new ItemStack(ModBlocks.septupleCompressedGravel)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.octupleCompressedGravel), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.septupleCompressedGravel
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.septupleCompressedGravel, 9), new ItemStack(ModBlocks.octupleCompressedGravel)));



        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        // Stone
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.compressedStone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), Blocks.STONE
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.STONE, 9), new ItemStack(ModBlocks.compressedStone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.doubleCompressedStone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.compressedStone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.compressedStone, 9), new ItemStack(ModBlocks.doubleCompressedStone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.tripleCompressedStone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.doubleCompressedStone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.doubleCompressedStone, 9), new ItemStack(ModBlocks.tripleCompressedStone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedStone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.tripleCompressedStone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.tripleCompressedStone, 9), new ItemStack(ModBlocks.quadrupleCompressedStone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quintupleCompressedStone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quadrupleCompressedStone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedStone, 9), new ItemStack(ModBlocks.quintupleCompressedStone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.sextupleCompressedStone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quintupleCompressedStone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.quintupleCompressedStone, 9), new ItemStack(ModBlocks.sextupleCompressedStone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.septupleCompressedStone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.sextupleCompressedStone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.sextupleCompressedStone, 9), new ItemStack(ModBlocks.septupleCompressedStone)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.octupleCompressedStone), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.septupleCompressedStone
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.septupleCompressedStone, 9), new ItemStack(ModBlocks.octupleCompressedStone)));


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        // Netherrack
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.compressedNetherrack), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), Blocks.NETHERRACK
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.NETHERRACK, 9), new ItemStack(ModBlocks.compressedNetherrack)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.doubleCompressedNetherrack), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.compressedNetherrack
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.compressedNetherrack, 9), new ItemStack(ModBlocks.doubleCompressedNetherrack)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.tripleCompressedNetherrack), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.doubleCompressedNetherrack
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.doubleCompressedNetherrack, 9), new ItemStack(ModBlocks.tripleCompressedNetherrack)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedNetherrack), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.tripleCompressedNetherrack
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.tripleCompressedNetherrack, 9), new ItemStack(ModBlocks.quadrupleCompressedNetherrack)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quintupleCompressedNetherrack), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quadrupleCompressedNetherrack
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.quadrupleCompressedNetherrack, 9), new ItemStack(ModBlocks.quintupleCompressedNetherrack)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.sextupleCompressedNetherrack), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.quintupleCompressedNetherrack
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.quintupleCompressedNetherrack, 9), new ItemStack(ModBlocks.sextupleCompressedNetherrack)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.septupleCompressedNetherrack), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.sextupleCompressedNetherrack
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.sextupleCompressedNetherrack, 9), new ItemStack(ModBlocks.septupleCompressedNetherrack)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.octupleCompressedNetherrack), new Object[] {
                "xxx",
                "xxx",
                "xxx",
                Character.valueOf('x'), ModBlocks.septupleCompressedNetherrack
        }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.septupleCompressedNetherrack, 9), new ItemStack(ModBlocks.octupleCompressedNetherrack)));










    }
}
