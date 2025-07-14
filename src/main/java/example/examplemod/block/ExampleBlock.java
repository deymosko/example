package example.examplemod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ExampleBlock extends Block {
    public ExampleBlock() {
        super(BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    }
}
