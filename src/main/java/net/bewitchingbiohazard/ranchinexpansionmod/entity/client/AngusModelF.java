package net.bewitchingbiohazard.ranchinexpansionmod.entity.client;// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.animations.CowAnimations;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class AngusModelF<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "f_cowangus_javamodel"), "main");
	private final ModelPart Angus;
	private final ModelPart Body;
	private final ModelPart Legs;
	private final ModelPart B_Left;
	private final ModelPart F_Right;
	private final ModelPart F_Left;
	private final ModelPart B_Right;
	private final ModelPart Head;
	private final ModelPart Ears;
	private final ModelPart L_Ear;
	private final ModelPart R_Ear;
	private final ModelPart Eyes;
	private final ModelPart TopJaw;
	private final ModelPart BottomJaw;
	private final ModelPart Ring;
	private final ModelPart Tag;
	private final ModelPart Tail;
	private final ModelPart Bell;
	private final ModelPart Neck;

	public AngusModelF(ModelPart root) {
		this.Angus = root.getChild("Angus");
		this.Body = this.Angus.getChild("Body");
		this.Legs = this.Angus.getChild("Legs");
		this.B_Left = this.Legs.getChild("B_Left");
		this.F_Right = this.Legs.getChild("F_Right");
		this.F_Left = this.Legs.getChild("F_Left");
		this.B_Right = this.Legs.getChild("B_Right");
		this.Head = this.Angus.getChild("Head");
		this.Ears = this.Head.getChild("Ears");
		this.L_Ear = this.Ears.getChild("L_Ear");
		this.R_Ear = this.Ears.getChild("R_Ear");
		this.Eyes = this.Head.getChild("Eyes");
		this.TopJaw = this.Head.getChild("TopJaw");
		this.BottomJaw = this.Head.getChild("BottomJaw");
		this.Ring = this.Head.getChild("Ring");
		this.Tag = this.Head.getChild("Tag");
		this.Tail = this.Angus.getChild("Tail");
		this.Bell = this.Angus.getChild("Bell");
		this.Neck = this.Angus.getChild("Neck");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Angus = partdefinition.addOrReplaceChild("Angus", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = Angus.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6F, -3.0F, -1.0F, 7.2F, 6.0F, 9.75F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -6.0F, -2.0F));

		PartDefinition Legs = Angus.addOrReplaceChild("Legs", CubeListBuilder.create().texOffs(16, 29).addBox(-3.6F, -2.1F, -4.1F, 2.9F, 0.5F, 2.2F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -1.0F, 5.1F));

		PartDefinition B_Left = Legs.addOrReplaceChild("B_Left", CubeListBuilder.create().texOffs(8, 27).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, 0.0F));

		PartDefinition F_Right = Legs.addOrReplaceChild("F_Right", CubeListBuilder.create().texOffs(16, 22).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -6.1F));

		PartDefinition F_Left = Legs.addOrReplaceChild("F_Left", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, -6.1F));

		PartDefinition B_Right = Legs.addOrReplaceChild("B_Right", CubeListBuilder.create().texOffs(24, 21).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head = Angus.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -4.1F, 0.0F, 4.0F, 4.1F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.5F, -6.0F));

		PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(2.3F, -2.0F, 1.1F));

		PartDefinition L_Ear = Ears.addOrReplaceChild("L_Ear", CubeListBuilder.create(), PartPose.offset(-4.4F, 0.0F, 0.0F));

		PartDefinition L_Ear_r1 = L_Ear.addOrReplaceChild("L_Ear_r1", CubeListBuilder.create().texOffs(26, 19).addBox(-1.0F, -1.2F, -0.6F, 2.0F, 0.4F, 1.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6586F, -0.1925F, -0.4887F));

		PartDefinition R_Ear = Ears.addOrReplaceChild("R_Ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition R_Ear_r1 = R_Ear.addOrReplaceChild("R_Ear_r1", CubeListBuilder.create().texOffs(26, 26).addBox(-1.0F, -1.2F, -0.6F, 2.0F, 0.4F, 1.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6586F, -0.1925F, 0.4887F));

		PartDefinition Eyes = Head.addOrReplaceChild("Eyes", CubeListBuilder.create().texOffs(4, 4).mirror().addBox(-1.0F, -1.5F, 0.9F, 1.1F, 0.5F, 0.1F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(4, 4).addBox(-3.9F, -1.5F, 0.9F, 1.1F, 0.5F, 0.1F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, -1.0F, -1.0F));

		PartDefinition TopJaw = Head.addOrReplaceChild("TopJaw", CubeListBuilder.create().texOffs(25, 7).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 1.2F, 1.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition BottomJaw = Head.addOrReplaceChild("BottomJaw", CubeListBuilder.create().texOffs(26, 28).addBox(-1.0F, -0.8F, -1.3F, 2.0F, 0.6F, 1.3F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Ring = Head.addOrReplaceChild("Ring", CubeListBuilder.create().texOffs(2, 0).addBox(-0.825F, -0.25F, 0.75F, 0.475F, 0.15F, 0.15F, new CubeDeformation(0.0F)), PartPose.offset(0.55F, -1.0F, -2.65F));

		PartDefinition cube_r1 = Ring.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 4).mirror().addBox(0.0F, -0.25F, 0.85F, 0.475F, 0.15F, 0.15F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1594F, -0.4425F, -0.3182F));

		PartDefinition cube_r2 = Ring.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 2).mirror().addBox(-0.1F, -0.25F, 0.85F, 0.575F, 0.15F, 0.15F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, -0.3F, 0.6F, 0.3139F, -0.9791F, -0.5413F));

		PartDefinition cube_r3 = Ring.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.475F, -0.25F, 0.85F, 0.575F, 0.15F, 0.15F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.3F, 0.6F, 0.3139F, 0.9791F, 0.5413F));

		PartDefinition cube_r4 = Ring.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(3, 2).addBox(-0.475F, -0.25F, 0.85F, 0.475F, 0.15F, 0.15F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, 0.0F, 0.1594F, 0.4425F, 0.3182F));

		PartDefinition Tag = Head.addOrReplaceChild("Tag", CubeListBuilder.create(), PartPose.offset(0.0F, 6.5F, 6.0F));

		PartDefinition cube_r5 = Tag.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, -7.35F, -2.95F, 0.1585F, -0.0735F, 0.7796F));

		PartDefinition Tail = Angus.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(-0.8F, -5.7F, 7.8F));

		PartDefinition tail_r1 = Tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(4, 5).addBox(0.5F, -2.0F, -1.0F, 0.5F, 3.25F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3016F, -0.0051F, 0.0038F));

		PartDefinition Bell = Angus.addOrReplaceChild("Bell", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Bell.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -5.4F, -3.4F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Bell.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 1).addBox(0.2F, -1.0F, -1.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -5.7F, -3.1F, 0.6684F, -0.115F, -0.242F));

		PartDefinition cube_r8 = Bell.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 3).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -6.0F, -3.1F, 0.6821F, 0.5134F, 0.2536F));

		PartDefinition Neck = Angus.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neck_r1 = Neck.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(16, 16).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.4F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.1F, -3.1F, 0.576F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(CowAnimations.IDLE_ANIMATION, limbSwing, limbSwingAmount, 25f, 2.5f);
		this.animateWalk(CowAnimations.WALKING_ANIMATION, limbSwing, limbSwingAmount, 25f, 2.5f);
		this.animateWalk(CowAnimations.EAT_ANIMATION, limbSwing, limbSwingAmount, 25f, 2.5f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks)
	{
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.Head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.Head.zRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Angus.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Angus;
	}
}