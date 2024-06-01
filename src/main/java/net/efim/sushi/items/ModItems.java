package net.efim.sushi.items;

import net.efim.sushi.Sushi;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Sushi.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> BOWL = ITEMS.register("bowl", () -> new Item(new Item.Properties()
            .tab(CreativeModeTab.TAB_FOOD)
            .food(FoodItems.BOWL_FOOD)
    ));

    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new Item(new Item.Properties()
            .tab(CreativeModeTab.TAB_MISC)
    ));

    public static final RegistryObject<Item> ROLL = ITEMS.register("roll", () -> new Item(new Item.Properties()
            .tab(CreativeModeTab.TAB_FOOD)
            .food(FoodItems.ROLL_FOOD)
    ));
}
