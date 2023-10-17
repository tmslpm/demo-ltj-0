package com.jtorleonstudios.awesomedungeon;

import com.jtorleonstudios.libraryferret.conf.Configuration;
import com.jtorleonstudios.libraryferret.conf.Props;

// Structure Configuration
public class AwsConfig {
  private static Configuration INSTANCE = null;

  public static final Props ENABLED_DEFAULT_JUNGLE_TEMPLE = Props.create( "default_jungle_temple", "enable", true),
          SEPARATION_DEFAULT_JUNGLE_TEMPLE = Props.create( "default_jungle_temple", "separation", 10),
          SPACING_DEFAULT_JUNGLE_TEMPLE = Props.create( "default_jungle_temple", "spacing", 15),
          ENABLED_DESERT_TEMPLE_HUSK = Props.create( "desert_temple_husk", "enable", true),
          SEPARATION_DESERT_TEMPLE_HUSK = Props.create( "desert_temple_husk", "separation", 10),
          SPACING_DESERT_TEMPLE_HUSK = Props.create( "desert_temple_husk", "spacing", 15),
          ENABLED_GIANT_JUNGLE_TREE = Props.create( "giant_jungle_tree", "enable", true),
          SEPARATION_GIANT_JUNGLE_TREE = Props.create( "giant_jungle_tree", "separation", 10),
          SPACING_GIANT_JUNGLE_TREE = Props.create( "giant_jungle_tree", "spacing", 15),
          ENABLED_OAK_PALACE = Props.create( "oak_palace", "enable", true),
          SEPARATION_OAK_PALACE = Props.create( "oak_palace", "separation", 10),
          SPACING_OAK_PALACE = Props.create( "oak_palace", "spacing", 15),
          ENABLED_SWAMP_TEMPLE = Props.create( "swamp_temple", "enable", true),
          SEPARATION_SWAMP_TEMPLE = Props.create( "swamp_temple", "separation", 10),
          SPACING_SWAMP_TEMPLE = Props.create( "swamp_temple", "spacing", 15),
          ENABLED_THE_Z_TOWER = Props.create( "the_z_tower", "enable", true),
          SEPARATION_THE_Z_TOWER = Props.create( "the_z_tower", "separation", 10),
          SPACING_THE_Z_TOWER = Props.create( "the_z_tower", "spacing", 15),
          ENABLED_MUSHROOM_ABANDONED = Props.create( "mushroom_abandoned", "enable", true),
          SEPARATION_MUSHROOM_ABANDONED = Props.create( "mushroom_abandoned", "separation", 10),
          SPACING_MUSHROOM_ABANDONED = Props.create( "mushroom_abandoned", "spacing", 15),
          ENABLED_USINE = Props.create( "the_factory", "enable", true),
          SEPARATION_USINE = Props.create( "the_factory", "separation", 10),
          SPACING_USINE = Props.create( "the_factory", "spacing", 15),
          ENABLED_WITCH_CASTLE = Props.create( "witch_castle", "enable", true),
          SEPARATION_WITCH_CASTLE = Props.create( "witch_castle", "separation", 10),
          SPACING_WITCH_CASTLE = Props.create( "witch_castle", "spacing", 15);

  private static void init() {
    AwsConfig.INSTANCE = new Configuration(Main.MOD_ID,

            ENABLED_DEFAULT_JUNGLE_TEMPLE,
            SEPARATION_DEFAULT_JUNGLE_TEMPLE,
            SPACING_DEFAULT_JUNGLE_TEMPLE,

            ENABLED_DESERT_TEMPLE_HUSK,
            SEPARATION_DESERT_TEMPLE_HUSK,
            SPACING_DESERT_TEMPLE_HUSK,

            ENABLED_GIANT_JUNGLE_TREE,
            SEPARATION_GIANT_JUNGLE_TREE,
            SPACING_GIANT_JUNGLE_TREE,

            ENABLED_OAK_PALACE,
            SEPARATION_OAK_PALACE,
            SPACING_OAK_PALACE,

            ENABLED_SWAMP_TEMPLE,
            SEPARATION_SWAMP_TEMPLE,
            SPACING_SWAMP_TEMPLE,

            ENABLED_THE_Z_TOWER,
            SEPARATION_THE_Z_TOWER,
            SPACING_THE_Z_TOWER,

            ENABLED_MUSHROOM_ABANDONED,
            SEPARATION_MUSHROOM_ABANDONED,
            SPACING_MUSHROOM_ABANDONED,

            ENABLED_USINE,
            SEPARATION_USINE,
            SPACING_USINE,

            ENABLED_WITCH_CASTLE,
            SEPARATION_WITCH_CASTLE,
            SPACING_WITCH_CASTLE
    );
  }

  public static Configuration get() {
    if (INSTANCE == null)
      init();
    return INSTANCE;
  }

}
