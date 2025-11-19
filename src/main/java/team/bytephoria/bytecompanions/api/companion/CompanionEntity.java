package team.bytephoria.bytecompanions.api.companion;

import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import team.bytephoria.bytecompanions.api.companion.animations.CompanionAnimations;

import java.util.Map;

public interface CompanionEntity {

    void tick();

    CompanionModel model();

    boolean isSpawned();

    int entityId();

    void teleport(final @NotNull Location location);

    void setSmall(final boolean small);

    void setVisible(final boolean visible);

    void setShowArms(final boolean showArms);

    void setShowBaseplate(final boolean baseplate);

    void setNameVisible(final boolean nameVisible);

    void setMarker(final boolean marker);

    void customName(final @Nullable Component customName);

    void equipment(final @NotNull EquipmentSlot equipmentSlot, final @Nullable ItemStack itemStack);

    @Nullable Component customName();

    Map<EquipmentSlot, ItemStack> equipment();

    CompanionAnimations animations();


}
