package net.bewitchingbiohazard.ranchinexpansionmod.entity;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.chicken.LeghornEntity_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.chicken.WyandotteEntity_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.cow.AngusEntity_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.cow.LonghornEntity_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.pig.*;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.sheep.HampshireDownEntity_F;
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
    public static final RegistryObject<EntityType<LonghornEntity_F>> LONGHORN_F =
            ENTITY_TYPES.register("longhornfemale", () -> EntityType.Builder.of(LonghornEntity_F::new, MobCategory.CREATURE)
                    .sized(1.2f, 1.3f).build("longhornfemale"));

    public static final RegistryObject<EntityType<WyandotteEntity_F>> WYANDOTTE_F =
            ENTITY_TYPES.register("wyandottefemale", () -> EntityType.Builder.of(WyandotteEntity_F::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("wyandottefemale"));
    public static final RegistryObject<EntityType<LeghornEntity_F>> LEGHORN_F =
            ENTITY_TYPES.register("leghornfemale", () -> EntityType.Builder.of(LeghornEntity_F::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("leghornfemale"));

    public static final RegistryObject<EntityType<LandraceEntity_F>> LANDRACE_F =
            ENTITY_TYPES.register("landracefemale", () -> EntityType.Builder.of(LandraceEntity_F::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("landracefemale"));
    public static final RegistryObject<EntityType<SpottedEntity_F>> SPOTTED_F =
            ENTITY_TYPES.register("spottedfemale", () -> EntityType.Builder.of(SpottedEntity_F::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("spottedfemale"));
    public static final RegistryObject<EntityType<HampshireEntity_F>> HAMPSHIRE_F =
            ENTITY_TYPES.register("hampshirefemale", () -> EntityType.Builder.of(HampshireEntity_F::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("hampshirefemale"));
    public static final RegistryObject<EntityType<DurocEntity_F>> DUROC_F =
            ENTITY_TYPES.register("durocfemale", () -> EntityType.Builder.of(DurocEntity_F::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("durocfemale"));
    public static final RegistryObject<EntityType<BerkshireEntity_F>> BERKSHIRE_F =
            ENTITY_TYPES.register("berkshirefemale", () -> EntityType.Builder.of(BerkshireEntity_F::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("berkshirefemale"));

    public static final RegistryObject<EntityType<HampshireDownEntity_F>> HAMPSHIREDOWN_F =
            ENTITY_TYPES.register("hampshiredownfemale", () -> EntityType.Builder.of(HampshireDownEntity_F::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("hampshiredownfemale"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}