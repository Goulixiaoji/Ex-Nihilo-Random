package abstruck.goulixiaoji.ex_nihilo_random.common.base;

import abstruck.goulixiaoji.ex_nihilo_random.common.registry.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BaseTab extends ItemGroup {

    public BaseTab (){
        super("ExNihiloRandom");
    }
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.Broken_Amethyst_Shard.get());
    }
}
