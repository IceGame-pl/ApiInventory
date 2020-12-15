package pl.rex89m.apiinventory;

import org.bukkit.event.inventory.InventoryCloseEvent;

public interface OnCloseInventory {

    void onClosed(InventoryCloseEvent e);

}
