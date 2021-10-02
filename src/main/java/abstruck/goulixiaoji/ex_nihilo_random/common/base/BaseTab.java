package abstruck.goulixiaoji.ex_nihilo_random.common.base;

import abstruck.goulixiaoji.ex_nihilo_random.common.plugin.IsLoad;
import abstruck.goulixiaoji.ex_nihilo_random.common.registry.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class BaseTab extends ItemGroup {

    public BaseTab() {
        super("ExNihiloRandom");
    }

    @Override
    public ItemStack makeIcon() {
        if (IsLoad.isOnCACB()) {
            return new ItemStack(ItemRegistry.Broken_Amethyst_Shard.get());
        } else if (IsLoad.isOnTAIGA()) {
            Random random = new Random();
            return new ItemStack(ItemRegistry.TAIGA_Items[random.nextInt(14)].get());
        }
            return new ItemStack(ItemRegistry.Goulixiaojis_Pants.get());
    }

}

