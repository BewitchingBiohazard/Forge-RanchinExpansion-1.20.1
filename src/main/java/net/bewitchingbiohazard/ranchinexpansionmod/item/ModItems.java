package net.bewitchingbiohazard.ranchinexpansionmod.item;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RanchinExpansionMod.MOD_ID);

    public static final RegistryObject<Item> ANGUSFEMALE_SPAWN_EGG = ITEMS.register("angusfemale_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.ANGUS_F, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));

    //Raw Meat - Cow
    public static final RegistryObject<Item> RAW_BRISKET = ITEMS.register("raw_brisket",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CHUCK = ITEMS.register("raw_chuck",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LOIN = ITEMS.register("raw_loin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RIB= ITEMS.register("raw_rib",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SHANK = ITEMS.register("raw_shank",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
