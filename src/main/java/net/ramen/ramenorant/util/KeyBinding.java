package net.ramen.ramenorant.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String RAMENORANT_KEY_CATEGORY = "key.categories.ramenorant.ramenorant";

    public static final KeyMapping RELOAD_KEY = new KeyMapping(
            "key.ramenorant.reload",
            KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_R,
            RAMENORANT_KEY_CATEGORY
    );

    public static final KeyMapping INSPECT_KEY = new KeyMapping(
        "key.ramenorant.inspect",
        KeyConflictContext.IN_GAME,
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_Y,
        RAMENORANT_KEY_CATEGORY
    );
}
