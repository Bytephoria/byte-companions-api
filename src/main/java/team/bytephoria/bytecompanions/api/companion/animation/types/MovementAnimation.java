package team.bytephoria.bytecompanions.api.companion.animation.types;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.animation.Animation;
import team.bytephoria.bytecompanions.api.companion.animation.AnimationChannel;
import team.bytephoria.bytecompanions.api.companion.animation.output.MovementOutput;

public interface MovementAnimation extends Animation<MovementOutput> {

    @Override
    default @NotNull AnimationChannel channel() {
        return AnimationChannel.MOVEMENT;
    }

}
