package abstruck.goulixiaoji.ex_nihilo_random.common.plugin;

import net.minecraftforge.fml.ModList;

public class IsLoad {
    public static boolean isOnCACB(){
        return ModList.get().isLoaded("cavesandcliffs");
    }


    public static boolean isOnTAIGA(){

        return ModList.get().isLoaded("taiga");
    }
}
