package com.flansmod.common;

import com.flansmod.client.gui.GuiGunBox;
import com.flansmod.common.guns.boxes.GunBoxType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CommonGuiHandler implements IGuiHandler {
	@SideOnly(Side.CLIENT)
	public static void openGunBoxGui(EntityPlayer player, GunBoxType type) {
		EntityPlayerMP playerMP = (EntityPlayerMP) player;
		FMLClientHandler.instance().displayGuiScreen(player, new GuiGunBox(playerMP.inventory, type));
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return FlansMod.proxy.getServerGui(ID, player, world, x, y, z);
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return FlansMod.proxy.getClientGui(ID, player, world, x, y, z);
	}
}
