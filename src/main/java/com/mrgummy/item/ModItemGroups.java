package com.mrgummy.item;

import com.mrgummy.AskFriends;
import com.mrgummy.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ASK_FRIENDS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(AskFriends.MOD_ID, "ask_friends_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.ask_friends"))
                    .icon(() -> new ItemStack(ModItems.BUTTERFLY)).entries((displayParameters, itemStackCollector) -> {
                        itemStackCollector.add(new ItemStack(ModBlocks.BLOCK_OF_CHEESE));
                        itemStackCollector.add(new ItemStack(ModBlocks.CHISELED_PRISMARINE_BRICKS));
                        itemStackCollector.add(new ItemStack(ModBlocks.GLUE));
                        itemStackCollector.add(new ItemStack(ModBlocks.STRAWBERRY_MILK));
                        itemStackCollector.add(new ItemStack(ModBlocks.TV_BLOCK));
                        itemStackCollector.add(new ItemStack(ModItems.BUTTERFLY));
                        itemStackCollector.add(new ItemStack(ModItems.CANTALOUPE));
                        itemStackCollector.add(new ItemStack(ModItems.COFFEE));
                        itemStackCollector.add(new ItemStack(ModItems.CUPCAKE));
                        itemStackCollector.add(new ItemStack(ModItems.ICE_CREAM));
                        itemStackCollector.add(new ItemStack(ModItems.PAINT_BRUSH));
                        itemStackCollector.add(new ItemStack(ModItems.PHONE));
                        itemStackCollector.add(new ItemStack(ModItems.SHARK));
                        itemStackCollector.add(new ItemStack(ModItems.SQUID_HAT));
                        itemStackCollector.add(new ItemStack(ModItems.SUNGLASSES));
                    }).build());


    public static void registerItemGroup() {
    }

}
