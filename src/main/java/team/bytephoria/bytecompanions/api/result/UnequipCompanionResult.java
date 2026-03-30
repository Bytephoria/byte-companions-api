package team.bytephoria.bytecompanions.api.result;

public enum UnequipCompanionResult {

    /** The companion was unequipped and despawned successfully. */
    SUCCESS,

    /** The player had no active companion to unequip. */
    NO_COMPANION_ACTIVE,

    /** The player data is not loaded (not online or cache miss). */
    PLAYER_NOT_LOADED,

    /** The unequip was cancelled by a {@link team.bytephoria.bytecompanions.bukkitapi.event.CompanionUnequipEvent} listener. */
    CANCELLED

}
