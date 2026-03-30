package team.bytephoria.bytecompanions.api;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.Companion;
import team.bytephoria.bytecompanions.api.companion.CompanionManager;
import team.bytephoria.bytecompanions.api.companion.CompanionType;
import team.bytephoria.bytecompanions.api.companion.CompanionTypeRegistry;
import team.bytephoria.bytecompanions.api.companion.animations.registry.CompanionAnimationRegistry;
import team.bytephoria.bytecompanions.api.companion.builder.CompanionTypeBuilder;
import team.bytephoria.bytecompanions.api.user.CompanionPlayer;
import team.bytephoria.bytecompanions.api.user.UserManager;

import java.util.Optional;
import java.util.UUID;

/**
 * Root access point for all ByteCompanions services.
 *
 * <p>Obtain the instance via {@link #getAPI()}.
 *
 * <p><b>Quick usage:</b>
 * <pre>{@code
 * // Register a custom animation
 * ByteCompanionsAPI.getAPI().animationRegistry().register("my_anim", data -> new MyAnimation());
 *
 * // Build and register a custom companion type
 * CompanionType type = ByteCompanionsAPI.getAPI().companionTypeBuilder()
 *     .id("my_companion")
 *     .display("My Companion")
 *     ...
 *     .build();
 * ByteCompanionsAPI.getAPI().typeRegistry().registerType("my_companion", type);
 *
 * // Equip a companion for a player
 * ByteCompanionsAPI.getAPI().companionManager()
 *     .equip(player, type);
 * }</pre>
 */
public interface ByteCompanionsAPI {

    /**
     * Returns the active {@link ByteCompanionsAPI} instance.
     *
     * @return the global API instance
     * @throws IllegalStateException if the plugin is not yet enabled
     */
    static @NotNull ByteCompanionsAPI getAPI() {
        return ByteCompanionsAPIProvider.getInstance();
    }

    // ── Services ───────────────────────────────────────────────────────────

    /**
     * Manages access to loaded companion player instances.
     * Use {@link UserManager#find(java.util.UUID)} for online players and
     * {@link UserManager#findAsync(java.util.UUID)} for offline lookups.
     *
     * @return the user manager
     */
    @NotNull UserManager userManager();

    /**
     * Registry for companion types. Use this to register custom companion types
     * that devs create via {@link #companionTypeBuilder()}.
     *
     * @return the companion type registry
     */
    @NotNull CompanionTypeRegistry typeRegistry();

    /**
     * Manages the lifecycle of active companions (equip, unequip, query).
     *
     * @return the companion manager
     */
    @NotNull CompanionManager companionManager();

    /**
     * Registry for animation factories. Register custom animations here
     * so they can be referenced by ID in companion YAML configuration.
     *
     * @return the animation registry
     */
    @NotNull CompanionAnimationRegistry animationRegistry();

    // ── Factories ──────────────────────────────────────────────────────────

    /**
     * Returns a fresh {@link CompanionTypeBuilder} for constructing custom companion types.
     *
     * @return a new builder instance
     */
    @NotNull CompanionTypeBuilder companionTypeBuilder();

    // ── Convenience shortcuts ──────────────────────────────────────────────

    /**
     * Looks up a loaded companion player by UUID.
     * Returns empty if the player is not online or not yet cached.
     *
     * @param playerId the player's UUID
     * @return an optional containing the companion player
     */
    default @NotNull Optional<CompanionPlayer> getPlayer(final @NotNull UUID playerId) {
        return this.userManager().find(playerId);
    }

    /**
     * Looks up the active companion for the given player UUID.
     *
     * @param playerId the player's UUID
     * @return an optional containing the companion
     */
    default @NotNull Optional<Companion> getCompanion(final @NotNull UUID playerId) {
        return Optional.ofNullable(this.companionManager().find(playerId));
    }

    /**
     * Looks up a companion type by its registered ID.
     *
     * @param typeId the companion type ID
     * @return an optional containing the type
     */
    default @NotNull Optional<CompanionType> getType(final @NotNull String typeId) {
        return this.typeRegistry().getOptional(typeId);
    }

}
