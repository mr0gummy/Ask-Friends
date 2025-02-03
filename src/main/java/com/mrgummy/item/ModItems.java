package com.mrgummy.item;

import com.mrgummy.AskFriends;
import net.minecraft.item.BlockItem;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;

public class ModItems {
    //batch 1
    public static final Item BUTTERFLY =registerItem("butterfly", SuggestedItem::new, new Item.Settings().maxCount(16));
    public static final Item CANTALOUPE =registerItem("cantaloupe", SuggestedItem::new, new Item.Settings().food(
            new FoodComponent(1, 0.6F, false)));
    public static final Item COFFEE =registerItem("coffee", SuggestedItem::new, new Item.Settings().food(
            new FoodComponent(1, 0.1F, true)));
    public static final Item CUPCAKE =registerItem("cupcake", SuggestedItem::new, new Item.Settings().food(
            new FoodComponent(2, 1F, false)));
    public static final Item ICE_CREAM =registerItem("ice_cream", SuggestedItem::new, new Item.Settings().food(
            new FoodComponent(2, 1F, false)));
    public static final Item PAINT_BRUSH =registerItem("paint_brush", SuggestedItem::new, new Item.Settings().maxCount(1));
    public static final Item PHONE =registerItem("phone", SuggestedItem::new, new Item.Settings().maxCount(1));
    public static final Item SHARK =registerItem("shark", SuggestedItem::new, new Item.Settings());
    public static final Item SQUID_HAT =registerItem("squid_hat", HatItem::new, new Item.Settings().maxCount(1));
    public static final Item LEO =registerItem("leo", HatItem::new, new Item.Settings().maxCount(1).rarity(Rarity.EPIC).fireproof());
    public static final Item SUNGLASSES =registerItem("sunglasses", HatItem::new, new Item.Settings().maxCount(1));

    //batch 2
    public static final Item BANDANA =registerItem("bandana", HatItem::new, new Item.Settings().maxCount(1));
    public static final Item BUTTER =registerItem("butter", SuggestedItem::new, new Item.Settings().maxCount(32).food(
            new FoodComponent(2, 0.75F, true)).useRemainder(Items.BOWL));
    public static final Item CHAINSAW =registerItem("chainsaw", ChainsawItem::new, new Item.Settings().maxCount(1));
    public static final Item MANGO =registerItem("mango", SuggestedItem::new, new Item.Settings().food(
            new FoodComponent(4, 0.3F, false)));
    public static final Item MILKSHAKE =registerItem("milkshake", SuggestedItem::new, new Item.Settings().food(
            new FoodComponent(2, 1F, true)).useRemainder(Items.GLASS));
    public static final Item MUG =registerItem("mug", SuggestedItem::new, new Item.Settings().maxCount(16));
    public static final Item NIGHT_VISION_GOGGLES =registerItem("night_vision_goggles", HatItem::new, new Item.Settings().maxCount(1));
    public static final Item PAINT_BUCKET = registerItem("paint_bucket", SuggestedItem::new, new Item.Settings().maxCount(1));
    public static final Item SPOON = registerItem("spoon", SuggestedItem::new, new Item.Settings().maxCount(1));
    public static final Item TV_REMOTE = registerItem("tv_remote", SuggestedItem::new, new Item.Settings().maxCount(16));

    public static Item registerItem(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.tryParse(AskFriends.MOD_ID, id));
        Item item = (Item)factory.apply(settings.registryKey(key));
        if (item instanceof BlockItem blockItem) {
            blockItem.appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return (Item)Registry.register(Registries.ITEM, key, item);
    }
    public static void registerModItem() {
    }
}
