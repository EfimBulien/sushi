package net.efim.sushi.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class FoodItems extends Item {
    public FoodItems(Properties properties) {
        super(properties);
    }

    public static final FoodProperties BOWL_FOOD = ((new FoodProperties.Builder())
            .nutrition(4)
            .saturationMod(0.3f)
            .alwaysEat()
            .build()
    );

    public static final FoodProperties ROLL_FOOD = ((new FoodProperties.Builder())
            .nutrition(2)
            .saturationMod(0.1f)
            .alwaysEat()
            .build()
    );
}
