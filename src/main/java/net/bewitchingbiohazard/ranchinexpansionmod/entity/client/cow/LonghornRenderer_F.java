package net.bewitchingbiohazard.ranchinexpansionmod.entity.client.cow;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.ModModelLayers;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.cow.LonghornEntity_F;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;


public class LonghornRenderer_F extends MobRenderer<LonghornEntity_F, LonghornModelF<LonghornEntity_F>>{


    public LonghornRenderer_F(EntityRendererProvider.Context pContext) {
        super(pContext, new LonghornModelF<>(pContext.bakeLayer(ModModelLayers.LONGHORN_LAYER)), .5f);
    }

    @Override
    public ResourceLocation getTextureLocation(LonghornEntity_F longhornEntityF) {
        AtomicReference<ResourceLocation> resourceLocation = new AtomicReference<>(ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID,
                "textures/entity/longhorn.png"));
        return resourceLocation.get();
    }

    @Override
    public void render(LonghornEntity_F pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.scale(2.25f, 2.25f, 2.25f);
        if (pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
