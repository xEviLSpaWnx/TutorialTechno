package com.evilspawn.tutorialtechno.items;

import com.evilspawn.tutorialtechno.Tutorial;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PoisonApple extends Item {

    public PoisonApple() {
        super(new Item.Properties().group(Tutorial.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.NAUSEA, 300, 0), 1f)
                        .effect(new EffectInstance(Effects.POISON, 300, 1), 1f)
                        .effect(new EffectInstance(Effects.HUNGER, 150, 2), 0.3f)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
