package net.ramen.ramenorant.item.client.renderer;

import net.ramen.ramenorant.item.client.model.ClassicModel;
import net.ramen.ramenorant.item.custom.Classic;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ClassicRenderer extends GeoItemRenderer<Classic> {
    public ClassicRenderer() {
        super(new ClassicModel());
    }
}
