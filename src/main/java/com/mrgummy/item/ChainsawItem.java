package com.mrgummy.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ChainsawItem extends AxeItem {
    public ChainsawItem( Settings settings) {
        super(ToolMaterials.IRON, 5, -3, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.ask_friends." + stack.getItem() + ".tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
