// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfour_arms<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "four_arms"), "main");
	private final ModelPart RightArm;
	private final ModelPart RightArm2;
	private final ModelPart LeftArm;
	private final ModelPart LeftArm2;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Head;
	private final ModelPart Body;

	public Modelfour_arms(ModelPart root) {
		this.RightArm = root.getChild("RightArm");
		this.RightArm2 = root.getChild("RightArm2");
		this.LeftArm = root.getChild("LeftArm");
		this.LeftArm2 = root.getChild("LeftArm2");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-5.5F, -4.5F, -3.0F, 5.0F, 21.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 37)
						.addBox(-0.2F, -3.0F, -1.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(13.3F, -5.0F, 0.0F));

		PartDefinition cube_r1 = RightArm
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(68, 31).addBox(-8.0F, -1.0F, 0.0F, 13.0F, 2.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.5F, 5.0F, 0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition RightArm2 = partdefinition.addOrReplaceChild("RightArm2", CubeListBuilder.create()
				.texOffs(48, 22).addBox(-4.0F, -0.25F, -2.5F, 5.0F, 17.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.8F, -3.25F, 0.5F));

		PartDefinition cube_r2 = RightArm2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(68, 34).addBox(-4.0F, 0.0F, 0.0F, 9.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 7.25F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(24, 32)
				.addBox(-0.75F, -1.5F, -3.5F, 5.0F, 21.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.45F, -8.0F, 0.5F));

		PartDefinition cube_r3 = LeftArm.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(68, 29).addBox(-8.0F, -1.0F, 0.0F, 13.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.75F, 8.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition LeftArm2 = partdefinition.addOrReplaceChild("LeftArm2", CubeListBuilder.create().texOffs(46, 0)
				.addBox(-1.0F, -3.5F, -2.5F, 5.0F, 17.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.2F, 0.0F, 0.5F));

		PartDefinition cube_r4 = LeftArm2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(68, 33).addBox(-4.0F, 0.0F, 0.0F, 9.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 4.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(68, 13)
				.addBox(-2.5333F, 3.6167F, -2.2667F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 55)
				.addBox(-3.0333F, 12.6167F, -4.5667F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0333F, 8.3833F, 0.0667F));

		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(24, 60).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0667F, 1.5167F, 0.3333F, 0.0F, 0.0F, -0.0436F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(48, 66)
						.addBox(-2.5F, 4.1167F, -2.2667F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 44)
						.addBox(-3.0F, 13.1167F, -4.5667F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 7.8833F, 0.0667F));

		PartDefinition RightLeg_r2 = LeftLeg.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(0, 60).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0167F, 0.3333F, 0.0F, 0.0F, 0.0436F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(68, 35)
						.addBox(-3.0F, 0.3F, -1.6F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(66, 0)
						.addBox(-3.0F, -4.8F, -1.4F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.3F, -12.2F, -2.6F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-6.5F, 0.75F, -3.5F, 13.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.5F, -9.25F, -4.0F, 15.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.3F, -0.75F, 0.5F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}