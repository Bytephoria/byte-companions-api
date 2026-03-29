package team.bytephoria.bytecompanions.api;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Holds the global singleton instance of {@link ByteCompanionsAPI}.
 * Managed internally by the plugin — external code should never call set/reset.
 */
public final class ByteCompanionsAPIProvider {

    private static ByteCompanionsAPI instance;

    private ByteCompanionsAPIProvider() {
        throw new UnsupportedOperationException("This class cannot be instantiated.");
    }

    public static @NotNull ByteCompanionsAPI getInstance() {
        return Objects.requireNonNull(instance,
                "ByteCompanions API is not available yet. Is the plugin enabled?");
    }

    public static void setInstance(final @NotNull ByteCompanionsAPI api) {
        Objects.requireNonNull(api, "API instance must not be null.");
        if (instance != null) {
            throw new IllegalStateException("ByteCompanionsAPIProvider instance is already set.");
        }

        instance = api;
    }

    public static boolean isAvailable() {
        return instance != null;
    }

    public static void resetInstance() {
        instance = null;
    }

}
