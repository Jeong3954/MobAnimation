package kr.jeong3954.ma.util.handlers;

import kr.jeong3954.ma.EntityInit;
import kr.jeong3954.ma.Main;
import kr.jeong3954.ma.entity.EntityFakePlayer;
import kr.jeong3954.ma.entity.render.RenderFakePlayer;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MOD_ID)
public class RegistryHandler {

    private static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityFakePlayer.class, RenderFakePlayer::new);
    }

    public static void preInit() {
        EntityInit.registerEntities();
        registerEntityRenders();
    }
}
