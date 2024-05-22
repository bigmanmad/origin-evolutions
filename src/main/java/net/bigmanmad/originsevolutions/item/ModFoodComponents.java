package net.bigmanmad.originsevolutions.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent WHITE_STIMULANT = new FoodComponent.Builder().alwaysEdible().snack().hunger(1)
            .saturationModifier(0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100),0.8f).build();

    public static final FoodComponent BEJEWELED_STEAK = new FoodComponent.Builder().hunger(8).saturationModifier(1.2f).meat().build();

    public static final FoodComponent LUSCIOUS_STEAK = new FoodComponent.Builder().hunger(12).saturationModifier(1f).meat().build();



}
