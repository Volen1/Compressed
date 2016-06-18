package com.volen.compressed.block;

import com.volen.compressed.item.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static BlockCompressed compressedCobblestone;
    public static BlockCompressed doubleCompressedCobblestone;
    public static BlockCompressed tripleCompressedCobblestone;
    public static BlockCompressed quadrupleCompressedCobblestone;

    public static void init() {
        compressedCobblestone = register(new BlockCompressed("compressedCobblestone"));
        doubleCompressedCobblestone = register(new BlockCompressed("doubleCompressedCobblestone"));
        tripleCompressedCobblestone = register(new BlockCompressed("tripleCompressedCobblestone"));
        quadrupleCompressedCobblestone = register(new BlockCompressed("quadrupleCompressedCobblestone"));
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
