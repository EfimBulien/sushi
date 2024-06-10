package net.efim.sushi.blocks;

import net.efim.sushi.Sushi;
import net.efim.sushi.ModCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Sushi.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Sushi.MOD_ID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Block> WASABI_BLOCK = BLOCKS.register("wasabi_block", () ->
            new WasabiBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(1.0f)));

    public static final RegistryObject<Block> RICE_BLOCK = BLOCKS.register("rice_block", () ->
            new RiceBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(0.5f)));

    public static final RegistryObject<Block> SEAWEED_BLOCK = BLOCKS.register("seaweed_block", () ->
            new SeaweedBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(0.5f)));

    public static final RegistryObject<Block> GINGER_BLOCK = BLOCKS.register("ginger_block", () ->
            new GingerBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(0.5f)));


    public static final RegistryObject<Item> WASABI_BLOCK_ITEM = ITEMS.register("wasabi_block", () ->
            new BlockItem(WASABI_BLOCK.get(), new Item.Properties().tab(ModCreativeModeTab.SUSHI_TAB)));

    public static final RegistryObject<Item> RICE_BLOCK_ITEM = ITEMS.register("rice_block", () ->
            new BlockItem(RICE_BLOCK.get(), new Item.Properties().tab(ModCreativeModeTab.SUSHI_TAB)));

    public static final RegistryObject<Item> SEAWEED_BLOCK_ITEM = ITEMS.register("seaweed_block", () ->
            new BlockItem(SEAWEED_BLOCK.get(), new Item.Properties().tab(ModCreativeModeTab.SUSHI_TAB)));

    public static final RegistryObject<Item> GINGER_BLOCK_ITEM = ITEMS.register("ginger_block", () ->
            new BlockItem(GINGER_BLOCK.get(), new Item.Properties().tab(ModCreativeModeTab.SUSHI_TAB)));
}
