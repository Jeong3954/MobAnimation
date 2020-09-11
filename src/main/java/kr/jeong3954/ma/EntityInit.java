package kr.jeong3954.ma;

import kr.jeong3954.ma.entity.EntityFakePlayer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import java.awt.*;

public class EntityInit {

    public static void registerEntities() {
        registerEntity("fakeplayer", EntityFakePlayer.class, 120, 50, Color.BLACK.getRGB(), Color.WHITE.getRGB());
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(new ResourceLocation(Main.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
    }
}
