package team.bytephoria.bytecompanions.api.companion.animation.types;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.animation.AnimationChannel;
import team.bytephoria.bytecompanions.api.companion.animation.AnimationContext;

public interface Animation<O> {

    @NotNull AnimationChannel channel();

    O tick(final @NotNull AnimationContext context);

    default void onStart(final @NotNull AnimationContext context) {}

    default void onStop(final @NotNull AnimationContext context) {}

    default boolean isActive() {
        return true;
    }

}
