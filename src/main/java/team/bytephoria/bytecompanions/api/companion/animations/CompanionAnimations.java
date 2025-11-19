package team.bytephoria.bytecompanions.api.companion.animations;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;
import team.bytephoria.bytecompanions.api.companion.animations.animation.*;

import java.util.List;

public interface CompanionAnimations {

    void addMovement(final @NotNull MovementAnimation movementAnimation);

    void addRotation(final @NotNull RotationAnimation rotationAnimation);

    void addPose(final @NotNull PoseAnimation poseAnimation);

    void fullBody(final @Nullable FullBodyAnimation fullBodyAnimation);

    void headOnly(final @Nullable HeadOnlyAnimation headOnlyAnimation);

    @NotNull
    @UnmodifiableView
    List<MovementAnimation> movements();

    @NotNull
    @UnmodifiableView
    List<RotationAnimation> rotations();

    @NotNull
    @UnmodifiableView
    List<PoseAnimation> poses();

    @Nullable FullBodyAnimation fullBody();

    @Nullable HeadOnlyAnimation headOnly();

    void clear();

}
