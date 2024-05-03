package com.iroplisk.nuclearengineering.blocks.entity;

import ic2.api.energy.EnergyNet;
import ic2.api.energy.tile.IEnergyAcceptor;
import ic2.api.energy.tile.IEnergySource;
import ic2.core.block.base.features.IWrenchableTile;
import ic2.core.block.base.tiles.BaseTileEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class RTGBlockGongGornEntity extends BaseTileEntity implements IEnergySource, IWrenchableTile {
    private boolean addedToEnergyNet;

    public RTGBlockGongGornEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
    }

    @Override
    public void onLoaded() {
        super.onLoaded();
        if (this.isSimulating() && !this.addedToEnergyNet) {
            this.addedToEnergyNet = true;
            EnergyNet.INSTANCE.addTile(this);
        }
    }

    @Override
    public void onUnloaded(boolean chunk) {
        if (this.isSimulating() && this.addedToEnergyNet) {
            this.addedToEnergyNet = false;
            EnergyNet.INSTANCE.removeTile(this);
        }
        super.onUnloaded(chunk);
    }

    @Override
    public BlockEntityType<?> createType() {
        return EntityInit.RTG_GONG_GORN.get();
    }


    @Override
    public int getSourceTier() {
        return 2;
    }

    @Override
    public int getMaxEnergyOutput() {
        return 128;
    }

    @Override
    public int getProvidedEnergy() {
        return 4;
    }

    @Override
    public boolean canEmitEnergy(IEnergyAcceptor iEnergyAcceptor, Direction direction) {
        return true;
    }


    @Override
    public void consumeEnergy(int i) {

    }
    @Override
    public boolean canSetFacing(Direction direction) {
        return this.getFacing() != direction && direction.get2DDataValue() != -1;
    }

    @Override
    public boolean canRemoveBlock(Player player) {
        return true;
    }

    @Override
    public double getDropRate(Player player) {
        return 1;
    }
}
