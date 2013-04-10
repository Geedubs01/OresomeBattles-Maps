package com.maps.classes;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.maps.BattleMap;
import com.maps.MapInterface;
import com.maps.OresomeBattlesMaps;
import com.oresomecraft.OresomeBattles.events.InventoryEvent;
import com.oresomecraft.OresomeBattles.events.ReadyMapsEvent;

public class Carnival extends BattleMap implements MapInterface, Listener {

    OresomeBattlesMaps plugin;
    public Suburban(OresomeBattlesMaps pl) {
  super(pl);
	plugin = pl;
    }

    // Spawn lists. (Don't change!)
    public ArrayList<Location> redSpawns = new ArrayList<Location>();
    public ArrayList<Location> blueSpawns = new ArrayList<Location>();
    public ArrayList<Location> FFASpawns = new ArrayList<Location>();

    // Map details
    String name = "carnival";
    String fullName = "Carnival";
    String creators = "R3creat3 and FaazM";
    //Map download link: N/A

    @EventHandler(priority = EventPriority.NORMAL)
    public void readyMap(ReadyMapsEvent event) {
	addVotes(name);
	clearSpawns();
	readyTDMSpawns();
	readyFFASpawns();
	addCreators(name, creators); 
	setFullName(name, fullName);
    }

    public void readyTDMSpawns() {
	World w = Bukkit.getServer().getWorld(name);
	Location 1 = new Location(w, -83, 39, 1836);
	Location 2 = new Location(w, -25, 41, 18);
	Location 3 = new Location(w, -116, 33, 1832);
	Location 4 = new Location(w, -19, 29, 1832);
	Location 5 = new Location(w, -120, 29, 1831);
	Location 6 = new Location(w, -72, 25, 1831);
	Location 7 = new Location(w, -16, 21, 1831);
	Location 8 = new Location(w, -81, 16, 1831);
	Location 9 = new Location(w, -131, 12, 1831);
	Location 10 = new Location(w, -18, 5, 1831);
	Location 11 = new Location(w, -79, 21, 1831);
	Location 12 = new Location(w, -17, 49, 1831);

	redSpawns.add(1);
	redSpawns.add(2);
	redSpawns.add(3);
	redSpawns.add(4);
	redSpawns.add(5);
	redSpawns.add(6);
	redSpawns.add(7);
	redSpawns.add(8);
	redSpawns.add(9);
	redSpawns.add(10);
	redSpawns.add(11);
	redSpawns.add(12);

	blueSpawns.add(1);
	blueSpawns.add(2);
	blueSpawns.add(3);
	blueSpawns.add(4);
	blueSpawns.add(5);
	blueSpawns.add(6);
	blueSpawns.add(7);
	blueSpawns.add(8);
	blueSpawns.add(9);
	blueSpawns.add(10);
	blueSpawns.add(11);
	blueSpawns.add(12);

	setRedSpawns(name, redSpawns);
	setBlueSpawns(name, blueSpawns);
    }

    public void readyFFASpawns() {

	World w = Bukkit.getServer().getWorld(name);

	World w = Bukkit.getServer().getWorld(name);

     Location 1 = new Location(w, -83, 39, 1836);
	Location 2 = new Location(w, -25, 41, 18);
	Location 3 = new Location(w, -116, 33, 1832);
	Location 4 = new Location(w, -19, 29, 1832);
	Location 5 = new Location(w, -120, 29, 1831);
	Location 6 = new Location(w, -72, 25, 1831);
	Location 7 = new Location(w, -16, 21, 1831);
	Location 8 = new Location(w, -81, 16, 1831);
	Location 9 = new Location(w, -131, 12, 1831);
	Location 10 = new Location(w, -18, 5, 1831);
	Location 11 = new Location(w, -79, 21, 1831);
	Location 12 = new Location(w, -17, 49, 1831);

	FFASpawns.add(1);
	FFASpawns.add(2);
	FFASpawns.add(3);
	FFASpawns.add(4);
	FFASpawns.add(5);
	FFASpawns.add(6);
	FFASpawns.add(7);
	FFASpawns.add(8);
	FFASpawns.add(9);
	FFASpawns.add(10);
	FFASpawns.add(11);
	FFASpawns.add(12);
	setFFASpawns(name, FFASpawns);
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void applyInventory(InventoryEvent event) {

	String par = event.getMessage();
	Player p = event.getPlayer();
	Inventory i = p.getInventory();
	if (par.equalsIgnoreCase(name)) {
	    clearInv(p);

ItemStack HEALTH_POTION = new ItemStack(Material.POTION, 1, (short) 16373);
	    ItemStack STEAK = new ItemStack(Material.COOKED_BEEF, 5);
	    ItemStack BOW = new ItemStack(Material.BOW, 1);
	    ItemStack ARROWS = new ItemStack(Material.ARROW, 64);
	    ItemStack IRON_HELMET = new ItemStack(Material.IRON_HELMET, 1);
	    ItemStack IRON_CHESTPLATE = new ItemStack(Material.IRON_CHESTPLATE, 1);
	    ItemStack IRON_PANTS = new ItemStack(Material.IRON_LEGGINGS, 1);
	    ItemStack IRON_BOOTS = new ItemStack(Material.IRON_BOOTS, 1);
	    ItemStack IRON_SWORD = new ItemStack(Material.IRON_SWORD, 1);

	    p.getInventory().setBoots(IRON_BOOTS);
	    p.getInventory().setLeggings(IRON_PANTS);
	    p.getInventory().setChestplate(IRON_CHESTPLATE);
	    p.getInventory().setHelmet(IRON_HELMET);

	    i.setItem(0, IRON_SWORD);
	    i.setItem(1, BOW);
	    i.setItem(2, STEAK);
	    i.setItem(3, HEALTH_POTION);
	    i.setItem(4, ARROWS);

	}
    }

    public void clearSpawns() {
	redSpawns.clear();
	blueSpawns.clear();
	FFASpawns.clear();
    }

    // Region. (Top corner block and bottom corner block.
    // Top left corner.
    public int x1 = -152;
    public int y1 = 0;
    public int z1 = 1816;

    //Bottom right corner.
    public int x2 = 5;
    public int y2 = 64;
    public int z2 = 1852;

    // Getting the region
    public boolean contains(Location loc, int x1, int x2, int y1,
	    int y2, int z1, int z2) {
	int bottomCornerX = x1 < x2 ? x1 : x2; 
	int bottomCornerZ = z1 < z2 ? z1 : z2; 
	int topCornerX = x1 > x2 ? x1 : x2;
	int topCornerZ = z1 > z2 ? z1 : z2;
	int bottomCornerY = y1 < y2 ? y1 : y2;
	int topCornerY = y1 > y2 ? y1 : y2;
	if (loc.getX() >= bottomCornerX && loc.getX() <= topCornerX) {
	    if (loc.getZ() >= bottomCornerZ && loc.getZ() <= topCornerZ) {
		if (loc.getY() >= bottomCornerY && loc.getY() <= topCornerY) {
		    return true;
		}
	    }
	}
	return false;

    }

    // Code to prevent block breaking.
    @EventHandler(priority = EventPriority.NORMAL)
    public void protection(BlockBreakEvent event) {

	Block b = event.getBlock();
	Location loc = b.getLocation();

	if (loc.getWorld().getName().equals(name)) {

	    event.setCancelled(true);
	}

    }
    
    // Code to prevent block placing.
    @EventHandler(priority = EventPriority.NORMAL)
    public void protection1(BlockPlaceEvent event) {

	Block b = event.getBlock();
	Location loc = b.getLocation();

	if (loc.getWorld().getName().equals(name)) {

	    event.setCancelled(true);

	}

    }

}
