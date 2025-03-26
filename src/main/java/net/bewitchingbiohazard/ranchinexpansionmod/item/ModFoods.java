package net.bewitchingbiohazard.ranchinexpansionmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RAW_BRISKET = new FoodProperties.Builder().nutrition(3).fast().
            saturationMod(0.3f).meat().build();
    public static final FoodProperties COOKED_BRISKET = new FoodProperties.Builder().nutrition(8).fast().
            saturationMod(0.8f).meat().build();

    public static final FoodProperties COOKED_CHUCK = new FoodProperties.Builder().nutrition(8).fast().
            saturationMod(0.8f).meat().build();

    public static final FoodProperties COOKED_LOIN = new FoodProperties.Builder().nutrition(8).fast().
            saturationMod(0.8f).meat().build();

    public static final FoodProperties COOKED_RIB = new FoodProperties.Builder().nutrition(8).fast().
            saturationMod(0.8f).meat().build();

    public static final FoodProperties COOKED_SHANK = new FoodProperties.Builder().nutrition(8).fast().
            saturationMod(0.8f).meat().build();
}
