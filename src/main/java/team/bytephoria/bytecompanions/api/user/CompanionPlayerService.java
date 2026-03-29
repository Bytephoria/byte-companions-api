package team.bytephoria.bytecompanions.api.user;

import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * Provides access to {@link CompanionPlayer} instances.
 *
 * <p><b>Cache vs async:</b>
 * <ul>
 *   <li>{@link #find(UUID)} — instant cache lookup, only works while the player is online.</li>
 *   <li>{@link #findAsync(UUID)} — queries storage, works for offline players.</li>
 * </ul>
 */
public interface CompanionPlayerService {

    /**
     * Looks up the player from the in-memory cache.
     * Returns empty if the player is not currently online or not yet loaded.
     *
     * @param playerId the player's UUID
     * @return an optional containing the companion player, empty if not cached
     */
    @NotNull Optional<CompanionPlayer> find(final @NotNull UUID playerId);

    /**
     * Queries storage asynchronously for the given player.
     * Use this when the player may be offline or not yet cached.
     *
     * @param playerId the player's UUID
     * @return a future resolving to an optional companion player
     */
    @NotNull CompletableFuture<Optional<CompanionPlayer>> findAsync(final @NotNull UUID playerId);

}
