package net.ramen.ramenorant.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ramen.ramenorant.Ramenorant;

public class ModGuns {
    public static final DeferredRegister<Item> GUNS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ramenorant.MOD_ID);
    // Test items:
    public static final RegistryObject<Item> BLACK_OPAL = GUNS.register("black_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BLACK_OPAL = GUNS.register("raw_black_opal",
            () -> new Item(new Item.Properties()));

    // Actual things start here:
    // Pistols / Sidearms
    public static final RegistryObject<Item> CLASSIC = GUNS.register("classic",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.COMMON)
            ));

    public static final RegistryObject<Item> SHORTY = GUNS.register("shorty",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.COMMON)
            ));

    public static final RegistryObject<Item> FRENZY = GUNS.register("frenzy",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.COMMON)
            ));

    public static final RegistryObject<Item> GHOST = GUNS.register("ghost",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.COMMON)
            ));

    public static final RegistryObject<Item> SHERIFF = GUNS.register("sheriff",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.COMMON)
            ));

    // Sub Machine Guns
    public static final RegistryObject<Item> STINGER = GUNS.register("stinger",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.UNCOMMON)
            ));

    public static final RegistryObject<Item> SPECTRE = GUNS.register("spectre",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.UNCOMMON)
            ));

    // Shotguns
    public static final RegistryObject<Item> BUCKY = GUNS.register("bucky",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.UNCOMMON)
            ));

    public static final RegistryObject<Item> JUDGE = GUNS.register("judge",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.RARE)
            ));

    // Rifles
    public static final RegistryObject<Item> BULLDOG = GUNS.register("bulldog",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.RARE)
            ));

    public static final RegistryObject<Item> GUARDIAN = GUNS.register("guardian",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.RARE)
            ));

    public static final RegistryObject<Item> PHANTOM = GUNS.register("phantom",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.RARE)
            ));

    public static final RegistryObject<Item> VANDAL = GUNS.register("vandal",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.RARE)
            ));

    // Sniper Rifles
    public static final RegistryObject<Item> MARSHALL = GUNS.register("marshall",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.UNCOMMON)
            ));

    public static final RegistryObject<Item> OPERATOR = GUNS.register("operator",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.EPIC)
            ));

    // Machine Guns
    public static final RegistryObject<Item> ARES = GUNS.register("ares",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.UNCOMMON)
            ));

    public static final RegistryObject<Item> ODIN = GUNS.register("odin",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.EPIC)
            ));

    // Melee
    public static final RegistryObject<Item> KNIFE = GUNS.register("knife",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.COMMON)
            ));

    public static void register(IEventBus eventBus) {
        GUNS.register(eventBus);
    }
}
