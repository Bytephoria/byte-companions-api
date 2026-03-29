package team.bytephoria.bytecompanions.api.companion.builder;

import org.bukkit.inventory.EquipmentSlot;
import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.bukkit.ItemStackProvider;
import team.bytephoria.bytecompanions.api.companion.*;
import team.bytephoria.bytecompanions.api.companion.animations.AnimationData;
import team.bytephoria.bytecompanions.api.companion.animations.AnimationLayer;
import team.bytephoria.bytecompanions.api.util.Builder;

/**
 * Fluent builder for creating custom {@link CompanionType} instances.
 *
 * <p>Obtain an instance via {@code ByteCompanions.getAPI().companionTypeBuilder()}.
 *
 * <p><b>Example:</b>
 * <pre>{@code
 * CompanionType type = ByteCompanions.getAPI().companionTypeBuilder()
 *     .id("my_ghost")
 *     .display("&7Ghost")
 *     .model(CompanionModel.HEAD_ONLY)
 *     .appearance(new CompanionAppearance(true, true, false, false, true, "{player}'s Ghost", true, 0.5))
 *     .behavior(new CompanionBehavior(32))
 *     .animation(AnimationLayer.MOVEMENT, "hover", Map.of("height", 1.5))
 *     .animation(AnimationLayer.ROTATION, "look_at_owner", Map.of())
 *     .build();
 *
 * ByteCompanions.getAPI().typeRegistry().registerType("my_ghost", type);
 * }</pre>
 */
public interface CompanionTypeBuilder extends Builder<CompanionType> {

    /**
     * Sets the unique identifier for this companion type.
     * Must be unique within the {@link CompanionTypeRegistry}.
     *
     * @param id the companion type ID
     * @return this builder
     */
    @NotNull CompanionTypeBuilder id(final @NotNull String id);

    /**
     * Sets the display name shown in the companion selection menu.
     * Supports MiniMessage/ampersand formatting depending on the server config.
     *
     * @param display the display name
     * @return this builder
     */
    @NotNull CompanionTypeBuilder display(final @NotNull String display);

    /**
     * Sets the item shown in the companion selection menu.
     *
     * @param displayItem the item stack provider
     * @return this builder
     */
    @NotNull CompanionTypeBuilder displayItem(final @NotNull ItemStackProvider displayItem);

    /**
     * Sets the visual appearance of the armor stand entity.
     *
     * @param appearance the appearance configuration
     * @return this builder
     */
    @NotNull CompanionTypeBuilder appearance(final @NotNull CompanionAppearance appearance);

    /**
     * Sets the behavior parameters (e.g. view radius for spawning).
     *
     * @param behavior the behavior configuration
     * @return this builder
     */
    @NotNull CompanionTypeBuilder behavior(final @NotNull CompanionBehavior behavior);

    /**
     * Sets the body model (full body or head only).
     *
     * @param model the model type
     * @return this builder
     */
    @NotNull CompanionTypeBuilder model(final @NotNull CompanionModel model);

    /**
     * Registers an animation for this companion type on the given layer.
     * The animation ID must be registered in {@link team.bytephoria.bytecompanions.api.companion.animations.registry.CompanionAnimationRegistry}.
     *
     * @param layer       the animation layer
     * @param animationId the registered animation ID
     * @param data        the animation data (parameters map)
     * @return this builder
     */
    @NotNull CompanionTypeBuilder animation(
            final @NotNull AnimationLayer layer,
            final @NotNull String animationId,
            final @NotNull AnimationData data
    );

    /**
     * Adds equipment to the companion for the given slot.
     *
     * @param slot     the equipment slot
     * @param provider the item stack provider
     * @return this builder
     */
    @NotNull CompanionTypeBuilder equipment(
            final @NotNull EquipmentSlot slot,
            final @NotNull ItemStackProvider provider
    );

    /**
     * Adds an overlay layer (additional armor stand) on top of the base entity.
     *
     * @param layerId the unique layer identifier
     * @param overlay the overlay configuration
     * @return this builder
     */
    @NotNull CompanionTypeBuilder overlay(
            final @NotNull String layerId,
            final @NotNull OverlayData overlay
    );

    /**
     * Builds the {@link CompanionType}.
     *
     * @return the constructed companion type
     * @throws IllegalStateException if required fields (id, display, model, appearance, behavior) are missing
     */
    @Override
    @NotNull CompanionType build();

}
