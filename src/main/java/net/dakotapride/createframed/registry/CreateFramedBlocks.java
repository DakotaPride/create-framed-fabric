package net.dakotapride.createframed.registry;

import java.util.function.Supplier;

import com.simibubi.create.content.decoration.TrainTrapdoorBlock;
import com.simibubi.create.content.decoration.palettes.ConnectedGlassBlock;
import com.simibubi.create.content.decoration.palettes.ConnectedGlassPaneBlock;
import com.simibubi.create.content.decoration.palettes.GlassPaneBlock;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.HorizontalCTBehaviour;
import com.simibubi.create.foundation.block.connected.SimpleCTBehaviour;
import com.simibubi.create.foundation.utility.Lang;
import com.tterrag.registrate.util.entry.BlockEntry;

import net.dakotapride.createframed.CreateFramedMod;
import net.dakotapride.createframed.block.TintedConnectedGlassBlock;
import net.dakotapride.createframed.block.TintedConnectedGlassPaneBlock;
import net.dakotapride.createframed.block.TintedFramedGlassTrapdoorBlock;
import net.dakotapride.createframed.block.TintedGlassPaneBlock;
import net.dakotapride.createframed.block.door.FramedGlassSlidingDoorBlock;
import net.dakotapride.createframed.block.door.TintedFramedGlassSlidingDoorBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.TintedGlassBlock;
import net.minecraft.world.level.material.MapColor;

public enum CreateFramedBlocks {
    RED(() -> CreateFramedSpriteShifts.RED_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_RED_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_RED_STAINED_FRAMED_GLASS,
    Blocks.RED_STAINED_GLASS),
    ORANGE(() -> CreateFramedSpriteShifts.ORANGE_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_ORANGE_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_ORANGE_STAINED_FRAMED_GLASS,
    Blocks.ORANGE_STAINED_GLASS),
    YELLOW(() -> CreateFramedSpriteShifts.YELLOW_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_YELLOW_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_YELLOW_STAINED_FRAMED_GLASS,
    Blocks.YELLOW_STAINED_GLASS),
    GREEN(() -> CreateFramedSpriteShifts.GREEN_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_GREEN_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_GREEN_STAINED_FRAMED_GLASS,
    Blocks.GREEN_STAINED_GLASS),
    LIME(() -> CreateFramedSpriteShifts.LIME_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_LIME_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_LIME_STAINED_FRAMED_GLASS,
    Blocks.LIME_STAINED_GLASS),
    BLUE(() -> CreateFramedSpriteShifts.BLUE_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_BLUE_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_BLUE_STAINED_FRAMED_GLASS,
    Blocks.BLUE_STAINED_GLASS),
    LIGHT_BLUE(() -> CreateFramedSpriteShifts.LIGHT_BLUE_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_LIGHT_BLUE_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_LIGHT_BLUE_STAINED_FRAMED_GLASS,
    Blocks.LIGHT_BLUE_STAINED_GLASS),
    CYAN(() -> CreateFramedSpriteShifts.CYAN_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_CYAN_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_CYAN_STAINED_FRAMED_GLASS,
    Blocks.CYAN_STAINED_GLASS),
    PURPLE(() -> CreateFramedSpriteShifts.PURPLE_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_PURPLE_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_PURPLE_STAINED_FRAMED_GLASS,
    Blocks.PURPLE_STAINED_GLASS),
    MAGENTA(() -> CreateFramedSpriteShifts.MAGENTA_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_MAGENTA_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_MAGENTA_STAINED_FRAMED_GLASS,
    Blocks.MAGENTA_STAINED_GLASS),
    PINK(() -> CreateFramedSpriteShifts.PINK_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_PINK_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_PINK_STAINED_FRAMED_GLASS,
    Blocks.PINK_STAINED_GLASS),
    BLACK(() -> CreateFramedSpriteShifts.BLACK_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_BLACK_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_BLACK_STAINED_FRAMED_GLASS,
    Blocks.BLACK_STAINED_GLASS),
    GRAY(() -> CreateFramedSpriteShifts.GRAY_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_GRAY_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_GRAY_STAINED_FRAMED_GLASS,
    Blocks.GRAY_STAINED_GLASS),
    LIGHT_GRAY(() -> CreateFramedSpriteShifts.LIGHT_GRAY_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_LIGHT_GRAY_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_LIGHT_GRAY_STAINED_FRAMED_GLASS,
    Blocks.LIGHT_GRAY_STAINED_GLASS),
    WHITE(() -> CreateFramedSpriteShifts.WHITE_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_WHITE_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_WHITE_STAINED_FRAMED_GLASS,
    Blocks.WHITE_STAINED_GLASS),
    BROWN(() -> CreateFramedSpriteShifts.BROWN_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.VERTICAL_BROWN_STAINED_FRAMED_GLASS,
            () -> CreateFramedSpriteShifts.HORIZONTAL_BROWN_STAINED_FRAMED_GLASS,
    Blocks.BROWN_STAINED_GLASS),
    TINTED();

    private final ResourceLocation id;
    public BlockEntry<ConnectedGlassBlock> glass_block;
    public BlockEntry<ConnectedGlassBlock> vertical_glass_block;
    public BlockEntry<ConnectedGlassBlock> horizontal_glass_block;
    public BlockEntry<GlassBlock> tiled_glass;
    public BlockEntry<ConnectedGlassPaneBlock> glass_pane;
    public BlockEntry<ConnectedGlassPaneBlock> vertical_glass_pane;
    public BlockEntry<ConnectedGlassPaneBlock> horizontal_glass_pane;
    public BlockEntry<GlassPaneBlock> tiled_glass_pane;
    public BlockEntry<FramedGlassSlidingDoorBlock> glass_door;
    public BlockEntry<TrainTrapdoorBlock> glass_trapdoor;

    CreateFramedBlocks(Supplier<CTSpriteShiftEntry> basic_ctshift,
					   Supplier<CTSpriteShiftEntry> vertical_ctshift,
					   Supplier<CTSpriteShiftEntry> horizontal_ctshift,
					   Block template_block) {

        String name = Lang.asId(name());
        id = CreateFramedMod.asResource(name);
        glass_block = CreateFramedBuilderTransformers.colouredFramedGlass(name, () -> new SimpleCTBehaviour(basic_ctshift.get()), template_block);
        vertical_glass_block = CreateFramedBuilderTransformers.verticalColouredFramedGlass(name, () -> new HorizontalCTBehaviour(vertical_ctshift.get()), template_block);
        horizontal_glass_block = CreateFramedBuilderTransformers.horizontalColouredFramedGlass(name, () -> new HorizontalCTBehaviour(horizontal_ctshift.get(), basic_ctshift.get()), template_block);
        tiled_glass = CreateFramedBuilderTransformers.colouredTiledGlass(name);
        glass_pane = CreateFramedBuilderTransformers.colouredFramedGlassPane(name, () -> template_block, basic_ctshift);
        vertical_glass_pane = CreateFramedBuilderTransformers.verticalColouredFramedGlassPane(name, () -> template_block, vertical_ctshift);
        horizontal_glass_pane = CreateFramedBuilderTransformers.horizontalColouredFramedGlassPane(name, () -> template_block, horizontal_ctshift);
        tiled_glass_pane = CreateFramedBuilderTransformers.colouredTiledGlassPane(name);
        glass_door = CreateFramedBuilderTransformers.framedGlassSlidingDoor(name, template_block.defaultMapColor());
        glass_trapdoor = CreateFramedBuilderTransformers.framedGlassTrapdoor(name, template_block.defaultMapColor(), basic_ctshift.get());
    }

    public BlockEntry<ConnectedGlassBlock> getGlassBlock() {
        return glass_block;
    }

    public BlockEntry<ConnectedGlassBlock> getVerticalGlassBlock() {
        return vertical_glass_block;
    }

    public BlockEntry<ConnectedGlassBlock> getHorizontalGlassBlock() {
        return horizontal_glass_block;
    }

    public BlockEntry<GlassBlock> getTiledGlassBlock() {
        return tiled_glass;
    }

    public BlockEntry<ConnectedGlassPaneBlock> getGlassPane() {
        return glass_pane;
    }

    public BlockEntry<ConnectedGlassPaneBlock> getVerticalGlassPane() {
        return vertical_glass_pane;
    }

    public BlockEntry<ConnectedGlassPaneBlock> getHorizontalGlassPane() {
        return horizontal_glass_pane;
    }

    public BlockEntry<GlassPaneBlock> getTiledGlassPane() {
        return tiled_glass_pane;
    }

    public BlockEntry<FramedGlassSlidingDoorBlock> getGlassDoorBlock() {
        return glass_door;
    }

    public BlockEntry<TrainTrapdoorBlock> getGlassTrapdoorBlock() {
        return glass_trapdoor;
    }

    /* Tinted Blocks */

    public BlockEntry<TintedConnectedGlassBlock> tinted_glass;
    public BlockEntry<TintedConnectedGlassBlock> vertical_tinted_glass;
    public BlockEntry<TintedConnectedGlassBlock> horizontal_tinted_glass;
    public BlockEntry<TintedGlassBlock> tinted_tiled_glass;
    public BlockEntry<TintedConnectedGlassPaneBlock> tinted_glass_pane;
    public BlockEntry<TintedConnectedGlassPaneBlock> vertical_tinted_glass_pane;
    public BlockEntry<TintedConnectedGlassPaneBlock> horizontal_tinted_glass_pane;
    public BlockEntry<TintedGlassPaneBlock> tinted_tiled_glass_pane;
    public BlockEntry<TintedFramedGlassSlidingDoorBlock> tinted_glass_door;
    public BlockEntry<TintedFramedGlassTrapdoorBlock> tinted_glass_trapdoor;

    CreateFramedBlocks() {

        String name = Lang.asId(name());
        id = CreateFramedMod.asResource(name);
        tinted_glass = CreateFramedBuilderTransformers.tintedFramedGlass(CreateFramedSpriteShifts.TINTED_FRAMED_GLASS);
        vertical_tinted_glass = CreateFramedBuilderTransformers.tintedFramedGlass("vertical",
                new HorizontalCTBehaviour(CreateFramedSpriteShifts.VERTICAL_TINTED_FRAMED_GLASS, CreateFramedSpriteShifts.TINTED_FRAMED_GLASS));
        horizontal_tinted_glass = CreateFramedBuilderTransformers.tintedFramedGlass("horizontal",
                new HorizontalCTBehaviour(CreateFramedSpriteShifts.HORIZONTAL_TINTED_FRAMED_GLASS, CreateFramedSpriteShifts.TINTED_FRAMED_GLASS));
        tinted_tiled_glass = CreateFramedBuilderTransformers.tintedTiledGlass();
        tinted_glass_pane = CreateFramedBuilderTransformers.tintedFramedGlassPane("tinted_framed_glass",
                tinted_glass, () -> CreateFramedSpriteShifts.TINTED_FRAMED_GLASS);
        vertical_tinted_glass_pane = CreateFramedBuilderTransformers.tintedFramedGlassPane("vertical_tinted_framed_glass",
                tinted_glass, () -> CreateFramedSpriteShifts.VERTICAL_TINTED_FRAMED_GLASS);
        horizontal_tinted_glass_pane = CreateFramedBuilderTransformers.tintedFramedGlassPane("horizontal_tinted_framed_glass",
                tinted_glass, () -> CreateFramedSpriteShifts.HORIZONTAL_TINTED_FRAMED_GLASS);
        tinted_tiled_glass_pane = CreateFramedBuilderTransformers.tintedTiledGlassPane();
        tinted_glass_door = CreateFramedBuilderTransformers.tintedFramedGlassSlidingDoor("tinted_framed_glass", MapColor.COLOR_BLACK);
        tinted_glass_trapdoor = CreateFramedBuilderTransformers.tintedFramedGlassTrapdoor("tinted_framed_glass", MapColor.COLOR_BLACK, CreateFramedSpriteShifts.TINTED_FRAMED_GLASS);
    }

    public BlockEntry<TintedConnectedGlassBlock> getTintedGlass() {
        return tinted_glass;
    }

    public BlockEntry<TintedConnectedGlassBlock> getVerticalTintedGlass() {
        return vertical_tinted_glass;
    }

    public BlockEntry<TintedConnectedGlassBlock> getHorizontalTintedGlass() {
        return horizontal_tinted_glass;
    }

    public BlockEntry<TintedGlassBlock> getTintedTiledGlass() {
        return tinted_tiled_glass;
    }

    public BlockEntry<TintedGlassPaneBlock> getTintedTiledGlassPane() {
        return tinted_tiled_glass_pane;
    }

    public BlockEntry<TintedConnectedGlassPaneBlock> getTintedGlassPane() {
        return tinted_glass_pane;
    }

    public BlockEntry<TintedConnectedGlassPaneBlock> getVerticalTintedGlassPane() {
        return vertical_tinted_glass_pane;
    }

    public BlockEntry<TintedConnectedGlassPaneBlock> getHorizontalTintedGlassPane() {
        return horizontal_tinted_glass_pane;
    }

    public BlockEntry<TintedFramedGlassSlidingDoorBlock> getTintedGlassDoor() {
        return tinted_glass_door;
    }

    public BlockEntry<TintedFramedGlassTrapdoorBlock> getTintedGlassTrapoor() {
        return tinted_glass_trapdoor;
    }

    public static void register() {
        CreateFramedWindows.register();
    }
}
