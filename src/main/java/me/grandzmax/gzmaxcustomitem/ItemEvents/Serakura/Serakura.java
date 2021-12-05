package me.grandzmax.gzmaxcustomitem.ItemEvents.Serakura;

import me.grandzmax.gzmaxcustomitem.GzmaxCustomItem;
import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.UUID;

public class Serakura implements Listener {

        GzmaxCustomItem plugin;

        public Serakura(GzmaxCustomItem plugin) {
            this.plugin = plugin;
        }

        @EventHandler
        public void OnPlayerSkill(PlayerInteractEvent event) {
            Player player = event.getPlayer();
            if (event.getAction().equals(Action.RIGHT_CLICK_AIR)||event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                    if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null
                            && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Shadow Kill")
                            ) { //check if the player held item has the lore

                        if (SerakuraCooldown.checkCooldown(player)) { //checks if the player skill is on cooldown
                            int t = 0;

                            double attack = player.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).getValue();
                            double sharpness = player.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.DAMAGE_ALL);
                            double hasenchantment = 0;
                            if (sharpness >= 1){
                                hasenchantment = 1;
                            }
                            //checking the enchantment in the player weapon

                            AttributeModifier extradamage = new AttributeModifier(UUID.randomUUID(), "Serakura", attack + (sharpness * 0.5) + (hasenchantment * 0.5), AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
                            AttributeModifier extraaspd = new AttributeModifier(UUID.randomUUID(), "Serakura", 20, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

                            ItemStack item1 = player.getInventory().getItemInMainHand();
                            ItemMeta meta1 = item1.getItemMeta();
                            meta1.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, extraaspd);
                            meta1.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, extradamage);
                            item1.setItemMeta(meta1);
                            ItemStack item2 = player.getInventory().getItemInMainHand();

                            //buffing the player item for skill duration
                            for (Entity target : player.getNearbyEntities(5, 5, 5)) {
                                if (target instanceof EnderDragonPart){
                                    t = 1; //if no enemy nearby don't cast skill
                                }

                                else if ((target instanceof LivingEntity) && !(target instanceof Villager)){
                                    t = 1; //if no enemy nearby don't cast skill
                                }

                                else if (target.isEmpty()){
                                    t = 0;
                                }
                            }

                            if (t == 0){
                                player.sendMessage(ChatColor.YELLOW + "There is no enemy nearby"); //if no enemy nearby don't cast skill
                            }

                            else {
                                new BukkitRunnable() {
                                    int ti = 0;

                                    public void run() {
                                        ti++; //tick integer to count slashes done

                                        player.setInvulnerable(true);

                                        ArrayList<Entity> potentialtarget = (ArrayList<Entity>) player.getNearbyEntities(5, 5, 5);
                                        if (potentialtarget.isEmpty()){
                                            ItemMeta correction = item2.getItemMeta();
                                            correction.removeAttributeModifier(Attribute.GENERIC_ATTACK_SPEED);
                                            correction.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
                                            item2.setItemMeta(correction);
                                            player.setInvulnerable(false);
                                            cancel(); //if no more enemies nearby, stop the skill
                                        }

                                        double lowestDistanceSoFar = Double.MAX_VALUE;
                                        Entity closestEntity = null;

                                        for (Entity entity : potentialtarget) {
                                            double distance = entity.getLocation().distance(player.getLocation());
                                            if (distance < lowestDistanceSoFar) {
                                                if ((entity instanceof LivingEntity) && !(entity instanceof Villager) || entity instanceof EnderDragonPart){
                                                    lowestDistanceSoFar = distance;
                                                    closestEntity = entity; //check the closest entity from the player
                                                }
                                            }

                                            if (closestEntity != null) {
                                                double newX;
                                                double newZ;
                                                double randomangle = (Math.random()*360);
                                                float nang = (float) (closestEntity.getLocation().getYaw() + randomangle);

                                                if(nang < 0) nang += 360;

                                                newX = Math.cos(Math.toRadians(nang));
                                                newZ = Math.sin(Math.toRadians(nang));

                                            /*Location newDamagerLoc = new Location(closestEntity.getWorld(), closestEntity.getLocation().getX() - newX,
                                                    closestEntity.getLocation().getY(), closestEntity.getLocation().getZ() - newZ, closestEntity.getLocation().getYaw(), closestEntity.getLocation().getPitch());*/

                                                Location newDamagerLoc = new Location(closestEntity.getWorld(), closestEntity.getLocation().getX() - newX,
                                                        closestEntity.getLocation().getY(), closestEntity.getLocation().getZ() - newZ, closestEntity.getLocation().getYaw(), closestEntity.getLocation().getPitch());

                                                float yaw = (float) Math.toDegrees(Math.atan2(
                                                        closestEntity.getLocation().getZ()- newDamagerLoc.getZ(),  closestEntity.getLocation().getX() - newDamagerLoc.getX())) - 90;

                                                Location newDamagerLocFacingMob = new Location(closestEntity.getWorld(), closestEntity.getLocation().getX() - newX,
                                                        closestEntity.getLocation().getY(), closestEntity.getLocation().getZ() - newZ, yaw, closestEntity.getLocation().getPitch());

                                                //rotate player so they are facing the enemy

                                                player.teleport(newDamagerLocFacingMob);
                                                player.getLocation().getWorld().playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 5, 5);
                                                player.getLocation().getWorld().spawnParticle(Particle.REDSTONE, player.getLocation(), 25, new Particle.DustOptions(Color.PURPLE, 3.6f));
                                                player.getLocation().getWorld().spawnParticle(Particle.REDSTONE, player.getLocation(), 25, new Particle.DustOptions(Color.RED, 3.6f));
                                                player.attack(closestEntity); //
                                                //actual skill attack event
                                            }
                                        }

                                        if (player.getInventory().getItemInMainHand().getType().equals(Material.AIR)  || player.getInventory().getItemInMainHand().getItemMeta() == null || player.getInventory().getItemInMainHand().getItemMeta().getLore() == null || !(player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Shadow Kill"))
                                        ){
                                            ItemMeta correction = item2.getItemMeta();
                                            correction.removeAttributeModifier(Attribute.GENERIC_ATTACK_SPEED);
                                            correction.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
                                            item2.setItemMeta(correction);
                                            player.setInvulnerable(false);
                                            cancel(); //cancel skill if player is not holding the right item
                                        }

                                        if (ti > 9){
                                            ItemMeta correction = item2.getItemMeta();
                                            correction.removeAttributeModifier(Attribute.GENERIC_ATTACK_SPEED);
                                            correction.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
                                            item2.setItemMeta(correction);
                                            player.setInvulnerable(false);
                                            cancel(); //cancel the skill after 9 slashes
                                        }
                                    }
                                }.runTaskTimer(plugin, 0, 5); //loop every 5 ticks
                                SerakuraCooldown.setCooldown(player, t * 18); //set the cooldown of skill for player
                            }

                            Bukkit.getServer().getScheduler().runTaskLater(plugin, () -> {
                                if (player.getInventory().contains(item2)){
                                    ItemStack item3 = player.getInventory().getItem(player.getInventory().getHeldItemSlot());
                                    ItemMeta correction = item3.getItemMeta();
                                    correction.removeAttributeModifier(Attribute.GENERIC_ATTACK_SPEED);
                                    correction.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
                                    item3.setItemMeta(correction); // after 9 slashes remove modifier
                                }
                                ItemMeta correction = item2.getItemMeta();
                                correction.removeAttributeModifier(Attribute.GENERIC_ATTACK_SPEED);
                                correction.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
                                item2.setItemMeta(correction); // after 9 slashes remove modifier
                            }, 45); //extra clearing step to ensure that the buff is not permanent on the item
                        }

                        else {
                            double timeleft = ((SerakuraCooldown.cooldowns.get(player.getUniqueId()) - System.currentTimeMillis()) / 1000);
                            player.sendMessage(ChatColor.YELLOW + "Item Ability: Shadow Kill is in cooldown for " + timeleft + " seconds");
                            //tell player if ability is still in cooldown
                        }
                    }
            }
        }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player) {
            Player player = (Player) e.getDamager();
            if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null
                    && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§6Item Ability: Shadow Kill")){
                if (e.getEntity() instanceof LivingEntity) {
                    Bukkit.getScheduler().runTaskLaterAsynchronously(plugin, () -> {
                        ((LivingEntity) e.getEntity()).setNoDamageTicks(0); // after 100ms you will set the no damage ticks to 0 so arrows can hurt again
                    }, 2L);
                }
            }
        }
    }
}

