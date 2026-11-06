package com.lota.lotamap.item;

import com.lota.lotamap.LotaMap;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LotaMap.MOD_ID);

    public static final RegistryObject<Item> KAMATH_RUINS_MAP = ITEMS.register("kamath_ruins_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "dungeons_and_combat:the_ruins_of_kamath", "kamath_ruins_map"));

    public static final RegistryObject<Item> SUNLEIA_PANTHEON_MAP = ITEMS.register("sunleia_pantheon_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "dungeons_and_combat:the_pantheon_of_sunleia", "sunleia_pantheon_map"));

    public static final RegistryObject<Item> UNDERWORLD_ARENA_MAP = ITEMS.register("underworld_arena_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "block_factorys_bosses:underworld_arena", "underworld_arena_map"));

    public static final RegistryObject<Item> ICE_MAZE_MAP = ITEMS.register("ice_maze_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "aquamirae:pirate_ship", "ice_maze_map"));

    public static final RegistryObject<Item> PIRATE_SHELTER_MAP = ITEMS.register("pirate_shelter_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "aquamirae:pirate_shelter", "pirate_shelter_map"));

    public static final RegistryObject<Item> SUN_TEMPLE_MAP = ITEMS.register("sun_temple_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "call_of_yucutan:overgrown_temple", "sun_temple_map"));

    public static final RegistryObject<Item> DEADLY_CRYPT_MAP = ITEMS.register("deadly_crypt_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "call_of_yucutan:deadly_crypt", "deadly_crypt_map"));

    public static final RegistryObject<Item> TEMPLE_OF_DUALITY_MAP = ITEMS.register("temple_of_duality_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "dungeonnowloading:temple_of_duality", "temple_of_duality_map"));

    public static final RegistryObject<Item> SANDWORM_NEST_MAP = ITEMS.register("sandworm_nest_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "block_factorys_bosses:sandworm_nest", "sandworm_nest_map"));

    public static final RegistryObject<Item> LAB_RUINS_MAP = ITEMS.register("lab_ruins_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "incendium:pipeline", "lab_ruins_map"));

    public static final RegistryObject<Item> LICH_PRISON_MAP = ITEMS.register("lich_prison_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "graveyard:lich_prison", "lich_prison_map"));

    public static final RegistryObject<Item> FORGOTTEN_SANDS_MAP = ITEMS.register("forgotten_sands_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "dungeons_and_combat:the_forgotten_sands", "forgotten_sands_map"));

    public static final RegistryObject<Item> RIZA_CAVE_MAP = ITEMS.register("riza_cave_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "lotadungeon:nightmare_forest/floor_2/boss_arena", "riza_cave_map"));

    public static final RegistryObject<Item> DARK_SKELETON_ARENA_MAP = ITEMS.register("dark_skeleton_arena_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "lotadungeon:nightmare_forest/floor_1/boss_arena", "dark_skeleton_arena_map"));

    public static final RegistryObject<Item> LIFESTEALER_ARENA_MAP = ITEMS.register("lifestealer_arena_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "lotadungeon:pole_zabytyh_dush/lifestealer_arena", "lifestealer_arena_map"));

    public static final RegistryObject<Item> ICE_SPIDER_DEN_MAP = ITEMS.register("ice_spider_den_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "irons_spellbooks:ice_spider_den", "ice_spider_den_map"));

    public static final RegistryObject<Item> CRYOLITE_CASTLE_MAP = ITEMS.register("cryolite_castle_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "lota:cryolitecastle", "cryolite_castle_map"));

    public static final RegistryObject<Item> OBSIDILITH_ARENA_MAP = ITEMS.register("obsidilith_arena_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "bosses_of_mass_destruction:obsidilith_arena", "obsidilith_arena_map"));

    public static final RegistryObject<Item> BLAZING_FORTRESS_MAP = ITEMS.register("blazing_fortress_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "dungeons_and_combat:blazing_fortress", "blazing_fortress_map"));

    public static final RegistryObject<Item> BLOODY_CHURCH_MAP = ITEMS.register("bloody_church_map_finder",
            () -> new LotaMapItem(new Item.Properties().stacksTo(1), "dungeons_and_combat:the_church", "bloody_church_map"));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
