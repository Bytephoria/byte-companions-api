package team.bytephoria.bytecompanions.api.companion.animation.types;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.animation.AnimationChannel;

public interface PostTrackingAnimation extends Animation<Void> {

    @Override
    default @NotNull AnimationChannel channel() {
        return AnimationChannel.POST_TRACKING;
    }

}
