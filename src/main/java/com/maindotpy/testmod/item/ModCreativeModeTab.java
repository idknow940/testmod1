package com.maindotpy.testmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOD_TAB = new CreativeModeTab("testModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SOUL_ITEM.get());
        }
    };
}
