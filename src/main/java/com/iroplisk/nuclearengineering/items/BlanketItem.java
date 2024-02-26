package com.iroplisk.nuclearengineering.items;

import ic2.api.reactor.IReactor;
import ic2.api.reactor.IReactorComponent;
import ic2.api.reactor.ISteamReactor;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class BlanketItem extends Item implements IReactorComponent {
    private final Item resultItem;
    private final int enrichmentDuration;

    public BlanketItem(CreativeModeTab tab, Item resultItem, int enrichmentDuration) {
        super(new Properties().tab(tab).setNoRepair().durability(enrichmentDuration));
        this.resultItem = resultItem;
        this.enrichmentDuration = enrichmentDuration;
    }

    @Override
    public void processChamber(ItemStack itemStack, IReactor iReactor, int i, int i1, boolean b, boolean damageTick) {
    }

    @Override
    public boolean acceptUraniumPulse(ItemStack itemStack, IReactor iReactor, ItemStack itemStack1, int i, int i1, int i2, int i3, boolean heatRun, boolean damageTick) {
        if (damageTick) {
            if (itemStack.getDamageValue() == enrichmentDuration) {
                iReactor.setStackInReactor(i, i1, new ItemStack(resultItem, 1));
            } else {
                itemStack.setDamageValue(1+(iReactor.getHeat() / 3000));
            }
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
