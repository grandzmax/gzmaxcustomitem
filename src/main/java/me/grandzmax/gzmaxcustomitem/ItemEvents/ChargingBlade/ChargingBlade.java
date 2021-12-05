package me.grandzmax.gzmaxcustomitem.ItemEvents.ChargingBlade;

import me.grandzmax.gzmaxcustomitem.GzmaxCustomItem;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.util.UUID;

public class ChargingBlade implements Listener{

    GzmaxCustomItem plugin;

    public ChargingBlade(GzmaxCustomItem plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void OnPlayerSneak(PlayerToggleSneakEvent event) {
        Player player = event.getPlayer();
        if (event.isSneaking()) {
            if (player.isBlocking()) {
                if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null
                        && player.getInventory().getItemInOffHand().getType() != null
                        && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Charge")
                        && player.getInventory().getItemInOffHand().getType().equals(Material.SHIELD)) {

                    if (ChargingBladeCooldown.checkCooldown(player)) {
                        AttributeModifier baseaspd = new AttributeModifier(UUID.randomUUID(), "Serakura", 20, AttributeModifier.Operation.ADD_NUMBER);
                        player.getAttribute(Attribute.GENERIC_ATTACK_SPEED).addModifier(baseaspd);
                        player.getLocation().getWorld().playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 5, 5);

                        Location l1 = player.getLocation();
                        Vector destination = new Vector(player.getLocation().getX() + 8 * player.getLocation().getDirection().getX(),
                                player.getLocation().getY() + 8 * player.getLocation().getDirection().getY(),
                                player.getLocation().getZ() + 8 * player.getLocation().getDirection().getZ());

                        double n;
                        if (((destination.getY() - l1.getY()) / 6) > 2.0) {
                            n = 2.0;
                        } else {
                            n = ((destination.getY() - l1.getY()) / 6);
                        }

                        Vector v = new Vector((destination.getX() - l1.getX()) / 3, n / 2, (destination.getZ() - l1.getZ()) / 3);
                        Vector v1 = new Vector((destination.getX() - l1.getX()) / 7, 0, (destination.getZ() - l1.getZ()) / 6.5);

                        player.setVelocity(v);
                        player.getLocation().getWorld().playSound(player.getLocation(), Sound.ITEM_SHIELD_BLOCK, 5, 5);
                        player.getLocation().getWorld().playSound(player.getLocation(), Sound.ITEM_SHIELD_BREAK, 5, 5);

                        new BukkitRunnable() {
                            int ti = 0;

                            public void run() {
                                ti++;
                                for (Entity target : player.getNearbyEntities(1.5 * player.getLocation().getDirection().getX(), 3, 1.5 * player.getLocation().getDirection().getZ())) {
                                    if (target instanceof LivingEntity) {
                                        player.attack(target);
                                        target.setVelocity(v1);
                                        target.setFreezeTicks(30);
                                        ((LivingEntity) target).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 30, 8));
                                        ((LivingEntity) target).addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 30, 8));
                                        ((LivingEntity) target).addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 30, 8));
                                        ((LivingEntity) target).setCollidable(false);
                                    }

                                    if (target instanceof LivingEntity && ti > 8)
                                        ((LivingEntity) target).setCollidable(true);
                                }

                                if (ti > 8)
                                    cancel();
                            }
                        }.runTaskTimer(plugin, 0, 1);
                        ChargingBladeCooldown.setCooldown(player, 3.5);
                        player.getAttribute(Attribute.GENERIC_ATTACK_SPEED).removeModifier(baseaspd);
                    }

                    else {
                        double timeleft = ((ChargingBladeCooldown.cooldowns.get(player.getUniqueId()) - System.currentTimeMillis()) / 1000);
                        player.sendMessage(ChatColor.YELLOW + "Item Ability: Charge is in cooldown for " + timeleft + " seconds");
                    }
                }
            }
        }
    }
}


