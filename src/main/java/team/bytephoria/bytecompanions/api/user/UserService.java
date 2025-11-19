package team.bytephoria.bytecompanions.api.user;

import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.UUID;

/**
 * Provides access to user data associated with companions.
 */
public interface UserService {

    /**
     * Searches for the user associated with the given player ID.
     *
     * @param playerId the unique identifier of the player
     * @return an optional containing the user if found
     */
    @NotNull
    Optional<User> find(final @NotNull UUID playerId);

}
