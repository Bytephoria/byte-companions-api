package team.bytephoria.bytecompanions.api.companion;

import org.bukkit.inventory.EquipmentSlot;
import team.bytephoria.bytecompanions.api.bukkit.ItemStackProvider;

import java.util.Map;

public record OverlayData(
        boolean lockHeadYaw,
        Map<EquipmentSlot, ItemStackProvider> equipment
) {
}