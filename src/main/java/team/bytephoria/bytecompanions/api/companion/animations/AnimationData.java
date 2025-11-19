
package team.bytephoria.bytecompanions.api.companion.animations;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface AnimationData {

    @NotNull Map<String, Double> parameters();

    default double get(final @NotNull String key, final double defaultValue) {
        return parameters().getOrDefault(key, defaultValue);
    }
}
