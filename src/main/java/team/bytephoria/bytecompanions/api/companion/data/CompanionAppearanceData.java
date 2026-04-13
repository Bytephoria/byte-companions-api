package team.bytephoria.bytecompanions.api.companion.data;

import org.jetbrains.annotations.Nullable;

public record CompanionAppearanceData(
        boolean small,
        boolean visible,
        boolean showArms,
        boolean showBaseplate,
        boolean marker,
        @Nullable String customName,
        boolean customNameVisible,
        double scale
) {

}
