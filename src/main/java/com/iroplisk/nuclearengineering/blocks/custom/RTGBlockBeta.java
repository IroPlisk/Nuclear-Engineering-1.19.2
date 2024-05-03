package com.iroplisk.nuclearengineering.blocks.custom;

import com.iroplisk.nuclearengineering.blocks.BlockInit;
import com.iroplisk.nuclearengineering.blocks.entity.EntityInit;
import com.iroplisk.nuclearengineering.blocks.entity.RTGBlockBetaEntity;
import com.iroplisk.nuclearengineering.items.ItemInit;
import ic2.api.blocks.IWrenchable;
import ic2.core.block.base.IStateController;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class RTGBlockBeta extends Block implements IStateController<RTGBlockBetaEntity>, IWrenchable {

    public RTGBlockBeta(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new RTGBlockBetaEntity(pos, state);
    }

    @Override
    public void onStateUpdate(Level level, BlockPos blockPos, BlockState blockState, RTGBlockBetaEntity rtgBlockBetaEntity) {
        switch (rtgBlockBetaEntity.getFacing()) {
            case EAST -> blockState = blockState.setValue(BlockStateProperties.FACING, Direction.EAST);
            case WEST -> blockState = blockState.setValue(BlockStateProperties.FACING, Direction.WEST);
            case NORTH -> blockState = blockState.setValue(BlockStateProperties.FACING, Direction.NORTH);
            case SOUTH -> blockState = blockState.setValue(BlockStateProperties.FACING, Direction.SOUTH);
        }
        if (level != null) {
            level.setBlockAndUpdate(blockPos, blockState);
        }
    }

    @Override
    public Direction getFacing(BlockState blockState, Level level, BlockPos blockPos) {
        return blockState.getValue(BlockStateProperties.FACING);
    }

    @Override
    public boolean canSetFacing(BlockState blockState, Level level, BlockPos blockPos, Player player, Direction direction) {
        return blockState.getValue(BlockStateProperties.FACING) != direction && direction.get2DDataValue() != -1;
    }

    @Override
    public boolean setFacing(BlockState blockState, Level level, BlockPos blockPos, Player player, Direction direction) {
        BlockEntity blockEntity = level.getBlockEntity(blockPos);
        if (blockEntity instanceof RTGBlockBetaEntity blockBetaEntity) {
            if (!blockBetaEntity.isSimulating()) {
                return false;
            }
            blockBetaEntity.setFacing(direction);
            return true;
        }
        return false;
    }

    @Override
    public List<ItemStack> getDrops(BlockState p_60537_, LootContext.Builder p_60538_) {
        List<ItemStack> drops = new ArrayList<>(1);
        drops.add(new ItemStack(BlockInit.RTG_BETA.get()));
        return drops;
    }

    @Override
    public boolean doSpecialAction(BlockState blockState, Level level, BlockPos blockPos, Direction direction, Player player, Vec3 vec3) {
        return false;
    }

    @Override
    public AABB hasSpecialAction(BlockState blockState, Level level, BlockPos blockPos, Direction direction, Player player, Vec3 vec3) {
        return null;
    }

    @Override
    public boolean canRemoveBlock(BlockState blockState, Level level, BlockPos blockPos, Player player) {
        return true;
    }

    @Override
    public double getDropRate(BlockState blockState, Level level, BlockPos blockPos, Player player) {
        return 1;
    }

    @Override
    public List<ItemStack> getDrops(BlockState blockState, Level level, BlockPos blockPos, Player player) {
        List<ItemStack> drops = new ArrayList<>(1);
        drops.add(new ItemStack(BlockInit.RTG_BETA.get()));
        return drops;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction direction = context.getHorizontalDirection().getOpposite();
        if (direction.get2DDataValue() != -1) {
            return this.defaultBlockState().setValue(BlockStateProperties.FACING, direction);
        } else {
            return this.defaultBlockState();
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.FACING);
    }

}
