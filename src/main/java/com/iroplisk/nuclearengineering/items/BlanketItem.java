package com.iroplisk.nuclearengineering.items;

import ic2.api.reactor.IReactor;
import ic2.api.reactor.IReactorComponent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class BlanketItem extends Item implements IReactorComponent {
    private final Item resultItem;
    public BlanketItem(CreativeModeTab tab, Item resultItem, int enrichmentDuration) {
        super(new Properties().tab(tab).setNoRepair().durability(enrichmentDuration));
        this.resultItem = resultItem;
    }

    @Override
    public void processChamber(ItemStack itemStack, IReactor iReactor, int i, int i1, boolean b, boolean b1) {

    }

    @Override
    public boolean acceptUraniumPulse(ItemStack itemStack, IReactor iReactor, ItemStack itemStack1, int i, int i1, int i2, int i3, boolean b, boolean b1) {
        final int myLevel = itemStack.getDamageValue() - 1 - iReactor.getHeat() / 3000;
        if (myLevel <= 0) {
            iReactor.setStackInReactor(i, i1, new ItemStack(resultItem, 1));
        }
        else {
            itemStack.setDamageValue(myLevel);
        }
        return true;
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
        return 0;
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
