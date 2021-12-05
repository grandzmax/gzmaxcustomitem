package me.grandzmax.gzmaxcustomitem.ItemEvents;

import me.grandzmax.gzmaxcustomitem.GzmaxCustomItem;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

import java.util.Random;

import static java.lang.Math.sqrt;

public class EndermanBow implements Listener {

    GzmaxCustomItem plugin;

    public EndermanBow(GzmaxCustomItem plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onShootEnderman(ProjectileHitEvent event){
        if (event.getHitEntity() instanceof Enderman){

            if (event.getEntity() instanceof Arrow){
                Arrow arrow = (Arrow)event.getEntity();

                if (arrow.getShooter() instanceof Player){
                    Player player = (Player)arrow.getShooter();

                        if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null
                                && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Special Arrow")){
                            event.setCancelled(true);
                            Entity entity = event.getHitEntity();
                            double damage = arrow.getDamage();
                            double damagefromvelocity = sqrt((arrow.getVelocity().getX() * arrow.getVelocity().getX()
                                    + arrow.getVelocity().getY() * arrow.getVelocity().getY()
                                    + arrow.getVelocity().getZ() * arrow.getVelocity().getZ()));
                            double finaldamage = damage * damagefromvelocity;

                            if (arrow.isCritical()){
                                Random r = new Random();
                                int low = (int) damage;
                                int high = (int) (3 * damage / 2) + 2;
                                finaldamage = finaldamage + r.nextInt(high-low) + low;
                            }

                            ((LivingEntity) entity).damage(finaldamage, player);

                            ((LivingEntity) entity).setArrowsInBody(((LivingEntity) entity).getArrowsInBody() + 1);
                        }
                    }
                }
            }
        }
    }