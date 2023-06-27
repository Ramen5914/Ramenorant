package net.ramen.ramenorant.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.ramen.ramenorant.Ramenorant.MOD_ID;

public class ModGuns {
    public static final DeferredRegister<Item> GUNS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> CLASSIC = GUNS.register("classic",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )
    );

    public static final RegistryObject<Item> SHORTY = GUNS.register("shorty",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )
    );

    public static final RegistryObject<Item> FRENZY = GUNS.register("frenzy",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )
    );

    public static final RegistryObject<Item> GHOST = GUNS.register("ghost",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )
    );
}
