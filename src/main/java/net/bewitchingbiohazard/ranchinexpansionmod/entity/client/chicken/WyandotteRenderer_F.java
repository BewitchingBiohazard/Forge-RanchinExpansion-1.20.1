package net.bewitchingbiohazard.ranchinexpansionmod.entity.client.chicken;

import com.mojang.blaze3d.vertex.PoseStack;
import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.chicken.WyandotteEntity_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.ModModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.atomic.AtomicReference;


public class WyandotteRenderer_F extends MobRenderer<WyandotteEntity_F, WyandotteModelF<WyandotteEntity_F>> {
    public WyandotteRenderer_F(EntityRendererProvider.Context pContext) {
        super(pContext, new WyandotteModelF<>(pContext.bakeLayer(ModModelLayers.WYANDOTTE_LAYER)), .5f);
    }

    @Override
    public void render(WyandotteEntity_F pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.scale(2.25f, 2.25f, 2.25f);
        if (pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(WyandotteEntity_F wyandotteEntityF) {
        AtomicReference<ResourceLocation> resourceLocation = new AtomicReference<>(ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID,
                "textures/entity/chickentest.png"));
        return resourceLocation.get();
    }
}
