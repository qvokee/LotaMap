package com.lota.lotamap;

import com.lota.lotamap.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LotaMap.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAPS_TAB = CREATIVE_MODE_TABS.register("maps",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.lotamap.maps"))
                    .icon(() -> new ItemStack(ModItems.RIZA_CAVE_MAP.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.KAMATH_RUINS_MAP.get());
                        output.accept(ModItems.SUNLEIA_PANTHEON_MAP.get());
                        output.accept(ModItems.UNDERWORLD_ARENA_MAP.get());
                        output.accept(ModItems.ICE_MAZE_MAP.get());
                        output.accept(ModItems.PIRATE_SHELTER_MAP.get());
                        output.accept(ModItems.SUN_TEMPLE_MAP.get());
                        output.accept(ModItems.DEADLY_CRYPT_MAP.get());
                        output.accept(ModItems.TEMPLE_OF_DUALITY_MAP.get());
                        output.accept(ModItems.SANDWORM_NEST_MAP.get());
                        output.accept(ModItems.LAB_RUINS_MAP.get());
                        output.accept(ModItems.LICH_PRISON_MAP.get());
                        output.accept(ModItems.FORGOTTEN_SANDS_MAP.get());
                        output.accept(ModItems.RIZA_CAVE_MAP.get());
                        output.accept(ModItems.DARK_SKELETON_ARENA_MAP.get());
                        output.accept(ModItems.LIFESTEALER_ARENA_MAP.get());
                        output.accept(ModItems.ICE_SPIDER_DEN_MAP.get());
                        output.accept(ModItems.CRYOLITE_CASTLE_MAP.get());
                        output.accept(ModItems.OBSIDILITH_ARENA_MAP.get());
                        output.accept(ModItems.BLAZING_FORTRESS_MAP.get());
                        output.accept(ModItems.BLOODY_CHURCH_MAP.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
