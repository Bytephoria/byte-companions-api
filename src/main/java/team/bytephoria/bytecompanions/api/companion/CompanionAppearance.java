package team.bytephoria.bytecompanions.api.companion;

import org.jetbrains.annotations.NotNull;

public record CompanionAppearance(
        boolean small,
        boolean visible,
        boolean showArms,
        boolean showBaseplate,
        boolean marker,
        String customName,
        boolean customNameVisible,
        double scale
) {

    public static @NotNull CompanionAppearance cloneWithCustomName(
            final @NotNull CompanionAppearance companionAppearance,
            final @NotNull String customName
    ) {
        return new CompanionAppearance(
                companionAppearance.small,
                companionAppearance.visible,
                companionAppearance.showArms,
                companionAppearance.showBaseplate,
                companionAppearance.marker,
                customName,
                companionAppearance.customNameVisible,
                companionAppearance.scale
        );
    }

    public @NotNull CompanionAppearance cloneWithCustomName(final @NotNull String customName) {
        return cloneWithCustomName(this, customName);
    }


}
