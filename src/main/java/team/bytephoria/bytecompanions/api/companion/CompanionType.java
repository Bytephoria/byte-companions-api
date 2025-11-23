package team.bytephoria.bytecompanions.api.companion;

import org.bukkit.inventory.EquipmentSlot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;
import team.bytephoria.bytecompanions.api.bukkit.ItemStackProvider;
import team.bytephoria.bytecompanions.api.companion.animations.AnimationData;
import team.bytephoria.bytecompanions.api.companion.animations.AnimationLayer;

import java.util.Map;

public interface CompanionType {

    @NotNull String id();

    @NotNull String display();

    @NotNull ItemStackProvider displayItem();

    @NotNull CompanionAppearance appearance();

    @NotNull CompanionBehavior behavior();

    @NotNull CompanionModel model();

    @NotNull @Unmodifiable Map<AnimationLayer, Map<String, AnimationData>> animations();

    @NotNull @Unmodifiable Map<EquipmentSlot, ItemStackProvider> equipment();

    @NotNull @Unmodifiable Map<String, OverlayData> overlays();
}
