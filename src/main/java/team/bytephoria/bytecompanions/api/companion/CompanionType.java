package team.bytephoria.bytecompanions.api.companion;

import org.bukkit.inventory.EquipmentSlot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import team.bytephoria.bytecompanions.api.bukkit.ItemStackProvider;
import team.bytephoria.bytecompanions.api.companion.animation.AnimationChannel;
import team.bytephoria.bytecompanions.api.companion.animation.AnimationData;
import team.bytephoria.bytecompanions.api.companion.data.AppearanceData;
import team.bytephoria.bytecompanions.api.companion.data.OverlayData;

import java.util.Map;

public interface CompanionType {

    @NotNull String id();

    boolean exclusive();

    @Nullable ItemStackProvider displayItem();

    @NotNull AppearanceData appearance();

    @NotNull CompanionModel model();

    @NotNull ConfigurationData data();

    @NotNull @Unmodifiable Map<AnimationChannel, Map<String, AnimationData>> animations();

    @NotNull @Unmodifiable Map<EquipmentSlot, ItemStackProvider> equipment();

    @NotNull @Unmodifiable Map<String, OverlayData> overlays();

}
