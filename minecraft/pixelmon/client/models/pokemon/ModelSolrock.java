// Date: 15/07/2012 11:52:15 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSolrock extends ModelBase {
	// fields
	ModelRenderer Body1;
	ModelRenderer Body2;
	ModelRenderer Body3;
	ModelRenderer Body4;
	ModelRenderer TopBlade1;
	ModelRenderer TopBlade2;
	ModelRenderer TopBlade3;
	ModelRenderer TopBlade4;
	ModelRenderer LeftBlade1;
	ModelRenderer LeftBlade2;
	ModelRenderer LeftBlade3;
	ModelRenderer RightBlade1;
	ModelRenderer RightBlade2;
	ModelRenderer RightBlade3;
	ModelRenderer DownBlade1;
	ModelRenderer DownBlade2;
	ModelRenderer DownBlade3;
	ModelRenderer TopLeftBlade1;
	ModelRenderer TopLeftBlade2;
	ModelRenderer TopRightBlade1;
	ModelRenderer TopRightBlade2;
	ModelRenderer DownLeftBlade1;
	ModelRenderer DownLeftBlade2;
	ModelRenderer DownLeftBlade3;
	ModelRenderer DownRightBlade1;
	ModelRenderer DownRightBlade2;
	ModelRenderer Nose1;
	ModelRenderer Nose2;
	ModelRenderer Nose3;

	public ModelSolrock() {
		textureWidth = 64;
		textureHeight = 32;

		Body1 = new ModelRenderer(this, 0, 0);
		Body1.addBox(0F, 0F, 0F, 9, 7, 7);
		Body1.setRotationPoint(-4F, -3F, 0F);
		Body1.setTextureSize(64, 32);
		Body1.mirror = true;
		setRotation(Body1, 0F, 0F, 0F);
		Body2 = new ModelRenderer(this, 32, 0);
		Body2.addBox(0F, 0F, 0F, 7, 7, 9);
		Body2.setRotationPoint(-3F, -3F, -1F);
		Body2.setTextureSize(64, 32);
		Body2.mirror = true;
		setRotation(Body2, 0F, 0F, 0F);
		Body3 = new ModelRenderer(this, 0, 15);
		Body3.addBox(0F, 0F, 0F, 7, 9, 7);
		Body3.setRotationPoint(-3F, -4F, 0F);
		Body3.setTextureSize(64, 32);
		Body3.mirror = true;
		setRotation(Body3, 0F, 0F, 0F);
		Body4 = new ModelRenderer(this, 0, 0);
		Body4.addBox(0F, 0F, 0F, 8, 8, 8);
		Body4.setRotationPoint(-3.5F, -3.5F, -0.5F);
		Body4.setTextureSize(64, 32);
		Body4.mirror = true;
		setRotation(Body4, 0F, 0F, 0F);
		TopBlade1 = new ModelRenderer(this, 50, 20);
		TopBlade1.addBox(0F, 0F, 0F, 1, 6, 1);
		TopBlade1.setRotationPoint(0F, -10F, 2F);
		TopBlade1.setTextureSize(64, 32);
		TopBlade1.mirror = true;
		setRotation(TopBlade1, 0F, 0F, 0F);
		TopBlade2 = new ModelRenderer(this, 48, 20);
		TopBlade2.addBox(0F, 0F, 0F, 1, 7, 1);
		TopBlade2.setRotationPoint(0F, -11F, 3F);
		TopBlade2.setTextureSize(64, 32);
		TopBlade2.mirror = true;
		setRotation(TopBlade2, 0F, 0F, 0F);
		TopBlade3 = new ModelRenderer(this, 45, 19);
		TopBlade3.addBox(0F, 0F, 0F, 1, 3, 1);
		TopBlade3.setRotationPoint(0.2F, -8F, 2.3F);
		TopBlade3.setTextureSize(64, 32);
		TopBlade3.mirror = true;
		setRotation(TopBlade3, 0F, 0F, 0F);
		TopBlade4 = new ModelRenderer(this, 45, 19);
		TopBlade4.addBox(0F, 0F, 0F, 1, 3, 1);
		TopBlade4.setRotationPoint(-0.1F, -8.6F, 2.3F);
		TopBlade4.setTextureSize(64, 32);
		TopBlade4.mirror = true;
		setRotation(TopBlade4, 0F, 0F, 0F);
		LeftBlade1 = new ModelRenderer(this, 41, 22);
		LeftBlade1.addBox(0F, 0F, 0F, 7, 1, 2);
		LeftBlade1.setRotationPoint(5F, 0F, 2F);
		LeftBlade1.setTextureSize(64, 32);
		LeftBlade1.mirror = true;
		setRotation(LeftBlade1, 0F, 0F, 0F);
		LeftBlade2 = new ModelRenderer(this, 41, 22);
		LeftBlade2.addBox(0F, 0F, 0F, 3, 1, 1);
		LeftBlade2.setRotationPoint(6F, 0.2F, 2.3F);
		LeftBlade2.setTextureSize(64, 32);
		LeftBlade2.mirror = true;
		setRotation(LeftBlade2, 0F, 0F, 0F);
		LeftBlade3 = new ModelRenderer(this, 39, 28);
		LeftBlade3.addBox(0F, 0F, 0F, 3, 1, 1);
		LeftBlade3.setRotationPoint(6.7F, -0.2F, 2.8F);
		LeftBlade3.setTextureSize(64, 32);
		LeftBlade3.mirror = true;
		setRotation(LeftBlade3, 0F, 0F, 0F);
		RightBlade1 = new ModelRenderer(this, 44, 23);
		RightBlade1.addBox(0F, 0F, 0F, 5, 1, 1);
		RightBlade1.setRotationPoint(-9F, 0F, 3F);
		RightBlade1.setTextureSize(64, 32);
		RightBlade1.mirror = true;
		setRotation(RightBlade1, 0F, 0F, 0F);
		RightBlade2 = new ModelRenderer(this, 45, 22);
		RightBlade2.addBox(0F, 0F, 0F, 7, 1, 1);
		RightBlade2.setRotationPoint(-11F, 0F, 2F);
		RightBlade2.setTextureSize(64, 32);
		RightBlade2.mirror = true;
		setRotation(RightBlade2, 0F, 0F, 0F);
		RightBlade3 = new ModelRenderer(this, 44, 23);
		RightBlade3.addBox(0F, 0F, 0F, 3, 1, 1);
		RightBlade3.setRotationPoint(-9.4F, -0.2F, 2.5F);
		RightBlade3.setTextureSize(64, 32);
		RightBlade3.mirror = true;
		setRotation(RightBlade3, 0F, 0F, 0F);
		DownBlade1 = new ModelRenderer(this, 48, 18);
		DownBlade1.addBox(0F, 0F, 0F, 1, 7, 1);
		DownBlade1.setRotationPoint(0F, 4F, 3F);
		DownBlade1.setTextureSize(64, 32);
		DownBlade1.mirror = true;
		setRotation(DownBlade1, 0F, 0F, 0F);
		DownBlade2 = new ModelRenderer(this, 40, 20);
		DownBlade2.addBox(0F, 0F, 0F, 1, 6, 1);
		DownBlade2.setRotationPoint(0F, 4F, 2F);
		DownBlade2.setTextureSize(64, 32);
		DownBlade2.mirror = true;
		setRotation(DownBlade2, 0F, 0F, 0F);
		DownBlade3 = new ModelRenderer(this, 57, 18);
		DownBlade3.addBox(0F, 0F, 0F, 1, 3, 1);
		DownBlade3.setRotationPoint(-0.2F, 5.6F, 2.4F);
		DownBlade3.setTextureSize(64, 32);
		DownBlade3.mirror = true;
		setRotation(DownBlade3, 0F, 0F, 0F);
		TopLeftBlade1 = new ModelRenderer(this, 56, 23);
		TopLeftBlade1.addBox(0F, 0F, 0F, 1, 5, 2);
		TopLeftBlade1.setRotationPoint(7F, -7F, 2F);
		TopLeftBlade1.setTextureSize(64, 32);
		TopLeftBlade1.mirror = true;
		setRotation(TopLeftBlade1, 0F, 0F, 0.7853982F);
		TopLeftBlade2 = new ModelRenderer(this, 56, 23);
		TopLeftBlade2.addBox(0F, 0F, 0F, 1, 2, 1);
		TopLeftBlade2.setRotationPoint(7.6F, -7.6F, 2.3F);
		TopLeftBlade2.setTextureSize(64, 32);
		TopLeftBlade2.mirror = true;
		setRotation(TopLeftBlade2, 0F, 0F, 0.7853982F);
		TopRightBlade1 = new ModelRenderer(this, 43, 22);
		TopRightBlade1.addBox(0F, 0F, 0F, 1, 5, 2);
		TopRightBlade1.setRotationPoint(-7F, -6F, 2F);
		TopRightBlade1.setTextureSize(64, 32);
		TopRightBlade1.mirror = true;
		setRotation(TopRightBlade1, 0F, 0F, -0.7853982F);
		TopRightBlade2 = new ModelRenderer(this, 43, 22);
		TopRightBlade2.addBox(0F, 0F, 0F, 1, 1, 1);
		TopRightBlade2.setRotationPoint(-7.2F, -6.2F, 2.6F);
		TopRightBlade2.setTextureSize(64, 32);
		TopRightBlade2.mirror = true;
		setRotation(TopRightBlade2, 0F, 0F, -0.7853982F);
		DownLeftBlade1 = new ModelRenderer(this, 42, 28);
		DownLeftBlade1.addBox(0F, 0F, 0F, 6, 1, 1);
		DownLeftBlade1.setRotationPoint(3F, 3F, 2F);
		DownLeftBlade1.setTextureSize(64, 32);
		DownLeftBlade1.mirror = true;
		setRotation(DownLeftBlade1, 0F, 0F, 0.7853982F);
		DownLeftBlade2 = new ModelRenderer(this, 44, 21);
		DownLeftBlade2.addBox(0F, 0F, 0F, 5, 1, 1);
		DownLeftBlade2.setRotationPoint(3F, 3F, 3F);
		DownLeftBlade2.setTextureSize(64, 32);
		DownLeftBlade2.mirror = true;
		setRotation(DownLeftBlade2, 0F, 0F, 0.7853982F);
		DownLeftBlade3 = new ModelRenderer(this, 51, 19);
		DownLeftBlade3.addBox(0F, 0F, 0F, 2, 1, 1);
		DownLeftBlade3.setRotationPoint(5F, 4.7F, 2.8F);
		DownLeftBlade3.setTextureSize(64, 32);
		DownLeftBlade3.mirror = true;
		setRotation(DownLeftBlade3, 0F, 0F, 0.7853982F);
		DownRightBlade1 = new ModelRenderer(this, 38, 25);
		DownRightBlade1.addBox(0F, 0F, 1F, 5, 1, 2);
		DownRightBlade1.setRotationPoint(-7F, 7F, 1F);
		DownRightBlade1.setTextureSize(64, 32);
		DownRightBlade1.mirror = true;
		setRotation(DownRightBlade1, 0F, 0F, -0.7853982F);
		DownRightBlade2 = new ModelRenderer(this, 38, 25);
		DownRightBlade2.addBox(0F, 0F, 1F, 2, 1, 1);
		DownRightBlade2.setRotationPoint(-5.9F, 5.9F, 2.2F);
		DownRightBlade2.setTextureSize(64, 32);
		DownRightBlade2.mirror = true;
		setRotation(DownRightBlade2, 0F, 0F, -0.7853982F);
		Nose1 = new ModelRenderer(this, 40, 18);
		Nose1.addBox(0F, 0F, 0F, 1, 1, 1);
		Nose1.setRotationPoint(0F, -2F, -1.2F);
		Nose1.setTextureSize(64, 32);
		Nose1.mirror = true;
		setRotation(Nose1, 0F, 0F, 0F);
		Nose2 = new ModelRenderer(this, 40, 18);
		Nose2.addBox(0F, 0F, 0F, 1, 1, 1);
		Nose2.setRotationPoint(0F, 0F, -1.2F);
		Nose2.setTextureSize(64, 32);
		Nose2.mirror = true;
		setRotation(Nose2, 0F, 0F, 0F);
		Nose3 = new ModelRenderer(this, 40, 18);
		Nose3.addBox(0F, 0F, 0F, 1, 1, 1);
		Nose3.setRotationPoint(0F, 2F, -1.2F);
		Nose3.setTextureSize(64, 32);
		Nose3.mirror = true;
		setRotation(Nose3, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body1.render(f5);
		Body2.render(f5);
		Body3.render(f5);
		Body4.render(f5);
		TopBlade1.render(f5);
		TopBlade2.render(f5);
		TopBlade3.render(f5);
		TopBlade4.render(f5);
		LeftBlade1.render(f5);
		LeftBlade2.render(f5);
		LeftBlade3.render(f5);
		RightBlade1.render(f5);
		RightBlade2.render(f5);
		RightBlade3.render(f5);
		DownBlade1.render(f5);
		DownBlade2.render(f5);
		DownBlade3.render(f5);
		TopLeftBlade1.render(f5);
		TopLeftBlade2.render(f5);
		TopRightBlade1.render(f5);
		TopRightBlade2.render(f5);
		DownLeftBlade1.render(f5);
		DownLeftBlade2.render(f5);
		DownLeftBlade3.render(f5);
		DownRightBlade1.render(f5);
		DownRightBlade2.render(f5);
		Nose1.render(f5);
		Nose2.render(f5);
		Nose3.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
	}

}
