package eu.pb4.polymertest;

import eu.pb4.polymer.core.api.entity.PolymerEntity;
import eu.pb4.polymertest.mixin.VillagerEntityAccessor;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.village.VillagerData;
import net.minecraft.village.VillagerProfession;
import net.minecraft.village.VillagerType;
import net.minecraft.world.World;
import xyz.nucleoid.packettweaker.PacketContext;

import java.util.List;

public class TestEntity extends ZombieEntity implements PolymerEntity {
    public TestEntity(EntityType<TestEntity> entityEntityType, World world) {
        super(entityEntityType, world);
    }

    @Override
    public EntityType<?> getPolymerEntityType(PacketContext context) {
        return EntityType.IRONGOLEM;
    }

    @Override
    public boolean doHurtTarget(ServerLevel serverLevel, Entity entity) {
        serverLevel.broadcastEntityEvent(this, (byte) 4);
        return super.doHurtTarget(serverLevel, entity);
        }
    }

    //@Override
    //protected SoundEvent getHurtSound(DamageSource source) {
    //    return TestMod.GHOST_HURT;
    //}
}
