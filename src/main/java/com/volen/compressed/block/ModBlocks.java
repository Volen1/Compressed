package com.volen.compressed.block;

import com.volen.compressed.item.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    // Cobblestone
    public static BlockCompressed compressedCobblestone;
    public static BlockCompressed doubleCompressedCobblestone;
    public static BlockCompressed tripleCompressedCobblestone;
    public static BlockCompressed quadrupleCompressedCobblestone;
    public static BlockCompressed quintupleCompressedCobblestone;
    public static BlockCompressed sextupleCompressedCobblestone;
    public static BlockCompressed septupleCompressedCobblestone;
    public static BlockCompressed octupleCompressedCobblestone;

    // Dirt
    public static BlockCompressed compressedDirt;
    public static BlockCompressed doubleCompressedDirt;
    public static BlockCompressed tripleCompressedDirt;
    public static BlockCompressed quadrupleCompressedDirt;
    public static BlockCompressed quintupleCompressedDirt;
    public static BlockCompressed sextupleCompressedDirt;
    public static BlockCompressed septupleCompressedDirt;
    public static BlockCompressed octupleCompressedDirt;

    // Sand
    public static BlockCompressed compressedSand;
    public static BlockCompressed doubleCompressedSand;
    public static BlockCompressed tripleCompressedSand;
    public static BlockCompressed quadrupleCompressedSand;
    public static BlockCompressed quintupleCompressedSand;
    public static BlockCompressed sextupleCompressedSand;
    public static BlockCompressed septupleCompressedSand;
    public static BlockCompressed octupleCompressedSand;

    // Gravel
    public static BlockCompressed compressedGravel;
    public static BlockCompressed doubleCompressedGravel;
    public static BlockCompressed tripleCompressedGravel;
    public static BlockCompressed quadrupleCompressedGravel;
    public static BlockCompressed quintupleCompressedGravel;
    public static BlockCompressed sextupleCompressedGravel;
    public static BlockCompressed septupleCompressedGravel;
    public static BlockCompressed octupleCompressedGravel;

    // Netherrack
    public static BlockCompressed compressedNetherrack;
    public static BlockCompressed doubleCompressedNetherrack;
    public static BlockCompressed tripleCompressedNetherrack;
    public static BlockCompressed quadrupleCompressedNetherrack;
    public static BlockCompressed quintupleCompressedNetherrack;
    public static BlockCompressed sextupleCompressedNetherrack;
    public static BlockCompressed septupleCompressedNetherrack;
    public static BlockCompressed octupleCompressedNetherrack;

    // Stone
    public static BlockCompressed compressedStone;
    public static BlockCompressed doubleCompressedStone;
    public static BlockCompressed tripleCompressedStone;
    public static BlockCompressed quadrupleCompressedStone;
    public static BlockCompressed quintupleCompressedStone;
    public static BlockCompressed sextupleCompressedStone;
    public static BlockCompressed septupleCompressedStone;
    public static BlockCompressed octupleCompressedStone;


    public static void init() {

        // Cobblestone
        compressedCobblestone = register(new BlockCompressed("compressedCobblestone"));
        doubleCompressedCobblestone = register(new BlockCompressed("doubleCompressedCobblestone"));
        tripleCompressedCobblestone = register(new BlockCompressed("tripleCompressedCobblestone"));
        quadrupleCompressedCobblestone = register(new BlockCompressed("quadrupleCompressedCobblestone"));
        quintupleCompressedCobblestone = register(new BlockCompressed("quintupleCompressedCobblestone"));
        sextupleCompressedCobblestone = register(new BlockCompressed("sextupleCompressedCobblestone"));
        septupleCompressedCobblestone = register(new BlockCompressed("septupleCompressedCobblestone"));
        octupleCompressedCobblestone = register(new BlockCompressed("octupleCompressedCobblestone"));

        // Dirt
        compressedDirt = register(new BlockCompressed("compressedDirt"));
        doubleCompressedDirt = register(new BlockCompressed("doubleCompressedDirt"));
        tripleCompressedDirt = register(new BlockCompressed("tripleCompressedDirt"));
        quadrupleCompressedDirt = register(new BlockCompressed("quadrupleCompressedDirt"));
        quintupleCompressedDirt = register(new BlockCompressed("quintupleCompressedDirt"));
        sextupleCompressedDirt = register(new BlockCompressed("sextupleCompressedDirt"));
        septupleCompressedDirt = register(new BlockCompressed("septupleCompressedDirt"));
        octupleCompressedDirt = register(new BlockCompressed("octupleCompressedDirt"));

        // Sand
        compressedSand = register(new BlockCompressed("compressedSand"));
        doubleCompressedSand = register(new BlockCompressed("doubleCompressedSand"));
        tripleCompressedSand = register(new BlockCompressed("tripleCompressedSand"));
        quadrupleCompressedSand = register(new BlockCompressed("quadrupleCompressedSand"));
        quintupleCompressedSand = register(new BlockCompressed("quintupleCompressedSand"));
        sextupleCompressedSand = register(new BlockCompressed("sextupleCompressedSand"));
        septupleCompressedSand = register(new BlockCompressed("septupleCompressedSand"));
        octupleCompressedSand = register(new BlockCompressed("octupleCompressedSand"));

        // Gravel
        compressedGravel = register(new BlockCompressed("compressedGravel"));
        doubleCompressedGravel = register(new BlockCompressed("doubleCompressedGravel"));
        tripleCompressedGravel = register(new BlockCompressed("tripleCompressedGravel"));
        quadrupleCompressedGravel = register(new BlockCompressed("quadrupleCompressedGravel"));
        quintupleCompressedGravel = register(new BlockCompressed("quintupleCompressedGravel"));
        sextupleCompressedGravel = register(new BlockCompressed("sextupleCompressedGravel"));
        septupleCompressedGravel = register(new BlockCompressed("septupleCompressedGravel"));
        octupleCompressedGravel = register(new BlockCompressed("octupleCompressedGravel"));

        // Netherack
        compressedNetherrack = register(new BlockCompressed("compressedNetherrack"));
        doubleCompressedNetherrack = register(new BlockCompressed("doubleCompressedNetherrack"));
        tripleCompressedNetherrack = register(new BlockCompressed("tripleCompressedNetherrack"));
        quadrupleCompressedNetherrack = register(new BlockCompressed("quadrupleCompressedNetherrack"));
        quintupleCompressedNetherrack = register(new BlockCompressed("quintupleCompressedNetherrack"));
        sextupleCompressedNetherrack = register(new BlockCompressed("sextupleCompressedNetherrack"));
        septupleCompressedNetherrack = register(new BlockCompressed("septupleCompressedNetherrack"));
        octupleCompressedNetherrack = register(new BlockCompressed("octupleCompressedNetherrack"));

        // Stone
        compressedStone = register(new BlockCompressed("compressedStone"));
        doubleCompressedStone = register(new BlockCompressed("doubleCompressedStone"));
        tripleCompressedStone = register(new BlockCompressed("tripleCompressedStone"));
        quadrupleCompressedStone = register(new BlockCompressed("quadrupleCompressedStone"));
        quintupleCompressedStone = register(new BlockCompressed("quintupleCompressedStone"));
        sextupleCompressedStone = register(new BlockCompressed("sextupleCompressedStone"));
        septupleCompressedStone = register(new BlockCompressed("septupleCompressedStone"));
        octupleCompressedStone = register(new BlockCompressed("octupleCompressedStone"));


    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        if (itemBlock != null) {
        GameRegistry.register(itemBlock);

            if (block instanceof ItemModelProvider) {
                ((ItemModelProvider)block).registerItemModel(itemBlock);
            }
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
