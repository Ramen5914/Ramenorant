package net.ramen.ramenorant.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ramen.ramenorant.item.custom.ClassicItem;

import static net.ramen.ramenorant.Ramenorant.MOD_ID;

public class ModGuns {
    public static final DeferredRegister<Item> GUNS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    // Sidearms
    public static final RegistryObject<Item> CLASSIC = GUNS.register("classic",
            () -> new ClassicItem(new Item.Properties()
                    .rarity(Rarity.COMMON)
                    .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> SHORTY = GUNS.register("shorty",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
                    .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> FRENZY = GUNS.register("frenzy",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
                    .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> GHOST = GUNS.register("ghost",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
                    .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> SHERIFF = GUNS.register("sheriff",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
                    .stacksTo(1)
            )
    );

    // SMGs
    public static final RegistryObject<Item> STINGER = GUNS.register("stinger",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
                    .stacksTo(1)
            )
    );
                                                                     
    public static final RegistryObject<Item> SPECTRE = GUNS.register("spectre",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
                    .stacksTo(1)
            )
    );

    // Shotguns
    public static final RegistryObject<Item> BUCKY = GUNS.register("bucky",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
                    .stacksTo(1)
            )
    );
}
