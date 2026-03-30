package team.bytephoria.bytecompanions.api.result;

public enum EquipCompanionResult {

    /** The companion was equipped successfully. */
    SUCCESS,

    /** The player already has this companion type active. */
    ALREADY_EQUIPPED,

    /** The requested companion type does not exist in the registry. */
    COMPANION_TYPE_NOT_FOUND,

    /** The player data is not loaded (not online or cache miss). */
    PLAYER_NOT_LOADED,

    /** The equip was cancelled by a {@link team.bytephoria.bytecompanions.bukkitapi.event.CompanionEquipEvent} listener. */
    CANCELLED

}
