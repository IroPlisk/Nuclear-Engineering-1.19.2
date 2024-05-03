package com.iroplisk.nuclearengineering.handlers;

import com.iroplisk.nuclearengineering.NuclearEngineering;
import com.iroplisk.nuclearengineering.blocks.custom.RTGBlockBeta;
import com.iroplisk.nuclearengineering.blocks.custom.RTGBlockEfir;
import com.iroplisk.nuclearengineering.blocks.custom.RTGBlockGongGorn;
import com.iroplisk.nuclearengineering.blocks.custom.RTGBlockIEU;
import ic2.core.platform.registries.IC2Potions;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NuclearEngineering.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Events {


    // cancrizzatore di RTG
    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        if(!event.getPlayer().isCreative()) {
            if (event.getState().getBlock() instanceof RTGBlockBeta || event.getState().getBlock() instanceof RTGBlockEfir || event.getState().getBlock() instanceof RTGBlockGongGorn || event.getState().getBlock() instanceof RTGBlockIEU) {
                event.getPlayer().addEffect(new MobEffectInstance(MobEffects.HUNGER, 3600, 1));
                event.getPlayer().addEffect(new MobEffectInstance(MobEffects.CONFUSION, 1100, 2));
                event.getPlayer().addEffect(new MobEffectInstance(IC2Potions.RADIATION, 500, 0));
            }
        }
    }

    public Events() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
