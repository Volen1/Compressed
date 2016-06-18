package com.volen.compressed.client;

import com.volen.compressed.Compressed;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CompressedTab extends CreativeTabs {

    public CompressedTab() {
        super(Compressed.modId);
        setBackgroundImageName("item_search.png");

    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(Blocks.COBBLESTONE);



    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
