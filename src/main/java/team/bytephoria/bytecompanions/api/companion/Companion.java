package team.bytephoria.bytecompanions.api.companion;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

/**
 * A live companion entity attached to an anchor (player, location, or custom).
 *
 * <p>{@code Companion} extends {@link CompanionEntity} directly — it <em>is</em> the entity.
 * All visual controls ({@link #tick()}, {@link #animations()}, {@link #equipment}, etc.)
 * are available directly without going through a separate {@code entity()} accessor.
 *
 * <p>The companion is destroyed and removed from the world when {@link #destroy()} is called
 * (inherited from {@link CompanionEntity}). Calling {@code destroy()} does not affect the
 * player's saved companion data — that is managed separately by the storage layer.
 *
 * <p><b>Owner semantics:</b> if this companion belongs to a player, {@link #ownerId()} and
 * {@link #ownerName()} return that player's data. For anchor-based companions created by
 * addons (e.g. decorative companions), these return sentinel values ({@code UUID(0,0)} and
 * {@code "none"}) — check {@link #hasOwner()} before using them.
 */
public interface Companion extends CompanionEntity {

    /**
     * Returns the UUID of the player who owns this companion,
     * or {@code UUID(0, 0)} for anchor-based companions with no player owner.
     *
     * @return the owner's UUID
     */
    @NotNull UUID ownerId();

    /**
     * Returns the last known name of the player owner at equip time,
     * or {@code "none"} for anchor-based companions with no player owner.
     *
     * @return the owner's name
     */
    @NotNull String ownerName();

    /**
     * The type definition that describes this companion's appearance, model, and animations.
     *
     * @return the companion type
     */
    @NotNull CompanionType type();

    /**
     * Whether this companion uses multiple armor stand layers (overlays).
     *
     * @return {@code true} if the underlying entity is a {@link LayeredCompanionEntity}
     */
    boolean isLayered();

    /**
     * Whether this companion is owned by a real player.
     * Returns {@code false} for anchor-based companions created by addons.
     *
     * @return {@code true} if a player owner exists
     */
    default boolean hasOwner() {
        return !this.ownerId().equals(new java.util.UUID(0, 0));
    }

}
