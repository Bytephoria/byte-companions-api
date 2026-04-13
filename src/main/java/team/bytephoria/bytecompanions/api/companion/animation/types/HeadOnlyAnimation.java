package team.bytephoria.bytecompanions.api.companion.animation.types;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.animation.Animation;
import team.bytephoria.bytecompanions.api.companion.animation.AnimationChannel;
import team.bytephoria.bytecompanions.api.companion.animation.output.HeadOnlyOutput;

public interface HeadOnlyAnimation extends Animation<HeadOnlyOutput> {

    @Override
    default @NotNull AnimationChannel channel() {
        return AnimationChannel.HEAD_ONLY;
    }

}
