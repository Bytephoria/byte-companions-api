package team.bytephoria.bytecompanions.api.user;

import java.util.UUID;

public record UserDTO(UUID playerId, String playerName, String miniatureTypeId) { }
