package kr.jeong3954.ma.entity.model;

import kr.jeong3954.ma.Main;
import kr.jeong3954.ma.entity.EntityFakePlayer;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

import java.io.IOException;

public class ModelFakePlayer extends AnimatedEntityModel<EntityFakePlayer> {

    private final AnimatedModelRenderer body;
    private final AnimatedModelRenderer head;
    private final AnimatedModelRenderer top_parent;
    private final AnimatedModelRenderer body_top;
    private final AnimatedModelRenderer leftArm;
    private final AnimatedModelRenderer leftArm_top;
    private final AnimatedModelRenderer leftArm_bottom;
    private final AnimatedModelRenderer rightArm;
    private final AnimatedModelRenderer rightArm_top;
    private final AnimatedModelRenderer rightArm_bottom;
    private final AnimatedModelRenderer bottom_parent;
    private final AnimatedModelRenderer body_bottom;
    private final AnimatedModelRenderer leftLeg;
    private final AnimatedModelRenderer leftLeg_top;
    private final AnimatedModelRenderer leftLeg_bottom;
    private final AnimatedModelRenderer rightLeg;
    private final AnimatedModelRenderer rightLeg_top;
    private final AnimatedModelRenderer rightLeg_bottom;

    public ModelFakePlayer()
    {
        textureWidth = 64;
        textureHeight = 64;
        body = new AnimatedModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);

        body.setModelRendererName("body");
        this.registerModelRenderer(body);

        head = new AnimatedModelRenderer(this);
        head.setRotationPoint(0.0F, -24.0F, 0.0F);
        body.addChild(head);
        head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        head.setModelRendererName("head");
        this.registerModelRenderer(head);

        top_parent = new AnimatedModelRenderer(this);
        top_parent.setRotationPoint(0.0F, -18.0F, 0.0F);
        body.addChild(top_parent);

        top_parent.setModelRendererName("top_parent");
        this.registerModelRenderer(top_parent);

        body_top = new AnimatedModelRenderer(this);
        body_top.setRotationPoint(0.0F, 0.0F, 0.0F);
        top_parent.addChild(body_top);
        body_top.setTextureOffset(0, 0).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 6.0F, 4.0F, 0.0F, false);
        body_top.setModelRendererName("body_top");
        this.registerModelRenderer(body_top);

        leftArm = new AnimatedModelRenderer(this);
        leftArm.setRotationPoint(4.0F, -4.0F, 0.0F);
        top_parent.addChild(leftArm);

        leftArm.setModelRendererName("leftArm");
        this.registerModelRenderer(leftArm);

        leftArm_top = new AnimatedModelRenderer(this);
        leftArm_top.setRotationPoint(-0.1F, 0.0F, 0.0F);
        leftArm.addChild(leftArm_top);
        leftArm_top.setTextureOffset(24, 24).addBox(0.1F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        leftArm_top.setModelRendererName("leftArm_top");
        this.registerModelRenderer(leftArm_top);

        leftArm_bottom = new AnimatedModelRenderer(this);
        leftArm_bottom.setRotationPoint(1.9F, 4.0F, 0.0F);
        leftArm.addChild(leftArm_bottom);
        leftArm_bottom.setTextureOffset(0, 0).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        leftArm_bottom.setModelRendererName("leftArm_bottom");
        this.registerModelRenderer(leftArm_bottom);

        rightArm = new AnimatedModelRenderer(this);
        rightArm.setRotationPoint(-4.0F, -4.0F, 0.0F);
        top_parent.addChild(rightArm);

        rightArm.setModelRendererName("rightArm");
        this.registerModelRenderer(rightArm);

        rightArm_top = new AnimatedModelRenderer(this);
        rightArm_top.setRotationPoint(-0.1F, 0.0F, 0.0F);
        rightArm.addChild(rightArm_top);
        rightArm_top.setTextureOffset(24, 24).addBox(-3.9F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        rightArm_top.setModelRendererName("rightArm_top");
        this.registerModelRenderer(rightArm_top);

        rightArm_bottom = new AnimatedModelRenderer(this);
        rightArm_bottom.setRotationPoint(-2.1F, 4.0F, 0.0F);
        rightArm.addChild(rightArm_bottom);
        rightArm_bottom.setTextureOffset(0, 0).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        rightArm_bottom.setModelRendererName("rightArm_bottom");
        this.registerModelRenderer(rightArm_bottom);

        bottom_parent = new AnimatedModelRenderer(this);
        bottom_parent.setRotationPoint(0.0F, -18.0F, 0.0F);
        body.addChild(bottom_parent);

        bottom_parent.setModelRendererName("bottom_parent");
        this.registerModelRenderer(bottom_parent);

        body_bottom = new AnimatedModelRenderer(this);
        body_bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        bottom_parent.addChild(body_bottom);
        body_bottom.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, 0.0F, false);
        body_bottom.setModelRendererName("body_bottom");
        this.registerModelRenderer(body_bottom);

        leftLeg = new AnimatedModelRenderer(this);
        leftLeg.setRotationPoint(2.0F, 6.0F, 0.0F);
        bottom_parent.addChild(leftLeg);

        leftLeg.setModelRendererName("leftLeg");
        this.registerModelRenderer(leftLeg);

        leftLeg_top = new AnimatedModelRenderer(this);
        leftLeg_top.setRotationPoint(-0.1F, 0.0F, 0.0F);
        leftLeg.addChild(leftLeg_top);
        leftLeg_top.setTextureOffset(24, 24).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        leftLeg_top.setModelRendererName("leftLeg_top");
        this.registerModelRenderer(leftLeg_top);

        leftLeg_bottom = new AnimatedModelRenderer(this);
        leftLeg_bottom.setRotationPoint(-0.1F, 6.0F, 0.0F);
        leftLeg.addChild(leftLeg_bottom);
        leftLeg_bottom.setTextureOffset(0, 0).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        leftLeg_bottom.setModelRendererName("leftLeg_bottom");
        this.registerModelRenderer(leftLeg_bottom);

        rightLeg = new AnimatedModelRenderer(this);
        rightLeg.setRotationPoint(2.0F, 6.0F, 0.0F);
        bottom_parent.addChild(rightLeg);

        rightLeg.setModelRendererName("rightLeg");
        this.registerModelRenderer(rightLeg);

        rightLeg_top = new AnimatedModelRenderer(this);
        rightLeg_top.setRotationPoint(-4.1F, 0.0F, 0.0F);
        rightLeg.addChild(rightLeg_top);
        rightLeg_top.setTextureOffset(24, 24).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        rightLeg_top.setModelRendererName("rightLeg_top");
        this.registerModelRenderer(rightLeg_top);

        rightLeg_bottom = new AnimatedModelRenderer(this);
        rightLeg_bottom.setRotationPoint(-4.1F, 6.0F, 0.0F);
        rightLeg.addChild(rightLeg_bottom);
        rightLeg_bottom.setTextureOffset(0, 0).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        rightLeg_bottom.setModelRendererName("rightLeg_bottom");
        this.registerModelRenderer(rightLeg_bottom);

        this.rootBones.add(body);
    }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation(Main.MOD_ID + ":animations/fakeplayer.json");
    }

    @Override
    public void onResourceManagerReload(IResourceManager resourceManager) {

    }
}
