package team.bytephoria.bytecompanions.api.access;

import org.jetbrains.annotations.NotNull;
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

    @NotNull Optional<CompanionPlayer> getPlayer(final @NotNull UUID playerId);

    default Optional<Companion> getCompanion(final @NotNull UUID playerId) {
        final CompanionPlayer companionPlayer = this.getPlayer(playerId).orElse(null);
        if (companionPlayer == null) {
            return Optional.empty();
        }

        return companionPlayer.companion();
    }

    default @NotNull Optional<CompanionType> getType(final @NotNull String typeId) {
        return this.typeRegistry().get(typeId);
    }

}
