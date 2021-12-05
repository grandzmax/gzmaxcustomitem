package me.grandzmax.gzmaxcustomitem;

import me.grandzmax.gzmaxcustomitem.ItemEvents.*;
import me.grandzmax.gzmaxcustomitem.ItemEvents.ChargingBlade.ChargingBlade;
import me.grandzmax.gzmaxcustomitem.ItemEvents.ChargingBlade.ChargingBladeCooldown;
import me.grandzmax.gzmaxcustomitem.ItemEvents.Serakura.Serakura;
import me.grandzmax.gzmaxcustomitem.ItemEvents.Serakura.SerakuraCooldown;
import me.grandzmax.gzmaxcustomitem.ItemEvents.Windtalker.Windtalker;
import me.grandzmax.gzmaxcustomitem.ItemEvents.Windtalker.WindtalkerHitCount;
import org.bukkit.plugin.java.JavaPlugin;

public final class GzmaxCustomItem extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        me.grandzmax.gzmaxcustomitem.ItemManager.init();

        this.getCommand("givetripleshotbow").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givezombieslayeraxe").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("giveskeletonslayeraxe").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givespiderslayeraxe").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("giveendermanslayeraxe").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givedragonslayeraxe").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givewitherslayeraxe").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("giveguardianslayeraxe").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givepiglinslayeraxe").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givecubeslayeraxe").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givevindicatorslayeraxe").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givegiantslayeraxe").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givezombieslayerbow").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("giveskeletonslayerbow").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givespiderslayerbow").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("giveendermanslayerbow").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givedragonslayerbow").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givewitherslayerbow").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("giveguardianslayerbow").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givepiglinslayerbow").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givecubeslayerbow").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givevindicatorslayerbow").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givegiantslayerbow").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givethrowingaxe").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("giveinfinitewater").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("giveinfinitelava").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givechargingblade").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("giveserakura").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());
        this.getCommand("givewindtalker").setExecutor(new me.grandzmax.gzmaxcustomitem.Commands());


        this.getServer().getPluginManager().registerEvents(new TripleShotBow(this), this);
        this.getServer().getPluginManager().registerEvents(new Slayer(this), this);
        this.getServer().getPluginManager().registerEvents(new ThrowingAxe(this), this);
        this.getServer().getPluginManager().registerEvents(new EndermanBow(this), this);
        this.getServer().getPluginManager().registerEvents(new InfiniteBuckets(this), this);
        this.getServer().getPluginManager().registerEvents(new ChargingBlade(this), this);
        this.getServer().getPluginManager().registerEvents(new Serakura(this), this);
        this.getServer().getPluginManager().registerEvents(new Windtalker(this), this);

        ChargingBladeCooldown.setupCooldown();
        SerakuraCooldown.setupCooldown();
        WindtalkerHitCount.setupHitCount();
    }


    @Override
    public void onDisable () {
        // Plugin shutdown logic
    }

}
