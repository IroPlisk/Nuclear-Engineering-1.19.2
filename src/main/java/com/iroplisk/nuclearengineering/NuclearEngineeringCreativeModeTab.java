package com.iroplisk.nuclearengineering;

import com.iroplisk.nuclearengineering.items.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class NuclearEngineeringCreativeModeTab extends CreativeModeTab{
        public static final NuclearEngineeringCreativeModeTab NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB = new NuclearEngineeringCreativeModeTab(CreativeModeTab.TABS.length, "nuclearengineering");
        private NuclearEngineeringCreativeModeTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.BLANKETDU.get());
        }
}

