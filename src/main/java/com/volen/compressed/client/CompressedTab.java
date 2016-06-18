package com.volen.compressed.client;

import com.volen.compressed.Compressed;
import net.minecraft.creativetab.*;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CompressedTab extends CreativeTabs {

    public CompressedTab() {
        super(Compressed.modId);
    }

    @Override
    public Item getTabIconItem() {
        return Items.FEATHER;
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
