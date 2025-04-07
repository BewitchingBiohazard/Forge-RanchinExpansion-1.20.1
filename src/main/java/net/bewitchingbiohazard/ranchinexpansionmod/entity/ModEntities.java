package net.bewitchingbiohazard.ranchinexpansionmod.entity;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.chicken.WyandotteEntity_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.cow.AngusEntity_F;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RanchinExpansionMod.MOD_ID);

    public static final RegistryObject<EntityType<AngusEntity_F>> ANGUS_F =
            ENTITY_TYPES.register("angusfemale", () -> EntityType.Builder.of(AngusEntity_F::new, MobCategory.CREATURE)
                    .sized(1.2f, 1.3f).build("angusfemale"));

    public static final RegistryObject<EntityType<WyandotteEntity_F>> WYANDOTTE_F =
            ENTITY_TYPES.register("wyandottefemale", () -> EntityType.Builder.of(WyandotteEntity_F::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("wyandottefemale"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}