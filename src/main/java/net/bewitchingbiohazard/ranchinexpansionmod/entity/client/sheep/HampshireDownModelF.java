package net.bewitchingbiohazard.ranchinexpansionmod.entity.client.sheep;// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.animations.SheepAnimations;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class HampshireDownModelF<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "sheep_converted"), "main");
	private final ModelPart Sheep;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart Nose;
	private final ModelPart Eyes;
	private final ModelPart Ears;
	private final ModelPart R_Ear;
	private final ModelPart L_Ear;
	private final ModelPart Legs;
	private final ModelPart F_RightFoot;
	private final ModelPart F_LeftFoot;
	private final ModelPart B_RightFoot;
	private final ModelPart F_LeftFoot2;
	private final ModelPart Tail;
	private final ModelPart Neck;

	public HampshireDownModelF(ModelPart root) {
		this.Sheep = root.getChild("Sheep");
		this.Body = this.Sheep.getChild("Body");
		this.Head = this.Sheep.getChild("Head");
		this.Nose = this.Head.getChild("Nose");
		this.Eyes = this.Head.getChild("Eyes");
		this.Ears = this.Head.getChild("Ears");
		this.R_Ear = this.Ears.getChild("R_Ear");
		this.L_Ear = this.Ears.getChild("L_Ear");
		this.Legs = this.Sheep.getChild("Legs");
		this.F_RightFoot = this.Legs.getChild("F_RightFoot");
		this.F_LeftFoot = this.Legs.getChild("F_LeftFoot");
		this.B_RightFoot = this.Legs.getChild("B_RightFoot");
		this.F_LeftFoot2 = this.Legs.getChild("F_LeftFoot2");
		this.Tail = this.Sheep.getChild("Tail");
		this.Neck = this.Sheep.getChild("Neck");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Sheep = partdefinition.addOrReplaceChild("Sheep", CubeListBuilder.create(), PartPose.offset(8.0F, 24.0F, -8.0F));

		PartDefinition Body = Sheep.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(5, 26).mirror().addBox(-1.25F, -7.25F, 1.0F, 6.5F, 6.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1, 1).addBox(-2.0F, -8.0F, 0.0F, 8.25F, 8.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.05F, -2.7F, 2.0F));

		PartDefinition Head = Sheep.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(43, 2).mirror().addBox(-2.0F, -4.7F, -4.0F, 4.5F, 4.7F, 5.5F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-8.3F, -8.6F, 2.25F));

		PartDefinition Nose = Head.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(2, 8).addBox(-2.1F, -2.2F, 0.0F, 2.7F, 2.2F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -0.1F, -5.65F));

		PartDefinition Eyes = Head.addOrReplaceChild("Eyes", CubeListBuilder.create().texOffs(34, 27).addBox(1.05F, 1.3F, -1.4F, 1.3F, 0.65F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(34, 30).addBox(3.65F, 1.3F, -1.4F, 1.3F, 0.65F, 0.25F, new CubeDeformation(0.0F)), PartPose.offset(-2.75F, -4.15F, -2.7F));

		PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(3.6F, -2.0F, -2.5F));

		PartDefinition R_Ear = Ears.addOrReplaceChild("R_Ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition R_Ear_r1 = R_Ear.addOrReplaceChild("R_Ear_r1", CubeListBuilder.create().texOffs(5, 33).addBox(-2.0F, -0.5F, 0.0F, 2.25F, 0.5F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition L_Ear = Ears.addOrReplaceChild("L_Ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition L_Ear_r1 = L_Ear.addOrReplaceChild("L_Ear_r1", CubeListBuilder.create().texOffs(5, 28).addBox(-2.0F, 0.75F, 0.0F, 2.25F, 0.5F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.35F, -2.25F, -0.2F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Legs = Sheep.addOrReplaceChild("Legs", CubeListBuilder.create(), PartPose.offset(-4.8F, 0.0F, 4.0F));

		PartDefinition F_RightFoot = Legs.addOrReplaceChild("F_RightFoot", CubeListBuilder.create().texOffs(26, 45).addBox(-2.4F, -6.2F, 0.0F, 2.65F, 6.2F, 2.6F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition F_LeftFoot = Legs.addOrReplaceChild("F_LeftFoot", CubeListBuilder.create().texOffs(2, 45).addBox(-2.4F, -6.2F, 0.0F, 2.65F, 6.2F, 2.6F, new CubeDeformation(0.0F)), PartPose.offset(-4.35F, 0.0F, 0.0F));

		PartDefinition B_RightFoot = Legs.addOrReplaceChild("B_RightFoot", CubeListBuilder.create().texOffs(14, 45).addBox(1.95F, -6.2F, 0.0F, 2.65F, 6.2F, 2.6F, new CubeDeformation(0.0F)), PartPose.offset(-4.35F, 0.0F, 7.0F));

		PartDefinition F_LeftFoot2 = Legs.addOrReplaceChild("F_LeftFoot2", CubeListBuilder.create().texOffs(38, 45).addBox(-2.4F, -6.2F, 0.0F, 2.65F, 6.2F, 2.6F, new CubeDeformation(0.0F)), PartPose.offset(-4.35F, 0.0F, 7.0F));

		PartDefinition Tail = Sheep.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(3, 2).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.05F, -9.0F, 14.0F));

		PartDefinition Neck = Sheep.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offset(-10.05F, -2.7F, 2.0F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(42, 23).addBox(-2.0F, -7.0F, -3.0F, 5.0F, 6.3F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.75F, 2.25F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(SheepAnimations.WALKING_ANIMATION, limbSwing, limbSwingAmount, 5f, 2f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks)
	{
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -5.0F, 5.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, 0F, 20.0F);

		this.Head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.Head.zRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Sheep.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public ModelPart root() {
		return Sheep;
	}
}