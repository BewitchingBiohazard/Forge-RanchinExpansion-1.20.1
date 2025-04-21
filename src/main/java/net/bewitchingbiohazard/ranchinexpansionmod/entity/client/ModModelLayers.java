package net.bewitchingbiohazard.ranchinexpansionmod.entity.client;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation ANGUS_LAYER;
    public static final ModelLayerLocation LONGHORN_LAYER;

    public static final ModelLayerLocation WYANDOTTE_LAYER;
    public static final ModelLayerLocation LEGHORN_LAYER;

    public static final ModelLayerLocation LANDRACE_LAYER;
    public static final ModelLayerLocation SPOTTED_LAYER;
    public static final ModelLayerLocation HAMPSHIRE_LAYER;
    public static final ModelLayerLocation DUROC_LAYER;
    public static final ModelLayerLocation BERKSHIRE_LAYER;

    public static final ModelLayerLocation HAMPSHIREDOWN_LAYER;

    static {
        ANGUS_LAYER = new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "angus_layer"), "main");
    }

    static {
        LONGHORN_LAYER= new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "longhorn_layer"), "main");
    }

    static {
        WYANDOTTE_LAYER = new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "wyandotte_layer"), "main");
    }
    static {
        LEGHORN_LAYER = new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "leghorn_layer"), "main");
    }

    static {
        LANDRACE_LAYER= new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "landrace_layer"), "main");
    }
    static {
        SPOTTED_LAYER= new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "spotted_layer"), "main");
    }
    static {
        HAMPSHIRE_LAYER= new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "hampshire_layer"), "main");
    }
    static {
        DUROC_LAYER= new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "duroc_layer"), "main");
    }
    static {
        BERKSHIRE_LAYER= new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "berkshire_layer"), "main");
    }

    static {
        HAMPSHIREDOWN_LAYER= new ModelLayerLocation(
                ResourceLocation.fromNamespaceAndPath(RanchinExpansionMod.MOD_ID, "hampshiredown_layer"), "main");
    }

}
