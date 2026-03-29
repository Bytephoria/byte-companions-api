package team.bytephoria.bytecompanions.api.companion.animations.registry;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.animations.AnimationData;
import team.bytephoria.bytecompanions.api.companion.animations.CompanionAnimation;

/**
 * Factory that produces a {@link CompanionAnimation} instance from a given {@link AnimationData}.
 *
 * <p>Register implementations via {@link CompanionAnimationRegistry#register(String, CompanionAnimationFactory)}.
 *
 * <p><b>Example:</b>
 * <pre>{@code
 * registry.register("my_spin", data -> {
 *     double speed = data.get("speed", 0.05);
 *     return new MySpinAnimation(speed);
 * });
 * }</pre>
 */
@FunctionalInterface
public interface CompanionAnimationFactory {

    @NotNull CompanionAnimation create(final @NotNull AnimationData data);

}
