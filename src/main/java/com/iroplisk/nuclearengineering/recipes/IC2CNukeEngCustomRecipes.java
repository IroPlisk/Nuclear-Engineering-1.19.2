package com.iroplisk.nuclearengineering.recipes;

import com.iroplisk.nuclearengineering.NuclearEngineering;
import com.iroplisk.nuclearengineering.items.ItemInit;
import ic2.api.recipes.ingridients.inputs.IInput;
import ic2.api.recipes.ingridients.inputs.ItemInput;
import ic2.core.platform.registries.IC2Items;
import net.minecraft.resources.ResourceLocation;
import ic2.core.IC2;
import net.minecraft.util.Tuple;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class IC2CNukeEngCustomRecipes {
    public static ResourceLocation id(String id){
        return new ResourceLocation(NuclearEngineering.MODID, id);
    }

    public static void init(){
        Item leuingot = ForgeRegistries.ITEMS.getValue(new ResourceLocation("enhancedgeology", "leuingot"));
        Item heuingot = ForgeRegistries.ITEMS.getValue(new ResourceLocation("enhancedgeology", "heuingot"));
        Item mguingot = ForgeRegistries.ITEMS.getValue(new ResourceLocation("enhancedgeology", "mguingot"));
        IC2.RECIPES.get(true).macerator.registerListener(r ->{
            r.addSimpleRecipe(id("leudust"), new ItemStack(ItemInit.DUSTLEU.get()), new ItemStack(leuingot));
            r.addSimpleRecipe(id("heudust"), new ItemStack(ItemInit.DUSTHEU.get()), new ItemStack(heuingot));
            r.addSimpleRecipe(id("mgudust"), new ItemStack(ItemInit.DUSTMGU.get()), new ItemStack(mguingot));
            r.addSimpleRecipe(id("dudust"), new ItemStack(ItemInit.DUSTDU.get()), new ItemStack(IC2Items.URANIUM_ROD_NEAR_DEPLETED));
        });
    }

    public void onCommonSetup(FMLCommonSetupEvent event) {
        IC2CNukeEngCustomRecipes.init();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
    }
}
