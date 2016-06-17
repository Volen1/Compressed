package com.volen.compressed.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CompressedCobble extends BlockBase {

    public CompressedCobble(String name) {
        super(Material.ROCK, name);

        setHardness(2f);
        setResistance(32f);
    }

    @Override
    public CompressedCobble setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
