package net.efim.sushi.items;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import org.jetbrains.annotations.NotNull;

public class SoySauceItem extends Item {

    public SoySauceItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, Level level,
                                              net.minecraft.world.entity.@NotNull LivingEntity entity) {
        if (!level.isClientSide) {
            entity.removeAllEffects();
            entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                    net.minecraft.world.effect.MobEffects.MOVEMENT_SLOWDOWN, 600, 0)
            );
        }
        return super.finishUsingItem(stack, level, entity);
    }

    @Override
    public @NotNull UseAnim getUseAnimation(@NotNull ItemStack stack) {
        return UseAnim.DRINK; // Анимация питья
    }

    @Override
    public int getUseDuration(@NotNull ItemStack stack) {
        return 32; // Время использования, как у зелья
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, @NotNull Player player,
                                                           @NotNull InteractionHand hand) {
        return ItemUtils.startUsingInstantly(level, player, hand);
    }
}
