package team.bytephoria.bytecompanions.api.bukkit.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.EquipmentSlot;
import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.Companion;

public final class CompanionPlayerInteractEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Player player;
    private final Companion companion;
    private final int entityId;

    private final EquipmentSlot hand;
    private final boolean attack;

    public CompanionPlayerInteractEvent(
            final @NotNull Player player,
            final @NotNull Companion companion,
            final @NotNull EquipmentSlot hand,
            final boolean attack
    ) {
        this(player, companion, companion.entityId(), hand, attack);
    }

    public CompanionPlayerInteractEvent(
            final @NotNull Player player,
            final @NotNull Companion companion,
            final int entityId,
            final @NotNull EquipmentSlot hand,
            final boolean attack
    ) {
        this.player = player;
        this.companion = companion;
        this.entityId = entityId;
        this.hand = hand;
        this.attack = attack;
    }

    public @NotNull Player player() {
        return this.player;
    }

    public @NotNull Companion companion() {
        return this.companion;
    }

    public int entityId() {
        return this.entityId;
    }

    public EquipmentSlot hand() {
        return this.hand;
    }

    public boolean attack() {
        return this.attack;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }
}
