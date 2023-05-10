package net.ramen5914.ramenorant;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ramen5914.ramenorant.Ramenorant;
import net.ramen5914.ramenorant.item.ModItems;

@Mod.EventBusSubscriber(modid = Ramenorant.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab RAMENORANT_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        RAMENORANT_TAB = event.registerCreativeModeTab(new ResourceLocation(Ramenorant.MOD_ID, "ramenorant_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
                        .title(Component.translatable("creativemodetab.ramenorant_tab")));
    }
}
