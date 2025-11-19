package team.bytephoria.bytecompanions.api.user;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import team.bytephoria.bytecompanions.api.companion.Companion;

import java.util.UUID;

public interface User {

    @NotNull UUID playerId();

    @NotNull String playerName();

    @Nullable Companion miniature();

    @Nullable String miniatureTypeId();

    void unEquipMiniature();

    void updateMiniature(final @Nullable Companion companion);

}
