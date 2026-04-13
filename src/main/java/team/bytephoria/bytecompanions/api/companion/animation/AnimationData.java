
package team.bytephoria.bytecompanions.api.companion.animation;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Map;

public interface AnimationData {

    AnimationData EMPTY = Collections::emptyMap;

    static @NotNull AnimationData empty() {
        return EMPTY;
    }

    @NotNull Map<String, Double> parameters();

    default double getOrDouble(final @NotNull String key, final double defaultValue) {
        return this.parameters().getOrDefault(key, defaultValue);
    }

    default int getOrInt(final @NotNull String key, final int defaultValue) {
        final Double value = this.parameters().get(key);
        return value != null ? value.intValue() : defaultValue;
    }

    default float getOrFloat(final @NotNull String key, final float defaultValue) {
        final Double value = this.parameters().get(key);
        return value != null ? value.floatValue() : defaultValue;
    }

    default boolean getOrBoolean(final @NotNull String key, final boolean defaultValue) {
        final Double value = this.parameters().get(key);
        return value != null ? value != 0.0 : defaultValue;
    }

    default boolean has(final @NotNull String key) {
        return this.parameters().containsKey(key);
    }
}
