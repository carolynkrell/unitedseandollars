package com.xanderj.unitedseandollars.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item USD = new Item(new Item.Settings().maxCount(64).group(ItemGroup.MISC).rarity(Rarity.UNCOMMON));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("unitedseandollars", "usd"), USD);
    }
}