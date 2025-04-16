package net.bewitchingbiohazard.ranchinexpansionmod.entity.client.chicken;// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.bewitchingbiohazard.ranchinexpansionmod.entity.animations.ChickenAnimations;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class WyandotteModelF<T extends Entity> extends HierarchicalModel<T>{
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "chicken_item_model_converted"), "main");
	private final ModelPart Chicken;
	private final ModelPart Legs;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Head;
	private final ModelPart Beak;
	private final ModelPart Comb;
	private final ModelPart Waddle;
	private final ModelPart Body;
	private final ModelPart Wings;
	private final ModelPart RightWing;
	private final ModelPart LeftWing;
	private final ModelPart Tail;
	private final ModelPart Neck;

	public WyandotteModelF(ModelPart root) {
		this.Chicken = root.getChild("Chicken");
		this.Legs = this.Chicken.getChild("Legs");
		this.LeftLeg = this.Legs.getChild("LeftLeg");
		this.RightLeg = this.Legs.getChild("RightLeg");
		this.Head = this.Chicken.getChild("Head");
		this.Beak = this.Head.getChild("Beak");
		this.Comb = this.Head.getChild("Comb");
		this.Waddle = this.Head.getChild("Waddle");
		this.Body = this.Chicken.getChild("Body");
		this.Wings = this.Body.getChild("Wings");
		this.RightWing = this.Wings.getChild("RightWing");
		this.LeftWing = this.Wings.getChild("LeftWing");
		this.Tail = this.Body.getChild("Tail");
		this.Neck = this.Chicken.getChild("Neck");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Chicken = partdefinition.addOrReplaceChild("Chicken", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Legs = Chicken.addOrReplaceChild("Legs", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition LeftLeg = Legs.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, -1.4F, 0.0F, 0.2F, 1.4F, 0.2F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-2.25F, -0.05F, -0.55F, 0.7F, 0.15F, 0.85F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 7.9F, -1.0F));

		PartDefinition RightLeg = Legs.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(4, 10).addBox(-1.75F, 7.85F, -1.55F, 0.7F, 0.15F, 0.85F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-1.5F, 6.5F, -1.0F, 0.2F, 1.4F, 0.2F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head = Chicken.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 6).addBox(-1.6F, 3.8F, -3.4F, 1.4F, 1.7F, 1.7F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(7, 9).addBox(-2.0F, 0.0F, 0.7F, 1.0F, 0.3F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(7, 8).addBox(-2.0F, -0.3F, 0.7F, 1.0F, 0.3F, 0.6F, new CubeDeformation(0.0F)), PartPose.offset(0.6F, 5.0F, -4.7F));

		PartDefinition Comb = Head.addOrReplaceChild("Comb", CubeListBuilder.create().texOffs(8, 9).addBox(-0.9F, 2.75F, -3.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(11, 10).addBox(-1.0F, 3.5F, -3.5F, 0.25F, 1.25F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Waddle = Head.addOrReplaceChild("Waddle", CubeListBuilder.create().texOffs(14, 14).addBox(-1.0F, 5.25F, -3.55F, 0.25F, 0.35F, 0.55F, new CubeDeformation(0.0F))
		.texOffs(12, 14).addBox(-1.0F, 5.5F, -3.4F, 0.25F, 0.25F, 0.65F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = Chicken.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.4F, -1.2F, -0.3F, 2.2F, 2.0F, 3.1F, new CubeDeformation(0.0F))
		.texOffs(3, 12).addBox(-1.9F, 0.3F, 0.5F, 1.25F, 0.75F, 1.25F, new CubeDeformation(0.0F)), PartPose.offset(0.4F, -2.0F, -2.0F));

		PartDefinition Wings = Body.addOrReplaceChild("Wings", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightWing = Wings.addOrReplaceChild("RightWing", CubeListBuilder.create(), PartPose.offset(-2.1F, 0.0F, 0.0F));

		PartDefinition RightUnderWing_r1 = RightWing.addOrReplaceChild("RightUnderWing_r1", CubeListBuilder.create().texOffs(11, 0).addBox(-0.25F, -1.3F, 0.0F, 0.0F, 1.5F, 2.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.05F, 0.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition RightWing_r1 = RightWing.addOrReplaceChild("RightWing_r1", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -1.3F, 0.0F, 0.25F, 1.5F, 2.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition LeftWing = Wings.addOrReplaceChild("LeftWing", CubeListBuilder.create(), PartPose.offset(-2.1F, 0.0F, 0.0F));

		PartDefinition LeftUnderWing_r1 = LeftWing.addOrReplaceChild("LeftUnderWing_r1", CubeListBuilder.create().texOffs(11, -2).addBox(-0.25F, -1.3F, 0.0F, 0.0F, 1.5F, 2.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.05F, 0.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition LeftWing_r1 = LeftWing.addOrReplaceChild("LeftWing_r1", CubeListBuilder.create().texOffs(6, 12).addBox(-0.25F, -1.3F, 0.0F, 0.25F, 1.5F, 2.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(-0.4F, -6.0F, 2.0F));

		PartDefinition TailFeather_r1 = Tail.addOrReplaceChild("TailFeather_r1", CubeListBuilder.create().texOffs(5, 6).addBox(-1.7F, -1.2F, 0.0F, 1.7F, 1.2F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.65F, 1.4F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Tail_r1 = Tail.addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(11, 7).addBox(-1.7F, -2.0F, -0.375F, 1.7F, 2.0F, 0.375F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4F, 0.8F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Neck = Chicken.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(11, 4).addBox(-1.5F, 5.4F, -2.75F, 1.25F, 0.75F, 1.25F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ChickenAnimations.WALKING_ANIMATION, limbSwing, limbSwingAmount, 20f, 2f);
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
		Chicken.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public ModelPart root() {
		return Chicken;
	}
}
