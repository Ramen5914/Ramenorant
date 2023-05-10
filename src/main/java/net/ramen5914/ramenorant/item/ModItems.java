package net.ramen5914.ramenorant.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ramen5914.ramenorant.Ramenorant;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ramenorant.MOD_ID);
    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> RAW_BLACK_OPAL = ITEMS.register("raw_black_opal",
            () -> new Item(new Item.Properties()));
    // Actual things start here:
    // Pistols / Sidearms
    public static final  RegistryObject<Item> CLASSIC = ITEMS.register("classic",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> SHORTY = ITEMS.register("shorty",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> FRENZY = ITEMS.register("frenzy",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> GHOST = ITEMS.register("ghost",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> SHERIFF = ITEMS.register("sheriff",
            () -> new Item(new Item.Properties()));
    // Sub Machine Guns
    public static final  RegistryObject<Item> STINGER = ITEMS.register("stinger",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> SPECTRE = ITEMS.register("spectre",
            () -> new Item(new Item.Properties()));
    // Shotguns
    public static final  RegistryObject<Item> BUCKY = ITEMS.register("bucky",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> JUDGE = ITEMS.register("judge",
            () -> new Item(new Item.Properties()));
    // Rifles
    public static final  RegistryObject<Item> BULLDOG = ITEMS.register("bulldog",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> GUARDIAN = ITEMS.register("guardian",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> PHANTOM = ITEMS.register("phantom",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> VANDAL = ITEMS.register("vandal",
            () -> new Item(new Item.Properties()));
    // Sniper Rifles
    public static final  RegistryObject<Item> MARSHALL = ITEMS.register("marshall",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> OPERATOR = ITEMS.register("operator",
            () -> new Item(new Item.Properties()));
    // Machine Guns
    public static final  RegistryObject<Item> ARES = ITEMS.register("ares",
            () -> new Item(new Item.Properties()));
    public static final  RegistryObject<Item> ODIN = ITEMS.register("odin",
            () -> new Item(new Item.Properties()));
    // Melee
    public static final  RegistryObject<Item> KNIFE = ITEMS.register("knife",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
