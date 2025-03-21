package net.bewitchingbiohazard.ranchinexpansionmod.entity.client;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation ANGUS_LAYER;

    static {
        ANGUS_LAYER = new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "angus_layer"), "main");
    }

}
