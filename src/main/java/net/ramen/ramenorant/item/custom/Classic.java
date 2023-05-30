package net.ramen.ramenorant.item.custom;

import net.minecraft.world.level.block.BaseEntityBlock;
import net.ramen.ramenorant.item.client.renderer.ClassicRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

import java.util.function.Consumer;

public class Classic extends Item implements GeoItem {
    private static final RawAnimation SHOOT_ANIMATION = RawAnimation.begin().thenPlay("animation.classic.fire");
    private static final RawAnimation RELOAD_ANIMATION = RawAnimation.begin().thenPlay("animation.classic.reload");
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    public Classic(Properties properties) {
        super(properties);
    }

    private PlayState idlePredicate(AnimationState animationState) {
        animationState.getController().setAnimation(RawAnimation.begin().then("animation.classic.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    private PlayState firePredicate(AnimationState animationState) {
        animationState.getController().setAnimation(RawAnimation.begin().then("animation.classic.fire", Animation.LoopType.PLAY_ONCE));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController(this, "animation.classic.idle.controller", 0, this::idlePredicate));
        controllerRegistrar.add(new AnimationController(this, "animation.classic.fire.controller", 0, this::firePredicate));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

//    @Override
//    public double getTick(Object itemStack) {
//        return RenderUtils.getCurrentTick();
//    }



    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private ClassicRenderer renderer;

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if (this.renderer == null) {
                    renderer = new ClassicRenderer();
                }

                return this.renderer;
            }
        });
    }
}