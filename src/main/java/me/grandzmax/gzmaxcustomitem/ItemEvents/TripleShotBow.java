package me.grandzmax.gzmaxcustomitem.ItemEvents;

import me.grandzmax.gzmaxcustomitem.GzmaxCustomItem;
import org.bukkit.entity.AbstractArrow;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class TripleShotBow implements Listener {

    GzmaxCustomItem plugin;

    public TripleShotBow(GzmaxCustomItem plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onShoot(EntityShootBowEvent event){
        if(event.getProjectile() instanceof Arrow){
            if(event.getEntity() instanceof Player){
                if(event.getBow() != null && event.getBow().getItemMeta() != null && event.getBow().getItemMeta().getLore() != null
                        && event.getBow().getItemMeta().getLore().contains("§6Item Ability: Triple Shot")){

                    Arrow arrow = (Arrow) event.getProjectile();

                    new BukkitRunnable() {
                        int ti = 0;

                        public void run() {
                            if (ti++ > 1) {
                                cancel();
                                return;
                            }

                        Arrow arrow1 = event.getEntity().getWorld().spawn(event.getEntity().getEyeLocation(), Arrow.class);
                        arrow1.setDamage(arrow.getDamage()/1.7);
                        arrow1.setKnockbackStrength(arrow.getKnockbackStrength());
                        arrow1.setShooter(event.getEntity());
                        arrow1.setVelocity(arrow.getVelocity());
                        arrow1.setPickupStatus(AbstractArrow.PickupStatus.DISALLOWED);
                        arrow1.setBounce(false);
                        }
                    }.runTaskTimer(plugin, 0, 2);
                }
            }
        }
    }
}
