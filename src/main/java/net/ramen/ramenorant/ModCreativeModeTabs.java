package net.ramen.ramenorant;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ramen.ramenorant.item.ModGuns;

public class ModCreativeModeTabs {
    private static final DeferredRegister<CreativeModeTab> RAMENORANT_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Ramenorant.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RAMENORANT_TAB = RAMENORANT_TABS.register("ramenorant_tab", () -> {
        return CreativeModeTab.builder()
                .icon(() -> new ItemStack(ModGuns.BLACK_OPAL.get()))
                .displayItems((features, output) -> {
                    output.accept(new ItemStack(ModGuns.BLACK_OPAL.get()));
                    output.accept(new ItemStack(ModGuns.RAW_BLACK_OPAL.get()));
                })
                .title(Component.translatable("itemgroup.ramenorant_tab"))
                .build();
    });

    public static void register(IEventBus eventBus) {
        RAMENORANT_TABS.register(eventBus);
    }
}
