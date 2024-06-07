package net.efim.sushi;

import net.efim.sushi.items.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SUSHI_TAB = new CreativeModeTab("Sushi Tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ROLL.get());
        }
    };
}
