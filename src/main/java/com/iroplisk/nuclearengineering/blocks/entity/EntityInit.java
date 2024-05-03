package com.iroplisk.nuclearengineering.blocks.entity;

import com.iroplisk.nuclearengineering.NuclearEngineering;
import com.iroplisk.nuclearengineering.blocks.BlockInit;
import com.iroplisk.nuclearengineering.blocks.custom.RTGBlockGongGorn;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, NuclearEngineering.MODID);

    public static final RegistryObject<BlockEntityType<RTGBlockBetaEntity>> RTG_BASE =
            BLOCK_ENTITIES.register("rtg_beta", () ->
                    BlockEntityType.Builder.of(RTGBlockBetaEntity::new,
                            BlockInit.RTG_BETA.get()).build(null));
    public static final RegistryObject<BlockEntityType<RTGBlockEfirEntity>> RTG_EFIR =
            BLOCK_ENTITIES.register("rtg_efir", () ->
                    BlockEntityType.Builder.of(RTGBlockEfirEntity::new,
                            BlockInit.RTG_EFIR.get()).build(null));
    public static final RegistryObject<BlockEntityType<RTGBlockGongGornEntity>> RTG_GONG_GORN =
            BLOCK_ENTITIES.register("rtg_gong_gorn", () ->
                    BlockEntityType.Builder.of(RTGBlockGongGornEntity::new,
                            BlockInit.RTG_GONG_GORN.get()).build(null));
    public static final RegistryObject<BlockEntityType<RTGBlockIEUEntity>> RTG_IEU =
            BLOCK_ENTITIES.register("rtg_ieu", () ->
                    BlockEntityType.Builder.of(RTGBlockIEUEntity::new,
                            BlockInit.RTG_IEU.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
