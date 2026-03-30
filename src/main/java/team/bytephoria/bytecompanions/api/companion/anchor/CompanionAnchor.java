package team.bytephoria.bytecompanions.api.companion.anchor;

import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

/**
 * Represents the spatial reference point for a companion's animation system.
 *
 * <p>An anchor abstracts the concept of an "owner" — it provides the positional
 * and rotational data that animations use to calculate movement, rotation, and
 * distance checks. This decouples animations from any specific entity type.
 *
 * <p>Built-in implementations:
 * <ul>
 *   <li>{@link PlayerAnchor} — follows a live Bukkit {@link org.bukkit.entity.Player} in real time.</li>
 *   <li>{@link LocationAnchor} — fixed point in the world, never moves.</li>
 * </ul>
 *
 * <p>External addons can implement this interface to provide custom anchors,
 * e.g. an anchor that tracks the nearest player, follows a mob, or simulates a dummy.
 */
public interface CompanionAnchor {

    /** X coordinate of the anchor. */
    double x();

    /** Y coordinate of the anchor (feet level). */
    double y();

    /** Z coordinate of the anchor. */
    double z();

    /**
     * Horizontal rotation in degrees (Bukkit convention: -180 to 180,
     * 0 = south, -90 = east, 90 = west, ±180 = north).
     */
    float yaw();

    /** Vertical rotation in degrees (-90 = looking straight up, 90 = straight down). */
    float pitch();

    /**
     * Body yaw, which may differ from {@link #yaw()} when the entity is strafing.
     * For fixed anchors this is typically the same as {@link #yaw()}.
     */
    float bodyYaw();

    /**
     * Eye height above {@link #y()}.
     * For a player this is roughly {@code 1.62} normally or {@code 0.4} when sneaking.
     * For a fixed anchor this can be a sensible default such as {@code 1.62}.
     */
    double eyeHeight();

    /**
     * Total entity height in blocks.
     * For a player this is {@code 1.8} normally.
     * For a fixed anchor a default of {@code 1.8} is reasonable.
     */
    double height();

    /** The world this anchor lives in. Used for cross-world viewer checks. */
    @NotNull World world();

}
