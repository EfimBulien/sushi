package net.efim.sushi.blocks;

import net.efim.sushi.Sushi;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.efim.sushi.items.ModItems;

@EventBusSubscriber(modid = Sushi.MOD_ID, bus = Bus.MOD)
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Sushi.MOD_ID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static final RegistryObject<Block> RICE_FIELD = registerBlock("rice_field",
            new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> WASABI_PLANT = registerBlock("wasabi_plant",
            new Block(BlockBehaviour.Properties.copy(Blocks.FARMLAND)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SUSHI_TABLE = registerBlock("sushi_table",
            new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SUSHI_PLATE = registerBlock("sushi_plate",
            new Block(BlockBehaviour.Properties.copy(Blocks.STONE)), CreativeModeTab.TAB_DECORATIONS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, T block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, () -> block);
        ModItems.ITEMS.register(name, () -> new BlockItem(block, new Item.Properties().tab(tab)));
        return toReturn;
    }
}
