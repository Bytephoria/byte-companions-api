package team.bytephoria.bytecompanions.api.companion.data;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface OwnerData {

    @NotNull UUID id();

    @NotNull String name();

}
