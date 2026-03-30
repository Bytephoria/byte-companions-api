package team.bytephoria.bytecompanions.api.companion.anchor;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * A {@link CompanionAnchor} that delegates all spatial queries to a live Bukkit {@link Player}.
 *
 * <p>All values are read in real-time on every call — the anchor always reflects
 * the player's current position, rotation, and world.
 */
public record PlayerAnchor(@NotNull Player player) implements CompanionAnchor {

    @Override
    public double x() {
        return this.player.getX();
    }

    @Override
    public double y() {
        return this.player.getY();
    }

    @Override
    public double z() {
        return this.player.getZ();
    }

    @Override
    public float yaw() {
        return this.player.getYaw();
    }

    @Override
    public float pitch() {
        return this.player.getPitch();
    }

    @Override
    public float bodyYaw() {
        return this.player.getBodyYaw();
    }

    @Override
    public double eyeHeight() {
        return this.player.getEyeHeight();
    }

    @Override
    public double height() {
        return this.player.getHeight();
    }

    @Override
    public @NotNull World world() {
        return this.player.getWorld();
    }

}
