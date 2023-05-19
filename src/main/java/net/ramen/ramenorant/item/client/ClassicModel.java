package net.ramen.ramenorant.item.client;

import net.minecraft.resources.ResourceLocation;
import net.ramen.ramenorant.Ramenorant;
import net.ramen.ramenorant.item.custom.Classic;
import software.bernie.geckolib.model.GeoModel;

public class ClassicModel extends GeoModel<Classic> {

    @Override
    public ResourceLocation getModelResource(Classic animatable) {
        return new ResourceLocation(Ramenorant.MOD_ID, "geo/classic.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Classic animatable) {
        return new ResourceLocation(Ramenorant.MOD_ID, "textures/item/classic.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Classic animatable) {
        return new ResourceLocation(Ramenorant.MOD_ID, "animations/classic.animation.json");
    }
}
