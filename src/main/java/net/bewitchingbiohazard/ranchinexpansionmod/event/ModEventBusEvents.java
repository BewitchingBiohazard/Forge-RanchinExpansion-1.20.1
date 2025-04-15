package net.bewitchingbiohazard.ranchinexpansionmod.event;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.ModEntities;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.chicken.WyandotteEntity_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.AngusRenderer_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.cow.AngusEntity_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.pig.LandraceEntity_F;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RanchinExpansionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void  registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.ANGUS_F.get(), AngusEntity_F.createAttributes().build());
        event.put(ModEntities.WYANDOTTE_F.get(), WyandotteEntity_F.createAttributes().build());
        event.put(ModEntities.LANDRACE_F.get(), LandraceEntity_F.createAttributes().build());
    }



}
