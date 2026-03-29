package team.bytephoria.bytecompanions.api.user;

import org.jetbrains.annotations.Nullable;

import java.util.UUID;

/**
 * Immutable data transfer object for persisting and loading companion player state.
 *
 * @param playerId        the player's UUID
 * @param playerName      the player's last known name
 * @param companionTypeId the ID of the companion type last equipped, or {@code null} if none
 */
public record CompanionPlayerData(
        UUID playerId,
        String playerName,
        @Nullable String companionTypeId
) {
}
