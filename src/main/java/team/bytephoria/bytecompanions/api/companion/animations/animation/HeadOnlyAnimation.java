package team.bytephoria.bytecompanions.api.companion.animations.animation;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.animations.CompanionAnimation;
import team.bytephoria.bytecompanions.api.companion.animations.CompanionAnimationContext;
import team.bytephoria.bytecompanions.api.companion.animations.output.HeadOnlyOutput;

public interface HeadOnlyAnimation extends CompanionAnimation {

    @NotNull HeadOnlyOutput tickHead(final @NotNull CompanionAnimationContext context);
}
