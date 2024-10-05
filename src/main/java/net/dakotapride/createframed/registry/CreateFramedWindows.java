package net.dakotapride.createframed.registry;

import com.simibubi.create.content.decoration.palettes.ConnectedGlassPaneBlock;
import com.simibubi.create.content.decoration.palettes.WindowBlock;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.HorizontalCTBehaviour;
import com.simibubi.create.foundation.utility.Lang;
import com.tterrag.registrate.util.entry.BlockEntry;

import net.dakotapride.createframed.CreateFramedMod;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Supplier;

public enum CreateFramedWindows {
    COPPER(() -> CreateFramedSpriteShifts.COPPER_WINDOW, Blocks.COPPER_BLOCK, RenderType.cutout()),
    ZINC(() -> CreateFramedSpriteShifts.ZINC_WINDOW, Blocks.GLOW_LICHEN, RenderType.cutout()),
    ANDESITE_ALLOY(() -> CreateFramedSpriteShifts.ANDESITE_ALLOY_WINDOW, Blocks.ANDESITE, RenderType.cutout()),
    INDUSTRIAL_IRON(() -> CreateFramedSpriteShifts.INDUSTRIAL_IRON_WINDOW, Blocks.NETHERITE_BLOCK, RenderType.cutout()),
    ROSE_QUARTZ(() -> CreateFramedSpriteShifts.ROSE_QUARTZ_WINDOW, Blocks.RED_TERRACOTTA, RenderType.translucent()),
    BRASS(() -> CreateFramedSpriteShifts.BRASS_WINDOW, Blocks.YELLOW_TERRACOTTA, RenderType.cutout());

    private final ResourceLocation id;
    public final BlockEntry<WindowBlock> window_block;
    public final BlockEntry<ConnectedGlassPaneBlock> window_pane;

    CreateFramedWindows(Supplier<CTSpriteShiftEntry> ctshift, Block template_block, RenderType renderType) {

        String name = Lang.asId(name());
        id = CreateFramedMod.asResource(name);
        window_block = CreateFramedBuilderTransformers.windowBlock(name, () -> new HorizontalCTBehaviour(ctshift.get()), template_block, () -> renderType);
        window_pane = CreateFramedBuilderTransformers.windowPaneBlock(name, ctshift, () -> renderType, template_block::defaultMapColor);
    }

    public BlockEntry<WindowBlock> getWindowBlock() {
        return window_block;
    }

    public BlockEntry<ConnectedGlassPaneBlock> getWindowPaneBlock() {
        return window_pane;
    }

    public static void register() {}
}
