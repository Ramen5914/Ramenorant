package net.ramen.ramenorant.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ramen.ramenorant.Ramenorant;
import net.ramen.ramenorant.util.KeyBinding;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = Ramenorant.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.RELOAD_WEAPON_KEY);
        }

        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if (KeyBinding.RELOAD_WEAPON_KEY.consumeClick()) {

            }
        }
    }
}
