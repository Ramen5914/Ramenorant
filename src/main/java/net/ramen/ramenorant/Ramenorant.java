package net.ramen.ramenorant;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.ramen.ramenorant.effect.ModEffects;
import net.ramen.ramenorant.item.ModAbilities;
import net.ramen.ramenorant.block.ModBlocks;
import net.ramen.ramenorant.item.ModGuns;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Ramenorant.MOD_ID)
public class Ramenorant {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "ramenorant";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Ramenorant() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModAbilities.register(modEventBus);
        ModGuns.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEffects.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTabs.RAMENORANT_TAB) {
            event.accept(ModGuns.BLACK_OPAL);
            event.accept(ModGuns.RAW_BLACK_OPAL);
            event.accept(ModBlocks.BLACK_OPAL_BLOCK);
            event.accept(ModBlocks.BLACK_OPAL_ORE);
            event.accept(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE);
            event.accept(ModBlocks.NETHERRACK_BLACK_OPAL_ORE);
            event.accept(ModBlocks.ENDSTONE_BLACK_OPAL_ORE);
        }

        if(event.getTab() == ModCreativeModeTabs.RAMENORANT_GUNS_TAB) {
            // Sidearms
            event.accept(ModGuns.CLASSIC);
            event.accept(ModGuns.SHORTY);
            event.accept(ModGuns.FRENZY);
            event.accept(ModGuns.GHOST);
            event.accept(ModGuns.SHERIFF);
            // Sub Machine Guns
            event.accept(ModGuns.STINGER);
            event.accept(ModGuns.SPECTRE);
            // Shotguns
            event.accept(ModGuns.BUCKY);
            event.accept(ModGuns.JUDGE);
            // Rifles
            event.accept(ModGuns.BULLDOG);
            event.accept(ModGuns.GUARDIAN);
            event.accept(ModGuns.PHANTOM);
            event.accept(ModGuns.VANDAL);
            // Sniper Rifles
            event.accept(ModGuns.MARSHALL);
            event.accept(ModGuns.OPERATOR);
            // Machine Guns
            event.accept(ModGuns.ARES);
            event.accept(ModGuns.ODIN);
            // Melee
            event.accept(ModGuns.KNIFE);
        }

        if(event.getTab() == ModCreativeModeTabs.RAMENORANT_ABILITIES_TAB) {
            // Astra
            event.accept(ModAbilities.GRAVITY_WELL);
            event.accept(ModAbilities.NOVA_PULSE);
            event.accept(ModAbilities.NEBULA);
            event.accept(ModAbilities.COSMIC_DIVIDE);
            // Breach
            event.accept(ModAbilities.AFTERSHOCK);
            event.accept(ModAbilities.FLASHPOINT);
            event.accept(ModAbilities.FAULT_LINE);
            event.accept(ModAbilities.ROLLING_THUNDER);
            // Brimstone
            event.accept(ModAbilities.INCENDIARY);
            event.accept(ModAbilities.STIM_BEACON);
            event.accept(ModAbilities.SKY_SMOKE);
            event.accept(ModAbilities.ORBITAL_STRIKE);
            // Chamber
            event.accept(ModAbilities.TRADEMARK);
            event.accept(ModAbilities.HEADHUNTER);
            event.accept(ModAbilities.RENDEZVOUS);
            event.accept(ModAbilities.TOUR_DE_FORCE);
            // Cypher
            event.accept(ModAbilities.TRAPWIRE);
            event.accept(ModAbilities.CYBER_CAGE);
            event.accept(ModAbilities.SPYCAM);
            event.accept(ModAbilities.NEURAL_THEFT);
            // Fade
            event.accept(ModAbilities.PROWLER);
            event.accept(ModAbilities.SEIZE);
            event.accept(ModAbilities.HAUNT);
            event.accept(ModAbilities.NIGHTFALL);
            // Gekko
            event.accept(ModAbilities.MOSH_PIT);
            event.accept(ModAbilities.WINGMAN);
            event.accept(ModAbilities.DIZZY);
            event.accept(ModAbilities.THRASH);
            // Harbor
            event.accept(ModAbilities.CASCADE);
            event.accept(ModAbilities.COVE);
            event.accept(ModAbilities.HIGH_TIDE);
            event.accept(ModAbilities.RECKONING);
            // Jett
            event.accept(ModAbilities.CLOUDBURST);
            event.accept(ModAbilities.UPDRAFT);
            event.accept(ModAbilities.TAILWIND);
            event.accept(ModAbilities.BLADE_STORM);
            // Kay/o
            event.accept(ModAbilities.FRAG_MENT);
            event.accept(ModAbilities.FLASH_DRIVE);
            event.accept(ModAbilities.ZERO_POINT);
            event.accept(ModAbilities.NULL_CMD);
            // Killjoy
            event.accept(ModAbilities.ALARMBOT);
            event.accept(ModAbilities.NANOSWARM);
            event.accept(ModAbilities.TURRET);
            event.accept(ModAbilities.LOCKDOWN);
            // Neon
            event.accept(ModAbilities.FAST_LANE);
            event.accept(ModAbilities.RELAY_BOLT);
            event.accept(ModAbilities.HIGH_GEAR);
            event.accept(ModAbilities.OVERDRIVE);
            // Omen
            event.accept(ModAbilities.SHROUDED_STEP);
            event.accept(ModAbilities.PARANOIA);
            event.accept(ModAbilities.DARK_COVER);
            event.accept(ModAbilities.FROM_THE_SHADOWS);
            // Phoenix
            event.accept(ModAbilities.BLAZE);
            event.accept(ModAbilities.CURVEBALL);
            event.accept(ModAbilities.HOT_HANDS);
            event.accept(ModAbilities.RUN_IT_BACK);
            // Raze
            event.accept(ModAbilities.BOOM_BOT);
            event.accept(ModAbilities.BLAST_PACK);
            event.accept(ModAbilities.PAINT_SHELLS);
            event.accept(ModAbilities.SHOWSTOPPER);
            // Reyna
            event.accept(ModAbilities.LEER);
            event.accept(ModAbilities.DEVOUR);
            event.accept(ModAbilities.DISMISS);
            event.accept(ModAbilities.EMPRESS);
            // Sage
            event.accept(ModAbilities.BARRIER_ORB);
            event.accept(ModAbilities.SLOW_ORB);
            event.accept(ModAbilities.HEALING_ORB);
            event.accept(ModAbilities.RESURRECTION);
            // Skye
            event.accept(ModAbilities.REGROWTH);
            event.accept(ModAbilities.TRAILBLAZER);
            event.accept(ModAbilities.GUIDING_LIGHT);
            event.accept(ModAbilities.SEEKERS);
            // Sova
            event.accept(ModAbilities.OWL_DRONE);
            event.accept(ModAbilities.SHOCK_BOLT);
            event.accept(ModAbilities.RECON_BOLT);
            event.accept(ModAbilities.HUNTERS_FURY);
            // Viper
            event.accept(ModAbilities.SNAKE_BITE);
            event.accept(ModAbilities.POISON_CLOUD);
            event.accept(ModAbilities.TOXIC_SCREEN);
            event.accept(ModAbilities.VIPERS_PIT);
            // Yoru
            event.accept(ModAbilities.FAKEOUT);
            event.accept(ModAbilities.BLINDSIDE);
            event.accept(ModAbilities.GATECRASH);
            event.accept(ModAbilities.DIMENSIONAL_DRIFT);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
