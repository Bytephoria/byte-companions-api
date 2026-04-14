package team.bytephoria.bytecompanions.api.bukkit.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.user.CompanionPlayer;

public final class CompanionPlayerUnloadEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Player player;
    private final CompanionPlayer companionPlayer;

    public CompanionPlayerUnloadEvent(
            final @NotNull Player player,
            final @NotNull CompanionPlayer companionPlayer
    ) {
        this.player = player;
        this.companionPlayer = companionPlayer;
    }

    public Player player() {
        return this.player;
    }

    public CompanionPlayer companionPlayer() {
        return this.companionPlayer;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

}
