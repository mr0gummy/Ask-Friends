package com.mrgummy.mixin;

import com.mrgummy.block.ModBlocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GlassBottleItem.class)
public class GlassBottleItemMixin {

    @Inject(method = "use", at = @At("TAIL"))
    public void use(World world, PlayerEntity user, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
        if (user.getY() > 196) {
            ItemStack item = user.getStackInHand(hand);
            if (item.isEmpty()) {
                user.setStackInHand(hand, new ItemStack(ModBlocks.CLOUD_BLOCK));
            } else if (!user.getInventory().insertStack(new ItemStack(ModBlocks.CLOUD_BLOCK))) {
                user.dropItem(new ItemStack(ModBlocks.CLOUD_BLOCK), false);
            }
        }
    }
}
