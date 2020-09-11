package kr.jeong3954.ma.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.manager.EntityAnimationManager;

public class EntityFakePlayer extends EntityAnimal implements IAnimatedEntity {

    EntityAnimationManager manager = new EntityAnimationManager();
    EntityAnimationController controller = new EntityAnimationController(this, "walkController", 20, this::animationPredicate);

    private <E extends Entity> boolean animationPredicate(AnimationTestEvent<E> event) {
        if (event.isWalking()) {
            controller.setAnimation(new AnimationBuilder().addAnimation("animation.ma.walk", true));
        } else {
            controller.setAnimation(new AnimationBuilder().addAnimation("animation.ma.idle", true));
        }
        return true;
    }

    public EntityFakePlayer(World worldIn) {
        super(worldIn);
        manager.addAnimationController(controller);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }

    @Override
    public EntityAnimationManager getAnimationManager() {
        return manager;
    }
}
