package net.ramen.ramenorant;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
//import net.ramen.ramenorant.effect.ModEffects;
import net.minecraftforge.registries.RegisterEvent;
import net.ramen.ramenorant.item.ModAbilities;
import net.ramen.ramenorant.block.ModBlocks;
import net.ramen.ramenorant.item.ModGuns;
import net.ramen.ramenorant.sound.ModSounds;
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

        ModCreativeModeTabs.register(modEventBus);

//        ModEffects.register(modEventBus);
      
        ModSounds.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
