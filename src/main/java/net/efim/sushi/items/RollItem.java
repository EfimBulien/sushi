package net.efim.sushi.items;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class RollItem extends Item {

    public RollItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(
            @NotNull ItemStack stack,
            @NotNull Level level,
            net.minecraft.world.entity.@NotNull LivingEntity entity
    ) {
        if (entity instanceof ServerPlayer player) {
            // Удаление всех эффектов
            player.removeAllEffects();
        }
        return super.finishUsingItem(stack, level, entity);
    }

    @Override
    public @NotNull UseAnim getUseAnimation(@NotNull ItemStack stack) {
        return UseAnim.EAT; // Анимация еды
    }
}
