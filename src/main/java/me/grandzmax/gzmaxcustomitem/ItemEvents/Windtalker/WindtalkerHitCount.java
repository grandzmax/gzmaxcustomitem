package me.grandzmax.gzmaxcustomitem.ItemEvents.Windtalker;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class WindtalkerHitCount {
    public static HashMap<UUID, Integer> hitcount;

    public static void setupHitCount() {
        hitcount = new HashMap<>();
    }

    public static void setHitCount(Player player, int count) {
        hitcount.put(player.getUniqueId(), count);
    }

    public static boolean checkHitCount(Player player) {
        if (hitcount == null || !(hitcount.containsKey(player.getUniqueId()))){
            return false;
        }

        else if(hitcount.containsKey(player.getUniqueId()) && hitcount.get(player.getUniqueId()) >= 4){
            return true;
        }

        return false;
    }
}
