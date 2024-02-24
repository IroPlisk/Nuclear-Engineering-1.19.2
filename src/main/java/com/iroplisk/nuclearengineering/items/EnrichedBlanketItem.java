package com.iroplisk.nuclearengineering.items;

import ic2.api.reactor.IReactor;
import ic2.api.reactor.IReactorComponent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class EnrichedBlanketItem extends RadioactiveItem implements IReactorComponent {


    public EnrichedBlanketItem(CreativeModeTab tab, String decayMode, int specificActivity) {
        super(tab, decayMode, specificActivity);
    }

    @Override
    public void processChamber(ItemStack itemStack, IReactor iReactor, int i, int i1, boolean b, boolean b1) {

    }

    @Override
    public boolean acceptUraniumPulse(ItemStack itemStack, IReactor iReactor, ItemStack itemStack1, int i, int i1, int i2, int i3, boolean b, boolean b1) {
        return false;
    }

    @Override
    public boolean canStoreHeat(ItemStack itemStack, IReactor iReactor, int i, int i1) {
        return false;
    }

    @Override
    public int getStoredHeat(ItemStack itemStack, IReactor iReactor, int i, int i1) {
        return 0;
    }

    @Override
    public int getMaxStoredHeat(ItemStack itemStack, IReactor iReactor, int i, int i1) {
        return 99999;
    }

    @Override
    public int storeHeat(ItemStack itemStack, IReactor iReactor, int i, int i1, int i2) {
        return 0;
    }

    @Override
    public float getExplosionInfluence(ItemStack itemStack, IReactor iReactor) {
        return 0;
    }
}
