package mayus.lightblock;

import mayus.lightblock.lightblock.BlockLightBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {


    @GameRegistry.ObjectHolder("lightblock:lightblock")
    public static BlockLightBlock blockLightBlock;



    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockLightBlock.initModel();
    }

    public static void register(IForgeRegistry<Block> registry) {
        registry.register(new BlockLightBlock());


    }


}
