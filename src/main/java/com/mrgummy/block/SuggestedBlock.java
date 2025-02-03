package com.mrgummy.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class SuggestedBlock extends Block {
    public SuggestedBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(Text.translatable(stack.getItem().getTranslationKey() + ".tooltip"));
        super.appendTooltip(stack, context, tooltip, options);
    }
}
