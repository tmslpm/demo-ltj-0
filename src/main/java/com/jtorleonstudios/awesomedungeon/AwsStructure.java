package com.jtorleonstudios.awesomedungeon;

import com.jtorleonstudios.libraryferret.worldgen.structures.AwesomeStructure;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.gen.ChunkRandom;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;

// Represents our structure which extends our class written in the library ferret
public class AwsStructure extends AwesomeStructure {

  private final static int BIOME_RANGE = 1;

  public AwsStructure(String identifier, boolean enabled) {
    this(identifier, enabled, 1, 2);
  }

  public AwsStructure(String identifier, boolean enabled, int size, int distanceMaxFromCenter) {
    super(Main.MOD_ID, identifier, enabled, size, distanceMaxFromCenter);
  }

  @Override
  protected boolean shouldStartAt(ChunkGenerator chunkGenerator, BiomeSource biomeSource, long seed, ChunkRandom chunkRandom, int chunkX, int chunkZ, Biome biome, ChunkPos chunkPos, DefaultFeatureConfig featureConfig) {
    if (!this.isValidStructureBiome(biomeSource, BIOME_RANGE, chunkX, chunkZ))
      return false;
    return this.isEmptyFluidState(chunkGenerator, this.getInitialPosition(chunkGenerator, chunkX, chunkZ));
  }

}