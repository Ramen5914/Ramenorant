package net.ramen.ramenorant.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_RAMENORANT = "key.category.ramenorant.ramenorant";
    public static final String KEY_RELOAD_WEAPON = "key.ramenorant.reload_weapon";

    public static final KeyMapping RELOAD_WEAPON_KEY = new KeyMapping(KEY_RELOAD_WEAPON, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_R, KEY_CATEGORY_RAMENORANT);
}
