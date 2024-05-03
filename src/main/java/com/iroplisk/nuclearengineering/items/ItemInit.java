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

    //polveri
    public static final RegistryObject<Item> DUSTA = ITEMS.register("dusta",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "alpha", 127));
    public static final RegistryObject<Item> DUSTCE = ITEMS.register("dustce",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "gamma", 32150));
    public static final RegistryObject<Item> DUSTCO = ITEMS.register("dustco",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "gamma", 44000));
    public static final RegistryObject<Item> DUSTIO = ITEMS.register("dustio",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "beta", 46000));
    public static final RegistryObject<Item> DUSTIR = ITEMS.register("dustir",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "gamma", 22200));
    public static final RegistryObject<Item> DUSTM = ITEMS.register("dustm",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "beta", 629));
    public static final RegistryObject<Item> DUSTP = ITEMS.register("dustp",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "alpha", 644));
    public static final RegistryObject<Item> DUSTSR = ITEMS.register("dustsr",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "beta", 5217));
    public static final RegistryObject<Item> DUSTY = ITEMS.register("dusty",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "beta", 200));
    public static final RegistryObject<Item> DUSTDU = ITEMS.register("dustdu",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "alpha", 1));
    public static final RegistryObject<Item> DUSTHEU = ITEMS.register("dustheu",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "alpha", 14));
    public static final RegistryObject<Item> DUSTMGU = ITEMS.register("dustmgu",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "alpha", 37));
    public static final RegistryObject<Item> DUSTLEU = ITEMS.register("dustleu",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "alpha", 5));



    //pellet
    public static final RegistryObject<Item> PELLETA = ITEMS.register("pelleta",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "alpha", 127));
    public static final RegistryObject<Item> PELLETCE = ITEMS.register("pelletce",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "gamma", 32150));
    public static final RegistryObject<Item> PELLETCO = ITEMS.register("pelletco",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "gamma", 44000));
    public static final RegistryObject<Item> PELLETIO = ITEMS.register("pelletio",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "beta", 46000));
    public static final RegistryObject<Item> PELLETIR = ITEMS.register("pelletir",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "gamma", 22000));
    public static final RegistryObject<Item> PELLETM = ITEMS.register("pelletm",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "beta", 629));
    public static final RegistryObject<Item> PELLETP = ITEMS.register("pelletp",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "alpha", 644));
    public static final RegistryObject<Item> PELLETSR = ITEMS.register("pelletsr",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "beta", 5217));
    public static final RegistryObject<Item> PELLETY = ITEMS.register("pellety",
            () -> new RadioactiveDustItem(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB, "beta", 200));

    // roba per gli rtg
    public static final RegistryObject<Item> CERAMIC_PLATE = ITEMS.register("ceramic_plate",
            () -> new Item(new Item.Properties().tab(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB).stacksTo(64)));
    public static final RegistryObject<Item> THERMO_JUNCTION = ITEMS.register("thermo_junction",
            () -> new Item(new Item.Properties().tab(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB).stacksTo(64)));
    public static final RegistryObject<Item> SMALL_THERMO_GEN = ITEMS.register("small_thermo_gen",
            () -> new Item(new Item.Properties().tab(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB).stacksTo(64)));
    public static final RegistryObject<Item> LARGE_THERMO_GEN = ITEMS.register("large_thermo_gen",
            () -> new Item(new Item.Properties().tab(NuclearEngineeringCreativeModeTab.NUCLEAR_ENGINEERING_CREATIVE_MODE_TAB).stacksTo(64)));
    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
