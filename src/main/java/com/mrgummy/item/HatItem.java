package com.mrgummy.item;


import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.EquippableComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;


public class HatItem extends SuggestedItem {


    public HatItem(Settings settings) {
        super(settings.component(DataComponentTypes.EQUIPPABLE, EquippableComponent.builder(EquipmentSlot.HEAD).swappable(false).build()));
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(Text.translatable("item.ask_friends.hat"));
        super.appendTooltip(stack, context, tooltip, options);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof LivingEntity living && isWearingHat(living)){
            if (living.getEquippedStack(EquipmentSlot.HEAD).getItem().equals(ModItems.NIGHT_VISION_GOGGLES)) {
                living.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300));
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    public static boolean isWearingHat(LivingEntity livingEntity) {
        return getWornHat(livingEntity) != ItemStack.EMPTY;
    }

    public static ItemStack getWornHat(LivingEntity livingEntity) {
        Item component = livingEntity.getEquippedStack(EquipmentSlot.HEAD).getItem();
        if (component instanceof HatItem) {
            return component.getDefaultStack();
        }
        return ItemStack.EMPTY;
    }
}

