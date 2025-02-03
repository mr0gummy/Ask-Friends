package com.mrgummy.item;

import com.mrgummy.AskFriends;
import com.mrgummy.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ASK_FRIENDS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.tryParse(AskFriends.MOD_ID, "ask_friends_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.ask_friends"))
                    .icon(() -> new ItemStack(ModItems.BUTTERFLY)).entries((displayParameters, entries) -> {
                        entries.add(ModBlocks.BLOCK_OF_CHEESE);
                        entries.add(ModBlocks.CHISELED_PRISMARINE_BRICKS);
                        entries.add(ModBlocks.GLUE);
                        entries.add(ModBlocks.STRAWBERRY_MILK);
                        entries.add(ModBlocks.TV_BLOCK);
                        entries.add(ModItems.BUTTERFLY);
                        entries.add(ModItems.CANTALOUPE);
                        entries.add(ModItems.COFFEE);
                        entries.add(ModItems.CUPCAKE);
                        entries.add(ModItems.ICE_CREAM);
                        entries.add(ModItems.PAINT_BRUSH);
                        entries.add(ModItems.PHONE);
                        entries.add(ModItems.SHARK);
                        entries.add(ModItems.SQUID_HAT);
                        entries.add(ModItems.SUNGLASSES);
                        entries.add(ModBlocks.ASH_BLOCK);
                        entries.add(ModBlocks.BLOCK_OF_SALT);
                        entries.add(ModBlocks.CONCRETE);
                        entries.add(ModBlocks.OPALIZED_WOOD);
                        entries.add(ModBlocks.CLOUD_BLOCK);
                        entries.add(ModItems.BANDANA);
                        entries.add(ModItems.BUTTER);
                        entries.add(ModItems.CHAINSAW);
                        entries.add(ModItems.MANGO);
                        entries.add(ModItems.MILKSHAKE);
                        entries.add(ModItems.MUG);
                        entries.add(ModItems.NIGHT_VISION_GOGGLES);
                        entries.add(ModItems.PAINT_BUCKET);
                        entries.add(ModItems.SPOON);
                        entries.add(ModItems.TV_REMOTE);
                    }).build());




    public static void registerItemGroup() {
    }

}
