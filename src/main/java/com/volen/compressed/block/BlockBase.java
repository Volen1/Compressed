package com.volen.compressed.block;

import com.volen.compressed.Compressed;
import com.volen.compressed.item.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class BlockBase extends Block implements ItemModelProvider {

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(Compressed.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {
        Compressed.proxy.registerItemRenderer(item, 0, name);
    }


    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
