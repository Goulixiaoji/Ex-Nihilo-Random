package abstruck.goulixiaoji.ex_nihilo_random;

import abstruck.goulixiaoji.ex_nihilo_random.common.registry.ItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ExNihiloRadom.MOD_ID)
public class ExNihiloRadom {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "ex_nihilo_random";

    public ExNihiloRadom() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);
    }

}
