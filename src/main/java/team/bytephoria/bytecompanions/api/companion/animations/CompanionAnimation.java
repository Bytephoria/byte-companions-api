package team.bytephoria.bytecompanions.api.companion.animations;

import org.jetbrains.annotations.NotNull;

public interface CompanionAnimation {

    default void onStart(final @NotNull CompanionAnimationContext context) {}

    default void onStop(final @NotNull CompanionAnimationContext context) {}

    default boolean isActive() {
        return true;
    }
}
