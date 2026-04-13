package team.bytephoria.bytecompanions.api.companion;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.result.EquipCompanionResult;
import team.bytephoria.bytecompanions.api.result.UnequipCompanionResult;
import team.bytephoria.bytecompanions.api.util.response.Response;

import java.util.Collection;
import java.util.UUID;

public interface CompanionManager {

    interface Admin {

        @NotNull Response<EquipCompanionResult> equip(
                final @NotNull UUID playerId,
                final @NotNull String companionTypeId
        );

        void forceEquip(
                final @NotNull Player player,
                final @NotNull Companion companion
        );

        @NotNull Response<UnequipCompanionResult> unequip(final @NotNull UUID playerId);

    }

    @NotNull Admin admin();

    @NotNull Response<EquipCompanionResult> equip(
            final @NotNull Player player,
            final @NotNull CompanionType companionType
    );

    @NotNull Response<UnequipCompanionResult> unequip(final @NotNull Player player);

    void equipVisual(final @NotNull Player player);
    void unequipVisual(final @NotNull Player player);

    @NotNull Collection<Companion> all();

}
