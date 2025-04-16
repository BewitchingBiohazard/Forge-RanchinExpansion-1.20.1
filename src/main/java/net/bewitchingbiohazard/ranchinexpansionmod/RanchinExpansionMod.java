package net.bewitchingbiohazard.ranchinexpansionmod;

import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.cow.AngusRenderer_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.pig.LandraceRenderer_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.chicken.WyandotteRenderer_F;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.client.pig.SpottedRenderer_F;
import net.bewitchingbiohazard.ranchinexpansionmod.item.ModCreativeModTabs;
import net.bewitchingbiohazard.ranchinexpansionmod.item.ModItems;
import net.bewitchingbiohazard.ranchinexpansionmod.loot.ModLootModifiers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.bewitchingbiohazard.ranchinexpansionmod.entity.ModEntities.*;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RanchinExpansionMod.MOD_ID)
public class RanchinExpansionMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "ranchinexpansionmod";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogManager.getLogger();
;
    public static final boolean DEBUG = false;

    public RanchinExpansionMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModLootModifiers.register(modEventBus);

        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);

        register(modEventBus);
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ANGUS_F.get(), AngusRenderer_F::new);
            EntityRenderers.register(WYANDOTTE_F.get(), WyandotteRenderer_F ::new);
            EntityRenderers.register(LANDRACE_F.get(), LandraceRenderer_F :: new);
            EntityRenderers.register(SPOTTED_F.get(), SpottedRenderer_F:: new);
        }
    }
}
