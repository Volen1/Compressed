package com.volen.compressed.block;

import com.volen.compressed.compat.top.TOPInfoProvider;
import com.volen.compressed.item.ItemModelProvider;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks implements TOPInfoProvider {

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

    // Andesite
    public static BlockCompressed compressedAndesite;
    public static BlockCompressed doubleCompressedAndesite;
    public static BlockCompressed tripleCompressedAndesite;
    public static BlockCompressed quadrupleCompressedAndesite;
    public static BlockCompressed quintupleCompressedAndesite;
    public static BlockCompressed sextupleCompressedAndesite;
    public static BlockCompressed septupleCompressedAndesite;
    public static BlockCompressed octupleCompressedAndesite;

    // Granite
    public static BlockCompressed compressedGranite;
    public static BlockCompressed doubleCompressedGranite;
    public static BlockCompressed tripleCompressedGranite;
    public static BlockCompressed quadrupleCompressedGranite;
    public static BlockCompressed quintupleCompressedGranite;
    public static BlockCompressed sextupleCompressedGranite;
    public static BlockCompressed septupleCompressedGranite;
    public static BlockCompressed octupleCompressedGranite;

    // Diorite
    public static BlockCompressed compressedDiorite;
    public static BlockCompressed doubleCompressedDiorite;
    public static BlockCompressed tripleCompressedDiorite;
    public static BlockCompressed quadrupleCompressedDiorite;
    public static BlockCompressed quintupleCompressedDiorite;
    public static BlockCompressed sextupleCompressedDiorite;
    public static BlockCompressed septupleCompressedDiorite;
    public static BlockCompressed octupleCompressedDiorite;

    // RedSand
    public static BlockCompressed compressedRedSand;
    public static BlockCompressed doubleCompressedRedSand;
    public static BlockCompressed tripleCompressedRedSand;
    public static BlockCompressed quadrupleCompressedRedSand;
    public static BlockCompressed quintupleCompressedRedSand;
    public static BlockCompressed sextupleCompressedRedSand;
    public static BlockCompressed septupleCompressedRedSand;
    public static BlockCompressed octupleCompressedRedSand;

    // EndStone
    public static BlockCompressed compressedEndStone;
    public static BlockCompressed doubleCompressedEndStone;
    public static BlockCompressed tripleCompressedEndStone;
    public static BlockCompressed quadrupleCompressedEndStone;
    public static BlockCompressed quintupleCompressedEndStone;
    public static BlockCompressed sextupleCompressedEndStone;
    public static BlockCompressed septupleCompressedEndStone;
    public static BlockCompressed octupleCompressedEndStone;


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

        // Andesite
        compressedAndesite = register(new BlockCompressed("compressedAndesite"));
        doubleCompressedAndesite = register(new BlockCompressed("doubleCompressedAndesite"));
        tripleCompressedAndesite = register(new BlockCompressed("tripleCompressedAndesite"));
        quadrupleCompressedAndesite = register(new BlockCompressed("quadrupleCompressedAndesite"));
        quintupleCompressedAndesite = register(new BlockCompressed("quintupleCompressedAndesite"));
        sextupleCompressedAndesite = register(new BlockCompressed("sextupleCompressedAndesite"));
        septupleCompressedAndesite = register(new BlockCompressed("septupleCompressedAndesite"));
        octupleCompressedAndesite = register(new BlockCompressed("octupleCompressedAndesite"));

        // Granite
        compressedGranite = register(new BlockCompressed("compressedGranite"));
        doubleCompressedGranite = register(new BlockCompressed("doubleCompressedGranite"));
        tripleCompressedGranite = register(new BlockCompressed("tripleCompressedGranite"));
        quadrupleCompressedGranite= register(new BlockCompressed("quadrupleCompressedGranite"));
        quintupleCompressedGranite = register(new BlockCompressed("quintupleCompressedGranite"));
        sextupleCompressedGranite = register(new BlockCompressed("sextupleCompressedGranite"));
        septupleCompressedGranite = register(new BlockCompressed("septupleCompressedGranite"));
        octupleCompressedGranite = register(new BlockCompressed("octupleCompressedGranite"));

        // Diorite
        compressedDiorite = register(new BlockCompressed("compressedDiorite"));
        doubleCompressedDiorite = register(new BlockCompressed("doubleCompressedDiorite"));
        tripleCompressedDiorite = register(new BlockCompressed("tripleCompressedDiorite"));
        quadrupleCompressedDiorite= register(new BlockCompressed("quadrupleCompressedDiorite"));
        quintupleCompressedDiorite = register(new BlockCompressed("quintupleCompressedDiorite"));
        sextupleCompressedDiorite = register(new BlockCompressed("sextupleCompressedDiorite"));
        septupleCompressedDiorite = register(new BlockCompressed("septupleCompressedDiorite"));
        octupleCompressedDiorite = register(new BlockCompressed("octupleCompressedDiorite"));

        // RedSand
        compressedRedSand = register(new BlockCompressed("compressedRedSand"));
        doubleCompressedRedSand = register(new BlockCompressed("doubleCompressedRedSand"));
        tripleCompressedRedSand = register(new BlockCompressed("tripleCompressedRedSand"));
        quadrupleCompressedRedSand= register(new BlockCompressed("quadrupleCompressedRedSand"));
        quintupleCompressedRedSand = register(new BlockCompressed("quintupleCompressedRedSand"));
        sextupleCompressedRedSand = register(new BlockCompressed("sextupleCompressedRedSand"));
        septupleCompressedRedSand = register(new BlockCompressed("septupleCompressedRedSand"));
        octupleCompressedRedSand = register(new BlockCompressed("octupleCompressedRedSand"));

        // EndStone
        compressedEndStone = register(new BlockCompressed("compressedEndStone"));
        doubleCompressedEndStone= register(new BlockCompressed("doubleCompressedEndStone"));
        tripleCompressedEndStone = register(new BlockCompressed("tripleCompressedEndStone"));
        quadrupleCompressedEndStone = register(new BlockCompressed("quadrupleCompressedEndStone"));
        quintupleCompressedEndStone= register(new BlockCompressed("quintupleCompressedEndStone"));
        sextupleCompressedEndStone = register(new BlockCompressed("sextupleCompressedEndStone"));
        septupleCompressedEndStone = register(new BlockCompressed("septupleCompressedEndStone"));
        octupleCompressedEndStone = register(new BlockCompressed("octupleCompressedEndStone"));


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

    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
    }
}
