package pl.rex89m.apiinventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ApiInventory extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this,this);
    }
    @Override
    public void onDisable() {
    }
    @EventHandler
    public void onClickInventory(InventoryClickEvent e){
        if (CreateInventory.lista.containsKey(e.getWhoClicked().getOpenInventory().getTitle())){
            if (CreateInventory.lista.get(e.getWhoClicked().getOpenInventory().getTitle()).containsKey(e.getRawSlot())){
                CreateInventory.lista.get(e.getWhoClicked().getOpenInventory().getTitle()).get(e.getRawSlot()).onClick(e);
            }
        }
    }
}
