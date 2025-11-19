package team.bytephoria.bytecompanions.api.companion;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface Companion {

    @NotNull UUID owner();

    @NotNull CompanionType type();

    @NotNull CompanionEntity entity();

    @NotNull CompanionModel model();

    boolean isSpawned();

    void despawn();


}
