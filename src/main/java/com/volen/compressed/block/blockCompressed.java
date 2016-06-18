package com.volen.compressed.block;

import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;

public class BlockCompressed extends BlockBase {

    public BlockCompressed(String name) {
        super(Material.ROCK, name);

        setHardness(2f);
        setResistance(32f);
    }

    @Override
    public BlockCompressed setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
