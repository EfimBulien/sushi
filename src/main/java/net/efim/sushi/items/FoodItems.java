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
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 1.0F)
            .build()
    );

    public static final FoodProperties ROLL_FOOD = ((new FoodProperties.Builder())
            .nutrition(2)
            .saturationMod(0.1f)
            .alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 1), 1.0F)
            .build()
    );

    public static final FoodProperties SOY_SAUCE_FOOD = ((new FoodProperties.Builder())
            .nutrition(0)
            .saturationMod(0.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 0), 1.0F)
            .build()
    );

    public static final FoodProperties WASABI_FOOD = ((new FoodProperties.Builder())
            .nutrition(1)
            .saturationMod(0.1f)
            .alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.HARM, 1, 1), 1.0F)
            .build()
    );
}
