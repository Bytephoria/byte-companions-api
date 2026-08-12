package team.bytephoria.bytecompanions.api.companion;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import team.bytephoria.bytecompanions.api.companion.anchor.CompanionAnchor;
import team.bytephoria.bytecompanions.api.companion.data.OwnerData;
import team.bytephoria.bytecompanions.api.companion.entity.OverlayCapableCompanionEntity;

public interface Companion extends OverlayCapableCompanionEntity {

    @Nullable OwnerData ownerData();

    @NotNull CompanionType type();

    @NotNull CompanionAnchor anchor();

    default boolean hasOwner() {
        return this.ownerData() != null;
    }

    void formationIndex(final int index, final int count);

}
