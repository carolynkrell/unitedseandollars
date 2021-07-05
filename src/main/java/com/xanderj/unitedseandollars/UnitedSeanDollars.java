package com.xanderj.unitedseandollars;

import com.xanderj.unitedseandollars.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class UnitedSeanDollars implements ModInitializer {
	@Override
	public void onInitialize() {
		ModItems.register();
	}
}
