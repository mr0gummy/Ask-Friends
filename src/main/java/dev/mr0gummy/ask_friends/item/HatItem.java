package dev.mr0gummy.ask_friends.item;


import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class HatItem extends SuggestedItem implements Equipment {


    public HatItem(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.ask_friends.hat"));

        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof LivingEntity living && isWearingHat(living) && stack.getItem() == ModItems.NIGHT_VISION_GOGGLES){
            living.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300));
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


    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }
}

