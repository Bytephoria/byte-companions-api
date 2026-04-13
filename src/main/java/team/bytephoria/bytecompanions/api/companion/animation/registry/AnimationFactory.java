package team.bytephoria.bytecompanions.api.companion.animation.registry;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.animation.Animation;
import team.bytephoria.bytecompanions.api.companion.animation.AnimationData;

@FunctionalInterface
public interface AnimationFactory<O extends Animation<?>> {

    @NotNull O create(final @NotNull AnimationData data);

}
