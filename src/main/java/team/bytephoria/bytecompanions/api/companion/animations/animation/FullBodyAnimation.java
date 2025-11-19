package team.bytephoria.bytecompanions.api.companion.animations.animation;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.animations.CompanionAnimation;
import team.bytephoria.bytecompanions.api.companion.animations.CompanionAnimationContext;
import team.bytephoria.bytecompanions.api.companion.animations.output.FullBodyOutput;

public interface FullBodyAnimation extends CompanionAnimation {

    @NotNull FullBodyOutput tickFullBody(final @NotNull CompanionAnimationContext context);
}
