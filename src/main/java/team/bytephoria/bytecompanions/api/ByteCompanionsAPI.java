package team.bytephoria.bytecompanions.api;

import team.bytephoria.bytecompanions.api.companion.CompanionTypeRegistry;
import team.bytephoria.bytecompanions.api.user.UserService;

/**
 * Root access point for all ByteCompanions services.
 */
public interface ByteCompanionsAPI {

    /**
     * Returns the active {@link ByteCompanionsAPI} instance.
     *
     * @return the global API instance
     */
    static ByteCompanionsAPI getInstance() {
        return ByteCompanionsAPIProvider.getInstance();
    }

    /**
     * Provides access to user-related companion data and operations.
     *
     * @return the user service
     */
    UserService userService();

    /**
     * Registry responsible for registering and retrieving companion types.
     *
     * @return the companion type registry
     */
    CompanionTypeRegistry companionTypeRegistry();

}
