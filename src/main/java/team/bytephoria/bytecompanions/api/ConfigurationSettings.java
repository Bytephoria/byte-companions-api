package team.bytephoria.bytecompanions.api;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.CompanionModel;

public interface ConfigurationSettings {

    @NotNull String serializer();

    int maxTotalPerPlayer();

    int maxTotalPerPlayer(final @NotNull CompanionModel companionModel);

    boolean autoLoadCompanions();

    boolean loadOnlinePlayersAfterReload();

    boolean dispatchInteractEvent();

    int updateInterval();

    int viewerRefreshDelay();

    int viewDistance();

}
