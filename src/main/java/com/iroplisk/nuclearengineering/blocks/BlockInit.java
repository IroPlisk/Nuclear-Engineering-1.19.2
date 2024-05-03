package com.iroplisk.nuclearengineering.blocks;

import com.iroplisk.nuclearengineering.NuclearEngineering;
import com.iroplisk.nuclearengineering.NuclearEngineeringCreativeModeTab;
import com.iroplisk.nuclearengineering.blocks.custom.RTGBlockBeta;
import com.iroplisk.nuclearengineering.blocks.custom.RTGBlockEfir;
import com.iroplisk.nuclearengineering.blocks.custom.RTGBlockGongGorn;
import com.iroplisk.nuclearengineering.blocks.custom.RTGBlockIEU;
import com.iroplisk.nuclearengineering.items.ItemInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NuclearEngineering.MODID);

    public static final RegistryObject<Block> RTG_BETA = registerBlock("rtg_beta",
            () -> new RTGBlockBeta(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).noOcclusion()), NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> RTG_EFIR = registerBlock("rtg_efir",
            () -> new RTGBlockEfir(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).noOcclusion()), NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> RTG_GONG_GORN = registerBlock("rtg_gong_gorn",
            () -> new RTGBlockGongGorn(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).noOcclusion()), NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> RTG_IEU = registerBlock("rtg_ieu",
            () -> new RTGBlockIEU(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).noOcclusion()), NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
