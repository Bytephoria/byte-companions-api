package team.bytephoria.bytecompanions.api;

import org.jetbrains.annotations.Nullable;

/**
 * Provides global access to the {@link ByteCompanionsAPI} instance.
 * Manages registration, retrieval, and cleanup of the API.
 */
public final class ByteCompanionsAPIProvider {

    /** Global API instance available to consumers. */
    private static ByteCompanionsAPI instance;

    private ByteCompanionsAPIProvider() {
        throw new UnsupportedOperationException("This class cannot be instantiated.");
    }

    /**
     * Returns the active {@link ByteCompanionsAPI} instance.
     *
     * @return the initialized API instance
     * @throws IllegalStateException if the API is not set
     */
    public static ByteCompanionsAPI getInstance() {
        if (instance == null) {
            throw new IllegalStateException("ByteCompanionsAPIProvider has not been initialized.");
        }

        return instance;
    }

    /**
     * Sets the global API instance.
     *
     * @param api the API implementation to register
     * @throws IllegalStateException if an instance is already set
     */
    public static void setInstance(final @Nullable ByteCompanionsAPI api) {
        if (instance != null) {
            throw new IllegalStateException("ByteCompanionsAPIProvider has already been initialized.");
        }

        instance = api;
    }

    /**
     * Clears the current API instance.
     */
    public static void clear() {
        instance = null;
    }

    /**
     * Checks if the API has been initialized.
     *
     * @return true if an API instance is registered
     */
    public static boolean isInitialized() {
        return instance != null;
    }
}
