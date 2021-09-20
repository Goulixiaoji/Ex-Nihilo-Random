package abstruck.goulixiaoji.ex_nihilo_random.common.registry;

import abstruck.goulixiaoji.ex_nihilo_random.ExNihiloRadom;
import abstruck.goulixiaoji.ex_nihilo_random.common.item.ItemBrokenAmethystShard;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExNihiloRadom.MOD_ID);
    public static final RegistryObject<Item> Broken_Amethyst_Shard =
            ITEMS.register("broken_amethyst_shard", ItemBrokenAmethystShard::new);
}
