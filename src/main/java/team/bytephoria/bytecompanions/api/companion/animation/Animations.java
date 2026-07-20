package team.bytephoria.bytecompanions.api.companion.animation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Collection;

public interface Animations {

    void add(
            final @NotNull String animationId,
            final @NotNull Animation<?> animation
    );

    boolean remove(final @NotNull String animationId);

    boolean remove(
            final @NotNull AnimationChannel channel,
            final @NotNull String animationId
    );

    boolean contains(final @NotNull String animationId);

    boolean contains(
            final @NotNull AnimationChannel channel,
            final @NotNull String animationId
    );

    @NotNull
    @UnmodifiableView
    Collection<? extends Animation<?>> get(final @NotNull AnimationChannel channel);

    boolean isEmpty(final @NotNull AnimationChannel channel);

    boolean isEmpty();

    int size();

    void clear();

}
