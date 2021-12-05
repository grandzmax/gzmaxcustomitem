package me.grandzmax.gzmaxcustomitem;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ItemManager {

    public static ItemStack TripleShotBow;
    public static ItemStack DragonSlayerAxe;
    public static ItemStack DragonSlayerBow;
    public static ItemStack ZombieSlayerAxe;
    public static ItemStack ZombieSlayerBow;
    public static ItemStack SkeletonSlayerAxe;
    public static ItemStack SkeletonSlayerBow;
    public static ItemStack SpiderSlayerAxe;
    public static ItemStack SpiderSlayerBow;
    public static ItemStack EndermanSlayerAxe;
    public static ItemStack EndermanSlayerBow;
    public static ItemStack WitherSlayerAxe;
    public static ItemStack WitherSlayerBow;
    public static ItemStack VindicatorSlayerAxe;
    public static ItemStack VindicatorSlayerBow;
    public static ItemStack GuardianSlayerAxe;
    public static ItemStack GuardianSlayerBow;
    public static ItemStack CubeSlayerAxe;
    public static ItemStack CubeSlayerBow;
    public static ItemStack GiantSlayerAxe;
    public static ItemStack GiantSlayerBow;
    public static ItemStack PiglinSlayerAxe;
    public static ItemStack PiglinSlayerBow;
    public static ItemStack ThrowingAxe;
    public static ItemStack ThrowingAxeTear;
    public static ItemStack InfiniteWaterBucket;
    public static ItemStack InfiniteLavaBucket;
    public static ItemStack ChargingBlade;
    public static ItemStack Serakura;
    public static ItemStack Windtalker;

    public static void init() {
        createTripleShotBow();
        createDragonSlayerAxe();
        createWitherSlayerAxe();
        createZombieSlayerAxe();
        createSkeletonSlayerAxe();
        createSpiderSlayerAxe();
        createEndermanSlayerAxe();
        createGuardianSlayerAxe();
        createPiglinSlayerAxe();
        createCubeSlayerAxe();
        createGiantSlayerAxe();
        createVindicatorSlayerAxe();
        createDragonSlayerBow();
        createWitherSlayerBow();
        createZombieSlayerBow();
        createSkeletonSlayerBow();
        createSpiderSlayerBow();
        createEndermanSlayerBow();
        createGuardianSlayerBow();
        createPiglinSlayerBow();
        createCubeSlayerBow();
        createGiantSlayerBow();
        createVindicatorSlayerBow();
        createThrowingAxe();
        createThrowingAxeTear();
        createInfiniteWaterBucket();
        createInfiniteLavaBucket();
        createChargingBlade();
        createSerakura();
        createWindtalker();
    }

    private static void createTripleShotBow(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lPhantasm");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Triple Shot");
        lore.add("§dShoots two additional arrows with 50% damage");
        lore.add("§dOnly consumes 1 arrow");
        meta.setLore(lore);
        item.setItemMeta(meta);
        TripleShotBow = item;
    }

    private static void createDragonSlayerAxe(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lDragon Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Dragon Slayer");
        lore.add("§dDeal 2.25x damage to dragons");
        meta.setLore(lore);
        item.setItemMeta(meta);
        DragonSlayerAxe = item;
    }

    private static void createZombieSlayerAxe(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lZombie Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Zombie Slayer");
        lore.add("§dDeal 2.25x damage to zombies");
        meta.setLore(lore);
        item.setItemMeta(meta);
        ZombieSlayerAxe = item;
    }

    private static void createSkeletonSlayerAxe(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lSkeleton Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Skeleton Slayer");
        lore.add("§dDeal 2.25x damage to skeletons");
        meta.setLore(lore);
        item.setItemMeta(meta);
        SkeletonSlayerAxe = item;
    }

    private static void createSpiderSlayerAxe(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lSpider Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Spider Slayer");
        lore.add("§dDeal 2.25x damage to spiders");
        meta.setLore(lore);
        item.setItemMeta(meta);
        SpiderSlayerAxe = item;
    }

    private static void createEndermanSlayerAxe(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lEnderman Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Enderman Slayer");
        lore.add("§dDeal 2.25x damage to endermen");
        meta.setLore(lore);
        item.setItemMeta(meta);
        EndermanSlayerAxe = item;
    }

    private static void createWitherSlayerAxe(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lWither Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Wither Slayer");
        lore.add("§dDeal 2.25x damage to withers");
        meta.setLore(lore);
        item.setItemMeta(meta);
        WitherSlayerAxe = item;
    }

    private static void createVindicatorSlayerAxe(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lVillage Protector");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Village Protector");
        lore.add("§dDeal 2.25x damage to raiders");
        meta.setLore(lore);
        item.setItemMeta(meta);
        VindicatorSlayerAxe = item;
    }

    private static void createGuardianSlayerAxe(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lGuardian Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Guardian Slayer");
        lore.add("§dDeal 2.25x damage to guardians");
        meta.setLore(lore);
        item.setItemMeta(meta);
        GuardianSlayerAxe = item;
    }

    private static void createCubeSlayerAxe(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lCube Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Cube Slayer");
        lore.add("§dDeal 2.25x damage to slimes and magma cubes");
        meta.setLore(lore);
        item.setItemMeta(meta);
        CubeSlayerAxe = item;
    }

    private static void createGiantSlayerAxe(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lGiant Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Giant Slayer");
        lore.add("§dDeal 2.25x damage to giants");
        meta.setLore(lore);
        item.setItemMeta(meta);
        GiantSlayerAxe = item;
    }

    private static void createPiglinSlayerAxe(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lPiglin Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Piglin Slayer");
        lore.add("§dDeal 2.25x damage to piglins");
        meta.setLore(lore);
        item.setItemMeta(meta);
        PiglinSlayerAxe = item;
    }

    private static void createDragonSlayerBow(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lDragon Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Dragon Slayer");
        lore.add("§dDeal 2.25x damage to dragons");
        meta.setLore(lore);
        item.setItemMeta(meta);
        DragonSlayerBow = item;
    }

    private static void createZombieSlayerBow(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lZombie Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Zombie Slayer");
        lore.add("§dDeal 2.25x damage to zombies");
        meta.setLore(lore);
        item.setItemMeta(meta);
        ZombieSlayerBow = item;
    }

    private static void createSkeletonSlayerBow(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lSkeleton Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Skeleton Slayer");
        lore.add("§dDeal 2.25x damage to skeletons");
        meta.setLore(lore);
        item.setItemMeta(meta);
        SkeletonSlayerBow = item;
    }

    private static void createSpiderSlayerBow(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lSpider Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Spider Slayer");
        lore.add("§dDeal 2.25x damage to spiders");
        meta.setLore(lore);
        item.setItemMeta(meta);
        SpiderSlayerBow = item;
    }

    private static void createEndermanSlayerBow(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lEnderman Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Enderman Slayer");
        lore.add("§dDeal 2.25x damage to endermen");
        lore.add("");
        lore.add("§6Item Ability: Special Arrow");
        lore.add("§dArrows from this bow can hit endermen");
        meta.setLore(lore);
        item.setItemMeta(meta);
        EndermanSlayerBow = item;
    }

    private static void createWitherSlayerBow(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lWither Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Wither Slayer");
        lore.add("§dDeal 2.25x damage to withers");
        meta.setLore(lore);
        item.setItemMeta(meta);
        WitherSlayerBow = item;
    }

    private static void createVindicatorSlayerBow(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lVillage Protector");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Village Protector");
        lore.add("§dDeal 2.25x damage to raiders");
        meta.setLore(lore);
        item.setItemMeta(meta);
        VindicatorSlayerBow = item;
    }

    private static void createGuardianSlayerBow(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lGuardian Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Guardian Slayer");
        lore.add("§dDeal 2.25x damage to guardians");
        meta.setLore(lore);
        item.setItemMeta(meta);
        GuardianSlayerBow = item;
    }

    private static void createCubeSlayerBow(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lCube Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Cube Slayer");
        lore.add("§dDeal 2.25x damage to slimes and magma cubes");
        meta.setLore(lore);
        item.setItemMeta(meta);
        CubeSlayerBow = item;
    }

    private static void createGiantSlayerBow(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lGiant Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Giant Slayer");
        lore.add("§dDeal 2.25x damage to giants");
        meta.setLore(lore);
        item.setItemMeta(meta);
        GiantSlayerBow = item;
    }

    private static void createPiglinSlayerBow(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lPiglin Slayer");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Piglin Slayer");
        lore.add("§dDeal 2.25x damage to piglins");
        meta.setLore(lore);
        item.setItemMeta(meta);
        PiglinSlayerBow = item;
    }

    private static void createThrowingAxe(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Throwing Axe");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Throw §eRIGHT CLICK");
        lore.add("§7Throw your axe and deal damage as melee damage");
        meta.setLore(lore);
        item.setItemMeta(meta);
        ThrowingAxe = item;
    }

    private static void createThrowingAxeTear(){
        ItemStack item = new ItemStack(Material.GHAST_TEAR, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Throwing Axe");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Throw §eRIGHT CLICK");
        lore.add("§7Throw your axe and deal damage as melee damage");
        meta.setLore(lore);
        item.setItemMeta(meta);
        ThrowingAxeTear = item;
    }

    private static void createInfiniteWaterBucket(){
        ItemStack item = new ItemStack(Material.WATER_BUCKET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Infinite Water Bucket");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Infinite Water");
        lore.add("§dInfinite flow of water...");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        InfiniteWaterBucket = item;
    }

    private static void createInfiniteLavaBucket(){
        ItemStack item = new ItemStack(Material.LAVA_BUCKET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Infinite Lava Bucket");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Infinite Lava");
        lore.add("§dInfinite flow of lava...");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        InfiniteLavaBucket = item;
    }

    private static void createChargingBlade(){
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Charging Blade");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Charge");
        lore.add("§dWhile blocking, toggle sneak");
        lore.add("§dto charge and damage opponent with melee attack");
        lore.add("§dand stun them for 1.5s");
        lore.add("§d3.5 seconds cooldown");
        meta.setLore(lore);
        item.setItemMeta(meta);
        ChargingBlade = item;
    }

    private static void createSerakura(){
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Serakura");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Shadow Kill");
        lore.add("§dRight click to teleport and do");
        lore.add("§d9 slashes on your opponent");
        lore.add("§d18 seconds cooldown");
        meta.setLore(lore);
        item.setItemMeta(meta);
        Serakura = item;
    }

    private static void createWindtalker(){
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Windtalker");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Arc Lightning");
        lore.add("§dEvery 5 hits will trigger volatile lightning ");
        lore.add("§dwhich deals 30 damage to nearby enemies");
        lore.add("");
        lore.add("§cItem Passive: Critical Strike");
        lore.add("§6Attacks from this item has 20% chance");
        lore.add("§6to deal 160% damage");
        meta.setLore(lore);
        item.setItemMeta(meta);
        Windtalker = item;
    }

    private static void createBonemerang(){
        ItemStack item = new ItemStack(Material.BONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Bonemerang");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Swing");
        lore.add("§dRight click to throw the Bonemerang ");
        lore.add("§dwhich will pierce enemy as melee damage");
        meta.setLore(lore);
        item.setItemMeta(meta);
        Windtalker = item;
    }
}

