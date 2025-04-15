package net.bewitchingbiohazard.ranchinexpansionmod.item;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.ModEntities;
import net.minecraft.world.item.CreativeModeTab;
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

    public static final RegistryObject<Item> WYANFEMALE_SPAWN_EGG = ITEMS.register("wyanfemale_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.WYANDOTTE_F, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));

    public static final RegistryObject<Item> LANDRACEFEMALE_SPAWN_EGG = ITEMS.register("landracefemale_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.LANDRACE_F, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));

    //Raw Meat - Cow
    public static final RegistryObject<Item> RAW_BRISKET = ITEMS.register("raw_brisket",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_BRISKET)));
    public static final RegistryObject<Item> RAW_CHUCK = ITEMS.register("raw_chuck",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LOIN = ITEMS.register("raw_loin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RIB= ITEMS.register("raw_rib",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SHANK = ITEMS.register("raw_shank",
            () -> new Item(new Item.Properties()));

    //Cooked Meat - Cow
    public static final RegistryObject<Item> COOKED_BRISKET = ITEMS.register("cooked_brisket",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_BRISKET)));
    public static final RegistryObject<Item> COOKED_CHUCK = ITEMS.register("cooked_chuck",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_CHUCK)));
    public static final RegistryObject<Item> COOKED_LOIN = ITEMS.register("cooked_loin",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_LOIN)));
    public static final RegistryObject<Item> COOKED_RIB = ITEMS.register("cooked_rib",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_RIB)));
    public static final RegistryObject<Item> COOKED_SHANK = ITEMS.register("cooked_shank",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_SHANK)));

    public static final RegistryObject<Item> RING = ITEMS.register("ring",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
