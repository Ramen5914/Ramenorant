package net.ramen.ramenorant.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ramen.ramenorant.Ramenorant;

public class ModAbilities {
    public static final DeferredRegister<Item> ABILITIES =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ramenorant.MOD_ID);
    // Astra
    public static final RegistryObject<Item> GRAVITY_WELL = ABILITIES.register("gravity_well",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NOVA_PULSE = ABILITIES.register("nova_pulse",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEBULA = ABILITIES.register("nebula",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COSMIC_DIVIDE = ABILITIES.register("cosmic_divide",
            () -> new Item(new Item.Properties()));
    // Breach
    public static final RegistryObject<Item> AFTERSHOCK = ABILITIES.register("aftershock",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLASHPOINT = ABILITIES.register("flashpoint",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FAULT_LINE = ABILITIES.register("fault_line",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROLLING_THUNDER = ABILITIES.register("rolling_thunder",
            () -> new Item(new Item.Properties()));
    // Brimstone
    public static final RegistryObject<Item> INCENDIARY = ABILITIES.register("incendiary",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STIM_BEACON = ABILITIES.register("stim_beacon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKY_SMOKE = ABILITIES.register("sky_smoke",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORBITAL_STRIKE = ABILITIES.register("orbital_strike",
            () -> new Item(new Item.Properties()));
    // Chamber
    public static final RegistryObject<Item> TRADEMARK = ABILITIES.register("trademark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEADHUNTER = ABILITIES.register("headhunter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RENDEZVOUS = ABILITIES.register("rendezvous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOUR_DE_FORCE = ABILITIES.register("tour_de_force",
            () -> new Item(new Item.Properties()));
    // Cypher
    public static final RegistryObject<Item> TRAPWIRE = ABILITIES.register("trapwire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CYBER_CAGE = ABILITIES.register("cyber_cage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPYCAM = ABILITIES.register("spycam",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEURAL_THEFT = ABILITIES.register("neural_theft",
            () -> new Item(new Item.Properties()));
    // Fade
    public static final RegistryObject<Item> PROWLER = ABILITIES.register("prowler",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEIZE = ABILITIES.register("seize",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HAUNT = ABILITIES.register("haunt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NIGHTFALL = ABILITIES.register("nightfall",
            () -> new Item(new Item.Properties()));
    // Gekko
    public static final RegistryObject<Item> MOSH_PIT = ABILITIES.register("mosh_pit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WINGMAN = ABILITIES.register("wingman",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIZZY = ABILITIES.register("dizzy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THRASH = ABILITIES.register("thrash",
            () -> new Item(new Item.Properties()));
    // Harbor
    public static final RegistryObject<Item> CASCADE = ABILITIES.register("cascade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COVE = ABILITIES.register("cove",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HIGH_TIDE = ABILITIES.register("high_tide",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RECKONING = ABILITIES.register("reckoning",
            () -> new Item(new Item.Properties()));
    // Jett
    public static final RegistryObject<Item> CLOUDBURST = ABILITIES.register("cloudburst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UPDRAFT = ABILITIES.register("updraft",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAILWIND = ABILITIES.register("tailwind",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLADE_STORM = ABILITIES.register("blade_storm",
            () -> new Item(new Item.Properties()));
    // Kay/o
    public static final RegistryObject<Item> FRAGMENT = ABILITIES.register("fragment",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLASH_DRIVE = ABILITIES.register("flash_drive",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZERO_POINT = ABILITIES.register("zero_point",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NULL_CMD = ABILITIES.register("null_cmd",
            () -> new Item(new Item.Properties()));
    // Killjoy
    public static final RegistryObject<Item> ALARMBOT = ABILITIES.register("alarmbot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NANOSWARM = ABILITIES.register("nanoswarm",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TURRET = ABILITIES.register("turret",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LOCKDOWN = ABILITIES.register("lockdown",
            () -> new Item(new Item.Properties()));
    // Neon
    public static final RegistryObject<Item> FAST_LANE = ABILITIES.register("fast_lane",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RELAY_BOLT = ABILITIES.register("relay_bolt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HIGH_GEAR = ABILITIES.register("high_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OVERDRIVE = ABILITIES.register("overdrive",
            () -> new Item(new Item.Properties()));
    // Omen
    public static final RegistryObject<Item> SHROUDED_STEP = ABILITIES.register("shrouded_step",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PARANOIA = ABILITIES.register("paranoia",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_COVER = ABILITIES.register("dark_cover",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FROM_THE_SHADOWS = ABILITIES.register("from_the_shadows",
            () -> new Item(new Item.Properties()));
    // Phoenix
    public static final RegistryObject<Item> BLAZE = ABILITIES.register("blaze",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CURVEBALL = ABILITIES.register("curveball",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOT_HANDS = ABILITIES.register("hots_hands",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUN_IT_BACK = ABILITIES.register("run_it_back",
            () -> new Item(new Item.Properties()));
    // Raze
    public static final RegistryObject<Item> BOOM_BOT = ABILITIES.register("boom_bot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLAST_PACK = ABILITIES.register("blast_pack",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PAINT_SHELLS = ABILITIES.register("paint_shells",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHOWSTOPPER = ABILITIES.register("showstopper",
            () -> new Item(new Item.Properties()));
    // Reyna
    public static final RegistryObject<Item> LEER = ABILITIES.register("leer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEVOUR = ABILITIES.register("devour",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DISMISS = ABILITIES.register("dismiss",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPRESS = ABILITIES.register("empress",
            () -> new Item(new Item.Properties()));
    // Sage
    public static final RegistryObject<Item> BARRIER_ORB = ABILITIES.register("barrier_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLOW_ORB = ABILITIES.register("slow_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEALING_ORB = ABILITIES.register("healing_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RESURRECTION = ABILITIES.register("resurrection",
            () -> new Item(new Item.Properties()));
    // Skye
    public static final RegistryObject<Item> REGROWTH = ABILITIES.register("regrowth",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRAILBLAZER = ABILITIES.register("trailblazer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GUIDING_LIGHT = ABILITIES.register("guiding_light",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEEKERS = ABILITIES.register("seekers",
            () -> new Item(new Item.Properties()));
    // Sova
    public static final RegistryObject<Item> OWL_DRONE = ABILITIES.register("owl_drone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHOCK_BOLT = ABILITIES.register("shock_bolt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RECON_BOLT = ABILITIES.register("recon_bolt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HUNTERS_FURY = ABILITIES.register("hunters_fury",
            () -> new Item(new Item.Properties()));
    // Viper
    public static final RegistryObject<Item> SNAKE_BITE = ABILITIES.register("snake_bite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISON_CLOUD = ABILITIES.register("poison_cloud",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOXIC_SCREEN = ABILITIES.register("toxic_screen",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIPERS_PIT = ABILITIES.register("vipers_pit",
            () -> new Item(new Item.Properties()));
    // Yoru
    public static final RegistryObject<Item> FAKEOUT = ABILITIES.register("fakeout",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLINDSIDE = ABILITIES.register("blindside",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GATECRASH = ABILITIES.register("gatecrash",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIMENSIONAL_DRIFT = ABILITIES.register("dimensional_drift",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ABILITIES.register(eventBus);
    }
}
