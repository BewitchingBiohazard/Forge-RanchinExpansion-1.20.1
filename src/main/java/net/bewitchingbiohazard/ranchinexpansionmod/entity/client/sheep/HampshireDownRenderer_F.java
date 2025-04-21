package net.bewitchingbiohazard.ranchinexpansionmod.entity.client.sheep;

import com.mojang.blaze3d.vertex.PoseStack;
import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.ModModelLayers;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.pig.HampshireModelF;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.pig.HampshireEntity_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.sheep.HampshireDownEntity_F;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.concurrent.atomic.AtomicReference;

public class HampshireDownRenderer_F extends MobRenderer<HampshireDownEntity_F, HampshireDownModelF<HampshireDownEntity_F>> {
    public HampshireDownRenderer_F(EntityRendererProvider.Context pContext) {
        super(pContext, new HampshireDownModelF<>(pContext.bakeLayer(ModModelLayers.HAMPSHIREDOWN_LAYER)), .5f);
    }

    @Override
    public ResourceLocation getTextureLocation(HampshireDownEntity_F hampshireDownEntityF) {
        AtomicReference<ResourceLocation> resourceLocation = new AtomicReference<>(ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID,
                "textures/entity/hampshiredown.png"));
        return resourceLocation.get();
    }

    @Override
    public void render(HampshireDownEntity_F pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.scale(1.5f, 1.4f, 1.5f);
        if (pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

}
