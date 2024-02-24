package com.iroplisk.nuclearengineering.items;

import com.iroplisk.nuclearengineering.NuclearEngineering;
import com.iroplisk.nuclearengineering.NuclearEngineeringCreativeModeTab;
import ic2.core.platform.registries.IC2Items;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NuclearEngineering.MODID);


    // blanket enriched
    public static final RegistryObject<Item> BLANKETENRICHEDDU = ITEMS.register("blanketenricheddu",
            () -> new EnrichedBlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "gamma", 32150));
    public static final RegistryObject<Item> BLANKETENRICHEDHEU = ITEMS.register("blanketenrichedheu",
            () -> new EnrichedBlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "beta", 629));
    public static final RegistryObject<Item> BLANKETENRICHEDI = ITEMS.register("blanketenrichedi",
            () -> new EnrichedBlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "gamma", 22200));
    public static final RegistryObject<Item> BLANKETENRICHEDLEU = ITEMS.register("blanketenrichedleu",
            () -> new EnrichedBlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "alpha", 644));
    public static final RegistryObject<Item> BLANKETENRICHEDMGU = ITEMS.register("blanketenrichedmgu",
            () -> new EnrichedBlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "alpha", 127));
    public static final RegistryObject<Item> BLANKETENRICHEDP = ITEMS.register("blanketenrichedp",
            () -> new EnrichedBlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "beta", 46000));
    public static final RegistryObject<Item> BLANKETENRICHEDS = ITEMS.register("blanketenricheds",
            () -> new EnrichedBlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "gamma", 44000));
    public static final RegistryObject<Item> BLANKETENRICHEDU = ITEMS.register("blanketenrichedu",
            () -> new EnrichedBlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "beta", 5217));
    public static final RegistryObject<Item> BLANKETENRICHEDY = ITEMS.register("blanketenrichedy",
            () -> new EnrichedBlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "beta", 200));

    // blanket base
    public static final RegistryObject<Item> BLANKETDU = ITEMS.register("blanketdu",
            () -> new BlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, ItemInit.BLANKETENRICHEDDU.get(), 15000));
    public static final RegistryObject<Item> BLANKETHEU = ITEMS.register("blanketheu",
            () -> new BlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, ItemInit.BLANKETENRICHEDHEU.get(), 16000));
    public static final RegistryObject<Item> BLANKETI = ITEMS.register("blanketi",
            () -> new BlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, ItemInit.BLANKETENRICHEDI.get(), 7500));
    public static final RegistryObject<Item> BLANKETLEU = ITEMS.register("blanketleu",
            () -> new BlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, ItemInit.BLANKETENRICHEDLEU.get(), 27700));
    public static final RegistryObject<Item> BLANKETMGU = ITEMS.register("blanketmgu",
            () -> new BlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, ItemInit.BLANKETENRICHEDMGU.get(), 8200));
    public static final RegistryObject<Item> BLANKETP = ITEMS.register("blanketp",
            () -> new BlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, ItemInit.BLANKETENRICHEDP.get(), 13000));
    public static final RegistryObject<Item> BLANKETS = ITEMS.register("blankets",
            () -> new BlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, ItemInit.BLANKETENRICHEDS.get(), 12500));
    public static final RegistryObject<Item> BLANKETU = ITEMS.register("blanketu",
            () -> new BlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, ItemInit.BLANKETENRICHEDU.get(), 6500));
    public static final RegistryObject<Item> BLANKETY = ITEMS.register("blankety",
            () -> new BlanketItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, ItemInit.BLANKETENRICHEDY.get(), 25000));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
