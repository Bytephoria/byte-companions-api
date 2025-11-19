package team.bytephoria.bytecompanions.api.companion;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import team.bytephoria.bytecompanions.api.user.User;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

/**
 * Manages active companions, including equipping, unequipping,
 * retrieval, and lifecycle handling.
 */
public interface CompanionManager {

    /**
     * Equips a companion of the given type for the player.
     *
     * @param player        the player receiving the companion
     * @param companionType the type of companion to equip
     */
    void equip(
            final @NotNull Player player,
            final @NotNull CompanionType companionType
    );

    /**
     * Equips a companion for the given player and user data.
     *
     * @param player        the player receiving the companion
     * @param user          the user owning the companion data
     * @param companionType the type of companion to equip
     */
    void equip(
            final @NotNull Player player,
            final @NotNull User user,
            final @NotNull CompanionType companionType
    );

    /**
     * Equips the companion stored for this player (if any).
     *
     * @param player the player to equip
     */
    void equip(final @NotNull Player player);

    /**
     * Unequips the active companion for the user.
     *
     * @param player the player
     * @param user   the user to unequip from
     */
    void unequip(
            final @NotNull Player player,
            final @NotNull User user
    );

    /**
     * Unequips the active companion for the player.
     *
     * @param player the player
     */
    void unequip(final @NotNull Player player);

    /**
     * Removes only the visual entity of the companion
     * without altering its state.
     *
     * @param player the player whose companion visual is removed
     */
    void unequipVisual(final @NotNull Player player);

    /**
     * Retrieves the companion for the given player ID if present.
     *
     * @param playerId the player UUID
     * @return the companion instance, or null if none
     */
    @Nullable Companion find(final @NotNull UUID playerId);

    /**
     * Retrieves the companion for the given player ID.
     *
     * @param playerId the player UUID
     * @return an optional containing the companion if found
     */
    @NotNull Optional<Companion> getOptional(final @NotNull UUID playerId);

    /**
     * Returns all active companions.
     *
     * @return all tracked companions
     */
    @NotNull Collection<Companion> all();

}
