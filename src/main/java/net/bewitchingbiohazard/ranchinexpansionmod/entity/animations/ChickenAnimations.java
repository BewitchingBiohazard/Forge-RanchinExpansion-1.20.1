package net.bewitchingbiohazard.ranchinexpansionmod.entity.animations;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class ChickenAnimations {

    public static final AnimationDefinition WALKING_ANIMATION = AnimationDefinition.Builder.withLength(3f).looping()
        .addAnimation("LeftLeg",
            new AnimationChannel(AnimationChannel.Targets.POSITION,
		    new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, -0.5f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.posVec(0f, 0f, 0.75f),
                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("LeftLeg",
            new AnimationChannel(AnimationChannel.Targets.ROTATION,
		    new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1f, KeyframeAnimations.degreeVec(-22.5f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.degreeVec(22.5f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("RightLeg",
            new AnimationChannel(AnimationChannel.Targets.POSITION,
		    new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1f, KeyframeAnimations.posVec(0f, -0.25f, -2.25f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.posVec(0f, -1.05f, 2.1f),
                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("RightLeg",
            new AnimationChannel(AnimationChannel.Targets.ROTATION,
		    new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1f, KeyframeAnimations.degreeVec(22.5f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.degreeVec(-22.5f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("Head",
            new AnimationChannel(AnimationChannel.Targets.POSITION,
		    new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1.5f, KeyframeAnimations.posVec(0f, -0.25f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("Head",
            new AnimationChannel(AnimationChannel.Targets.ROTATION,
		    new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("Body",
            new AnimationChannel(AnimationChannel.Targets.POSITION,
		    new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1.5f, KeyframeAnimations.posVec(0f, -0.25f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("Body",
            new AnimationChannel(AnimationChannel.Targets.ROTATION,
		    new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("RightWing",
            new AnimationChannel(AnimationChannel.Targets.POSITION,
		    new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1.5f, KeyframeAnimations.posVec(-0.25f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("RightWing",
            new AnimationChannel(AnimationChannel.Targets.ROTATION,
		    new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1.5f,KeyframeAnimations.degreeVec(0f, 0f, 22.5f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("LeftWing",
            new AnimationChannel(AnimationChannel.Targets.POSITION,
		    new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1.5f, KeyframeAnimations.posVec(0.5f, -0.75f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("LeftWing",
            new AnimationChannel(AnimationChannel.Targets.ROTATION,
		    new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, -22.5f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("Neck",
            new AnimationChannel(AnimationChannel.Targets.POSITION,
		    new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(1.5f, KeyframeAnimations.posVec(0f, -0.25f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.posVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR)))
        .addAnimation("Neck",
            new AnimationChannel(AnimationChannel.Targets.ROTATION,
		    new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR),
            new Keyframe(3f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                AnimationChannel.Interpolations.LINEAR))).build();
}
