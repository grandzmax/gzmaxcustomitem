package me.grandzmax.gzmaxcustomitem.ItemEvents;

import me.grandzmax.gzmaxcustomitem.GzmaxCustomItem;
import org.bukkit.entity.*;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;


public class Slayer implements Listener {

    GzmaxCustomItem plugin;

    public Slayer(GzmaxCustomItem plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            Player player = (Player) event.getDamager();

            if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null
                    ) {

                if (event.getEntity() instanceof EnderDragon) {
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Dragon Slayer")) {
                        event.setDamage(event.getDamage() * 2.25);
                    }
                }

                if (event.getEntity() instanceof Wither || event.getEntity() instanceof WitherSkeleton) {
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Wither Slayer")) {
                        event.setDamage(event.getDamage() * 2.25);
                    }
                }

                if (event.getEntity() instanceof Skeleton) {
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Skeleton Slayer")) {
                        event.setDamage(event.getDamage() * 2.25);
                    }
                }

                if (event.getEntity() instanceof Zombie) {
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Zombie Slayer")) {
                        event.setDamage(event.getDamage() * 2.25);
                    }
                }

                if (event.getEntity() instanceof Enderman) {
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Enderman Slayer")) {
                        event.setDamage(event.getDamage() * 2.25);
                    }
                }

                if (event.getEntity() instanceof Spider) {
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Spider Slayer")) {
                        event.setDamage(event.getDamage() * 2.25);
                    }
                }

                if (event.getEntity() instanceof Slime) {
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Cube Slayer")) {
                        event.setDamage(event.getDamage() * 2.25);
                    }
                }

                if (event.getEntity() instanceof Guardian || event.getEntity() instanceof ElderGuardian) {
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Guardian Slayer")) {
                        event.setDamage(event.getDamage() * 2.25);
                    }
                }

                if (event.getEntity() instanceof Piglin || event.getEntity() instanceof Hoglin || event.getEntity() instanceof PigZombie) {
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Piglin Slayer")) {
                        event.setDamage(event.getDamage() * 2.25);
                    }
                }

                if (event.getEntity() instanceof Giant) {
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Giant Slayer")) {
                        event.setDamage(event.getDamage() * 2.25);
                    }
                }

                if (event.getEntity() instanceof Raider) {
                    if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Village Protector")) {
                        event.setDamage(event.getDamage() * 2.25);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onDamagebyArrow(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Arrow) {
            Arrow arrow = (Arrow) event.getDamager();
            if (arrow.getShooter() instanceof Player) {
                Player player = (Player) arrow.getShooter();

                if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null) {

                    if (event.getEntity() instanceof EnderDragon) {
                        if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Dragon Slayer")) {
                            event.setDamage(event.getDamage() * 2.25);
                        }
                    }

                    if (event.getEntity() instanceof Wither || event.getEntity() instanceof WitherSkeleton) {
                        if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Wither Slayer")) {
                            event.setDamage(event.getDamage() * 2.25);
                        }
                    }

                    if (event.getEntity() instanceof Skeleton) {
                        if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Skeleton Slayer")) {
                            event.setDamage(event.getDamage() * 2.25);
                        }
                    }

                    if (event.getEntity() instanceof Zombie) {
                        if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Zombie Slayer")) {
                            event.setDamage(event.getDamage() * 2.25);
                        }
                    }

                    if (event.getEntity() instanceof Enderman) {
                        if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Enderman Slayer")) {
                            event.setDamage(event.getDamage() * 2.25);
                        }
                    }

                    if (event.getEntity() instanceof Spider) {
                        if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Spider Slayer")) {
                            event.setDamage(event.getDamage() * 2.25);
                        }
                    }

                    if (event.getEntity() instanceof Slime) {
                        if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Cube Slayer")) {
                            event.setDamage(event.getDamage() * 2.25);
                        }
                    }

                    if (event.getEntity() instanceof Guardian || event.getEntity() instanceof ElderGuardian) {
                        if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Guardian Slayer")) {
                            event.setDamage(event.getDamage() * 2.25);
                        }
                    }

                    if (event.getEntity() instanceof Piglin || event.getEntity() instanceof Hoglin || event.getEntity() instanceof PigZombie) {
                        if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Piglin Slayer")) {
                            event.setDamage(event.getDamage() * 2.25);
                        }
                    }

                    if (event.getEntity() instanceof Giant) {
                        if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Giant Slayer")) {
                            event.setDamage(event.getDamage() * 2.25);
                        }
                    }

                    if (event.getEntity() instanceof Raider) {
                        if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Village Protector")) {
                            event.setDamage(event.getDamage() * 2.25);
                        }
                    }
                }
            }
        }
    }
}