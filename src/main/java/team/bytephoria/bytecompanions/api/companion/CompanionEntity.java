package team.bytephoria.bytecompanions.api.companion;

import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import team.bytephoria.bytecompanions.api.companion.animations.CompanionAnimations;

import java.util.Map;

/**
 * The live entity representation of a companion in the world.
 *
 * <p>Provides full control over the companion's visual state, equipment,
 * animations, and lifecycle. All modifications are sent to viewers as
 * NMS packets — no Bukkit entity is created in the world.
 */
public interface CompanionEntity {

    // ── Lifecycle ──────────────────────────────────────────────────────────

    /**
     * Advances the animation system by one tick and flushes dirty state to viewers.
     * Called automatically by the tick scheduler — do not call manually unless
     * you are managing your own tick loop.
     */
    void tick();

    /**
     * Despawns the entity for all current viewers and frees all internal state.
     * After calling this, the companion entity is no longer usable.
     */
    void destroy();

    // ── Identity & state ──────────────────────────────────────────────────

    /** The body model of this companion (full body or head only). */
    @NotNull CompanionModel model();

    /** Whether the entity is currently spawned and visible to at least the anchor. */
    boolean isSpawned();

    /** The internal NMS entity ID, used for packet targeting. */
    int entityId();

    // ── Current position (read-only, updated each tick) ───────────────────

    /**
     * The companion's current X coordinate in world space.
     * Updated every tick by the animation system.
     * Useful for addons that need to track the companion's position (e.g. balloon leash holder).
     */
    double currentX();

    /**
     * The companion's current Y coordinate in world space.
     */
    double currentY();

    /**
     * The companion's current Z coordinate in world space.
     */
    double currentZ();

    // ── Appearance controls ───────────────────────────────────────────────

    void teleport(final @NotNull Location location);

    void setSmall(final boolean small);

    void setVisible(final boolean visible);

    void setShowArms(final boolean showArms);

    void setShowBaseplate(final boolean baseplate);

    void setNameVisible(final boolean nameVisible);

    void setMarker(final boolean marker);

    void customName(final @Nullable Component customName);

    @Nullable Component customName();

    // ── Equipment ─────────────────────────────────────────────────────────

    void equipment(final @NotNull EquipmentSlot equipmentSlot, final @Nullable ItemStack itemStack);

    @NotNull Map<EquipmentSlot, ItemStack> equipment();

    // ── Animations ────────────────────────────────────────────────────────

    @NotNull CompanionAnimations animations();

}
