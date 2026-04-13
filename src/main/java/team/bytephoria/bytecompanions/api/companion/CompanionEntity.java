package team.bytephoria.bytecompanions.api.companion;

import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import team.bytephoria.bytecompanions.api.companion.animation.Animations;
import team.bytephoria.bytecompanions.api.companion.data.CompanionOverlayData;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public interface CompanionEntity {

    void tick();
    void destroy();

    @NotNull CompanionModel model();

    boolean isSpawned();

    int entityId();

    double currentX();
    double currentY();
    double currentZ();

    void teleport(final @NotNull Location location);

    void setSmall(final boolean small);

    void setVisible(final boolean visible);

    void setShowArms(final boolean showArms);

    void setShowBaseplate(final boolean baseplate);

    void setNameVisible(final boolean nameVisible);

    void setMarker(final boolean marker);

    void customName(final @Nullable Component customName);

    @Nullable Component customName();

    void equipment(final @NotNull EquipmentSlot equipmentSlot, final @Nullable ItemStack itemStack);

    @NotNull Map<EquipmentSlot, ItemStack> equipment();

    @NotNull Animations animations();

    default @NotNull @Unmodifiable Set<String> overlayIds() {
        return Collections.emptySet();
    }

    default @NotNull @Unmodifiable Map<EquipmentSlot, ItemStack> overlayEquipment(final @NotNull String overlayId) {
        return Collections.emptyMap();
    }

    default boolean equipment(final @NotNull String overlayId, final @NotNull EquipmentSlot equipmentSlot, final @Nullable ItemStack itemStack) {
        return false;
    }

    default boolean addOverlay(final @NotNull String overlayId) {
        return false;
    }

    default boolean removeOverlay(final @NotNull String overlayId) {
        return false;
    }

    default boolean hasOverlay(final @NotNull String overlayId) {
        return false;
    }

    default void clearOverlays() {}

    default boolean overlayVisible(final @NotNull String overlayId, final boolean visible) {
        return false;
    }

    default boolean isOverlayVisible(final @NotNull String overlayId) {
        return false;
    }

    default @Nullable CompanionOverlayData overlay(final @NotNull String overlayId) {
        return null;
    }

}
