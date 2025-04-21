package net.bewitchingbiohazard.ranchinexpansionmod.event;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.ModEntities;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.chicken.WyandotteEntity_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.cow.AngusEntity_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.cow.LonghornEntity_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.pig.*;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.sheep.HampshireDownEntity_F;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RanchinExpansionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void  registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.ANGUS_F.get(), AngusEntity_F.createAttributes().build());
        event.put(ModEntities.LONGHORN_F.get(), LonghornEntity_F.createAttributes().build());

        event.put(ModEntities.WYANDOTTE_F.get(), WyandotteEntity_F.createAttributes().build());
        event.put(ModEntities.LEGHORN_F.get(), WyandotteEntity_F.createAttributes().build());


        event.put(ModEntities.LANDRACE_F.get(), LandraceEntity_F.createAttributes().build());
        event.put(ModEntities.SPOTTED_F.get(), SpottedEntity_F.createAttributes().build());
        event.put(ModEntities.HAMPSHIRE_F.get(), HampshireEntity_F.createAttributes().build());
        event.put(ModEntities.DUROC_F.get(), DurocEntity_F.createAttributes().build());
        event.put(ModEntities.BERKSHIRE_F.get(), BerkshireEntity_F.createAttributes().build());

        event.put(ModEntities.HAMPSHIREDOWN_F.get(), HampshireDownEntity_F.createAttributes().build());
    }
}
