package dev.mr0gummy.ask_friends.mixin;

import dev.mr0gummy.ask_friends.AskFriends;
import dev.mr0gummy.ask_friends.item.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useHatModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(ModItems.SUNGLASSES) && renderMode == ModelTransformationMode.HEAD) {
            return ((ItemRendererAccessor) this).askFriends$getModels().getModelManager().getModel(new ModelIdentifier(AskFriends.MOD_ID, "sunglasses_worn", "inventory"));
        } else if (stack.isOf(ModItems.SQUID_HAT) && renderMode == ModelTransformationMode.HEAD) {
            return ((ItemRendererAccessor) this).askFriends$getModels().getModelManager().getModel(new ModelIdentifier(AskFriends.MOD_ID, "squid_hat_worn", "inventory"));
        } else if (stack.isOf(ModItems.LEO) && renderMode == ModelTransformationMode.HEAD) {
            return ((ItemRendererAccessor) this).askFriends$getModels().getModelManager().getModel(new ModelIdentifier(AskFriends.MOD_ID, "squid_hat_worn", "inventory"));
        } else if (stack.isOf(ModItems.BANDANA) && renderMode == ModelTransformationMode.HEAD) {
            return ((ItemRendererAccessor) this).askFriends$getModels().getModelManager().getModel(new ModelIdentifier(AskFriends.MOD_ID, "bandana_worn", "inventory"));
        } else if (stack.isOf(ModItems.NIGHT_VISION_GOGGLES) && renderMode == ModelTransformationMode.HEAD) {
            return ((ItemRendererAccessor) this).askFriends$getModels().getModelManager().getModel(new ModelIdentifier(AskFriends.MOD_ID, "night_vision_goggles_worn", "inventory"));
        }
        return value;

    }
}