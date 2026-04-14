package team.bytephoria.bytecompanions.api.access;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import team.bytephoria.bytecompanions.api.companion.Companion;
import team.bytephoria.bytecompanions.api.companion.CompanionManager;
import team.bytephoria.bytecompanions.api.companion.CompanionType;
import team.bytephoria.bytecompanions.api.companion.CompanionTypeRegistry;
import team.bytephoria.bytecompanions.api.companion.animation.registry.AnimationRegistry;
import team.bytephoria.bytecompanions.api.user.CompanionPlayer;

import java.util.Optional;
import java.util.UUID;

public interface ByteCompanions {

    static @NotNull ByteCompanions getAPI() {
        return ByteCompanionsProvider.getInstance();
    }

    @NotNull CompanionTypeRegistry typeRegistry();
    @NotNull CompanionManager companionManager();
    @NotNull AnimationRegistry animationRegistry();

    @Nullable CompanionPlayer getPlayerOrNull(@NotNull UUID playerId);
    @NotNull Optional<CompanionPlayer> getPlayer(final @NotNull UUID playerId);

    default @Nullable Companion getCompanionOrNull(final @NotNull UUID playerId) {
        final CompanionPlayer companionPlayer = this.getPlayerOrNull(playerId);
        if (companionPlayer == null) {
            return null;
        }

        return companionPlayer.companionOrNull();
    }

    default Optional<Companion> getCompanion(final @NotNull UUID playerId) {
        final Companion companion = this.getCompanionOrNull(playerId);
        return Optional.ofNullable(companion);
    }

    default @NotNull Optional<CompanionType> getType(final @NotNull String typeId) {
        return this.typeRegistry().get(typeId);
    }

}
