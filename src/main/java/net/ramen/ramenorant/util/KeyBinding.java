package net.ramen.ramenorant.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String RAMENORANT_ABILITIES_KEY_CATEGORY = "key.category.ramenorant.abilities";
    public static final String RAMENORANT_WEAPONS_KEY_CATEGORY = "key.category.ramenorant.weapons";
    public static final String RAMENORANT_INTERACTION_KEY_CATEGORY = "key.category.ramenorant.interaction";
    public static final String RAMENORANT_PINGS_KEY_CATEGORY = "key.category.ramenorant.pings";
    public static final String RAMENORANT_GENERAL_KEY_CATEGORY = "key.category.ramenorant.general";
    public static final String RAMENORANT_VOTING_KEY_CATEGORY = "key.category.ramenorant.voting";

    // Abilities:
    public static final KeyMapping ABILITY_1_KEY = new KeyMapping("key.ramenorant.ability_1", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_C, RAMENORANT_ABILITIES_KEY_CATEGORY);
    public static final KeyMapping ABILITY_2_KEY = new KeyMapping("key.ramenorant.ability_2", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_Q, RAMENORANT_ABILITIES_KEY_CATEGORY);
    public static final KeyMapping ABILITY_3_KEY = new KeyMapping("key.ramenorant.ability_3", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_E, RAMENORANT_ABILITIES_KEY_CATEGORY);
    public static final KeyMapping ABILITY_ULT_KEY = new KeyMapping("key.ramenorant.ability_ult", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_X, RAMENORANT_ABILITIES_KEY_CATEGORY);

    // Weapons:
    public static final KeyMapping RELOAD_KEY = new KeyMapping("key.ramenorant.reload", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_R, RAMENORANT_WEAPONS_KEY_CATEGORY);

    // Interaction:
    public static final KeyMapping INSPECT_KEY = new KeyMapping("key.ramenorant.inspect", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_Y, RAMENORANT_INTERACTION_KEY_CATEGORY);
    public static final KeyMapping USE_OBJECT = new KeyMapping("key.ramenorant.use_object", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_F, RAMENORANT_INTERACTION_KEY_CATEGORY);
    public static final KeyMapping USE_SPIKE = new KeyMapping("key.ramenorant.use_spike", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_4, RAMENORANT_INTERACTION_KEY_CATEGORY);

    // Pings:
    public static final KeyMapping PING = new KeyMapping("key.ramenorant.ping", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_Z, RAMENORANT_PINGS_KEY_CATEGORY);

    // General:
    public static final KeyMapping SHOW_LOADOUTS = new KeyMapping("key.ramenorant.show_loadouts", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_LEFT_ALT, RAMENORANT_GENERAL_KEY_CATEGORY);
    public static final KeyMapping OPEN_ARMORY = new KeyMapping("key.ramenorant.open_armory", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_B, RAMENORANT_GENERAL_KEY_CATEGORY);
    public static final KeyMapping OPEN_MAP_TOGGLE = new KeyMapping("key.ramenorant.open_map_toggle", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_M, RAMENORANT_GENERAL_KEY_CATEGORY);
    public static final KeyMapping OPEN_MAP_HOLD = new KeyMapping("key.ramenorant.open_map_hold", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_CAPS_LOCK, RAMENORANT_GENERAL_KEY_CATEGORY);
    public static final KeyMapping SHOW_SCOREBOARD = new KeyMapping("key.ramenorant.show_scoreboard", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_TAB, RAMENORANT_GENERAL_KEY_CATEGORY);

    // Voting:
    public static final KeyMapping VOTE_OPTION_1 = new KeyMapping("key.ramenorant.vote_option_1", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_F5, RAMENORANT_VOTING_KEY_CATEGORY);
    public static final KeyMapping VOTE_OPTION_2 = new KeyMapping("key.ramenorant.vote_option_2", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_F6, RAMENORANT_VOTING_KEY_CATEGORY);
    public static final KeyMapping VOTE_OPTION_3 = new KeyMapping("key.ramenorant.vote_option_3", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_F7, RAMENORANT_VOTING_KEY_CATEGORY);
    public static final KeyMapping VOTE_OPTION_4 = new KeyMapping("key.ramenorant.vote_option_4", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_F8, RAMENORANT_VOTING_KEY_CATEGORY);
}
