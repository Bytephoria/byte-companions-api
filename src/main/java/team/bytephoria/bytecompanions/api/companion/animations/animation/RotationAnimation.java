package team.bytephoria.bytecompanions.api.companion.animations.animation;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.animations.CompanionAnimation;
import team.bytephoria.bytecompanions.api.companion.animations.CompanionAnimationContext;
import team.bytephoria.bytecompanions.api.companion.animations.output.RotationOutput;

public interface RotationAnimation extends CompanionAnimation {

    @NotNull RotationOutput tickRotation(final @NotNull CompanionAnimationContext context);

}
