package team.bytephoria.bytecompanions.api.companion.animation.types;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.animation.Animation;
import team.bytephoria.bytecompanions.api.companion.animation.AnimationChannel;
import team.bytephoria.bytecompanions.api.companion.animation.output.PoseOutput;

public interface PoseAnimation extends Animation<PoseOutput> {

    @Override
    default @NotNull AnimationChannel channel() {
        return AnimationChannel.POSE;
    }

}
