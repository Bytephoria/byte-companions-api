package team.bytephoria.bytecompanions.api.user;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import team.bytephoria.bytecompanions.api.companion.Companion;

import java.util.Optional;
import java.util.UUID;

/**
 * Represents a player tracked by ByteCompanions.
 * Holds the companion state associated with a specific player.
 *
 * <p>Instances are created when a player joins and destroyed when they leave.
 * Always retrieve a fresh reference from {@link UserManager} rather than caching it.
 */
public interface CompanionPlayer {

    /**
     * The unique identifier of the underlying Bukkit player.
     *
     * @return the player's UUID
     */
    @NotNull UUID playerId();

    /**
     * The last known name of the player.
     *
     * @return the player name
     */
    @NotNull String playerName();

    /**
     * Returns the companion currently active for this player, if any.
     *
     * @return an optional containing the companion, empty if none is equipped
     */
    @NotNull Optional<Companion> companion();

    /**
     * Returns the companion currently active for this player, or {@code null}.
     *
     * @return the companion, or {@code null} if none is equipped
     */
    @Nullable Companion companionOrNull();

    /**
     * Returns {@code true} if this player currently has a companion equipped.
     *
     * @return whether a companion is active
     */
    boolean hasCompanion();

    /**
     * Returns the type ID of the companion last saved for this player.
     *
     * @return an optional containing the companion type ID, empty if none was ever set
     */
    @NotNull Optional<String> companionTypeId();

    /**
     * Despawns and removes the current companion.
     * No-op if no companion is equipped.
     */
    void unequip();

    /**
     * Sets the active companion for this player.
     * Replaces any existing companion without saving to storage.
     *
     * @param companion the new companion, or {@code null} to clear
     */
    void setCompanion(final @Nullable Companion companion);

}
