package com.mrgummy.item;

import com.mrgummy.AskFriends;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AskFriends.MOD_ID, name), item);
    }
    public static void registerModItem() {
    }
}
