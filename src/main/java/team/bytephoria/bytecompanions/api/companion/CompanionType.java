package team.bytephoria.bytecompanions.api.companion;

import org.bukkit.inventory.EquipmentSlot;
import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.bukkit.ItemStackProvider;
import team.bytephoria.bytecompanions.api.companion.animations.AnimationData;
import team.bytephoria.bytecompanions.api.companion.animations.AnimationLayer;

import java.util.Map;

public interface CompanionType {

    @NotNull String id();

    @NotNull String display();

    @NotNull ItemStackProvider menuDisplay();

    @NotNull CompanionModel model();

    @NotNull CompanionAppearance appearance();

    @NotNull CompanionBehavior behavior();

    @NotNull Map<AnimationLayer, Map<String, AnimationData>> animations();

    @NotNull Map<EquipmentSlot, ItemStackProvider> equipment();

}
