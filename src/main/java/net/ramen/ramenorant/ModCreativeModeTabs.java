package net.ramen.ramenorant;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ramen.ramenorant.item.ModGuns;

@Mod.EventBusSubscriber(modid = Ramenorant.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab RAMENORANT_TAB;
    public static CreativeModeTab RAMENORANT_GUNS_TAB;
    public static CreativeModeTab RAMENORANT_ABILITIES_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        RAMENORANT_TAB = event.registerCreativeModeTab(new ResourceLocation(Ramenorant.MOD_ID, "ramenorant_tab"),
                builder -> builder.icon(() -> new ItemStack(ModGuns.BLACK_OPAL.get()))
                        .title(Component.translatable("creativemodetab.ramenorant_tab")));

        RAMENORANT_GUNS_TAB = event.registerCreativeModeTab(new ResourceLocation(Ramenorant.MOD_ID, "ramenorant_guns_tab"),
                builder -> builder.icon(() -> new ItemStack(ModGuns.BLACK_OPAL.get()))
                        .title(Component.translatable("creativemodetab.ramenorant_guns_tab")));

        RAMENORANT_ABILITIES_TAB = event.registerCreativeModeTab(new ResourceLocation(Ramenorant.MOD_ID, "ramenorant_abilities_tab"),
                builder -> builder.icon(() -> new ItemStack(ModGuns.BLACK_OPAL.get()))
                        .title(Component.translatable("creativemodetab.ramenorant_abilities_tab")));
    }
}
