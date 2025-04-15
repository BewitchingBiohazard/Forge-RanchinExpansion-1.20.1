package net.bewitchingbiohazard.ranchinexpansionmod.datagen;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.item.ModItems;
import net.bewitchingbiohazard.ranchinexpansionmod.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, RanchinExpansionMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("raw_brisket_from_angus", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/angusfemale")).build()} , ModItems.RAW_BRISKET.get()));
    }
      //  add("raw_chuck_from_angus", new AddItemModifier(new LootItemCondition[]{
              //  new LootTableIdCondition.Builder(new ResourceLocation("entities/angusfemale")).build()} , ModItems.RAW_CHUCK.get()));
    //}
}
