package net.bewitchingbiohazard.ranchinexpansionmod.event;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.cow.AngusModelF;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.cow.LonghornModelF;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.pig.*;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.ModModelLayers;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.chicken.WyandotteModelF;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.sheep.HampshireDownModelF;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RanchinExpansionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.ANGUS_LAYER, AngusModelF::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.LONGHORN_LAYER, LonghornModelF::createBodyLayer);

        event.registerLayerDefinition(ModModelLayers.WYANDOTTE_LAYER, WyandotteModelF::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.LEGHORN_LAYER, WyandotteModelF::createBodyLayer);

        event.registerLayerDefinition(ModModelLayers.LANDRACE_LAYER, LandraceModelF::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SPOTTED_LAYER, SpottedModelF::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HAMPSHIRE_LAYER, HampshireModelF::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.DUROC_LAYER, DurocModelF::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BERKSHIRE_LAYER, BerkshireModelF::createBodyLayer);

        event.registerLayerDefinition(ModModelLayers.HAMPSHIREDOWN_LAYER, HampshireDownModelF::createBodyLayer);

    }
}
