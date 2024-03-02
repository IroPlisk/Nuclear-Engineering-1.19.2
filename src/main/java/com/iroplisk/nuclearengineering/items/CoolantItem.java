package com.iroplisk.nuclearengineering.items;

import ic2.api.reactor.planner.SimulatedStack;
import ic2.core.item.reactor.ReactorHeatSpreaderItem;
import net.minecraft.nbt.NumericTag;
import net.minecraft.world.item.ItemStack;

import java.util.List;

public class CoolantItem extends ReactorHeatSpreaderItem {
    public CoolantItem(String itemName, String textureFolder, String textureName) {
        super(itemName, textureFolder, textureName);
    }

    @Override
    public SimulatedStack createSimulationComponent(ItemStack self) {
        return super.createSimulationComponent(self);
    }

    @Override
    public ReactorType getSupportedReactor(ItemStack stack) {
        return super.getSupportedReactor(stack);
    }

    @Override
    public ComponentType getType(ItemStack stack) {
        return super.getType(stack);
    }

    @Override
    public List<ReactorStat> getStats(ItemStack stack) {
        return super.getStats(stack);
    }

    @Override
    public NumericTag getReactorStat(ReactorStat stat, ItemStack stack) {
        return super.getReactorStat(stat, stack);
    }
}
