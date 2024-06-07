package net.efim.sushi;

import net.efim.sushi.items.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab SUSHI_TAB = new CreativeModeTab("sushiTab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.ROLL.get());
        }
    };
}
