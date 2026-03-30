package team.bytephoria.bytecompanions.api.companion.animations;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.anchor.CompanionAnchor;

/**
 * Per-tick snapshot of the companion's spatial state, used by all animation layers.
 *
 * <p>The {@link CompanionAnchor} abstracts the reference point that animations
 * use for distance calculations, target positions, and orientation — it can be
 * a live player, a fixed location, or any custom implementation provided by an addon.
 *
 * <p>Animations should use {@link #anchor()} instead of any direct player reference
 * so they work correctly regardless of what kind of anchor is in use.
 */
public interface CompanionAnimationContext {

    /**
     * The spatial reference point for this companion's animations.
     * Use this instead of accessing a player directly.
     *
     * <p>For player-owned companions this wraps the live player.
     * For decorative companions this wraps a fixed location.
     * For addon companions this can be anything that implements {@link CompanionAnchor}.
     *
     * @return the companion anchor
     */
    @NotNull CompanionAnchor anchor();

    /** Current X position of the companion's armor stand. */
    double currentX();

    /** Current Y position of the companion's armor stand. */
    double currentY();

    /** Current Z position of the companion's armor stand. */
    double currentZ();

    /** X position on the previous tick (for velocity/movement detection). */
    double previousX();

    /** Y position on the previous tick. */
    double previousY();

    /** Z position on the previous tick. */
    double previousZ();

    /** Current body yaw of the armor stand in degrees. */
    float bodyYaw();

    /** Current head yaw of the armor stand in degrees. */
    float headYaw();

    /** Current head pitch of the armor stand in degrees. */
    float headPitch();

}
