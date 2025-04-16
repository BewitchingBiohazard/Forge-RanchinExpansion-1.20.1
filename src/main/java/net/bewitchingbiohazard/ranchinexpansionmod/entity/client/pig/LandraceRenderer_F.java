package net.bewitchingbiohazard.ranchinexpansionmod.entity.client.pig;

import com.mojang.blaze3d.vertex.PoseStack;
import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.ModModelLayers;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.pig.LandraceEntity_F;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.concurrent.atomic.AtomicReference;

public class LandraceRenderer_F extends MobRenderer<LandraceEntity_F, LandraceModelF<LandraceEntity_F>> {
    public LandraceRenderer_F(EntityRendererProvider.Context pContext) {
        super(pContext, new LandraceModelF<>(pContext.bakeLayer(ModModelLayers.LANDRACE_LAYER)), .5f);
    }

    @Override
    public ResourceLocation getTextureLocation(LandraceEntity_F landraceEntityF) {
        AtomicReference<ResourceLocation> resourceLocation = new AtomicReference<>(ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID,
                "textures/entity/landrace.png"));
        return resourceLocation.get();
    }

    @Override
    public void render(LandraceEntity_F pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.scale(2.25f, 2.25f, 2.25f);
        if (pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

}
