package team.bytephoria.bytecompanions.api.companion.anchor;

import org.bukkit.Location;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

/**
 * A {@link CompanionAnchor} backed by a fixed {@link Location}.
 *
 * <p>All spatial values are immutable after construction — this anchor never moves.
 * Useful for decorative companions placed at a specific point in the world
 * by an external addon.
 *
 * <p>{@link #eyeHeight()} and {@link #height()} use standard player defaults
 * ({@code 1.62} and {@code 1.8} respectively) since a fixed location has
 * no entity to derive these from.
 */
public final class LocationAnchor implements CompanionAnchor {

    private static final double DEFAULT_EYE_HEIGHT = 1.62;
    private static final double DEFAULT_HEIGHT = 1.8;

    private final double x;
    private final double y;
    private final double z;
    private final float yaw;
    private final float pitch;
    private final World world;

    public LocationAnchor(final @NotNull Location location) {
        if (location.getWorld() == null) {
            throw new IllegalArgumentException("LocationAnchor requires a location with a non-null world.");
        }

        this.x = location.getX();
        this.y = location.getY();
        this.z = location.getZ();
        this.yaw = location.getYaw();
        this.pitch = location.getPitch();
        this.world = location.getWorld();
    }

    @Override
    public double x() {
        return this.x;
    }

    @Override
    public double y() {
        return this.y;
    }

    @Override
    public double z() {
        return this.z;
    }

    @Override
    public float yaw() {
        return this.yaw;
    }

    @Override
    public float pitch() {
        return this.pitch;
    }

    @Override
    public float bodyYaw() {
        return this.yaw;
    }

    @Override
    public double eyeHeight() {
        return DEFAULT_EYE_HEIGHT;
    }

    @Override
    public double height() {
        return DEFAULT_HEIGHT;
    }

    @Override
    public @NotNull World world() {
        return this.world;
    }

}
