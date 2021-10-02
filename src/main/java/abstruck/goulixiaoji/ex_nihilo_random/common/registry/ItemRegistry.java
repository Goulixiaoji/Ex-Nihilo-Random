package abstruck.goulixiaoji.ex_nihilo_random.common.registry;

import abstruck.goulixiaoji.ex_nihilo_random.ExNihiloRadom;
import abstruck.goulixiaoji.ex_nihilo_random.common.item.GoulixiaojisPants;
import abstruck.goulixiaoji.ex_nihilo_random.common.item.cavesandcliffs.ItemBrokenAmethystShard;
import abstruck.goulixiaoji.ex_nihilo_random.common.item.taiga.ItemTAIGA;
import abstruck.goulixiaoji.ex_nihilo_random.common.plugin.IsLoad;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ExNihiloRadom.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExNihiloRadom.MOD_ID);

    public static final RegistryObject<Item> Goulixiaojis_Pants =
            ITEMS.register("goulixiaojis_pants", GoulixiaojisPants::new);
    //CavesAndCliffsBackport
    public static RegistryObject<Item> Broken_Amethyst_Shard;

    //TAIGA
    public static RegistryObject<Item> TAIGA_Items[] = new RegistryObject[15];

    public ItemRegistry(){
        //CavesAndCliffsBackport
        if(IsLoad.isOnCACB()){
            Broken_Amethyst_Shard =
                    ITEMS.register("broken_amethyst_shard", ItemBrokenAmethystShard::new);
        }

        //TAIGA
        if(IsLoad.isOnTAIGA()){
            //矿物碎片
            TAIGA_Items[0] =
                    ITEMS.register("broken_tiberium_crystal", ItemTAIGA::new);
            TAIGA_Items[1] =
                    ITEMS.register("broken_dilithium_crystal",ItemTAIGA::new);
            TAIGA_Items[2] =
                    ITEMS.register("aurorium_ore_chunk",ItemTAIGA::new);
            TAIGA_Items[3] =
                    ITEMS.register("prometheum_ore_chunk",ItemTAIGA::new);
            TAIGA_Items[4] =
                    ITEMS.register("duranite_ore_chunk",ItemTAIGA::new);
            TAIGA_Items[5] =
                    ITEMS.register("valyrium_ore_chunk",ItemTAIGA::new);
            TAIGA_Items[6] =
                    ITEMS.register("vibranium_ore_chunk",ItemTAIGA::new);
            TAIGA_Items[7] =
                    ITEMS.register("karmesine_ore_chunk",ItemTAIGA::new);
            TAIGA_Items[8] =
                    ITEMS.register("ovium_ore_chunk",ItemTAIGA::new);
            TAIGA_Items[9] =
                    ITEMS.register("jauxum_ore_chunk",ItemTAIGA::new);
            TAIGA_Items[10] =
                    ITEMS.register("palladium_ore_chunk",ItemTAIGA::new);
            TAIGA_Items[11] =
                    ITEMS.register("uru_ore_chunk",ItemTAIGA::new);
            TAIGA_Items[12] =
                    ITEMS.register("osram_ore_chunk",ItemTAIGA::new);
            TAIGA_Items[13] =
                    ITEMS.register("eezo_ore_chunk",ItemTAIGA::new);
            TAIGA_Items[14] =
                    ITEMS.register("abyssum_ore_chunk",ItemTAIGA::new);
        }

    }

}


