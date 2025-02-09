package dev.mr0gummy.ask_friends.misc;

import dev.mr0gummy.ask_friends.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class ModCustomTrades {
    public static void registerCustomTrades(){
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.SHARK, 1),
                            12, 5, 0.15f)));
                });
    }
}
