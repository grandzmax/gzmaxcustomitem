package me.grandzmax.gzmaxcustomitem.ItemEvents;

import me.grandzmax.gzmaxcustomitem.GzmaxCustomItem;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

public class InfiniteBuckets implements Listener {

    GzmaxCustomItem plugin;

    public InfiniteBuckets(GzmaxCustomItem plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBucketDrain(PlayerBucketEmptyEvent event){
        int x = event.getBlockClicked().getX() + event.getBlockFace().getModX();
        int y = event.getBlockClicked().getY() + event.getBlockFace().getModY();
        int z = event.getBlockClicked().getZ() + event.getBlockFace().getModZ();
        if(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore()!= null
            && event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Infinite Water")){
            event.getPlayer().getWorld().getBlockAt(x, y, z).setType(Material.WATER);
            event.setCancelled(true);
        }
        if(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore()!= null
            && event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("§6Item Ability: Infinite Lava")){
            event.getPlayer().getWorld().getBlockAt(x, y, z).setType(Material.LAVA);
            event.setCancelled(true);
        }
    }
}