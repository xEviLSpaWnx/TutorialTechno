package com.evilspawn.tutorialtechno.init;

import com.evilspawn.tutorialtechno.Tutorial;
import com.evilspawn.tutorialtechno.blocks.Oven;
import com.evilspawn.tutorialtechno.blocks.RubyBlock;
import com.evilspawn.tutorialtechno.blocks.RubyOre;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Tutorial.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<OreBlock> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    public static final RegistryObject<Block> OVEN = BLOCKS.register("oven", Oven::new);
}
