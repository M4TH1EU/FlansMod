package com.flansmod.client.gui.teams;

public enum EnumLoadoutSlot {
	primary("Primary", true),
	secondary("Secondary", true),
	special("Special", false),
	melee("Melee", false),
	armour("Armour", false);

	public boolean isWeapon;
	public String name;
	EnumLoadoutSlot(String s, boolean b) {
		name = s;
		isWeapon = b;
	}
}
