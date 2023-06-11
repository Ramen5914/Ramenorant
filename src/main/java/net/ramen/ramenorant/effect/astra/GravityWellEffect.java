//package net.ramen.ramenorant.effect.astra;
//
//import net.minecraft.world.effect.MobEffect;
//import net.minecraft.world.effect.MobEffectCategory;
//import net.minecraft.world.entity.LivingEntity;
//
//public class GravityWellEffect extends MobEffect {
//    public GravityWellEffect(MobEffectCategory mobEffectCategory, int color) {
//        super(mobEffectCategory, color);
//    }
//
//    @Override
//    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
//        if (!pLivingEntity.level.isClientSide()) {
//            // This is example code
//            double x = pLivingEntity.getX();
//            double y = pLivingEntity.getY();
//            double z = pLivingEntity.getZ();
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
