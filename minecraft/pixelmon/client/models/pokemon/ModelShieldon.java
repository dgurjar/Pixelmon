// Date: 2/12/2013 2:20:17 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.client.models.pokemon;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.SkeletonQuadruped;

public class ModelShieldon extends PixelmonModelBase
{
  //fields
    ModelRenderer Body;
  
  public ModelShieldon()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Body = new ModelRenderer(this, "Body");
      Body.setRotationPoint(0, 18, -2);
      ModelRenderer main_body = new ModelRenderer(this, 0, 54);
      main_body.addBox(-2.5F, -1F, 0F, 5, 5, 5);
      main_body.setTextureSize(128, 64);
      main_body.mirror = true;
      setRotation(main_body, 0.1047198F, 0F, 0F);
      Body.addChild(main_body);
      ModelRenderer main_body_bottom = new ModelRenderer(this, 0, 46);
      main_body_bottom.addBox(-1.5F, 2.533333F, 0F, 3, 2, 5);
      main_body_bottom.setTextureSize(128, 64);
      main_body_bottom.mirror = true;
      setRotation(main_body_bottom, 0.0698132F, 0F, 0F);
      Body.addChild(main_body_bottom);
      ModelRenderer body_2 = new ModelRenderer(this, 0, 38);
      body_2.addBox(-2F, -1.866667F, 3.333333F, 4, 4, 3);
      body_2.setTextureSize(128, 64);
      body_2.mirror = true;
      setRotation(body_2, -0.2617994F, 0F, 0F);
      Body.addChild(body_2);
      ModelRenderer body_2_top = new ModelRenderer(this, 0, 33);
      body_2_top.addBox(-2F, -3.1F, 4F, 4, 2, 2);
      body_2_top.setTextureSize(128, 64);
      body_2_top.mirror = true;
      setRotation(body_2_top, -0.4014257F, 0F, 0F);
      Body.addChild(body_2_top);
      ModelRenderer back_spike = new ModelRenderer(this, 0, 29);
      back_spike.addBox(-1F, -1F, 2F, 2, 1, 2);
      back_spike.setTextureSize(128, 64);
      back_spike.mirror = true;
      setRotation(back_spike, 0.2443461F, 0F, 0F);
      Body.addChild(back_spike);
      ModelRenderer back_spike_2 = new ModelRenderer(this, 0, 29);
      back_spike_2.addBox(-1F, -3.6F, 2F, 2, 1, 2);
      back_spike_2.setTextureSize(128, 64);
      back_spike_2.mirror = true;
      setRotation(back_spike_2, -0.5759587F, 0F, 0F);
      Body.addChild(back_spike_2);
      ModelRenderer neck = new ModelRenderer(this, 0, 22);
      neck.addBox(-1.5F, -1.8F, -1.4F, 3, 4, 2);
      neck.setRotationPoint(0F, 1F, 0F);
      neck.setTextureSize(128, 64);
      neck.mirror = true;
      setRotation(neck, -0.1396263F, 0F, 0F);
      Body.addChild(neck);
      
      
      ModelRenderer Head = new ModelRenderer(this, "Head");
      Head.setRotationPoint(0, 1, -1);
      ModelRenderer  main_head = new ModelRenderer(this, 0, 14);
      main_head.addBox(-2F, -2.066667F, -2.3F, 4, 4, 3);
      main_head.setTextureSize(128, 64);
      main_head.mirror = true;
      setRotation(main_head, 0.1919862F, 0F, 0F);
      Head.addChild(main_head);
      ModelRenderer  head_top = new ModelRenderer(this, 0, 10);
      head_top.addBox(-1.5F, -2.533333F, -2.2F, 3, 1, 2);
      head_top.setTextureSize(128, 64);
      head_top.mirror = true;
      setRotation(head_top, 0.1396263F, 0F, 0F);
      Head.addChild(head_top);
      ModelRenderer  mouth_bottom = new ModelRenderer(this, 15, 23);
      mouth_bottom.addBox(-1F, -1.333333F, -4.466667F, 2, 1, 2);
      mouth_bottom.setTextureSize(128, 64);
      mouth_bottom.mirror = true;
      setRotation(mouth_bottom, 0.8901179F, 0F, 0F);
      Head.addChild(mouth_bottom);
      ModelRenderer  mouth_top = new ModelRenderer(this, 14, 27);
      mouth_top.addBox(-1.5F, -2.6F, -4.8F, 3, 2, 2);
      mouth_top.setTextureSize(128, 64);
      mouth_top.mirror = true;
      setRotation(mouth_top, 0.8901179F, 0F, 0F);
      Head.addChild(mouth_top);
      ModelRenderer  head_front = new ModelRenderer(this, 15, 16);
      head_front.addBox(-1.5F, -3.066667F, -2.933333F, 3, 2, 3);
      head_front.setTextureSize(128, 64);
      head_front.mirror = true;
      setRotation(head_front, 1.291544F, 0F, 0F);
      Head.addChild(head_front);
      ModelRenderer  head_sheild_main = new ModelRenderer(this, 21, 55);
      head_sheild_main.addBox(-3F, -2.866667F, -3.266667F, 6, 1, 8);
      head_sheild_main.setTextureSize(128, 64);
      head_sheild_main.mirror = true;
      setRotation(head_sheild_main, 1.239184F, 0F, 0F);
      Head.addChild(head_sheild_main);
      ModelRenderer  head_sheild_side_L = new ModelRenderer(this, 25, 45);
      head_sheild_side_L.addBox(2.533333F, -2.866667F, -1.933333F, 1, 1, 5);
      head_sheild_side_L.setTextureSize(128, 64);
      head_sheild_side_L.mirror = true;
      setRotation(head_sheild_side_L, 1.239184F, 0F, -0.0523599F);
      Head.addChild(head_sheild_side_L);
      ModelRenderer  head_sheild_side_R = new ModelRenderer(this, 25, 45);
      head_sheild_side_R.addBox(-3.466667F, -2.866667F, -1.933333F, 1, 1, 5);
      head_sheild_side_R.setTextureSize(128, 64);
      head_sheild_side_R.mirror = true;
      setRotation(head_sheild_side_R, 1.239184F, 0F, 0.0523599F);
      Head.addChild(head_sheild_side_R);
      ModelRenderer  head_sheild_top = new ModelRenderer(this, 23, 52);
      head_sheild_top.addBox(-2F, -2.866667F, 4.733333F, 4, 1, 1);
      head_sheild_top.setTextureSize(128, 64);
      head_sheild_top.mirror = true;
      setRotation(head_sheild_top, 1.239184F, 0F, 0F);
      Head.addChild(head_sheild_top);
      ModelRenderer  head_sheild_center_ = new ModelRenderer(this, 25, 39);
      head_sheild_center_.addBox(-2F, -3.6F, -0.8F, 4, 1, 4);
      head_sheild_center_.setTextureSize(128, 64);
      head_sheild_center_.mirror = true;
      setRotation(head_sheild_center_, 1.151917F, 0F, 0F);
      Head.addChild(head_sheild_center_);
      ModelRenderer  head_sheild_center_top = new ModelRenderer(this, 29, 34);
      head_sheild_center_top.addBox(-1.5F, -4.066667F, -0.4F, 3, 1, 3);
      head_sheild_center_top.setTextureSize(128, 64);
      head_sheild_center_top.mirror = true;
      setRotation(head_sheild_center_top, 1.099557F, 0F, 0F);
      Head.addChild(head_sheild_center_top);
      ModelRenderer  head_sheild_bar_upper = new ModelRenderer(this, 30, 31);
      head_sheild_bar_upper.addBox(-2.5F, -3.933333F, -1.2F, 5, 1, 1);
      head_sheild_bar_upper.setTextureSize(128, 64);
      head_sheild_bar_upper.mirror = true;
      setRotation(head_sheild_bar_upper, 1.169371F, 0F, 0F);
      Head.addChild(head_sheild_bar_upper);
      ModelRenderer  head_sheild_bar_lower = new ModelRenderer(this, 30, 28);
      head_sheild_bar_lower.addBox(-1.966667F, -4.2F, -2.133333F, 4, 1, 1);
      head_sheild_bar_lower.setTextureSize(128, 64);
      head_sheild_bar_lower.mirror = true;
      setRotation(head_sheild_bar_lower, 1.48353F, 0F, 0F);
      Head.addChild(head_sheild_bar_lower);
      ModelRenderer  head_sheild_bar_upper_R = new ModelRenderer(this, 30, 31);
      head_sheild_bar_upper_R.addBox(-0.8F, -4.5F, -1.4F, 1, 1, 1);
      head_sheild_bar_upper_R.setRotationPoint(0F, -0.5F, 0F);
      head_sheild_bar_upper_R.setTextureSize(128, 64);
      head_sheild_bar_upper_R.mirror = true;
      setRotation(head_sheild_bar_upper_R, 1.186824F, 0.5410521F, -0.2792527F);
      Head.addChild(head_sheild_bar_upper_R);
      ModelRenderer  head_sheild_bar_upper_L = new ModelRenderer(this, 30, 31);
      head_sheild_bar_upper_L.addBox(-0.2F, -4.5F, -1.4F, 1, 1, 1);
      head_sheild_bar_upper_L.setRotationPoint(0F, -0.5F, 0F);
      head_sheild_bar_upper_L.setTextureSize(128, 64);
      head_sheild_bar_upper_L.mirror = true;
      setRotation(head_sheild_bar_upper_L, 1.186824F, -0.5410521F, 0.2792527F);
      Head.addChild(head_sheild_bar_upper_L);
      ModelRenderer  eyes = new ModelRenderer(this, 27, 23);
      eyes.addBox(-2.5F, -3.533333F, -1.933333F, 5, 1, 2);
      eyes.setTextureSize(128, 64);
      eyes.mirror = true;
      setRotation(eyes, 1.448623F, 0F, 0F);
      Head.addChild(eyes);
      Body.addChild(Head);
      
      
      ModelRenderer Tail = new ModelRenderer(this, "Tail");
      Tail.setRotationPoint(0, 1, 6);
      ModelRenderer  tail_1 = new ModelRenderer(this, 25, 0);
      tail_1.addBox(-1.5F, -1.333333F, 0F, 3, 3, 2);
      tail_1.setTextureSize(128, 64);
      tail_1.mirror = true;
      setRotation(tail_1, -0.1570796F, 0F, 0F);
      Tail.addChild(tail_1);
      ModelRenderer  tail_2 = new ModelRenderer(this, 26, 6);
      tail_2.addBox(-1F, -1.333333F, -0.2666667F, 2, 2, 2);
      tail_2.setRotationPoint(0F, 0.6F, 2F);
      tail_2.setTextureSize(128, 64);
      tail_2.mirror = true;
      setRotation(tail_2, -0.0523599F, 0F, 0F);
      Tail.addChild(tail_2);
      ModelRenderer tail_3 = new ModelRenderer(this, 28, 11);
      tail_3.addBox(-0.5F, -0.9333333F, -0.6F, 1, 1, 2);
      tail_3.setRotationPoint(0F, 0.6F, 3.533333F);
      tail_3.setTextureSize(128, 64);
      tail_3.mirror = true;
      setRotation(tail_3, 0.0698132F, 0F, 0F);
      Tail.addChild(tail_3);
      Body.addChild(Tail);
      
      
      ModelRenderer FLLeg = new ModelRenderer(this, "FLLeg");
      FLLeg.setRotationPoint(2, 2, 1);
      ModelRenderer L_front_leg = new ModelRenderer(this, 10, 0);
      L_front_leg.addBox(-0.7333333F, 0F, -1F, 2, 4, 2);
      L_front_leg.setTextureSize(128, 64);
      L_front_leg.mirror = true;
      setRotation(L_front_leg, -0.0872665F, 0F, 0F);
      FLLeg.addChild(L_front_leg);
      ModelRenderer L_front_toe = new ModelRenderer(this, 0, 0);
      L_front_toe.addBox(-0.2666667F, 3.133333F, -1.6F, 1, 1, 1);
      L_front_toe.setTextureSize(128, 64);
      L_front_toe.mirror = true;
      setRotation(L_front_toe, 0F, 0F, 0F);
      FLLeg.addChild(L_front_toe);
      Body.addChild(FLLeg);
      
      
      ModelRenderer FRLeg = new ModelRenderer(this, "FRLeg");
      FRLeg.setRotationPoint(-2, 2, 1);
      ModelRenderer R_front_leg = new ModelRenderer(this, 10, 0);
      R_front_leg.addBox(-1.066667F, 0F, -1F, 2, 4, 2);
      R_front_leg.setTextureSize(128, 64);
      R_front_leg.mirror = true;
      setRotation(R_front_leg, -0.0872665F, 0F, 0F);
      FRLeg.addChild(R_front_leg);
      ModelRenderer R_front_toe = new ModelRenderer(this, 0, 0);
      R_front_toe.addBox(-0.6666667F, 3.133333F, -1.6F, 1, 1, 1);
      R_front_toe.setTextureSize(128, 64);
      R_front_toe.mirror = true;
      setRotation(R_front_toe, 0F, 0F, 0F);
      FRLeg.addChild(R_front_toe);
      Body.addChild(FRLeg);
      
      
      ModelRenderer BLLeg = new ModelRenderer(this, "BLLeg");
      BLLeg.setRotationPoint(2, 2, 5);
      ModelRenderer L_back_leg = new ModelRenderer(this, 10, 0);
      L_back_leg.addBox(-1.066667F, 0F, -1F, 2, 4, 2);
      L_back_leg.setTextureSize(128, 64);
      L_back_leg.mirror = true;
      setRotation(L_back_leg, 0.0872665F, 0F, 0F);
      BLLeg.addChild(L_back_leg);
      ModelRenderer L_back_toe = new ModelRenderer(this, 0, 0);
      L_back_toe.addBox(-0.2666667F, 3.133333F, -1.2F, 1, 1, 1);
      L_back_toe.setTextureSize(128, 64);
      L_back_toe.mirror = true;
      setRotation(L_back_toe, 0F, 0F, 0F);
      BLLeg.addChild(L_back_toe);
      Body.addChild(BLLeg);
      
      
      ModelRenderer BRLeg = new ModelRenderer(this, "BRLeg");
      BRLeg.setRotationPoint(-2, 2, 5);
      ModelRenderer R_back_leg = new ModelRenderer(this, 10, 0);
      R_back_leg.addBox(-1.066667F, 0F, -1F, 2, 4, 2);
      R_back_leg.setTextureSize(128, 64);
      R_back_leg.mirror = true;
      setRotation(R_back_leg, 0.0872665F, 0F, 0F);
      BRLeg.addChild(R_back_leg);
      ModelRenderer R_back_toe = new ModelRenderer(this, 0, 0);
      R_back_toe.addBox(-0.7333333F, 3.133333F, -1.2F, 1, 1, 1);
      R_back_toe.setTextureSize(128, 64);
      R_back_toe.mirror = true;
      setRotation(R_back_toe, 0F, 0F, 0F);
      BRLeg.addChild(R_back_leg);
      Body.addChild(BRLeg);
      
      ModuleHead headModule = new ModuleHead(Head);
      skeleton = new SkeletonQuadruped(Body, headModule, FLLeg, FRLeg, BLLeg, BRLeg, 1.1f, 1.1f, 0.8f);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  

}
