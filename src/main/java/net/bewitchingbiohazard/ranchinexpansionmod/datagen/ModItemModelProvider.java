package net.bewitchingbiohazard.ranchinexpansionmod.datagen;

import net.bewitchingbiohazard.ranchinexpansionmod.RanchinExpansionMod;
import net.bewitchingbiohazard.ranchinexpansionmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RanchinExpansionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        withExistingParent(ModItems.ANGUSFEMALE_SPAWN_EGG.getId().getPath(), mcLoc("item/angusfemale_spawn_egg.png"));
        withExistingParent(ModItems.WYANFEMALE_SPAWN_EGG.getId().getPath(), mcLoc("item/wyanfemale_spawn_egg.png"));
    }
}

