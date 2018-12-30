package com.flansmod.common.teams;

import net.minecraft.item.ItemStack;

import java.util.List;

public interface IPlayerClass {
	List<ItemStack> GetStartingItems();

	boolean GetHorse();

	ItemStack GetHat();

	ItemStack GetChest();

	ItemStack GetLegs();

	ItemStack GetShoes();

	String GetName();

	String GetShortName();
}
