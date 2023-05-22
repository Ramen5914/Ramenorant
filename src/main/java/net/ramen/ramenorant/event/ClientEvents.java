package net.ramen.ramenorant.event;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
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
        public static void onKeyInput(InputEvent.Key event) {
            if (KeyBinding.ABILITY_1_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ability 1."));
            } else if (KeyBinding.ABILITY_2_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ability 2."));
            } else if (KeyBinding.ABILITY_3_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ability 3"));
            } else if (KeyBinding.ABILITY_ULT_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ultimate Ability"));
            }

            if (KeyBinding.RELOAD_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Reloaded Weapon."));
            }
            if (KeyBinding.ABILITY_ULT_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ultimate Ability"));
            }
            if (KeyBinding.ABILITY_ULT_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ultimate Ability"));
            }
            if (KeyBinding.ABILITY_ULT_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ultimate Ability"));
            }
            if (KeyBinding.ABILITY_ULT_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ultimate Ability"));
            }
            if (KeyBinding.ABILITY_ULT_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ultimate Ability"));
            }
            if (KeyBinding.ABILITY_ULT_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ultimate Ability"));
            }
            if (KeyBinding.ABILITY_ULT_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ultimate Ability"));
            }
            if (KeyBinding.ABILITY_ULT_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ultimate Ability"));
            }
            if (KeyBinding.ABILITY_ULT_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ultimate Ability"));
            }
            if (KeyBinding.ABILITY_ULT_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Used Ultimate Ability"));
            }
        }
    }

    @Mod.EventBusSubscriber(modid = Ramenorant.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            // Abilities
            event.register(KeyBinding.ABILITY_1_KEY);
            event.register(KeyBinding.ABILITY_2_KEY);
            event.register(KeyBinding.ABILITY_3_KEY);
            event.register(KeyBinding.ABILITY_ULT_KEY);

            // Weapons
            event.register(KeyBinding.RELOAD_KEY);

            // Interaction
            event.register(KeyBinding.INSPECT_KEY);
            event.register(KeyBinding.USE_OBJECT);
            event.register(KeyBinding.USE_SPIKE);

            // Pings
            event.register(KeyBinding.PING);

            // General
            event.register(KeyBinding.SHOW_LOADOUTS);
            event.register(KeyBinding.OPEN_ARMORY);
            event.register(KeyBinding.OPEN_MAP_TOGGLE);
            event.register(KeyBinding.OPEN_MAP_HOLD);
            event.register(KeyBinding.SHOW_SCOREBOARD);

            // Voting
            event.register(KeyBinding.VOTE_OPTION_1);
            event.register(KeyBinding.VOTE_OPTION_2);
            event.register(KeyBinding.VOTE_OPTION_3);
            event.register(KeyBinding.VOTE_OPTION_4);
        }
    }
}
