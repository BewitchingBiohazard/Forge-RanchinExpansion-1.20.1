package net.bewitchingbiohazard.ranchinexpansionmod.event;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.cow.AngusModelF;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.pig.LandraceModelF;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.ModModelLayers;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.chicken.WyandotteModelF;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.pig.SpottedModelF;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RanchinExpansionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.ANGUS_LAYER, AngusModelF::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.WYANDOTTE_LAYER, WyandotteModelF::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.LANDRACE_LAYER, LandraceModelF::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SPOTTED_LAYER, SpottedModelF::createBodyLayer);
    }
}
