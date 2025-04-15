package net.bewitchingbiohazard.ranchinexpansionmod.entity.client;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation ANGUS_LAYER;
    public static final ModelLayerLocation WYANDOTTE_LAYER;
    public static final ModelLayerLocation LANDRACE_LAYER;

    static {
        ANGUS_LAYER = new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "angus_layer"), "main");
    }

    static {
        WYANDOTTE_LAYER = new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "wyandotte_layer"), "main");
    }

    static {
        LANDRACE_LAYER= new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "landrace_layer"), "main");
    }

}
