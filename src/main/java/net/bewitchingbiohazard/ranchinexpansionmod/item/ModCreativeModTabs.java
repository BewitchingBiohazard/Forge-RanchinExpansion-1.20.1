package net.bewitchingbiohazard.ranchinexpansionmod.item;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RanchinExpansionMod.MOD_ID);

    public static RegistryObject<CreativeModeTab> RANCHINEXPANSION_TAB = CREATIVE_MODE_TABS.register("ranchinexpansion_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ANGUSFEMALE_SPAWN_EGG.get()))
                    .title(Component.translatable("creativetab.ranchinexpansion_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //order shown in tab
                        output.accept(ModItems.ANGUSFEMALE_SPAWN_EGG.get());
                        output.accept(ModItems.WYANFEMALE_SPAWN_EGG.get());
                        output.accept(ModItems.LANDRACEFEMALE_SPAWN_EGG.get());
                        output.accept(ModItems.SPOTTEDFEMALE_SPAWN_EGG.get());
                        output.accept(ModItems.RAW_BRISKET.get());
                        output.accept(ModItems.COOKED_BRISKET.get());
                        output.accept(ModItems.RAW_CHUCK.get());
                        output.accept(ModItems.COOKED_CHUCK.get());
                        output.accept(ModItems.RAW_LOIN.get());
                        output.accept(ModItems.COOKED_LOIN.get());
                        output.accept(ModItems.RAW_RIB.get());
                        output.accept(ModItems.COOKED_RIB.get());
                        output.accept(ModItems.RAW_SHANK.get());
                        output.accept(ModItems.COOKED_SHANK.get());
                        output.accept(ModItems.RING.get());

                    })
                    .build());
    // REPLACE ICON ABOVE

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
