package com.jtorleonstudios.awesomedungeon;

import com.jtorleonstudios.libraryferret.conf.Configuration;
import com.jtorleonstudios.libraryferret.worldgen.structures.AwesomeStructure;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.chunk.StructureConfig;

import java.util.ArrayList;
import java.util.List;

import static com.jtorleonstudios.libraryferret.LibraryFerret.registerStructure;

public class Main implements ModInitializer {

  public static final String MOD_ID = "awesomedungeon";

  public void onInitialize() {
    final Configuration c = AwsConfig.get();
    final List<AwesomeStructure> l = new ArrayList<>();

    // create and add new structures in list (with our library ferret)
    l.add(registerStructure(new AwsStructure("giant_jungle_tree", c.getBoolOrDefault(AwsConfig.ENABLED_GIANT_JUNGLE_TREE)),
            new StructureConfig(c.getIntOrDefault(AwsConfig.SPACING_GIANT_JUNGLE_TREE), c.getIntOrDefault(AwsConfig.SEPARATION_GIANT_JUNGLE_TREE), 121222324),
            BiomeSelectors.includeByKey(BiomeKeys.JUNGLE)
    ));

    l.add(registerStructure(new AwsStructure("oak_palace", c.getBoolOrDefault(AwsConfig.ENABLED_OAK_PALACE)),
            new StructureConfig(c.getIntOrDefault(AwsConfig.SPACING_OAK_PALACE), c.getIntOrDefault(AwsConfig.SEPARATION_OAK_PALACE), 311213141),
            BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS)
    ));

    l.add(registerStructure(new AwsStructure("desert_temple_husk", c.getBoolOrDefault(AwsConfig.ENABLED_DESERT_TEMPLE_HUSK)),
            new StructureConfig(c.getIntOrDefault(AwsConfig.SPACING_DESERT_TEMPLE_HUSK), c.getIntOrDefault(AwsConfig.SEPARATION_DESERT_TEMPLE_HUSK), 513233343),
            BiomeSelectors.includeByKey(BiomeKeys.DESERT)
    ));

    l.add(registerStructure(new AwsStructure("swamp_big_temple", c.getBoolOrDefault(AwsConfig.ENABLED_SWAMP_TEMPLE)),
            new StructureConfig(c.getIntOrDefault(AwsConfig.SPACING_SWAMP_TEMPLE), c.getIntOrDefault(AwsConfig.SEPARATION_SWAMP_TEMPLE), 412223242),
            BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.SWAMP_HILLS)
    ));

    l.add(registerStructure(new AwsStructure("default_jungle_temple", c.getBoolOrDefault(AwsConfig.ENABLED_DEFAULT_JUNGLE_TEMPLE)),
            new StructureConfig(c.getIntOrDefault(AwsConfig.SPACING_DEFAULT_JUNGLE_TEMPLE), c.getIntOrDefault(AwsConfig.SEPARATION_DEFAULT_JUNGLE_TEMPLE), 211121314),
            BiomeSelectors.includeByKey(BiomeKeys.JUNGLE_HILLS)
    ));

    l.add(registerStructure(new AwsStructure("the_ztower", c.getBoolOrDefault(AwsConfig.ENABLED_THE_Z_TOWER)),
            new StructureConfig(c.getIntOrDefault(AwsConfig.SPACING_THE_Z_TOWER), c.getIntOrDefault(AwsConfig.SEPARATION_THE_Z_TOWER), 614243444),
            BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST)
    ));

    l.add(registerStructure(new AwsStructure("mushroom_abandonned", c.getBoolOrDefault(AwsConfig.ENABLED_MUSHROOM_ABANDONED)),
            new StructureConfig(c.getIntOrDefault(AwsConfig.SPACING_MUSHROOM_ABANDONED), c.getIntOrDefault(AwsConfig.SEPARATION_MUSHROOM_ABANDONED), 715253545),
            BiomeSelectors.includeByKey(BiomeKeys.PLAINS)
    ));

    l.add(registerStructure(new AwsStructure("the_usine", c.getBoolOrDefault(AwsConfig.ENABLED_USINE)), // <<====== REQUIRE UPDATE
            new StructureConfig(c.getIntOrDefault(AwsConfig.SPACING_USINE), c.getIntOrDefault(AwsConfig.SEPARATION_USINE), 815253545),
            BiomeSelectors.includeByKey(BiomeKeys.RIVER)
    ));

    l.add(registerStructure(new AwsStructure("witch_castle", c.getBoolOrDefault(AwsConfig.ENABLED_WITCH_CASTLE), 200, 200),
            new StructureConfig(c.getIntOrDefault(AwsConfig.SPACING_WITCH_CASTLE), c.getIntOrDefault(AwsConfig.SEPARATION_WITCH_CASTLE), 915253545),
            BiomeSelectors.includeByKey(BiomeKeys.TAIGA)
    ));

    // add structures to the game's structure generation/spawn system (with our library ferret)
    AwesomeStructure.addStructureSpawningToAllDimensions(l);
  }

}
