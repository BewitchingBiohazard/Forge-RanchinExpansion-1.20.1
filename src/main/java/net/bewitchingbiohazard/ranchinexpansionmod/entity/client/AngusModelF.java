package net.bewitchingbiohazard.ranchinexpansionmod.entity.client;// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;

public class AngusModelF<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart Angus;
	private final ModelPart Legs;
	private final ModelPart B_Left;
	private final ModelPart F_Right;
	private final ModelPart F_Left;
	private final ModelPart B_Right;
	private final ModelPart Head;
	private final ModelPart Horns;
	private final ModelPart Ears;
	private final ModelPart L_Ear;
	private final ModelPart R_Ear;
	private final ModelPart Eyes;
	private final ModelPart Ring;
	private final ModelPart Tail;
	private final ModelPart Legs2;
	private final ModelPart Tail2;

	public AngusModelF(ModelPart root) {
		this.Angus = root.getChild("Angus");
		this.Legs = this.Angus.getChild("Legs");
		this.B_Left = this.Legs.getChild("B_Left");
		this.F_Right = this.Legs.getChild("F_Right");
		this.F_Left = this.Legs.getChild("F_Left");
		this.B_Right = this.Legs.getChild("B_Right");
		this.Head = this.Angus.getChild("Head");
		this.Horns = this.Head.getChild("Horns");
		this.Ears = this.Head.getChild("Ears");
		this.L_Ear = this.Ears.getChild("L_Ear");
		this.R_Ear = this.Ears.getChild("R_Ear");
		this.Eyes = this.Head.getChild("Eyes");
		this.Ring = this.Angus.getChild("Ring");
		this.Tail = this.Angus.getChild("Tail");
		this.Legs2 = this.Angus.getChild("Legs2");
		this.Tail2 = this.Angus.getChild("Tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Angus = partdefinition.addOrReplaceChild("Angus", CubeListBuilder.create().texOffs(0, 0).addBox(-3.6F, -9.0F, -3.0F, 7.2F, 6.0F, 9.75F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_r1 = Angus.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(16, 16).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.4F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.1F, -3.1F, 0.576F, 0.0F, 0.0F));

		PartDefinition Legs = Angus.addOrReplaceChild("Legs", CubeListBuilder.create().texOffs(16, 26).addBox(-3.6F, -2.1F, -4.1F, 2.9F, 0.5F, 2.2F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -1.0F, 5.1F));

		PartDefinition B_Left = Legs.addOrReplaceChild("B_Left", CubeListBuilder.create().texOffs(8, 24).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, 0.0F));

		PartDefinition F_Right = Legs.addOrReplaceChild("F_Right", CubeListBuilder.create().texOffs(16, 21).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -6.1F));

		PartDefinition F_Left = Legs.addOrReplaceChild("F_Left", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, -6.1F));

		PartDefinition B_Right = Legs.addOrReplaceChild("B_Right", CubeListBuilder.create().texOffs(24, 21).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head = Angus.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 1.2F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-2.0F, -4.1F, 0.0F, 4.0F, 4.1F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(26, 28).addBox(-1.0F, -0.8F, -1.3F, 2.0F, 0.6F, 1.3F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.5F, -6.0F));

		PartDefinition Horns = Head.addOrReplaceChild("Horns", CubeListBuilder.create(), PartPose.offset(-3.0F, -2.3F, 0.8F));

		PartDefinition cube_r1 = Horns.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 3).addBox(-1.0F, -1.4F, -0.4F, 2.0F, 0.8F, 0.8F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2094F));

		PartDefinition cube_r2 = Horns.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 2).addBox(-1.0F, -1.4F, -0.4F, 2.0F, 0.8F, 0.8F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2094F));

		PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(2.3F, -2.0F, 1.1F));

		PartDefinition L_Ear = Ears.addOrReplaceChild("L_Ear", CubeListBuilder.create(), PartPose.offset(-4.4F, 0.0F, 0.0F));

		PartDefinition L_Ear_r1 = L_Ear.addOrReplaceChild("L_Ear_r1", CubeListBuilder.create().texOffs(26, 19).addBox(-1.0F, -1.2F, -0.6F, 2.0F, 0.4F, 1.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6586F, -0.1925F, -0.4887F));

		PartDefinition R_Ear = Ears.addOrReplaceChild("R_Ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition R_Ear_r1 = R_Ear.addOrReplaceChild("R_Ear_r1", CubeListBuilder.create().texOffs(26, 26).addBox(-1.0F, -1.2F, -0.6F, 2.0F, 0.4F, 1.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6586F, -0.1925F, 0.4887F));

		PartDefinition Eyes = Head.addOrReplaceChild("Eyes", CubeListBuilder.create().texOffs(4, 29).mirror().addBox(-1.0F, -1.5F, 0.9F, 1.1F, 0.5F, 0.1F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(4, 29).addBox(-3.9F, -1.5F, 0.9F, 1.1F, 0.5F, 0.1F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, -1.0F, -1.0F));

		PartDefinition Ring = Angus.addOrReplaceChild("Ring", CubeListBuilder.create().texOffs(2, 0).addBox(-0.825F, -0.25F, 0.75F, 0.475F, 0.15F, 0.15F, new CubeDeformation(0.0F)), PartPose.offset(0.55F, -7.5F, -8.65F));

		PartDefinition cube_r3 = Ring.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 4).mirror().addBox(0.0F, -0.25F, 0.85F, 0.475F, 0.15F, 0.15F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1594F, -0.4425F, -0.3182F));

		PartDefinition cube_r4 = Ring.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 2).mirror().addBox(-0.1F, -0.25F, 0.85F, 0.575F, 0.15F, 0.15F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, -0.3F, 0.6F, 0.3139F, -0.9791F, -0.5413F));

		PartDefinition cube_r5 = Ring.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.475F, -0.25F, 0.85F, 0.575F, 0.15F, 0.15F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.3F, 0.6F, 0.3139F, 0.9791F, 0.5413F));

		PartDefinition cube_r6 = Ring.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(3, 2).addBox(-0.475F, -0.25F, 0.85F, 0.475F, 0.15F, 0.15F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, 0.0F, 0.1594F, 0.4425F, 0.3182F));

		PartDefinition Tail = Angus.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(-0.8F, -5.7F, 7.8F));

		PartDefinition tail_r1 = Tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(0, 29).addBox(0.5F, -2.0F, -1.0F, 0.5F, 3.25F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3019F, -0.0468F, -0.0092F));

		PartDefinition Legs2 = Angus.addOrReplaceChild("Legs2", CubeListBuilder.create().texOffs(16, 26).mirror().addBox(0.7F, -2.1F, -4.1F, 2.9F, 0.5F, 2.2F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -1.0F, 5.1F));

		PartDefinition Tail2 = Angus.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offset(0.8F, -5.7F, 7.8F));

		PartDefinition tail_r2 = Tail2.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-1.0F, -2.0F, -1.0F, 0.5F, 3.25F, 0.5F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3019F, 0.0468F, 0.0092F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

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