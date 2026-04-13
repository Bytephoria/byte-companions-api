package team.bytephoria.bytecompanions.api.companion.animation;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.anchor.CompanionAnchor;

/**
 * Snapshot of the companion's state for a single animation tick.
 *
 * <p>Passed to every {@link Animation#tick(AnimationContext)} call. All positional values
 * are in world-space. "Current" refers to the position at the start of this tick;
 * "previous" refers to the position at the start of the previous tick.
 *
 * <p>{@link #deltaTime()} accounts for variable tick intervals (e.g. every 3 server ticks),
 * so time-based animations should always scale their increments by it.
 */
public interface AnimationContext {

    /**
     * The anchor this companion is attached to (normally the owner player).
     * Use this to read the anchor's current position, rotation, and world.
     */
    @NotNull CompanionAnchor anchor();

    /** X coordinate of the anchor on the previous tick. */
    double previousAnchorX();

    /** Y coordinate of the anchor on the previous tick. */
    double previousAnchorY();

    /** Z coordinate of the anchor on the previous tick. */
    double previousAnchorZ();

    /** Current X coordinate of the companion entity. */
    double currentX();

    /** Current Y coordinate of the companion entity. */
    double currentY();

    /** Current Z coordinate of the companion entity. */
    double currentZ();

    /** X coordinate of the companion entity on the previous tick. */
    double previousX();

    /** Y coordinate of the companion entity on the previous tick. */
    double previousY();

    /** Z coordinate of the companion entity on the previous tick. */
    double previousZ();

    /** Current body yaw of the companion, in degrees. */
    float bodyYaw();

    /** Current head yaw of the companion, in degrees. */
    float headYaw();

    /** Current head pitch of the companion, in degrees. */
    float headPitch();

    /**
     * Elapsed time in seconds since the previous animation tick.
     *
     * <p>Because {@link team.bytephoria.bytecompanions.api.companion.CompanionEntity#tick()}
     * may be called every 3 or more server ticks, this value is not a fixed constant.
     * Multiply time-based increments by this value to keep animations TPS-independent.
     *
     * <p>Example: {@code this.time += speed * ctx.deltaTime();}
     */
    double deltaTime();

}
