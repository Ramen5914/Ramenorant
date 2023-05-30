package net.ramen.ramenorant.item.client;

import net.minecraft.resources.ResourceLocation;
import net.ramen.ramenorant.Ramenorant;
import net.ramen.ramenorant.item.custom.Vandal;
import software.bernie.geckolib.model.GeoModel;

public class VandalModel extends GeoModel<Vandal> {
    @Override
    public ResourceLocation getModelResource(Vandal animatable) {
        return new ResourceLocation(Ramenorant.MOD_ID, "geo/vandal.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Vandal animatable) {
        return new ResourceLocation(Ramenorant.MOD_ID, "textures/item/vandal.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Vandal animatable) {
        return new ResourceLocation(Ramenorant.MOD_ID, "animations/vandal.animation.json");
    }

}
