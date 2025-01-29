package com.mrgummy.item;

import com.mrgummy.AskFriends;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    //batch 1
    public static final Item BUTTERFLY =registerItem("butterfly", new SuggestedItem(new FabricItemSettings().maxCount(16)));
    public static final Item CANTALOUPE =registerItem("cantaloupe", new SuggestedItem(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.6F)
                    .snack()
                    .build())));
    public static final Item COFFEE =registerItem("coffee", new SuggestedItem(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.1F)
                    .snack()
                    .alwaysEdible()
                    .build())));
    public static final Item CUPCAKE =registerItem("cupcake", new SuggestedItem(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .hunger(2)
                    .saturationModifier(1F)
                    .build())));
    public static final Item ICE_CREAM =registerItem("ice_cream", new SuggestedItem(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .hunger(2)
                    .saturationModifier(1F)
                    .build())));
    public static final Item PAINT_BRUSH =registerItem("paint_brush", new SuggestedItem(new FabricItemSettings().maxCount(1)));
    public static final Item PHONE =registerItem("phone", new SuggestedItem(new FabricItemSettings().maxCount(1)));
    public static final Item SHARK =registerItem("shark", new SuggestedItem(new FabricItemSettings()));
    public static final Item SQUID_HAT =registerItem("squid_hat", new HatItem(new FabricItemSettings().maxCount(1)));
    public static final Item LEO =registerItem("leo", new HatItem(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC).fireproof()));
    public static final Item SUNGLASSES =registerItem("sunglasses", new HatItem(new FabricItemSettings().maxCount(1)));

    //batch 2
    public static final Item BANDANA =registerItem("bandana", new HatItem(new FabricItemSettings().maxCount(1)));
    public static final Item BUTTER =registerItem("butter", new SuggestedItem(new FabricItemSettings().maxCount(32).food(
            new FoodComponent.Builder()

                    .hunger(2)
                    .saturationModifier(0.75F)
                    .snack()
                    .alwaysEdible()
                    .build()
    )));
    public static final Item CHAINSAW =registerItem("chainsaw", new ChainsawItem(new FabricItemSettings().maxCount(1)));
    public static final Item MANGO =registerItem("mango", new SuggestedItem(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .hunger(4)
                    .saturationModifier(0.3F)
                    .build()
    )));
    public static final Item MILKSHAKE =registerItem("milkshake", new SuggestedItem(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .hunger(2)
                    .saturationModifier(1F)
                    .build())));
    public static final Item MUG =registerItem("mug", new SuggestedItem(new FabricItemSettings().maxCount(16)));
    public static final Item NIGHT_VISION_GOGGLES =registerItem("night_vision_goggles", new HatItem(new FabricItemSettings().maxCount(1)));
    public static final Item PAINT_BUCKET = registerItem("paint_bucket", new SuggestedItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPOON = registerItem("spoon", new SuggestedItem(new FabricItemSettings().maxCount(1)));
    public static final Item TV_REMOTE = registerItem("tv_remote", new SuggestedItem(new FabricItemSettings().maxCount(16)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AskFriends.MOD_ID, name), item);
    }
    public static void registerModItem() {
    }
}
