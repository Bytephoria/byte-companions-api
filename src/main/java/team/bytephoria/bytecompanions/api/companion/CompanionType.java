package team.bytephoria.bytecompanions.api.companion;

import org.bukkit.inventory.EquipmentSlot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;
import team.bytephoria.bytecompanions.api.bukkit.ItemStackProvider;
import team.bytephoria.bytecompanions.api.companion.animation.AnimationChannel;
import team.bytephoria.bytecompanions.api.companion.animation.AnimationData;
import team.bytephoria.bytecompanions.api.companion.data.CompanionAppearanceData;
import team.bytephoria.bytecompanions.api.companion.data.CompanionBehaviorData;
import team.bytephoria.bytecompanions.api.companion.data.OverlayData;

import java.util.Map;

public interface CompanionType {

    @NotNull String id();

    @NotNull String display();

    @NotNull ItemStackProvider displayItem();

    @NotNull CompanionAppearanceData appearance();

    @NotNull CompanionBehaviorData behavior();

    @NotNull CompanionModel model();

    @NotNull @Unmodifiable Map<AnimationChannel, Map<String, AnimationData>> animations();

    @NotNull @Unmodifiable Map<EquipmentSlot, ItemStackProvider> equipment();

    @NotNull @Unmodifiable Map<String, OverlayData> overlays();

}
