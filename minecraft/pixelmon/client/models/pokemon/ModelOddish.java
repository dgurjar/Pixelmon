// Date: 8/5/2012 11:10:54 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelOddish extends ModelBase {
	// fields
	ModelRenderer HEADBASE;
	ModelRenderer LEFTLEG;
	ModelRenderer RIGHTLEG;
	ModelRenderer righteye;
	ModelRenderer lefteye;
	ModelRenderer leaf1;
	ModelRenderer leaf2;
	ModelRenderer leaf3;
	ModelRenderer leaf4;
	ModelRenderer Body;
	ModelRenderer leftleg;
	ModelRenderer leftfoot;
	ModelRenderer rightfoot;
	ModelRenderer rightleg;

	public ModelOddish() {
		textureWidth = 32;
		textureHeight = 32;
		setTextureOffset("HEADBASE.Delete", 0, 0);
		setTextureOffset("LEFTLEG.Delete1", 0, 0);
		setTextureOffset("RIGHTLEG.Delete2", 0, 0);

		HEADBASE = new ModelRenderer(this, "HEADBASE");
		HEADBASE.setRotationPoint(0F, 21F, 0F);
		setRotation(HEADBASE, 0F, 0F, 0F);
		HEADBASE.mirror = true;
		righteye = new ModelRenderer(this, 0, 13);
		righteye.addBox(-0.5F, -0.5F, -2F, 1, 1, 1);
		righteye.setRotationPoint(0F, 0.5F, 0F);
		righteye.setTextureSize(32, 32);
		righteye.mirror = true;
		setRotation(righteye, -0.7853982F, 0.6283185F, 0F);
		lefteye = new ModelRenderer(this, 0, 13);
		lefteye.addBox(-0.5F, -0.5F, -2F, 1, 1, 1);
		lefteye.setRotationPoint(0F, 0.5F, 0F);
		lefteye.setTextureSize(32, 32);
		lefteye.mirror = true;
		setRotation(lefteye, -0.7853982F, -0.6283185F, 0F);
		lefteye.mirror = false;
		leaf1 = new ModelRenderer(this, 13, -3);
		leaf1.addBox(0F, -6.5F, -1.5F, 0, 5, 3);
		leaf1.setRotationPoint(0F, 0.5F, 0F);
		leaf1.setTextureSize(32, 32);
		leaf1.mirror = true;
		setRotation(leaf1, 0F, 0F, 0.4886922F);
		leaf2 = new ModelRenderer(this, 13, -3);
		leaf2.addBox(0F, -6.5F, -1.5F, 0, 5, 3);
		leaf2.setRotationPoint(0F, 0.5F, 0F);
		leaf2.setTextureSize(32, 32);
		leaf2.mirror = true;
		setRotation(leaf2, 0F, 1.570796F, 0.4886922F);
		leaf3 = new ModelRenderer(this, 13, -3);
		leaf3.addBox(0F, -6.5F, -1.5F, 0, 5, 3);
		leaf3.setRotationPoint(0F, 0.5F, 0F);
		leaf3.setTextureSize(32, 32);
		leaf3.mirror = true;
		setRotation(leaf3, 0F, 1.570796F, -0.4886922F);
		leaf4 = new ModelRenderer(this, 13, -3);
		leaf4.addBox(0F, -6.5F, -1.5F, 0, 5, 3);
		leaf4.setRotationPoint(0F, 0.5F, 0F);
		leaf4.setTextureSize(32, 32);
		leaf4.mirror = true;
		setRotation(leaf4, 0F, 0F, -0.4886922F);
		Body = new ModelRenderer(this, 0, 0);
		Body.addBox(-1.5F, -2F, -1.5F, 3, 3, 3);
		Body.setRotationPoint(0F, 0.5F, 0F);
		Body.setTextureSize(32, 32);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		LEFTLEG = new ModelRenderer(this, "LEFTLEG");
		LEFTLEG.setRotationPoint(0.9F, 22F, 0.3F);
		setRotation(LEFTLEG, 0F, 0F, 0F);
		LEFTLEG.mirror = true;
		leftleg = new ModelRenderer(this, 6, 6);
		leftleg.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
		leftleg.setRotationPoint(0F, 0F, 0F);
		leftleg.setTextureSize(32, 32);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, 0F);
		leftfoot = new ModelRenderer(this, 0, 6);
		leftfoot.addBox(-0.5F, 0F, -1.5F, 1, 1, 2);
		leftfoot.setRotationPoint(0F, 0.8F, 0F);
		leftfoot.setTextureSize(32, 32);
		leftfoot.mirror = true;
		setRotation(leftfoot, 0.1047198F, 0F, 0F);
		RIGHTLEG = new ModelRenderer(this, "RIGHTLEG");
		RIGHTLEG.setRotationPoint(-0.9F, 22F, 0.3F);
		setRotation(RIGHTLEG, 0F, 0F, 0F);
		RIGHTLEG.mirror = true;
		rightfoot = new ModelRenderer(this, 0, 9);
		rightfoot.addBox(-0.5F, 0F, -1.5F, 1, 1, 2);
		rightfoot.setRotationPoint(0F, 0.8F, 0F);
		rightfoot.setTextureSize(32, 32);
		rightfoot.mirror = true;
		setRotation(rightfoot, 0.1047198F, 0F, 0F);
		rightleg = new ModelRenderer(this, 6, 8);
		rightleg.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
		rightleg.setRotationPoint(0F, 0F, 0F);
		rightleg.setTextureSize(32, 32);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0F);
		HEADBASE.addChild(righteye);
		HEADBASE.addChild(lefteye);
		HEADBASE.addChild(leaf1);
		HEADBASE.addChild(leaf2);
		HEADBASE.addChild(leaf3);
		HEADBASE.addChild(leaf4);
		HEADBASE.addChild(Body);
		LEFTLEG.addChild(leftleg);
		LEFTLEG.addChild(leftfoot);
		RIGHTLEG.addChild(rightfoot);
		RIGHTLEG.addChild(rightleg);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		HEADBASE.render(f5);
		LEFTLEG.render(f5);
		RIGHTLEG.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		HEADBASE.rotateAngleY = f3 / (270F / (float) Math.PI);
		HEADBASE.rotateAngleX = f4 / (270F / (float) Math.PI);
		LEFTLEG.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		RIGHTLEG.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
	}

}
