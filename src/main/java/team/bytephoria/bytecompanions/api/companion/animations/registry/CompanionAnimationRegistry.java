package team.bytephoria.bytecompanions.api.companion.animations.registry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Optional;
import java.util.Set;

/**
 * Registry for companion animation factories.
 *
 * <p>Animations are identified by a string ID (e.g. {@code "follow_owner"}, {@code "hover"}).
 * External plugins register their custom animations here so the companion system
 * can instantiate them from YAML configuration.
 *
 * <p>Obtain an instance via {@code ByteCompanions.getAPI().animationRegistry()}.
 *
 * <p><b>Example registration:</b>
 * <pre>{@code
 * ByteCompanions.getAPI().animationRegistry().register("my_orbit", data -> {
 *     double radius = data.get("radius", 2.0);
 *     double speed  = data.get("speed",  0.04);
 *     return new MyOrbitAnimation(radius, speed);
 * });
 * }</pre>
 *
 * <p><b>Example usage in a companion YAML:</b>
 * <pre>{@code
 * animations:
 *   movement:
 *     - id: my_orbit
 *       options:
 *         radius: 1.5
 *         speed: 0.03
 * }</pre>
 */
public interface CompanionAnimationRegistry {

    /**
     * Registers an animation factory under the given ID.
     * Overwrites any previously registered factory with the same ID.
     *
     * @param id      the unique animation identifier (e.g. {@code "my_orbit"})
     * @param factory the factory that produces animation instances
     * @throws IllegalArgumentException if {@code id} is blank
     */
    void register(final @NotNull String id, final @NotNull CompanionAnimationFactory factory);

    /**
     * Looks up a registered factory by ID.
     *
     * @param id the animation identifier
     * @return an optional containing the factory, empty if not registered
     */
    @NotNull Optional<CompanionAnimationFactory> find(final @NotNull String id);

    /**
     * Looks up a registered factory by ID, throwing if not found.
     *
     * @param id the animation identifier
     * @return the factory
     * @throws IllegalArgumentException if no factory is registered under {@code id}
     */
    @NotNull CompanionAnimationFactory get(final @NotNull String id);

    /**
     * Returns whether an animation with the given ID is registered.
     *
     * @param id the animation identifier
     * @return {@code true} if registered
     */
    boolean isRegistered(final @NotNull String id);

    /**
     * Returns an unmodifiable snapshot of all registered animation IDs.
     *
     * @return the set of registered IDs
     */
    @NotNull @Unmodifiable Set<String> registeredIds();

    /**
     * Removes the factory registered under the given ID, if any.
     *
     * @param id the animation identifier to unregister
     */
    void unregister(final @NotNull String id);

}
