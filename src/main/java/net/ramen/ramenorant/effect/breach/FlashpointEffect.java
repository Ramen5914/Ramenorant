//package net.ramen.ramenorant.effect.breach;
//
//import net.minecraft.world.effect.MobEffect;
//import net.minecraft.world.effect.MobEffectCategory;
//import net.minecraft.world.entity.LivingEntity;
//
//public class FlashpointEffect extends MobEffect {
//    public FlashpointEffect(MobEffectCategory mobEffectCategory, int color) {
//        super(mobEffectCategory, color);
//    }
//
//    @Override
//    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
//        if (!pLivingEntity.level.isClientSide()) {
//            // This is example code
//            Double x = pLivingEntity.getX();
//            Double y = pLivingEntity.getY();
//            Double z = pLivingEntity.getZ();
//
//            pLivingEntity.teleportTo(x, y, z);
//            pLivingEntity.setDeltaMovement(0, 0, 0);
//        }
//        super.applyEffectTick(pLivingEntity, pAmplifier);
//    }
//
//    @Override
//    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
//        return true;
//    }
//}
