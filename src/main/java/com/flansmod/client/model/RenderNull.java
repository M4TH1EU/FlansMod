package com.flansmod.client.model;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntitySeat;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import org.lwjgl.opengl.GL11;

public class RenderNull extends Render {
	private static final ResourceLocation texture = new ResourceLocation("Flan", "null.png");
	protected ModelBase model;

	public RenderNull(RenderManager renderManager) {
		super(renderManager);
		shadowSize = 0.5F;
	}

	public void func_157_a(Entity entity, double d, double d1, double d2,
						   float f, float f1) {
	}

	@Override
	public void doRender(Entity entity, double d, double d1, double d2,
						 float f, float f1) {
		if (FlansMod.DEBUG) {
			GL11.glPushMatrix();
			GL11.glTranslatef((float) d, (float) d1, (float) d2);
			GL11.glRotatef(-entity.rotationYaw, 0F, 1F, 0F);
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			//GL11.glEnable(GL11.GL_BLEND);
			//GL11.glDisable(GL11.GL_DEPTH_TEST);
			if (entity instanceof EntitySeat) {
				GL11.glColor4f(1F, 1F, 1F, 1F);
			} else GL11.glColor4f(0F, 0F, 1F, 0.3F);
			GL11.glScalef(-1F, 1F, -1F);
			renderOffsetAABB(new AxisAlignedBB(-1F, -1F, -1F, 1F, 1F, 1F), 0, 0, 0);
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glColor4f(1F, 1F, 1F, 1F);
			GL11.glPopMatrix();
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}

	public static class Factory implements IRenderFactory {
		@Override
		public Render createRenderFor(RenderManager manager) {
			return new RenderNull(manager);
		}
	}
}
