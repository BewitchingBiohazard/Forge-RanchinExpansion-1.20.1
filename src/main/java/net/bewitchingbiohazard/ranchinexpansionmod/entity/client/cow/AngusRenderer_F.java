package net.bewitchingbiohazard.ranchinexpansionmod.entity.client.cow;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.ModModelLayers;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.cow.AngusEntity_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.variant.AngusVariant;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;


public class AngusRenderer_F extends MobRenderer<AngusEntity_F, AngusModelF<AngusEntity_F>>{


    public AngusRenderer_F(EntityRendererProvider.Context pContext) {
        super(pContext, new AngusModelF<>(pContext.bakeLayer(ModModelLayers.ANGUS_LAYER)), .5f);
    }

    public static final Map<AngusVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(AngusVariant.class), (p_114874_) -> {
                p_114874_.put(AngusVariant.BLACK,
                        new ResourceLocation(RanchinExpansionMod.MOD_ID,  "textures/entity/angusblack.png"));
                p_114874_.put(AngusVariant.RED,
                        new ResourceLocation(RanchinExpansionMod.MOD_ID,  "textures/entity/angusred.png"));
            });

    @Override
    public void render(AngusEntity_F pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.scale(2.25f, 2.25f, 2.25f);

        if (pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

    @Override
    public ResourceLocation getTextureLocation(AngusEntity_F instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }
}
