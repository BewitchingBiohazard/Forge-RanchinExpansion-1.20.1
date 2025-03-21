package net.bewitchingbiohazard.ranchinexpansionmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.custom.AngusEntity_F;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.concurrent.atomic.AtomicReference;

public class AngusRenderer_F extends MobRenderer<AngusEntity_F, AngusModelF<AngusEntity_F>> {
    public AngusRenderer_F(EntityRendererProvider.Context pContext) {
        super(pContext, new AngusModelF<>(pContext.bakeLayer(ModModelLayers.ANGUS_LAYER)), .5f);
    }

    @Override
    public ResourceLocation getTextureLocation(AngusEntity_F angusEntityF) {
        AtomicReference<ResourceLocation> resourceLocation = new AtomicReference<>(ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID,
                "textures/entity/angusf.png"));
        return resourceLocation.get();
    }

    @Override
    public void render(AngusEntity_F pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.scale(2.25f, 2.25f, 2.25f);
        if (pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
