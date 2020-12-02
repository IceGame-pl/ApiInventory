package pl.rex89m.apiinventory;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class CreateInventory implements Inventory {


    private Inventory inventory;

    public Inventory getInventory(){
        return inventory;
    }

    public CreateInventory(){
        inventory = Bukkit.createInventory(null, 9);
    }
    public CreateInventory(String nazwa){
        inventory = Bukkit.createInventory(null, 9, nazwa);
    }
    public CreateInventory(Integer integer, String nazwa){
        inventory = Bukkit.createInventory(null, integer, nazwa);
    }
    public CreateInventory(Player p, Integer integer, String nazwa){
        inventory = Bukkit.createInventory(p, integer, nazwa);
    }

    public static HashMap<ItemStack, OnClickListener> lista = new HashMap<>();

    public void setItemClick(Integer integer, ItemStack item, OnClickListener listener){
        inventory.setItem(integer, item);
        lista.put(item, listener);
    }

    @Override
    public int getSize() {
        return inventory.getSize();
    }

    @Override
    public int getMaxStackSize() {
        return inventory.getMaxStackSize();
    }

    @Override
    public void setMaxStackSize(int size) {
        inventory.setMaxStackSize(size);
    }

    @Override
    public ItemStack getItem(int index) {
        return inventory.getItem(index);
    }

    @Override
    public void setItem(int index, ItemStack item) {
        inventory.setItem(index, item);
    }

    @Override
    public HashMap<Integer, ItemStack> addItem(ItemStack... items){
        return inventory.addItem(items);
    }

    @Override
    public HashMap<Integer, ItemStack> removeItem(ItemStack... items){
        return inventory.removeItem(items);
    }

    @Override
    public ItemStack[] getContents() {
        return inventory.getContents();
    }

    @Override
    public void setContents(ItemStack[] items) {
        inventory.setContents(items);
    }

    @Override
    public ItemStack[] getStorageContents() {
        return inventory.getStorageContents();
    }

    @Override
    public void setStorageContents(ItemStack[] items){
        inventory.setStorageContents(items);
    }

    @Override
    public boolean contains(Material material){
        return inventory.contains(material);
    }

    @Override
    public boolean contains(ItemStack item) {
        return inventory.contains(item);
    }

    @Override
    public boolean contains(Material material, int amount) {
        return inventory.contains(material, amount);
    }

    @Override
    public boolean contains(ItemStack item, int amount) {
        return inventory.contains(item, amount);
    }

    @Override
    public boolean containsAtLeast(ItemStack item, int amount) {
        return inventory.containsAtLeast(item, amount);
    }

    @Override
    public HashMap<Integer, ? extends ItemStack> all(Material material){
        return inventory.all(material);
    }

    @Override
    public HashMap<Integer, ? extends ItemStack> all(ItemStack item) {
        return inventory.all(item);
    }

    @Override
    public int first(Material material){
        return inventory.first(material);
    }

    @Override
    public int first(ItemStack item) {
        return inventory.first(item);
    }

    @Override
    public int firstEmpty() {
        return inventory.firstEmpty();
    }

    @Override
    public void remove(Material material) {
        inventory.remove(material);
    }

    @Override
    public void remove(ItemStack item) {
        inventory.remove(item);
    }

    @Override
    public void clear(int index) {
        inventory.clear(index);
    }

    @Override
    public void clear() {
        inventory.clear();
    }

    @Override
    public List<HumanEntity> getViewers() {
        return inventory.getViewers();
    }

    @Override
    public InventoryType getType() {
        return inventory.getType();
    }

    @Override
    public InventoryHolder getHolder() {
        return inventory.getHolder();
    }

    @Override
    public ListIterator<ItemStack> iterator() {
        return inventory.iterator();
    }

    @Override
    public ListIterator<ItemStack> iterator(int index) {
        return inventory.iterator(index);
    }

    @Override
    public Location getLocation() {
        return inventory.getLocation();
    }
}
