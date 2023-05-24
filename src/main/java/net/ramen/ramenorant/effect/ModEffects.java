package net.ramen.ramenorant.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ramen.ramenorant.Ramenorant;
import net.ramen.ramenorant.effect.breach.FlashpointEffect;

public class ModEffects {
    public static final DeferredRegister<MobEffect> RAMENORANT_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Ramenorant.MOD_ID);

    // Breach
    public static final RegistryObject<MobEffect> FLASHPOINT = RAMENORANT_EFFECTS.register("flashpoint",
            () -> new FlashpointEffect(MobEffectCategory.HARMFUL, 0xba5919));

    public static void register(IEventBus eventBus) {
        RAMENORANT_EFFECTS.register(eventBus);
    }
}
