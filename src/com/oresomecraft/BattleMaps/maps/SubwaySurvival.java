package com.oresomecraft.BattleMaps.maps;

import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.inventory.*;

import com.oresomecraft.BattleMaps.*;
import com.oresomecraft.OresomeBattles.api.*;

public class SubwaySurvival extends BattleMap implements IBattleMap, Listener {

    public SubwaySurvival() {
        super.initiate(this, name, fullName, creators, modes);
        setAllowBuild(false);
        lockTime("night");
        disableDrops(new Material[]{Material.IRON_HELMET, Material.IRON_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS, Material.IRON_SWORD, Material.BOW, Material.ARROW});
    }

    // Map details
    String name = "subwaysurvival";
    String fullName = "Subway Survival";
    String creators = "iVelocityGaming and XxH4XxX";
    Gamemode[] modes = {Gamemode.FFA, Gamemode.INFECTION};

    // Map download link: bit.ly/19IKGtb  // Download link to map.
    public void readyTDMSpawns() {
        //Don't need anything here.
    }

    public void readyFFASpawns() {
        FFASpawns.add(new Location(w, 36, 75, 54, -50, 0));
        FFASpawns.add(new Location(w, 46, 70, 38, -50, 0));
        FFASpawns.add(new Location(w, 42, 74, 73, -50, 0));
        FFASpawns.add(new Location(w, 66, 67, 57, -50, 0));
        FFASpawns.add(new Location(w, 68, 67, 74, -50, 0));
        FFASpawns.add(new Location(w, 68, 67, 74, -50, 0));
        FFASpawns.add(new Location(w, 68, 67, 34, -50, 0));
        FFASpawns.add(new Location(w, 120, 70, 39, -50, 0));
        FFASpawns.add(new Location(w, 68, 67, 74, -50, 0));
        FFASpawns.add(new Location(w, 120, 70, 74, -50, 0));
        FFASpawns.add(new Location(w, 130, 75, 56, -50, 0));
    }

    public void applyInventory(final BattlePlayer p) {
        Inventory i = p.getInventory();

        ItemStack HEALTH_POTION = new ItemStack(Material.POTION, 1, (short) 16373);
        ItemStack IRON_HELMET = new ItemStack(Material.IRON_HELMET, 1);
        ItemStack IRON_CHESTPLATE = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemStack IRON_PANTS = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemStack IRON_BOOTS = new ItemStack(Material.IRON_BOOTS, 1);

        p.getInventory().setBoots(IRON_BOOTS);
        p.getInventory().setLeggings(IRON_PANTS);
        p.getInventory().setChestplate(IRON_CHESTPLATE);
        p.getInventory().setHelmet(IRON_HELMET);

        i.setItem(3, HEALTH_POTION);

        p.setItem(0, Material.IRON_SWORD, 1);
        p.setItem(1, Material.BOW, 1);
        p.setItem(2, Material.COOKED_BEEF, 1);
        p.setItem(9, Material.ARROW, 64);
    }

    @EventHandler
    public void arrowBoom(org.bukkit.event.entity.ProjectileHitEvent event) {
        org.bukkit.entity.Entity arrow = event.getEntity();
        World world = Bukkit.getWorld(name);
        if (getArena().equals(name)) {
            if (arrow instanceof org.bukkit.entity.Arrow) {
                world.playEffect(arrow.getLocation(), org.bukkit.Effect.STEP_SOUND, 8);
            }
        }
    }

    // Region. (Top corner block and bottom corner block.
    // Top left corner.
    public int x1 = 142;
    public int y1 = 93;
    public int z1 = 20;

    // Bottom right corner.
    public int x2 = 31;
    public int y2 = 55;
    public int z2 = 81;

}
