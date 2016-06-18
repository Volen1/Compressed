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
