package net.ramen.ramenorant.item.client;

import net.ramen.ramenorant.item.custom.Classic;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ClassicRenderer extends GeoItemRenderer<Classic> {
    public ClassicRenderer() {
        super(new ClassicModel());
    }
}
