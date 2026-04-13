package team.bytephoria.bytecompanions.api.companion.animation.types;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.animation.Animation;
import team.bytephoria.bytecompanions.api.companion.animation.AnimationChannel;

public interface TrackingAnimation extends Animation<Void> {

    @Override
    default @NotNull AnimationChannel channel() {
        return AnimationChannel.TRACKING;
    }
}
