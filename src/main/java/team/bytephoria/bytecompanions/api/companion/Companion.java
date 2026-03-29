package team.bytephoria.bytecompanions.api.companion;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * Represents a live companion attached to a player.
 *
 * <p>A companion is spawned when equipped and destroyed when unequipped or the player leaves.
 * Access the underlying entity via {@link #entity()} to modify visual properties or animations.
 */
public interface Companion {

    /** The UUID of the player who owns this companion. */
    @NotNull UUID ownerId();

    /** The last known name of the owner at equip time. */
    @NotNull String ownerName();

    /** The type definition that describes this companion's appearance and behavior. */
    @NotNull CompanionType type();

    /** The live entity handle, exposing visual and animation controls. */
    @NotNull CompanionEntity entity();

    /** The body model used by this companion (full body or head only). */
    @NotNull CompanionModel model();

    /** Whether this companion is currently spawned and visible in the world. */
    boolean isSpawned();

    /** Whether this companion uses multiple armor stand layers (overlays). */
    boolean isLayered();

    /** Despawns the companion entity. Does not affect the player's saved data. */
    void despawn();

}
