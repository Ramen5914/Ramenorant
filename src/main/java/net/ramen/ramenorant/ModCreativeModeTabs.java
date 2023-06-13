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

    public static final RegistryObject<CreativeModeTab> RAMENORANT_GUNS_TAB = RAMENORANT_TABS.register("ramenorant_guns_tab", () -> {
        return CreativeModeTab.builder()
                .icon(() -> new ItemStack(ModGuns.CLASSIC.get()))
                .displayItems((features, output) -> {
                    output.accept(new ItemStack(ModGuns.CLASSIC.get()));
                    output.accept(new ItemStack(ModGuns.SHORTY.get()));
                    output.accept(new ItemStack(ModGuns.FRENZY.get()));
                    output.accept(new ItemStack(ModGuns.GHOST.get()));
                    output.accept(new ItemStack(ModGuns.SHERIFF.get()));

                    output.accept(new ItemStack(ModGuns.STINGER.get()));
                    output.accept(new ItemStack(ModGuns.SPECTRE.get()));

                    output.accept(new ItemStack(ModGuns.BUCKY.get()));
                    output.accept(new ItemStack(ModGuns.JUDGE.get()));

                    output.accept(new ItemStack(ModGuns.BULLDOG.get()));
                    output.accept(new ItemStack(ModGuns.GUARDIAN.get()));
                    output.accept(new ItemStack(ModGuns.PHANTOM.get()));
                    output.accept(new ItemStack(ModGuns.VANDAL.get()));

                    output.accept(new ItemStack(ModGuns.MARSHALL.get()));
                    output.accept(new ItemStack(ModGuns.OPERATOR.get()));

                    output.accept(new ItemStack(ModGuns.ARES.get()));
                    output.accept(new ItemStack(ModGuns.ODIN.get()));

                    output.accept(new ItemStack(ModGuns.KNIFE.get()));
                })
                .title(Component.translatable("itemgroup.ramenorant_guns_tab"))
                .build();
    });

    public static void register(IEventBus eventBus) {
        RAMENORANT_TABS.register(eventBus);
    }
}
