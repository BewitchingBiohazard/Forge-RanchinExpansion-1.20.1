package net.bewitchingbiohazard.ranchinexpansionmod.entity.client.pig;

import com.mojang.blaze3d.vertex.PoseStack;
import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.ModModelLayers;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.pig.BerkshireEntity_F;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.concurrent.atomic.AtomicReference;

public class BerkshireRenderer_F extends MobRenderer<BerkshireEntity_F, BerkshireModelF<BerkshireEntity_F>> {
    public BerkshireRenderer_F(EntityRendererProvider.Context pContext) {
        super(pContext, new BerkshireModelF<>(pContext.bakeLayer(ModModelLayers.BERKSHIRE_LAYER)), .5f);
    }

    @Override
    public ResourceLocation getTextureLocation(BerkshireEntity_F berkshireEntityF) {
        AtomicReference<ResourceLocation> resourceLocation = new AtomicReference<>(ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID,
                "textures/entity/berkshire.png"));
        return resourceLocation.get();
    }

    @Override
    public void render(BerkshireEntity_F pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.scale(2.25f, 2.25f, 2.25f);
        if (pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

}
