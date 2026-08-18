package team.bytephoria.bytecompanions.api.companion;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;
import team.bytephoria.bytecompanions.api.result.EquipCompanionResult;
import team.bytephoria.bytecompanions.api.result.UnequipCompanionResult;
import team.bytephoria.bytecompanions.api.user.CompanionPlayer;
import team.bytephoria.bytecompanions.api.util.response.Response;
import team.bytephoria.bytecompanions.api.util.response.context.ResponseContext;

import java.util.Collection;
import java.util.UUID;

public interface CompanionManager {

    @NotNull Response<EquipCompanionResult> equip(
            final @NotNull UUID playerId,
            final @NotNull String companionTypeId
    );

    void forceEquip(
            final @NotNull Player player,
            final @NotNull Companion companion
    );

    @NotNull Response<UnequipCompanionResult> unequip(final @NotNull UUID playerId);

    @NotNull ResponseContext<Companion, EquipCompanionResult> equip(
            final @NotNull Player player,
            final @NotNull CompanionPlayer companionPlayer,
            final @NotNull CompanionType companionType
    );

    @NotNull Response<EquipCompanionResult> equip(
            final @NotNull Player player,
            final @NotNull CompanionType companionType
    );

    @NotNull ResponseContext<Collection<String>, UnequipCompanionResult> unequip(
            final @NotNull Player player,
            final @NotNull CompanionPlayer companionPlayer
    );

    @NotNull ResponseContext<CompanionPlayer, UnequipCompanionResult> unequip(
            final @NotNull Player player
    );

    @NotNull ResponseContext<CompanionPlayer, UnequipCompanionResult> unequip(
            final @NotNull Player player,
            final @NotNull String companionTypeId
    );

    void equipVisual(final @NotNull Player player);

    void equipVisual(
            final @NotNull Player player,
            final @NotNull String companionTypeId
    );

    void unequipVisual(final @NotNull Player player);

    void unequipVisual(
            final @NotNull Player player,
            final @NotNull String companionTypeId
    );

    @NotNull @Unmodifiable
    Collection<Companion> all();

}
