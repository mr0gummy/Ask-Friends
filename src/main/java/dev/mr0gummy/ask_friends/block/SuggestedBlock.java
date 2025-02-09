package dev.mr0gummy.ask_friends.block;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SuggestedBlock extends Block {
    public SuggestedBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.translatable("block.ask_friends." + stack.getItem() + ".tooltip"));
        super.appendTooltip(stack, world, tooltip, options);
    }
}
