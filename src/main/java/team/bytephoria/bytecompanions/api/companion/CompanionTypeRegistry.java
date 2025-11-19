package team.bytephoria.bytecompanions.api.companion;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Optional;

public interface CompanionTypeRegistry {

    @Nullable CompanionType get(final @NotNull String id);

    @NotNull Optional<CompanionType> getOptional(final @NotNull String id);

    void registerType(final @NotNull String id, final @NotNull CompanionType companionType);

    @NotNull Collection<CompanionType> all();

}
