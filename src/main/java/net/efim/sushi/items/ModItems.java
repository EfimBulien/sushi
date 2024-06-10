package net.efim.sushi.items;

import net.efim.sushi.Sushi;
import net.efim.sushi.ModCreativeModeTab;
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

    public static final RegistryObject<Item> BOWL = ITEMS.register("bowl", () ->
            new Item(new Item.Properties()
            .tab(ModCreativeModeTab.SUSHI_TAB)
            .food(FoodItems.BOWL_FOOD)
    ));

    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () ->
            new Item(new Item.Properties()
            .tab(ModCreativeModeTab.SUSHI_TAB)
    ));

    public static final RegistryObject<Item> ROLL = ITEMS.register("roll", () ->
            new RollItem(new Item.Properties()
            .tab(ModCreativeModeTab.SUSHI_TAB)
            .food(FoodItems.ROLL_FOOD)
    ));

    public static final RegistryObject<Item> SOY_SAUCE = ITEMS.register("soy_sauce", () ->

            new SoySauceItem(new Item.Properties()
            .tab(ModCreativeModeTab.SUSHI_TAB)
            .stacksTo(1)
            .food(FoodItems.SOY_SAUCE_FOOD)
    ));

    public static final RegistryObject<Item> WASABI = ITEMS.register("wasabi", () ->
            new Item(new Item.Properties()
            .tab(ModCreativeModeTab.SUSHI_TAB)
            .food(FoodItems.WASABI_FOOD)
    ));
}
