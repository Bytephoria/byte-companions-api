
package team.bytephoria.bytecompanions.api.companion.animation;

import org.jetbrains.annotations.NotNull;
import team.bytephoria.bytecompanions.api.companion.ConfigurationData;

public interface AnimationData extends ConfigurationData {

    @NotNull
    String id();

    @NotNull
    AnimationData section(final @NotNull String path);

}