package com.mrgummy.blocks;

import com.mrgummy.AskFriends;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AirBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.createLightLevelFromLitBlockState;

public class ModBlocks {

    public static final Block BLOCK_OF_CHEESE =registerBlock("block_of_cheese", new SuggestedBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CANDLE).mapColor(MapColor.OAK_TAN)));
    public static final Block CHISELED_PRISMARINE_BRICKS =registerBlock("chiseled_prismarine_bricks", new SuggestedBlock(FabricBlockSettings.create().mapColor(MapColor.CYAN).instrument(Instrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block GLUE =registerBlock("glue", new GlueBlock(FabricBlockSettings.create().nonOpaque().mapColor(MapColor.ORANGE).pistonBehavior(PistonBehavior.DESTROY).breakInstantly().notSolid()));
    public static final Block STRAWBERRY_MILK = registerBlock("strawberry_milk", new StrawberryMilkBlock(FabricBlockSettings.create().mapColor(MapColor.PINK).strength(0.1F).sounds(BlockSoundGroup.CANDLE)));
    public static final Block TV_BLOCK =registerBlock("tv_block", new TVBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).notSolid().nonOpaque().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS)));


    private  static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AskFriends.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AskFriends.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void regiterModBlock() {
    }

}

