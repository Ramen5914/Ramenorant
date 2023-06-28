package net.ramen.ramenorant;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ramen.ramenorant.item.ModGuns;

import static net.ramen.ramenorant.Ramenorant.MOD_ID;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example", () -> CreativeModeTab.builder()
            // Set name of tab to display
            .title(Component.translatable("item_group." + MOD_ID + ".example"))
            // Set icon of creative tab
            .icon(() -> new ItemStack(ModGuns.CLASSIC.get()))
            // Add default items to tab
            .displayItems((params, output) -> {
                // Sidearms
                output.accept(ModGuns.CLASSIC.get());
                output.accept(ModGuns.SHORTY.get());
                output.accept(ModGuns.FRENZY.get());
                output.accept(ModGuns.GHOST.get());
                output.accept(ModGuns.SHERIFF.get());

                // SMGs
                output.accept(ModGuns.STINGER.get());
            })
            .build()
    );
}
