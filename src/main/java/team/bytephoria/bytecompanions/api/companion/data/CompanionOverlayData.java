package team.bytephoria.bytecompanions.api.companion.data;

import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Map;

public record CompanionOverlayData(
        @NotNull String overlayId,
        boolean visible,
        @NotNull @Unmodifiable Map<EquipmentSlot, ItemStack> equipment
) {
}
