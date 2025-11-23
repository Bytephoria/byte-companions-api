
package team.bytephoria.bytecompanions.api.companion;

import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Map;

public record CompanionLayer(
        @NotNull String layerId,
        boolean visible,
        @NotNull @Unmodifiable Map<EquipmentSlot, ItemStack> equipment
) {
}
