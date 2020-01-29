package me.b1vth420.strategawkaApi.Utils;

import org.bukkit.Material;

public class PolishItemNames
{
  public static String getPolishName(Material material)
  {
    return getPolishName(material, (short)0);
  }

  public static String getPolishName(Material material, short dur)
  {
    if (material == Material.AIR) {
      return "powietrze";
    }
    if (material == Material.STONE) {
      return "kamien";
    }
    if (material == Material.GRASS) {
      return "trawa";
    }
    if (material == Material.DIRT) {
      return "dirt";
    }
    if (material == Material.COBBLESTONE) {
      return "bruk";
    }
    if (material == Material.LEGACY_WOOD) {
      return "drewno";
    }
    if (material == Material.LEGACY_SAPLING) {
      return "sadzonka";
    }
    if (material == Material.BEDROCK) {
      return "skala macierzysta";
    }
    if (material == Material.WATER) {
      return "woda";
    }
    if (material == Material.LEGACY_STATIONARY_WATER) {
      return "woda";
    }
    if (material == Material.LAVA) {
      return "lava";
    }
    if (material == Material.LEGACY_STATIONARY_LAVA) {
      return "lava";
    }
    if (material == Material.SAND) {
      return "piasek";
    }
    if (material == Material.GRAVEL) {
      return "zwir";
    }
    if (material == Material.GOLD_ORE) {
      return "ruda zlota";
    }
    if (material == Material.IRON_ORE) {
      return "ruda zelaza";
    }
    if (material == Material.COAL_ORE) {
      return "ruda wegla";
    }
    if (material == Material.LEGACY_LOG) {
      return "pien";
    }
    if (material == Material.LEGACY_LEAVES) {
      return "liscie";
    }
    if (material == Material.SPONGE) {
      return "gabka";
    }
    if (material == Material.GLASS) {
      return "szklo";
    }
    if (material == Material.LAPIS_ORE) {
      return "ruda lazurytu";
    }
    if (material == Material.LAPIS_BLOCK) {
      return "blok lazurytu";
    }
    if (material == Material.DISPENSER) {
      return "dozownik";
    }
    if (material == Material.SANDSTONE) {
      return "piaskoiec";
    }
    if (material == Material.NOTE_BLOCK) {
      return "szafa grajaca";
    }
    if (material == Material.LEGACY_BED_BLOCK) {
      return "lozko";
    }
    if (material == Material.POWERED_RAIL) {
      return "zasilane tory";
    }
    if (material == Material.DETECTOR_RAIL) {
      return "tory detekcyjne";
    }
    if (material == Material.LEGACY_PISTON_STICKY_BASE) {
      return "lepki tlok";
    }
    if (material == Material.LEGACY_WEB) {
      return "siec";
    }
    if (material == Material.LEGACY_LONG_GRASS) {
      return "dluga trawa";
    }
    if (material == Material.DEAD_BUSH) {
      return "martwy krzak";
    }
    if (material == Material.LEGACY_PISTON_BASE) {
      return "tlok";
    }
    if (material == Material.LEGACY_PISTON_EXTENSION) {
      return "tlok";
    }
    if (material == Material.LEGACY_WOOL) {
      return "welna";
    }
    if (material == Material.LEGACY_PISTON_MOVING_PIECE) {
      return "tlok";
    }
    if (material == Material.LEGACY_YELLOW_FLOWER) {
      return "zolty kwiatek";
    }
    if (material == Material.LEGACY_RED_ROSE) {
      return "czerwona roza";
    }
    if (material == Material.BROWN_MUSHROOM) {
      return "brazowy grzyb";
    }
    if (material == Material.RED_MUSHROOM) {
      return "czerwony grzyb";
    }
    if (material == Material.GOLD_BLOCK) {
      return "block zlota";
    }
    if (material == Material.IRON_BLOCK) {
      return "blok zelaza";
    }
    if (material == Material.LEGACY_DOUBLE_STEP) {
      return "podwojne polplytki";
    }
    if (material == Material.LEGACY_STEP) {
      return "polplytka";
    }
    if (material == Material.BRICK) {
      return "cegla";
    }
    if (material == Material.TNT) {
      return "TNT";
    }
    if (material == Material.BOOKSHELF) {
      return "regal na ksiazki";
    }
    if (material == Material.MOSSY_COBBLESTONE) {
      return "zarosniety mchem bruk";
    }
    if (material == Material.OBSIDIAN) {
      return "obsydian";
    }
    if (material == Material.TORCH) {
      return "pochodnia";
    }
    if (material == Material.FIRE) {
      return "ogine";
    }
    if (material == Material.LEGACY_MOB_SPAWNER) {
      return "spawner mobow";
    }
    if (material == Material.LEGACY_WOOD_STAIRS) {
      return "derwniane schody";
    }
    if (material == Material.CHEST) {
      return "skrzynka";
    }
    if (material == Material.REDSTONE_WIRE) {
      return "czerwony proch";
    }
    if (material == Material.DIAMOND_ORE) {
      return "ruda diamentu";
    }
    if (material == Material.DIAMOND_BLOCK) {
      return "diamentowy blok";
    }
    if (material == Material.LEGACY_WORKBENCH) {
      return "stol rzemieslniczy";
    }
    if (material == Material.LEGACY_CROPS) {
      return "nasiona";
    }
    if (material == Material.LEGACY_SOIL) {
      return "gleba";
    }
    if (material == Material.FURNACE) {
      return "piecyk";
    }
    if (material == Material.LEGACY_BURNING_FURNACE) {
      return "palacy sie piecyk";
    }
    if (material == Material.LEGACY_SIGN_POST) {
      return "tabliczka";
    }
    if (material == Material.LEGACY_WOODEN_DOOR) {
      return "drewniane drzwi";
    }
    if (material == Material.LADDER) {
      return "drabinka";
    }
    if (material == Material.LEGACY_RAILS) {
      return "tory";
    }
    if (material == Material.COBBLESTONE_STAIRS) {
      return "kamienne schody";
    }
    if (material == Material.LEGACY_WALL_SIGN) {
      return "tabliczka";
    }
    if (material == Material.LEVER) {
      return "dzwignia";
    }
    if (material == Material.LEGACY_STONE_PLATE) {
      return "kamienna plyta";
    }
    if (material == Material.LEGACY_IRON_DOOR_BLOCK) {
      return "zelazne drzwi";
    }
    if (material == Material.LEGACY_WOOD_PLATE) {
      return "drewniana plytka";
    }
    if (material == Material.REDSTONE_ORE) {
      return "ruda czerwonego kamienia";
    }
    if (material == Material.LEGACY_GLOWING_REDSTONE_ORE) {
      return "swiecacy czerwony kamien";
    }
    if (material == Material.LEGACY_REDSTONE_TORCH_OFF) {
      return "zgaszona czerwona pochodnia";
    }
    if (material == Material.LEGACY_REDSTONE_TORCH_ON) {
      return "czerwona pochodnia";
    }
    if (material == Material.STONE_BUTTON) {
      return "kamienny przycisk";
    }
    if (material == Material.SNOW) {
      return "snieg";
    }
    if (material == Material.ICE) {
      return "lod";
    }
    if (material == Material.SNOW_BLOCK) {
      return "block sniegu";
    }
    if (material == Material.CACTUS) {
      return "kaktus";
    }
    if (material == Material.CLAY) {
      return "glina";
    }
    if (material == Material.LEGACY_SUGAR_CANE_BLOCK) {
      return "trzcina cukrowa";
    }
    if (material == Material.JUKEBOX) {
      return "szafa grajaca";
    }
    if (material == Material.LEGACY_FENCE) {
      return "plotek";
    }
    if (material == Material.PUMPKIN) {
      return "dynia";
    }
    if (material == Material.NETHERRACK) {
      return "block netherowy";
    }
    if (material == Material.SOUL_SAND) {
      return "piasek dusz";
    }
    if (material == Material.GLOWSTONE) {
      return "jasnopyl";
    }
    if (material == Material.LEGACY_PORTAL) {
      return "portal";
    }
    if (material == Material.JACK_O_LANTERN) {
      return "smiecaca dynia";
    }
    if (material == Material.LEGACY_CAKE_BLOCK) {
      return "ciasto";
    }
    if (material == Material.LEGACY_DIODE_BLOCK_OFF) {
      return "dioda";
    }
    if (material == Material.LEGACY_DIODE_BLOCK_ON) {
      return "dioda";
    }
    if (material == Material.LEGACY_STAINED_GLASS) {
      return "witraz";
    }
    if (material == Material.LEGACY_TRAP_DOOR) {
      return "klapa";
    }
    if (material == Material.LEGACY_MONSTER_EGGS) {
      return "jajko z potworem";
    }
    if (material == Material.LEGACY_SMOOTH_BRICK) {
      return "gladkie cegly";
    }
    if (material == Material.LEGACY_HUGE_MUSHROOM_1) {
      return "duzy grzyb";
    }
    if (material == Material.LEGACY_HUGE_MUSHROOM_2) {
      return "duzy grzyb";
    }
    if (material == Material.LEGACY_IRON_FENCE) {
      return "zelazny plotek";
    }
    if (material == Material.LEGACY_THIN_GLASS) {
      return "cienkie szklo";
    }
    if (material == Material.LEGACY_MELON_BLOCK) {
      return "melon";
    }
    if (material == Material.PUMPKIN_STEM) {
      return "dynia";
    }
    if (material == Material.MELON_STEM) {
      return "melon";
    }
    if (material == Material.VINE) {
      return "winorosla";
    }
    if (material == Material.LEGACY_FENCE_GATE) {
      return "furtka";
    }
    if (material == Material.BRICK_STAIRS) {
      return "ceglane schody";
    }
    if (material == Material.LEGACY_SMOOTH_STAIRS) {
      return "gladkie schody";
    }
    if (material == Material.LEGACY_MYCEL) {
      return "mycel";
    }
    if (material == Material.LEGACY_WATER_LILY) {
      return "lilia wodna";
    }
    if (material == Material.NETHER_BRICK) {
      return "netherowe cegly";
    }
    if (material == Material.LEGACY_NETHER_FENCE) {
      return "netherowy plotek";
    }
    if (material == Material.NETHER_BRICK_STAIRS) {
      return "netherowe schody";
    }
    if (material == Material.LEGACY_NETHER_WARTS) {
      return "bordawka";
    }
    if (material == Material.LEGACY_ENCHANTMENT_TABLE) {
      return "stol do zaklec";
    }
    if (material == Material.BREWING_STAND) {
      return "statyw alchemiczny";
    }
    if (material == Material.CAULDRON) {
      return "kociol";
    }
    if (material == Material.LEGACY_ENDER_PORTAL) {
      return "portal do kresu";
    }
    if (material == Material.LEGACY_ENDER_PORTAL_FRAME) {
      return "portal do kresu";
    }
    if (material == Material.LEGACY_ENDER_STONE) {
      return "kamien z kresu";
    }
    if (material == Material.DRAGON_EGG) {
      return "jajko smoka";
    }
    if (material == Material.LEGACY_REDSTONE_LAMP_OFF) {
      return "lampa na czerwony proszek";
    }
    if (material == Material.LEGACY_REDSTONE_LAMP_ON) {
      return "lampa na czerwony proszek";
    }
    if (material == Material.LEGACY_WOOD_DOUBLE_STEP) {
      return "podwojna drewniana polplytka";
    }
    if (material == Material.LEGACY_WOOD_STEP) {
      return "drewniana polplytka";
    }
    if (material == Material.LEGACY_COCOA) {
      return "kakao";
    }
    if (material == Material.SANDSTONE_STAIRS) {
      return "schody z piaskowca";
    }
    if (material == Material.EMERALD_ORE) {
      return "ruda szmaragdow";
    }
    if (material == Material.ENDER_CHEST) {
      return "skrzynia kresu";
    }
    if (material == Material.TRIPWIRE_HOOK) {
      return "zaczep na linke";
    }
    if (material == Material.TRIPWIRE) {
      return "linka";
    }
    if (material == Material.EMERALD_BLOCK) {
      return "blok szmaragdow";
    }
    if (material == Material.LEGACY_SPRUCE_WOOD_STAIRS) {
      return "shody z ciemnego drewna";
    }
    if (material == Material.LEGACY_BIRCH_WOOD_STAIRS) {
      return "schody z jasnego drewna";
    }
    if (material == Material.LEGACY_JUNGLE_WOOD_STAIRS) {
      return "schody z junglowego drewna";
    }
    if (material == Material.LEGACY_COMMAND) {
      return "blok komend";
    }
    if (material == Material.BEACON) {
      return "magiczna latarnia";
    }
    if (material == Material.LEGACY_COBBLE_WALL) {
      return "brukowy plot";
    }
    if (material == Material.FLOWER_POT) {
      return "doniczka";
    }
    if (material == Material.CARROT) {
      return "marchewka";
    }
    if (material == Material.POTATO) {
      return "ziemniak";
    }
    if (material == Material.LEGACY_WOOD_BUTTON) {
      return "drewniany guzik";
    }
    if (material == Material.LEGACY_SKULL) {
      return "glowa";
    }
    if (material == Material.ANVIL) {
      return "kowadlo";
    }
    if (material == Material.TRAPPED_CHEST) {
      return "skrzynka z polapka";
    }
    if (material == Material.LEGACY_GOLD_PLATE) {
      return "zlota plytka";
    }
    if (material == Material.LEGACY_IRON_PLATE) {
      return "zelazna plytka";
    }
    if (material == Material.LEGACY_REDSTONE_COMPARATOR_OFF) {
      return "komparator";
    }
    if (material == Material.LEGACY_REDSTONE_COMPARATOR_ON) {
      return "komparator";
    }
    if (material == Material.DAYLIGHT_DETECTOR) {
      return "wykrywacz swaitla";
    }
    if (material == Material.REDSTONE_BLOCK) {
      return "block czerwonego kamienia";
    }
    if (material == Material.LEGACY_QUARTZ_ORE) {
      return "ruda kwarcu";
    }
    if (material == Material.HOPPER) {
      return "zbiornik";
    }
    if (material == Material.QUARTZ_BLOCK) {
      return "blok kwarcu";
    }
    if (material == Material.QUARTZ_STAIRS) {
      return "kwarcowe schody";
    }
    if (material == Material.ACTIVATOR_RAIL) {
      return "tory aktywacyjne";
    }
    if (material == Material.DROPPER) {
      return "podajnik";
    }
    if (material == Material.LEGACY_STAINED_CLAY) {
      return "kolorowa glina";
    }
    if (material == Material.LEGACY_STAINED_GLASS_PANE) {
      return "kolorowy witraz";
    }
    if (material == Material.LEGACY_LEAVES_2) {
      return "liscie";
    }
    if (material == Material.LEGACY_LOG_2) {
      return "pien";
    }
    if (material == Material.ACACIA_STAIRS) {
      return "akacjowe schody";
    }
    if (material == Material.DARK_OAK_STAIRS) {
      return "schody z ciemnego drewna";
    }
    if (material == Material.HAY_BLOCK) {
      return "blok siana";
    }
    if (material == Material.LEGACY_CARPET) {
      return "dywan";
    }
    if (material == Material.LEGACY_HARD_CLAY) {
      return "utrwardzona glina";
    }
    if (material == Material.COAL_BLOCK) {
      return "blok wegla";
    }
    if (material == Material.PACKED_ICE) {
      return "zbity lod";
    }
    if (material == Material.LEGACY_DOUBLE_PLANT) {
      return "roslina";
    }
    if (material == Material.LEGACY_IRON_SPADE) {
      return "zelazna lopata";
    }
    if (material == Material.IRON_PICKAXE) {
      return "zelazny kilof";
    }
    if (material == Material.IRON_AXE) {
      return "zelazna siekiera";
    }
    if (material == Material.FLINT_AND_STEEL) {
      return "zaplaniczka";
    }
    if (material == Material.APPLE) {
      return "jablko";
    }
    if (material == Material.BOW) {
      return "luk";
    }
    if (material == Material.ARROW) {
      return "strzala";
    }
    if (material == Material.COAL) {
      return "wegiel";
    }
    if (material == Material.DIAMOND) {
      return "diament";
    }
    if (material == Material.IRON_INGOT) {
      return "sztabka zelaza";
    }
    if (material == Material.GOLD_INGOT) {
      return "sztabka zlota";
    }
    if (material == Material.IRON_SWORD) {
      return "zelazny miecz";
    }
    if (material == Material.LEGACY_WOOD_SWORD) {
      return "drewniany miecz";
    }
    if (material == Material.LEGACY_WOOD_SPADE) {
      return "drewniana lopata";
    }
    if (material == Material.LEGACY_WOOD_PICKAXE) {
      return "drewniany kilof";
    }
    if (material == Material.LEGACY_WOOD_AXE) {
      return "drewniany toporek";
    }
    if (material == Material.STONE_SWORD) {
      return "kamienny miecz";
    }
    if (material == Material.LEGACY_STONE_SPADE) {
      return "kamienna lopata";
    }
    if (material == Material.STONE_PICKAXE) {
      return "kamienny kilof";
    }
    if (material == Material.STONE_AXE) {
      return "kamienny toporek";
    }
    if (material == Material.DIAMOND_SWORD) {
      return "diamentowy miecz";
    }
    if (material == Material.LEGACY_DIAMOND_SPADE) {
      return "diamentowa lopata";
    }
    if (material == Material.DIAMOND_PICKAXE) {
      return "diamentowy kilof";
    }
    if (material == Material.DIAMOND_AXE) {
      return "diamentowy toporek";
    }
    if (material == Material.STICK) {
      return "patyk";
    }
    if (material == Material.BOWL) {
      return "miska";
    }
    if (material == Material.LEGACY_MUSHROOM_SOUP) {
      return "zupa z nogi arcrosa";
    }
    if (material == Material.LEGACY_GOLD_SWORD) {
      return "zloty miecz";
    }
    if (material == Material.LEGACY_GOLD_SPADE) {
      return "zlota lopata";
    }
    if (material == Material.LEGACY_GOLD_PICKAXE) {
      return "zloty kilof";
    }
    if (material == Material.LEGACY_GOLD_AXE) {
      return "zloty toporek";
    }
    if (material == Material.STRING) {
      return "nic";
    }
    if (material == Material.FEATHER) {
      return "piorko";
    }
    if (material == Material.LEGACY_SULPHUR) {
      return "proch";
    }
    if (material == Material.LEGACY_WOOD_HOE) {
      return "drewniana motyka";
    }
    if (material == Material.STONE_HOE) {
      return "kamienna motyka";
    }
    if (material == Material.IRON_HOE) {
      return "zelazna motyka";
    }
    if (material == Material.DIAMOND_HOE) {
      return "diamentowa motyka";
    }
    if (material == Material.LEGACY_GOLD_HOE) {
      return "zlota motyka";
    }
    if (material == Material.LEGACY_SEEDS) {
      return "nasiona";
    }
    if (material == Material.WHEAT) {
      return "siano";
    }
    if (material == Material.BREAD) {
      return "chleb";
    }
    if (material == Material.LEATHER_HELMET) {
      return "skorzany helm";
    }
    if (material == Material.LEATHER_CHESTPLATE) {
      return "skorzana klata";
    }
    if (material == Material.LEATHER_LEGGINGS) {
      return "skorzane spodnie";
    }
    if (material == Material.LEATHER_BOOTS) {
      return "skorzane buty";
    }
    if (material == Material.CHAINMAIL_HELMET) {
      return "kolczaty helm";
    }
    if (material == Material.CHAINMAIL_CHESTPLATE) {
      return "kolczata klata";
    }
    if (material == Material.CHAINMAIL_LEGGINGS) {
      return "kolczate spodnie";
    }
    if (material == Material.CHAINMAIL_BOOTS) {
      return "kolczate buty";
    }
    if (material == Material.IRON_HELMET) {
      return "zelazny helm";
    }
    if (material == Material.IRON_CHESTPLATE) {
      return "zelazna klata";
    }
    if (material == Material.IRON_LEGGINGS) {
      return "zelazne spodnie";
    }
    if (material == Material.IRON_BOOTS) {
      return "zelazne buty";
    }
    if (material == Material.DIAMOND_HELMET) {
      return "diamentowy helm";
    }
    if (material == Material.DIAMOND_CHESTPLATE) {
      return "diamentowa klata";
    }
    if (material == Material.DIAMOND_LEGGINGS) {
      return "diamentowe spodnie";
    }
    if (material == Material.DIAMOND_BOOTS) {
      return "diamentowe buty";
    }
    if (material == Material.LEGACY_GOLD_HELMET) {
      return "zloty helm";
    }
    if (material == Material.LEGACY_GOLD_CHESTPLATE) {
      return "zlota klata";
    }
    if (material == Material.LEGACY_GOLD_LEGGINGS) {
      return "zlote spodnie";
    }
    if (material == Material.LEGACY_GOLD_BOOTS) {
      return "zlote buty";
    }
    if (material == Material.FLINT) {
      return "krzemien";
    }
    if (material == Material.LEGACY_PORK) {
      return "zarcie";
    }
    if (material == Material.LEGACY_GRILLED_PORK) {
      return "usmarzone zarcie";
    }
    if (material == Material.PAINTING) {
      return "malowidlo";
    }
    if (material == Material.GOLDEN_APPLE)
    {
      if (dur == 0) {
        return "zlote jablko";
      }
      return "kox";
    }
    if (material == Material.LEGACY_SIGN) {
      return "tabliczka";
    }
    if (material == Material.LEGACY_WOOD_DOOR) {
      return "drewniane drzwi";
    }
    if (material == Material.BUCKET) {
      return "wiadro";
    }
    if (material == Material.WATER_BUCKET) {
      return "wiadro wody";
    }
    if (material == Material.LAVA_BUCKET) {
      return "wiadro lavy";
    }
    if (material == Material.MINECART) {
      return "wozek";
    }
    if (material == Material.SADDLE) {
      return "siodlo";
    }
    if (material == Material.IRON_DOOR) {
      return "zelazne drzwi";
    }
    if (material == Material.REDSTONE) {
      return "czerwony proch";
    }
    if (material == Material.LEGACY_SNOW_BALL) {
      return "sniezka";
    }
    if (material == Material.LEGACY_BOAT) {
      return "lodka";
    }
    if (material == Material.LEATHER) {
      return "skora";
    }
    if (material == Material.MILK_BUCKET) {
      return "wiadro mleka";
    }
    if (material == Material.LEGACY_CLAY_BRICK) {
      return "cegla";
    }
    if (material == Material.CLAY_BALL) {
      return "glina";
    }
    if (material == Material.SUGAR_CANE) {
      return "trzcina curkowa";
    }
    if (material == Material.PAPER) {
      return "papier";
    }
    if (material == Material.BOOK) {
      return "ksiazka";
    }
    if (material == Material.SLIME_BALL) {
      return "kula glutu";
    }
    if (material == Material.LEGACY_STORAGE_MINECART) {
      return "wozek ze skrzynia";
    }
    if (material == Material.LEGACY_POWERED_MINECART) {
      return "lokomotywa";
    }
    if (material == Material.EGG) {
      return "jajo srutupufa";
    }
    if (material == Material.COMPASS) {
      return "kompas";
    }
    if (material == Material.FISHING_ROD) {
      return "wedka";
    }
    if (material == Material.LEGACY_WATCH) {
      return "zegar";
    }
    if (material == Material.GLOWSTONE_DUST) {
      return "jasnopyl";
    }
    if (material == Material.LEGACY_RAW_FISH) {
      return "surowa ryba";
    }
    if (material == Material.LEGACY_COOKED_FISH) {
      return "ugotowana ryba";
    }
    if (material == Material.LEGACY_INK_SACK) {
      return "atrament";
    }
    if (material == Material.BONE) {
      return "kosc";
    }
    if (material == Material.SUGAR) {
      return "cukier";
    }
    if (material == Material.CAKE) {
      return "ciasto";
    }
    if (material == Material.LEGACY_BED) {
      return "lozko";
    }
    if (material == Material.LEGACY_DIODE) {
      return "przekaznik";
    }
    if (material == Material.COOKIE) {
      return "ciasteczko";
    }
    if (material == Material.MAP) {
      return "mapa";
    }
    if (material == Material.SHEARS) {
      return "nozyce";
    }
    if (material == Material.MELON) {
      return "arbuz";
    }
    if (material == Material.PUMPKIN_SEEDS) {
      return "nasienie dyni";
    }
    if (material == Material.MELON_SEEDS) {
      return "nasienie arbuza";
    }
    if (material == Material.LEGACY_RAW_BEEF) {
      return "tatar";
    }
    if (material == Material.COOKED_BEEF) {
      return "befsztyk";
    }
    if (material == Material.LEGACY_RAW_CHICKEN) {
      return "kurczak";
    }
    if (material == Material.COOKED_CHICKEN) {
      return "kurczak z rozna";
    }
    if (material == Material.ROTTEN_FLESH) {
      return "zgnila stopa srutupufa";
    }
    if (material == Material.ENDER_PEARL) {
      return "oko endermana";
    }
    if (material == Material.BLAZE_ROD) {
      return "rozdzka plomienia";
    }
    if (material == Material.GHAST_TEAR) {
      return "lza ducha";
    }
    if (material == Material.GOLD_NUGGET) {
      return "fragment zlotej protezy";
    }
    if (material == Material.LEGACY_NETHER_STALK) {
      return "brodawa";
    }
    if (material == Material.POTION) {
      return "mikstura";
    }
    if (material == Material.GLASS_BOTTLE) {
      return "pusta butla 0,7";
    }
    if (material == Material.SPIDER_EYE) {
      return "oko pajaka";
    }
    if (material == Material.FERMENTED_SPIDER_EYE) {
      return "zgnile oko pajaka";
    }
    if (material == Material.BLAZE_POWDER) {
      return "plomienna koka";
    }
    if (material == Material.MAGMA_CREAM) {
      return "krem na przyszcze";
    }
    if (material == Material.LEGACY_BREWING_STAND_ITEM) {
      return "aparatura do bimbru";
    }
    if (material == Material.LEGACY_CAULDRON_ITEM) {
      return "kociol panoramixa";
    }
    if (material == Material.LEGACY_EYE_OF_ENDER) {
      return "wszechwidzace oko";
    }
    if (material == Material.LEGACY_SPECKLED_MELON) {
      return "lsniacy melon";
    }
    if (material == Material.LEGACY_MONSTER_EGG) {
      return "kinder niespodzianka";
    }
    if (material == Material.LEGACY_EXP_BOTTLE) {
      return "butla z expem";
    }
    if (material == Material.LEGACY_FIREBALL) {
      return "ognisty cyberpierd";
    }
    if (material == Material.LEGACY_BOOK_AND_QUILL) {
      return "ksiazka z piorem";
    }
    if (material == Material.WRITTEN_BOOK) {
      return "zapisana ksiazka";
    }
    if (material == Material.EMERALD) {
      return "szmaragd";
    }
    if (material == Material.ITEM_FRAME) {
      return "ramka na przedmiot";
    }
    if (material == Material.LEGACY_FLOWER_POT_ITEM) {
      return "doniczka";
    }
    if (material == Material.LEGACY_CARROT_ITEM) {
      return "marchw";
    }
    if (material == Material.LEGACY_POTATO_ITEM) {
      return "zimniok";
    }
    if (material == Material.BAKED_POTATO) {
      return "pieczony zimniok";
    }
    if (material == Material.POISONOUS_POTATO) {
      return "trujacy zimniok";
    }
    if (material == Material.LEGACY_EMPTY_MAP) {
      return "pusta mapa";
    }
    if (material == Material.GOLDEN_CARROT) {
      return "zlota marchw";
    }
    if (material == Material.LEGACY_SKULL_ITEM) {
      return "morda";
    }
    if (material == Material.LEGACY_CARROT_STICK) {
      return "bicz z marchewka";
    }
    if (material == Material.NETHER_STAR) {
      return "pentagram";
    }
    if (material == Material.PUMPKIN_PIE) {
      return "placek z dynii";
    }
    if (material == Material.LEGACY_FIREWORK) {
      return "gwiazdka pirotechniczna";
    }
    if (material == Material.LEGACY_FIREWORK_CHARGE) {
      return "gwiazdka pirotechniczna";
    }
    if (material == Material.ENCHANTED_BOOK) {
      return "zakleta ksiazka";
    }
    if (material == Material.LEGACY_REDSTONE_COMPARATOR) {
      return "komparator";
    }
    if (material == Material.LEGACY_NETHER_BRICK_ITEM) {
      return "piekielne cegly";
    }
    if (material == Material.QUARTZ) {
      return "kwarc";
    }
    if (material == Material.LEGACY_EXPLOSIVE_MINECART) {
      return "granat";
    }
    if (material == Material.HOPPER_MINECART) {
      return "ssacy wozek";
    }
    if (material == Material.LEGACY_IRON_BARDING) {
      return "zelazny korpierz";
    }
    if (material == Material.LEGACY_GOLD_BARDING) {
      return "zloty korpierz";
    }
    if (material == Material.LEGACY_DIAMOND_BARDING) {
      return "diamentowy korpierz";
    }
    if (material == Material.LEGACY_LEASH) {
      return "lasso";
    }
    if (material == Material.NAME_TAG) {
      return "niesmiertelnik";
    }
    if (material == Material.LEGACY_COMMAND_MINECART) {
      return "kapitan wozek";
    }
    if (material == Material.LEGACY_GOLD_RECORD) {
      return "zlote nagranie";
    }
    if (material == Material.LEGACY_GREEN_RECORD) {
      return "Prezerwatywa";
    }
    if (material == Material.LEGACY_RECORD_3) {
      return "nagranie";
    }
    if (material == Material.LEGACY_RECORD_4) {
      return "O.S.T.R";
    }
    if (material == Material.LEGACY_RECORD_5) {
      return "PFK - Jestem Bogiem";
    }
    if (material == Material.LEGACY_RECORD_6) {
      return "Sobota - Czuje sie dobrze";
    }
    if (material == Material.LEGACY_RECORD_7) {
      return "SKRILLEX - Bangarang";
    }
    if (material == Material.LEGACY_RECORD_8) {
      return "skrillex";
    }
    if (material == Material.LEGACY_RECORD_9) {
      return "Justin Bieber";
    }
    if (material == Material.LEGACY_RECORD_10) {
      return "Paktofonika";
    }
    if (material == Material.LEGACY_RECORD_11) {
      return "Kaliber 44";
    }
    if (material == Material.LEGACY_RECORD_12) {
      return "Hemp Gru";
    }
    return null;
  }
}