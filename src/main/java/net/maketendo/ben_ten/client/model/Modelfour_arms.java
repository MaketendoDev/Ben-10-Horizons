package net.maketendo.ben_ten.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelfour_arms<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ben_10", "modelfour_arms"), "main");
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart Body;
	public final ModelPart LowerLeftArm;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Head;
	public final ModelPart LowerRightArm;

	public Modelfour_arms(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Body = root.getChild("Body");
		this.LowerLeftArm = root.getChild("LowerLeftArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Head = root.getChild("Head");
		this.LowerRightArm = root.getChild("LowerRightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(48, 55).addBox(-1.4F, 9.0F, -4.5F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition BottomLeftLeg_r1 = LeftLeg.addOrReplaceChild("BottomLeftLeg_r1", CubeListBuilder.create().texOffs(68, 13).addBox(-2.5F, -5.5F, -2.5F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5142F, 5.4015F, 0.3F, 0.0F, 0.0F, -0.0436F));
		PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(24, 60).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2F, -2.1F, 0.4F, 0.0F, 0.0F, -0.0436F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(48, 44).addBox(-4.5F, 9.0F, -4.5F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1", CubeListBuilder.create().texOffs(0, 60).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1F, -2.1F, 0.4F, 0.0F, 0.0F, 0.0436F));
		PartDefinition RightBottomLeg_r1 = RightLeg.addOrReplaceChild("RightBottomLeg_r1", CubeListBuilder.create().texOffs(48, 66).addBox(-2.5F, -5.5F, -2.5F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5188F, 5.6109F, 0.3F, 0.0F, 0.0F, 0.0436F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.2F, -4.75F, -3.5F, 15.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-6.2F, 5.25F, -3.0F, 13.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.25F, 0.0F));
		PartDefinition LowerLeftArm = partdefinition.addOrReplaceChild("LowerLeftArm", CubeListBuilder.create().texOffs(48, 22).addBox(1.8F, -5.5F, -2.0F, 5.0F, 17.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition BottomLeftOverlay_r1 = LowerLeftArm.addOrReplaceChild("BottomLeftOverlay_r1", CubeListBuilder.create().texOffs(68, 34).addBox(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3F, 1.5F, 0.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 32).addBox(2.8F, -11.5F, -3.0F, 5.0F, 21.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
				.addBox(7.3F, -10.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 37).addBox(8.1F, -10.0F, -1.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition LeftOverlay_r1 = LeftArm.addOrReplaceChild("LeftOverlay_r1", CubeListBuilder.create().texOffs(68, 31).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.8F, -0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(24, 32).addBox(-7.2F, -11.5F, -3.0F, 5.0F, 21.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition RightOverlay_r1 = RightArm.addOrReplaceChild("RightOverlay_r1", CubeListBuilder.create().texOffs(68, 29).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.2F, -0.5F, 0.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(66, 0).addBox(-2.7F, -17.0F, -4.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(68, 35).addBox(-2.7F, -11.9F, -4.2F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LowerRightArm = partdefinition.addOrReplaceChild("LowerRightArm", CubeListBuilder.create().texOffs(46, 0).addBox(-6.2F, -5.5F, -2.0F, 5.0F, 17.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition BottomRightOverlay_r1 = LowerRightArm.addOrReplaceChild("BottomRightOverlay_r1", CubeListBuilder.create().texOffs(68, 33).addBox(-4.5F, -0.5F, 0.0F, 9.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7F, 1.5F, 0.5F, 0.0F, 0.0F, -1.5708F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LowerLeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LowerRightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
