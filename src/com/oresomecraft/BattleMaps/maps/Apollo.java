package com.oresomecraft.BattleMaps.maps;

import org.bukkit.*;
import org.bukkit.enchantments.*;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.*;
import org.bukkit.potion.*;

import com.oresomecraft.BattleMaps.*;
import com.oresomecraft.OresomeBattles.api.*;

public class Apollo extends BattleMap implements IBattleMap, Listener {

    public Apollo() {
        super.initiate(this, name, fullName, creators, modes);
        setAllowBuild(false);
    }

    // Map details
    String name = "apollo";
    String fullName = "Apollo";
    String creators = "RokMelon and Invinsible_Jelly";
    Gamemode[] modes = {Gamemode.TDM, Gamemode.FFA, Gamemode.INFECTION};

    public void readyTDMSpawns() {

        Location redSpawn = new Location(w, -11, 150, 72, 89, 0);
        Location blueSpawn = new Location(w, -33, 150, 50, -1, 0);

        redSpawns.add(redSpawn);
        redSpawns.add(new Location(w, -55, 150, 72, -111, 0));
        redSpawns.add(new Location(w, -20, 133, 27, 48, 0));
        redSpawns.add(new Location(w, -81, 133, 88, -133, 0));
        redSpawns.add(new Location(w, -40, 110, 55, -89, 0));
        redSpawns.add(new Location(w, -53, 93, 54, -43, 0));
        redSpawns.add(new Location(w, -68, 122, 38, -45, 0));
        redSpawns.add(new Location(w, -53, 133, 57, -53, 0));
        redSpawns.add(new Location(w, -62, 136, 80, -131, 0));

        blueSpawns.add(blueSpawn);
        blueSpawns.add(new Location(w, -33, 150, 94, 179, 0));
        blueSpawns.add(new Location(w, -19, 133, 88, 137, 0));
        blueSpawns.add(new Location(w, -82, 133, 25, -44, 0));
        blueSpawns.add(new Location(w, -57, 109, 72, -2, 0));
        blueSpawns.add(new Location(w, -53, 93, 54, -43, 0));
        blueSpawns.add(new Location(w, -68, 122, 38, -45, 0));
        blueSpawns.add(new Location(w, -53, 133, 57, -53, 0));
        blueSpawns.add(new Location(w, -62, 136, 80, -131, 0));
    }

    public void readyFFASpawns() {
        FFASpawns.add(new Location(w, -11, 150, 72, 89, 0));
        FFASpawns.add(new Location(w, -33, 150, 50, -1, 0));
        FFASpawns.add(new Location(w, -55, 150, 72, -111, 0));
        FFASpawns.add(new Location(w, -20, 133, 27, 48, 0));
        FFASpawns.add(new Location(w, -81, 133, 88, -133, 0));
        FFASpawns.add(new Location(w, -40, 110, 55, -89, 0));
        FFASpawns.add(new Location(w, -53, 93, 54, -43, 0));
        FFASpawns.add(new Location(w, -68, 122, 38, -45, 0));
        FFASpawns.add(new Location(w, -53, 133, 57, -53, 0));
        FFASpawns.add(new Location(w, -62, 136, 80, -131, 0));
        FFASpawns.add(new Location(w, -33, 150, 94, 179, 0));
        FFASpawns.add(new Location(w, -19, 133, 88, 137, 0));
        FFASpawns.add(new Location(w, -82, 133, 25, -44, 0));
        FFASpawns.add(new Location(w, -57, 109, 72, -2, 0));
    }

    public void applyInventory(final BattlePlayer p) {
        Inventory i = p.getInventory();

        ItemStack HEALTH_POTION = new ItemStack(Material.POTION, 1, (short) 16373);
        ItemStack STEAK = new ItemStack(Material.COOKED_BEEF, 1);
        ItemStack BOW = new ItemStack(Material.BOW, 1);
        ItemStack ARROWS = new ItemStack(Material.ARROW, 64);
        ItemStack IRON_HELMET = new ItemStack(Material.IRON_HELMET, 1);
        ItemStack IRON_CHESTPLATE = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemStack IRON_PANTS = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemStack IRON_BOOTS = new ItemStack(Material.IRON_BOOTS, 1);
        ItemStack IRON_SWORD = new ItemStack(Material.IRON_SWORD, 1);
        ItemStack EXP = new ItemStack(Material.EXP_BOTTLE, 5);
        ItemStack ENDER_PEARL = new ItemStack(Material.ENDER_PEARL, 3);
        IRON_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 4);

        p.getInventory().setBoots(IRON_BOOTS);
        p.getInventory().setLeggings(IRON_PANTS);
        p.getInventory().setChestplate(IRON_CHESTPLATE);
        p.getInventory().setHelmet(IRON_HELMET);

        i.setItem(0, IRON_SWORD);
        i.setItem(1, BOW);
        i.setItem(2, STEAK);
        i.setItem(3, HEALTH_POTION);
        i.setItem(9, ARROWS);
        i.setItem(4, EXP);
        i.setItem(8, ENDER_PEARL);

        Bukkit.getScheduler().runTask(plugin, new Runnable() {
            public void run() {
                p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000 * 20, 2));
            }
        });

    }

    // Top left corner.
    public int x1 = -8;
    public int y1 = 164;
    public int z1 = 16;

    //Bottom right corner.
    public int x2 = -85;
    public int y2 = 62;
    public int z2 = 99;

    @EventHandler
    public void onMove(PlayerMoveEvent event) { // Theoretically disable fall damage
        if (event.getPlayer().getWorld().getName().equals(name)) event.getPlayer().setFallDistance(0);
    }

}
