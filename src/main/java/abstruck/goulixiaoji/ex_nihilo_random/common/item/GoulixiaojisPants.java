package abstruck.goulixiaoji.ex_nihilo_random.common.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;


public class GoulixiaojisPants extends Item {
    private static final Food Pants =  (new Food.Builder())
            .saturationMod(32767)
            .nutrition(32767)
            .alwaysEat()
            .effect(()->new EffectInstance(Effects.REGENERATION,1 * 100,255),255)
            .build();
    public GoulixiaojisPants(){
        super(new Properties().food(Pants));
    }
}
