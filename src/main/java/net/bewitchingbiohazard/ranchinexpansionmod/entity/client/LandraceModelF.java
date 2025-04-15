package net.bewitchingbiohazard.ranchinexpansionmod.entity.client;// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class LandraceModelF<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "pigmodel_converted"), "main");
	private final ModelPart Pig;
	private final ModelPart Head;
	private final ModelPart Ears;
	private final ModelPart Snout;
	private final ModelPart Body;
	private final ModelPart Legs;
	private final ModelPart Tail;
	private final ModelPart Neck;

	public LandraceModelF(ModelPart root) {
		this.Pig = root.getChild("Pig");
		this.Head = this.Pig.getChild("Head");
		this.Ears = this.Head.getChild("Ears");
		this.Snout = this.Head.getChild("Snout");
		this.Body = this.Pig.getChild("Body");
		this.Legs = this.Pig.getChild("Legs");
		this.Tail = this.Pig.getChild("Tail");
		this.Neck = this.Pig.getChild("Neck");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Pig = partdefinition.addOrReplaceChild("Pig", CubeListBuilder.create(), PartPose.offset(8.0F, 24.0F, -8.0F));

		PartDefinition Head = Pig.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 12).addBox(-1.25F, -5.75F, -5.5F, 2.75F, 2.75F, 2.75F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 0.0F, 8.0F));

		PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(1.0F, -4.0F, 3.75F));

		PartDefinition LeftEar_r1 = Ears.addOrReplaceChild("LeftEar_r1", CubeListBuilder.create().texOffs(14, 20).addBox(-1.6F, -0.2F, -2.0F, 1.3F, 0.2F, 0.9F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, -1.55F, -6.85F, 0.0F, 0.0F, -0.7854F));

		PartDefinition RightEar_r1 = Ears.addOrReplaceChild("RightEar_r1", CubeListBuilder.create().texOffs(19, 20).addBox(-1.6F, -0.2F, -2.0F, 1.3F, 0.2F, 0.9F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.15F, -6.85F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(8, 20).addBox(-2.0F, -0.5F, -0.25F, 1.5F, 0.75F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(25, 20).addBox(-1.8F, 0.25F, 0.0F, 1.1F, 0.3F, 0.75F, new CubeDeformation(0.0F)), PartPose.offset(1.4F, -3.6F, -6.15F));

		PartDefinition Body = Pig.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -4.25F, 0.0F, 4.25F, 3.75F, 7.25F, new CubeDeformation(0.0F))
		.texOffs(12, 13).addBox(-1.75F, -0.75F, 2.0F, 3.75F, 0.75F, 3.25F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, -0.75F, 4.75F));

		PartDefinition Legs = Pig.addOrReplaceChild("Legs", CubeListBuilder.create().texOffs(19, 1).addBox(0.75F, -2.0F, -4.5F, 1.25F, 2.0F, 1.25F, new CubeDeformation(0.0F))
		.texOffs(26, 1).addBox(-1.25F, -2.0F, -4.5F, 1.25F, 2.0F, 1.25F, new CubeDeformation(0.0F))
		.texOffs(26, 9).addBox(0.75F, -2.0F, 0.0F, 1.25F, 2.0F, 1.25F, new CubeDeformation(0.0F))
		.texOffs(26, 5).addBox(-1.25F, -2.0F, 0.0F, 1.25F, 2.0F, 1.25F, new CubeDeformation(0.0F)), PartPose.offset(-8.25F, 0.0F, 10.0F));

		PartDefinition Tail = Pig.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(1, 4).addBox(-2.0F, -4.25F, 7.3F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -1.75F, 4.75F));

		PartDefinition Neck = Pig.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offset(-7.0F, -1.75F, 4.75F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(1, 19).addBox(-2.0F, -1.75F, 0.0F, 2.0F, 1.75F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Pig.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}