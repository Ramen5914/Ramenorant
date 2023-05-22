package net.ramen.ramenorant.item.client;

import net.ramen.ramenorant.item.custom.Vandal;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class VandalRenderer extends GeoItemRenderer<Vandal> {
    public VandalRenderer() {
        super(new VandalModel());
    }
}
