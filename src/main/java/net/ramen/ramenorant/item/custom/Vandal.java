package net.ramen.ramenorant.item.custom;

import net.ramen.ramenorant.item.client.VandalRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

import java.util.function.Consumer;

public class Vandal extends Item implements GeoItem {
    private static final RawAnimation FIRE_ANIMATION = RawAnimation.begin().thenPlay("animation.vandal.fire");
    private static final RawAnimation RELOAD_ANIMATION = RawAnimation.begin().thenPlay("animation.vandal.reload");
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    public Vandal(Properties properties) {
        super(properties);
    }

    private PlayState firePredicate(AnimationState animationState) {
        animationState.getController().setAnimation(FIRE_ANIMATION);
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController(this, "animation.vandal.controller.fire", 0, this::firePredicate));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private VandalRenderer renderer;

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if (this.renderer == null) {
                    renderer = new VandalRenderer();
                }

                return this.renderer;
            }
        });
    }
}
