package kr.jeong3954.ma;

import kr.jeong3954.ma.util.handlers.RegistryHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = Main.MOD_ID,
        name = "MobAnimation",
        version = "0.1"
)
public class Main {

    public static final String MOD_ID = "ma";

    @Mod.Instance
    public static Main instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        RegistryHandler.preInit();
    }
}
