package dev.mr0gummy.ask_friends.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class ChainsawItem extends AxeItem {
    public ChainsawItem( Settings settings) {
        super(ToolMaterial.IRON, 5, -3, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(Text.translatable(stack.getItem().getTranslationKey() + ".tooltip"));
        super.appendTooltip(stack, context, tooltip, options);
    }
}
