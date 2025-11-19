package team.bytephoria.bytecompanions.api.companion.animations;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface CompanionAnimationContext {

    /** The player who owns the miniature. */
    @NotNull Player owner();

    double currentX();

    double currentY();

    double currentZ();

    double previousX();

    double previousY();

    double previousZ();

    float bodyYaw();

    float headYaw();

    float headPitch();
}
