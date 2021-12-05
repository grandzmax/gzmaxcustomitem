package me.grandzmax.gzmaxcustomitem.ItemEvents.Windtalker;

import me.grandzmax.gzmaxcustomitem.GzmaxCustomItem;
import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Windtalker implements Listener {

    GzmaxCustomItem plugin;

    public Windtalker(GzmaxCustomItem plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onHitEvent(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            Player player = (Player) event.getDamager();

            if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null
                    && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Arc Lightning")
            ) {

                ItemStack item = player.getInventory().getItemInMainHand();
                ItemMeta meta = item.getItemMeta();

                if (WindtalkerHitCount.checkHitCount(player)) {
                    List<String> lore = item.getItemMeta().getLore();
                    lore.remove("§6Item Ability: Arc Lightning");
                    lore.remove("§dEvery 5 hits will trigger volatile lightning ");
                    lore.remove("§dwhich deals 30 damage to nearby enemies");
                    lore.remove("");
                    lore.remove("§cItem Passive: Critical Strike");
                    lore.remove("§6Attacks from this item has 20% chance");
                    lore.remove("§6to deal 160% damage");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    player.getLocation().getWorld().playSound(player.getLocation(), Sound.BLOCK_GLASS_BREAK, 5, 5);

                    for (Entity target : player.getNearbyEntities(6, 6, 6)) {
                        if (target instanceof EnderDragonPart || (target instanceof LivingEntity && !(target instanceof Villager) && !(target instanceof Player))) {
                            target.getLocation().getWorld().playSound(target.getLocation(), Sound.BLOCK_GLASS_BREAK, 5, 5);
                            target.getLocation().getWorld().playSound(target.getLocation(), Sound.ENTITY_PLAYER_ATTACK_CRIT, 5, 5);
                            target.getLocation().getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, target.getLocation(), 3);
                            target.getLocation().getWorld().strikeLightningEffect(target.getLocation());
                            ((LivingEntity) target).damage(30, player);
                        }
                    }

                    if (item.getItemMeta().getLore()!= null){
                        List<String> lore1 = player.getInventory().getItemInMainHand().getItemMeta().getLore();
                        lore1.add("§6Item Ability: Arc Lightning");
                        lore1.add("§dEvery 5 hits will trigger volatile lightning ");
                        lore1.add("§dwhich deals 30 damage to nearby enemies");
                        lore1.add("");
                        lore1.add("§cItem Passive: Critical Strike");
                        lore1.add("§6Attacks from this item has 20% chance");
                        lore1.add("§6to deal 160% damage");
                        ItemMeta meta1 = player.getInventory().getItemInMainHand().getItemMeta();
                        meta1.setLore(lore1);
                        player.getInventory().getItemInMainHand().setItemMeta(meta1);
                    }

                    else {
                        ItemMeta meta2 = item.getItemMeta();
                        List<String> lore2 = new ArrayList<>();
                        lore2.add("§6Item Ability: Arc Lightning");
                        lore2.add("§dEvery 5 hits will trigger volatile lightning ");
                        lore2.add("§dwhich deals 30 damage to nearby enemies");
                        lore2.add("");
                        lore2.add("§cItem Passive: Critical Strike");
                        lore2.add("§6Attacks from this item has 20% chance");
                        lore2.add("§6to deal 160% damage");
                        meta2.setLore(lore2);
                        item.setItemMeta(meta2);
                    }
                    WindtalkerHitCount.setHitCount(player, 0);
                }

                else {
                    if (!(WindtalkerHitCount.hitcount.containsKey(player.getUniqueId()))){
                        WindtalkerHitCount.setHitCount(player, 1);
                    }

                    else if (WindtalkerHitCount.hitcount.containsKey(player.getUniqueId())){
                        WindtalkerHitCount.setHitCount(player, WindtalkerHitCount.hitcount.get(player.getUniqueId()) + 1);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onCrit(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            Player player = (Player) event.getDamager();

            if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null
                    && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§cItem Passive: Critical Strike")
            ) {
                Random rand = new Random();
                int rng = rand.nextInt(5) + 1;
                player.getLocation().getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_CRIT, 5, 5);
                event.getEntity().getLocation().getWorld().spawnParticle(Particle.CRIT, event.getEntity().getLocation(), 15);
                if (rng == 1) {
                    event.setDamage(event.getDamage() * 1.6);
                }
            }
        }
    }
}