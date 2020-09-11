package kr.jeong3954.ma.entity.render;

import kr.jeong3954.ma.Main;
import kr.jeong3954.ma.entity.EntityFakePlayer;
import kr.jeong3954.ma.entity.model.ModelFakePlayer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFakePlayer extends RenderLiving<EntityFakePlayer> {

    public RenderFakePlayer(RenderManager rendermanager) {
        super(rendermanager, new ModelFakePlayer(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityFakePlayer entity) {
        return new ResourceLocation(Main.MOD_ID + ":textures/model/entity/fakeplayer.png");
    }
}
