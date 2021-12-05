package me.grandzmax.gzmaxcustomitem;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player)sender;
            if (player.hasPermission("op")) {
                if(cmd.getName().equalsIgnoreCase("givetripleshotbow")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.TripleShotBow);
                }

                if(cmd.getName().equalsIgnoreCase("givedragonslayeraxe")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.DragonSlayerAxe);
                }

                if(cmd.getName().equalsIgnoreCase("givewitherslayeraxe")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.WitherSlayerAxe);
                }

                if(cmd.getName().equalsIgnoreCase("givezombieslayeraxe")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.ZombieSlayerAxe);
                }

                if(cmd.getName().equalsIgnoreCase("giveskeletonslayeraxe")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.SkeletonSlayerAxe);
                }

                if(cmd.getName().equalsIgnoreCase("givespiderslayeraxe")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.SpiderSlayerAxe);
                }

                if(cmd.getName().equalsIgnoreCase("giveendermanslayeraxe")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.EndermanSlayerAxe);
                }

                if(cmd.getName().equalsIgnoreCase("givecubeslayeraxe")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.CubeSlayerAxe);
                }

                if(cmd.getName().equalsIgnoreCase("givegiantslayeraxe")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.GiantSlayerAxe);
                }

                if(cmd.getName().equalsIgnoreCase("giveguardianslayeraxe")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.GuardianSlayerAxe);
                }

                if(cmd.getName().equalsIgnoreCase("givevindicatorslayeraxe")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.VindicatorSlayerAxe);
                }

                if(cmd.getName().equalsIgnoreCase("givecubeslayeraxe")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.PiglinSlayerAxe);
                }

                if(cmd.getName().equalsIgnoreCase("givedragonslayerbow")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.DragonSlayerBow);
                }

                if(cmd.getName().equalsIgnoreCase("givewitherslayerbow")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.WitherSlayerBow);
                }

                if(cmd.getName().equalsIgnoreCase("givezombieslayerbow")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.ZombieSlayerBow);
                }

                if(cmd.getName().equalsIgnoreCase("giveskeletonslayerbow")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.SkeletonSlayerBow);
                }

                if(cmd.getName().equalsIgnoreCase("givespiderslayerbow")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.SpiderSlayerBow);
                }

                if(cmd.getName().equalsIgnoreCase("giveendermanslayerbow")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.EndermanSlayerBow);
                }

                if(cmd.getName().equalsIgnoreCase("givecubeslayerbow")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.CubeSlayerBow);
                }

                if(cmd.getName().equalsIgnoreCase("givegiantslayerbow")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.GiantSlayerBow);
                }

                if(cmd.getName().equalsIgnoreCase("giveguardianslayerbow")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.GuardianSlayerBow);
                }

                if(cmd.getName().equalsIgnoreCase("givevindicatorslayerbow")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.VindicatorSlayerBow);
                }

                if(cmd.getName().equalsIgnoreCase("givecubeslayerbow")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.PiglinSlayerBow);
                }

                if(cmd.getName().equalsIgnoreCase("givethrowingaxe")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.ThrowingAxe);
                }

                if(cmd.getName().equalsIgnoreCase("giveinfinitewater")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.InfiniteWaterBucket);
                }

                if(cmd.getName().equalsIgnoreCase("giveinfinitelava")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.InfiniteLavaBucket);
                }

                if(cmd.getName().equalsIgnoreCase("givechargingblade")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.ChargingBlade);
                }

                if(cmd.getName().equalsIgnoreCase("giveserakura")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.Serakura);
                }

                if(cmd.getName().equalsIgnoreCase("givewindtalker")){
                    player.getInventory().addItem(me.grandzmax.gzmaxcustomitem.ItemManager.Windtalker);
                }

            }
            else {
                sender.sendMessage("You are not allowed to use this command");
            }
            return true;
        }
        else {
            sender.sendMessage("Only players can use that command");
            return true;
        }
    }
}
