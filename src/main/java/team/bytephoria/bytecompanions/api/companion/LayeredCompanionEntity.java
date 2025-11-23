
package team.bytephoria.bytecompanions.api.companion;

import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Map;
import java.util.Set;

public interface LayeredCompanionEntity extends CompanionEntity {

    @NotNull
    @Unmodifiable
    Set<String> layersIds();

    @NotNull
    @Unmodifiable
    Map<EquipmentSlot, ItemStack> layerEquipment(final @NotNull String layerId);

    boolean equipment(
            final @NotNull String layerId,
            final @NotNull EquipmentSlot equipmentSlot,
            final @Nullable ItemStack itemStack
    );

    boolean addLayer(
            final @NotNull String layerId
    );

    boolean removeLayer(
            final @NotNull String layerId
    );

    boolean hasLayer(
            final @NotNull String layerId
    );

    void clearLayers();

    boolean visible(
            final @NotNull String layerId,
            final boolean visible
    );

    boolean isVisible(final @NotNull String layerId);

    @Nullable
    CompanionLayer layer(final @NotNull String layerId);

}
