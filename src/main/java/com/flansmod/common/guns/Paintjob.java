package com.flansmod.common.guns;

import com.flansmod.common.types.EnumPaintjobRarity;
import com.flansmod.common.types.PaintableType;
import net.minecraft.item.ItemStack;

import java.util.HashMap;

public class Paintjob {
	private static HashMap<Integer, Paintjob> paintjobs = new HashMap<>();

	public PaintableType parent;
	public String iconName;
	public String textureName;
	public ItemStack[] dyesNeeded;
	public int ID;
	public EnumPaintjobRarity rarity;

	public Paintjob(PaintableType parent, int id, String iconName, String textureName, ItemStack[] dyesNeeded) {
		this.parent = parent;
		this.ID = id;
		this.iconName = iconName;
		this.textureName = textureName;
		this.dyesNeeded = dyesNeeded;
		this.rarity = EnumPaintjobRarity.UNKNOWN;

		paintjobs.put(hashCode(), this);
	}

	public static Paintjob GetPaintjob(int hash) {
		return paintjobs.get(hash);
	}

	@Override
	public int hashCode() {
		return parent.hashCode() ^ ID;
	}
}
