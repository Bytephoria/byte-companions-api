package team.bytephoria.bytecompanions.api.companion.animations;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.util.Rotations;

public final class CompanionFrame {

    public double deltaX;
    public double deltaY;
    public double deltaZ;

    public Double absoluteX;
    public Double absoluteY;
    public Double absoluteZ;

    public Float absoluteBodyYaw;
    public Float absoluteHeadPitch;

    public float deltaBodyYaw;
    public float deltaHeadPitch;

    public Rotations leftArm;
    public Rotations rightArm;
    public Rotations leftLeg;
    public Rotations rightLeg;

    public static @NotNull CompanionFrame empty() {
        return new CompanionFrame();
    }
}
