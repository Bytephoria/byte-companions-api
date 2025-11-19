package team.bytephoria.bytecompanions.api.companion.animations.animation;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.animations.CompanionAnimation;
import team.bytephoria.bytecompanions.api.companion.animations.CompanionAnimationContext;
import team.bytephoria.bytecompanions.api.companion.animations.output.PoseOutput;

public interface PoseAnimation extends CompanionAnimation {

    @NotNull PoseOutput tickPose(final @NotNull CompanionAnimationContext context);

}
