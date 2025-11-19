package team.bytephoria.bytecompanions.api.companion.animations.animation;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.animations.CompanionAnimation;
import team.bytephoria.bytecompanions.api.companion.animations.CompanionAnimationContext;
import team.bytephoria.bytecompanions.api.companion.animations.output.MovementOutput;

public interface MovementAnimation extends CompanionAnimation {

    @NotNull MovementOutput tickMovement(final @NotNull CompanionAnimationContext context);

}
