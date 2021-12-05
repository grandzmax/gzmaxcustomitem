package me.grandzmax.gzmaxcustomitem.ItemEvents.Serakura;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class SerakuraCooldown {
    public static HashMap<UUID, Double> cooldowns;

    public static void setupCooldown() {
        cooldowns = new HashMap<>();
    }

    public static void setCooldown(Player player, double seconds) {
        double delay = (double)(System.currentTimeMillis() + (seconds * 1000));
        cooldowns.put(player.getUniqueId(), delay);
    }

    public static boolean checkCooldown(Player player) {
        if (cooldowns == null){
            return true;
        }

        else if(!cooldowns.containsKey(player.getUniqueId()) || cooldowns.get(player.getUniqueId()) <= System.currentTimeMillis()){
            return true;
        }

        return false;
    }
}
