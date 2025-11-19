
package team.bytephoria.bytecompanions.api.bukkit;

import org.bukkit.inventory.ItemStack;

/**
 * Represents an object that can provide an {@link ItemStack}.
 * This allows for dynamic creation of items, for example,
 * using a player's skin for a player head.
 */
public interface ItemStackProvider {

    ItemStack provide();

}
