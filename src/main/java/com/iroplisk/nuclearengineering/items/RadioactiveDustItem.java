package com.iroplisk.nuclearengineering.items;

import ic2.core.platform.registries.IC2Items;
import ic2.core.platform.registries.IC2Potions;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class RadioactiveDustItem extends Item {

    private int ticks = 0;
    private final String decayMode;
    private final int specificActivity;

    public RadioactiveDustItem(CreativeModeTab tab, String decayMode, int specificActivity) {
        super(new Properties().tab(tab).stacksTo(64));
        this.decayMode = decayMode;
        this.specificActivity = specificActivity;
    }

    private boolean armorBool(Player player) {
        for (ItemStack stack : player.getArmorSlots()) {
            if (!stack.isEmpty()) {
                return true; // Player has armor equipped
            }
        }
        return false; // Player has no armor equipped
    }


    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int i, boolean bool) {
        super.inventoryTick(stack, level, entity, i, bool);

        ticks++;
        if (ticks%20==0) {

            Player player = (Player) entity;
            ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
            ItemStack chestplate = player.getItemBySlot(EquipmentSlot.CHEST);
            ItemStack leggings = player.getItemBySlot(EquipmentSlot.LEGS);
            ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);
            Random random = new Random();
            int chance = random.nextInt(100000);
            switch(decayMode) {
                case "alpha":
                    if (helmet.getItem() != IC2Items.HAZMAT_HELMET & chance < specificActivity) {
                        //Main.nukeLog.info(player.username + " ha preso danno alfa");
                        if (!player.isAffectedByPotions()) {
                            player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 3600, 1));
                            player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 1100, 1));
                        }
                    }
                    break;
                case "beta":
                    if (helmet.getItem() != IC2Items.HAZMAT_HELMET && armorBool(player) && chance < specificActivity) {
                        //Main.nukeLog.info(player.username + " ha preso danno beta");
                        if (!player.isAffectedByPotions()) {
                            player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 3600, 1));
                            player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 1100, 2));
                        }
                        if (!player.isOnFire()) {
                            player.setSecondsOnFire(10);
                        }
                    }
                    break;
                case "gamma":
                    if (helmet.getItem() != IC2Items.HAZMAT_HELMET && chestplate.getItem() != IC2Items.HAZMAT_CHEST && leggings.getItem() != IC2Items.HAZMAT_LEGGINGS && boots.getItem() != IC2Items.HAZMAT_BOOTS && chance < specificActivity) {
                        //Main.nukeLog.info(player.username + " ha preso danno gamma");
                        if (!player.hasEffect(MobEffects.HUNGER) && !player.hasEffect(MobEffects.CONFUSION) && !player.hasEffect(IC2Potions.RADIATION)) {
                            player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 3600, 1));
                            player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 1100, 2));
                            player.addEffect(new MobEffectInstance(IC2Potions.RADIATION, 200, 0));
                        }
                    }
                    break;
            }
        }
    }

    @Override
    public boolean isFoil(ItemStack p_41453_) {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);

        tooltip.add(Component.literal("\247bMain decay type: \247e" + decayMode));
        switch(specificActivity) {
            case 0:
                tooltip.add(Component.literal("\247bSpecific activity: \247enegligible"));
                break;
            default:
                tooltip.add(Component.literal("\247bSpecific activity: \247e" + specificActivity + " GBq/g"));
                break;
        }
    }
}
