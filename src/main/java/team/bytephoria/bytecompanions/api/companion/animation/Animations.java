package team.bytephoria.bytecompanions.api.companion.animation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.List;

public interface Animations {

    void add(
            final @NotNull AnimationChannel channel,
            final @NotNull Animation<?> animation
    );

    boolean remove(
            final @NotNull AnimationChannel channel,
            final @NotNull Animation<?> animation
    );

    boolean contains(
            final @NotNull AnimationChannel channel,
            final @NotNull Animation<?> animation
    );

    @NotNull @UnmodifiableView List<? extends Animation<?>> get(final @NotNull AnimationChannel channel);

    default void add(final @NotNull Animation<?> animation) {
        this.add(animation.channel(), animation);
    }

    default boolean remove(final @NotNull Animation<?> animation) {
        return this.remove(animation.channel(), animation);
    }

    default boolean contains(final @NotNull Animation<?> animation) {
        return this.contains(animation.channel(), animation);
    }

    boolean isEmpty();

    int size();

    void clear();

}
