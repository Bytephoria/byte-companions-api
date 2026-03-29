package team.bytephoria.bytecompanions.api.companion;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import team.bytephoria.bytecompanions.api.result.EquipCompanionResult;
import team.bytephoria.bytecompanions.api.result.UnequipCompanionResult;
import team.bytephoria.bytecompanions.api.user.CompanionPlayer;
import team.bytephoria.bytecompanions.api.util.response.Response;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

/**
 * Manages the lifecycle of active companions — equipping, unequipping, and querying.
 *
 * <p>All methods operate on the in-memory cache synchronously.
 * Storage persistence (save/load) is handled by the player lifecycle service.
 *
 * <p>Use {@link #admin()} for privileged operations that bypass normal permission checks.
 */
public interface CompanionManager {

    /**
     * Privileged operations for server-side administration.
     * Bypasses ownership checks — use carefully.
     */
    interface Admin {

        /**
         * Equips a companion type by ID for any online player,
         * without persisting to storage.
         *
         * @param playerId       the target player's UUID
         * @param companionTypeId the companion type to equip
         * @return the result of the operation
         */
        @NotNull Response<EquipCompanionResult> equip(
                final @NotNull UUID playerId,
                final @NotNull String companionTypeId
        );

        /**
         * Equips a specific companion instance for any online player.
         * Useful for programmatic companion creation without going through the registry.
         *
         * @param player    the target player
         * @param companion the companion to attach
         */
        void forceEquip(
                final @NotNull Player player,
                final @NotNull Companion companion
        );

        /**
         * Unequips and despawns the companion for any online player.
         *
         * @param playerId the target player's UUID
         * @return the result of the operation
         */
        @NotNull Response<UnequipCompanionResult> unequip(final @NotNull UUID playerId);

    }

    /**
     * Returns the admin sub-interface for privileged operations.
     *
     * @return the admin interface
     */
    @NotNull Admin admin();

    // ── Player-facing equip ────────────────────────────────────────────────

    /**
     * Equips a companion of the given type for the player.
     * Replaces any currently equipped companion.
     *
     * @param player         the player receiving the companion
     * @param companionType  the type to equip
     * @return the result of the operation
     */
    @NotNull Response<EquipCompanionResult> equip(
            final @NotNull Player player,
            final @NotNull CompanionType companionType
    );

    /**
     * Equips a companion of the given type, also updating the player's saved state.
     *
     * @param player         the player receiving the companion
     * @param companionPlayer the player's companion data to update
     * @param companionType  the type to equip
     */
    void equip(
            final @NotNull Player player,
            final @NotNull CompanionPlayer companionPlayer,
            final @NotNull CompanionType companionType
    );

    /**
     * Equips the companion previously saved for this player, if any.
     * Looks up the player's last known companion type from the cache.
     *
     * @param player the player to equip
     */
    void equip(final @NotNull Player player);

    // ── Unequip ────────────────────────────────────────────────────────────

    /**
     * Unequips and despawns the companion for the given player.
     *
     * @param player the player
     * @return the result of the operation
     */
    @NotNull Response<UnequipCompanionResult> unequip(final @NotNull Player player);

    /**
     * Unequips and despawns the companion, updating the companion player state.
     *
     * @param player         the player
     * @param companionPlayer the player data to clear
     */
    void unequip(
            final @NotNull Player player,
            final @NotNull CompanionPlayer companionPlayer
    );

    /**
     * Removes only the visual entity without altering the player's saved state.
     * Used during teleports, dimension changes, or temporary despawns.
     *
     * @param player the player whose companion visual is removed
     */
    void unequipVisual(final @NotNull Player player);

    // ── Query ──────────────────────────────────────────────────────────────

    /**
     * Returns the companion for the given player, or {@code null} if none.
     *
     * @param playerId the player's UUID
     * @return the companion, or {@code null}
     */
    @Nullable Companion find(final @NotNull UUID playerId);

    /**
     * Returns the companion for the given player wrapped in an Optional.
     *
     * @param playerId the player's UUID
     * @return an optional containing the companion
     */
    @NotNull Optional<Companion> findOptional(final @NotNull UUID playerId);

    /**
     * Returns all currently active companions.
     *
     * @return an unmodifiable view of all active companions
     */
    @NotNull Collection<Companion> all();

}
