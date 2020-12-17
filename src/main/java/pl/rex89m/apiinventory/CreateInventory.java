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
    static HashMap<String, HashMap<Integer, OnClickListener>> lista = new HashMap<>();
    static HashMap<String, OnCloseInventory> closeinventory = new HashMap<>();
    private String name;
    private Integer sloty;
    private HashMap<Integer, OnClickListener> hashMap = new HashMap<>();

    public Inventory getInventory(){
        return this.inventory;
    }

    public CreateInventory(){
        this.inventory = Bukkit.createInventory(null, 9);
        this.name = "Chest";
        this.sloty=9;
    }

    public CreateInventory(String nazwa){
        this.inventory = Bukkit.createInventory(null, 9, nazwa);
        this.name=nazwa;
        this.sloty=9;
    }

    public CreateInventory(Integer integer, String nazwa){
        this.inventory = Bukkit.createInventory(null, integer, nazwa);
        this.name=nazwa;
        this.sloty=integer;
    }

    public CreateInventory(Player p, Integer integer, String nazwa){
        this.inventory = Bukkit.createInventory(p, integer, nazwa);
        this.name=nazwa;
        this.sloty=integer;
    }

    public void setItemClick(Integer integer, ItemStack item, OnClickListener listener){
        if (this.sloty>=integer) {
            this.inventory.setItem(integer, item);
            hashMap.put(integer, listener);
            lista.put(name, hashMap);
        }else{
            throw new NumberFormatException(this.sloty + " >= "+ integer);
        }
    }

    public void setCloseinventory(OnCloseInventory listener){
        closeinventory.put(name, listener);
    }

    public void addClick(Integer integer, OnClickListener listener){
        hashMap.put(integer, listener);
        lista.put(name, hashMap);
    }
    public String getName() {
        return this.name;
    }
    @Override
    public int getSize() {
        return this.inventory.getSize();
    }

    @Override
    public int getMaxStackSize() {
        return this.inventory.getMaxStackSize();
    }

    @Override
    public void setMaxStackSize(int size) {
        this.inventory.setMaxStackSize(size);
    }

    @Override
    public ItemStack getItem(int index) {
        return this.inventory.getItem(index);
    }

    @Override
    public void setItem(int index, ItemStack item) {
        this.inventory.setItem(index, item);
    }

    @Override
    public HashMap<Integer, ItemStack> addItem(ItemStack... items){
        return this.inventory.addItem(items);
    }

    @Override
    public HashMap<Integer, ItemStack> removeItem(ItemStack... items){
        return this.inventory.removeItem(items);
    }

    @Override
    public ItemStack[] getContents() {
        return this.inventory.getContents();
    }

    @Override
    public void setContents(ItemStack[] items) {
        this.inventory.setContents(items);
    }

    @Override
    public ItemStack[] getStorageContents() {
        return this.inventory.getStorageContents();
    }

    @Override
    public void setStorageContents(ItemStack[] items) {
        this.inventory.setStorageContents(items);
    }

    @Override
    public boolean contains(int materialId) {
        return this.inventory.contains(materialId);
    }

    @Override
    public boolean contains(Material material){
        return this.inventory.contains(material);
    }

    @Override
    public boolean contains(ItemStack item) {
        return this.inventory.contains(item);
    }

    @Override
    public boolean contains(int materialId, int amount) {
        return this.inventory.contains(materialId, amount);
    }

    @Override
    public boolean contains(Material material, int amount) {
        return this.inventory.contains(material, amount);
    }

    @Override
    public boolean contains(ItemStack item, int amount) {
        return this.inventory.contains(item, amount);
    }

    @Override
    public boolean containsAtLeast(ItemStack item, int amount) {
        return this.inventory.containsAtLeast(item, amount);
    }

    @Override
    public HashMap<Integer, ? extends ItemStack> all(int materialId) {
        return this.inventory.all(materialId);
    }

    @Override
    public HashMap<Integer, ? extends ItemStack> all(Material material){
        return this.inventory.all(material);
    }

    @Override
    public HashMap<Integer, ? extends ItemStack> all(ItemStack item) {
        return this.inventory.all(item);
    }

    @Override
    public int first(int materialId) {
        return this.inventory.first(materialId);
    }

    @Override
    public int first(Material material){
        return this.inventory.first(material);
    }

    @Override
    public int first(ItemStack item) {
        return this.inventory.first(item);
    }

    @Override
    public int firstEmpty() {
        return this.inventory.firstEmpty();
    }

    @Override
    public void remove(int materialId) {
        this.inventory.remove(materialId);
    }

    @Override
    public void remove(Material material) {
        this.inventory.remove(material);
    }

    @Override
    public void remove(ItemStack item) {
        this.inventory.remove(item);
    }

    @Override
    public void clear(int index) {
        this.inventory.clear(index);
    }

    @Override
    public void clear() {
        this.inventory.clear();
    }

    @Override
    public List<HumanEntity> getViewers() {
        return this.inventory.getViewers();
    }

    @Override
    public String getTitle() {
        return this.inventory.getTitle();
    }

    @Override
    public InventoryType getType() {
        return this.inventory.getType();
    }

    @Override
    public InventoryHolder getHolder() {
        return this.inventory.getHolder();
    }

    @Override
    public ListIterator<ItemStack> iterator() {
        return this.inventory.iterator();
    }

    @Override
    public ListIterator<ItemStack> iterator(int index) {
        return this.inventory.iterator(index);
    }

    @Override
    public Location getLocation() {
        return this.inventory.getLocation();
    }

}
