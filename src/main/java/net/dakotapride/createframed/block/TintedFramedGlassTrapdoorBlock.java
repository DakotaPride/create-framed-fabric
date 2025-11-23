package net.dakotapride.createframed.block;

import com.simibubi.create.content.decoration.TrainTrapdoorBlock;
import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;

public class TintedFramedGlassTrapdoorBlock extends TrainTrapdoorBlock {
    public TintedFramedGlassTrapdoorBlock(Properties properties) {
        super(properties, SlidingDoorBlock.GLASS_SET_TYPE.get());
    }
}
