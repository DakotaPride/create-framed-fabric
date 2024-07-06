package net.dakotapride.createframed.registry;

import java.util.function.Supplier;

import org.jetbrains.annotations.NotNull;

import com.simibubi.create.AllCreativeModeTabs;

import net.dakotapride.createframed.CreateFramedMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

@SuppressWarnings("unused")
public class CreateFramedTabs {
	public static final AllCreativeModeTabs.TabInfo CREATE_FRAMED = register("create_framed",
			() -> FabricItemGroup.builder().title(Component.translatable("itemGroup.createframed.create_framed"))
					.icon(CreateFramedBlocks.RED_STAINED_TILED_GLASS_PANE::asStack)
					.displayItems(new ItemsGenerator()).build());

    public static class ItemsGenerator implements CreativeModeTab.DisplayItemsGenerator {

        @Override
        public void accept(CreativeModeTab.@NotNull ItemDisplayParameters p, CreativeModeTab.Output o) {
            o.accept(CreateFramedBlocks.RED_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.RED_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.RED_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.RED_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.RED_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.RED_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_RED_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_RED_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_RED_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_RED_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.ORANGE_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.ORANGE_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.ORANGE_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.ORANGE_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.ORANGE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.ORANGE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_ORANGE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_ORANGE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_ORANGE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_ORANGE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.YELLOW_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.YELLOW_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.YELLOW_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.YELLOW_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.YELLOW_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.YELLOW_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_YELLOW_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_YELLOW_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_YELLOW_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_YELLOW_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.GREEN_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.GREEN_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.GREEN_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.GREEN_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.GREEN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.GREEN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_GREEN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_GREEN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_GREEN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_GREEN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.LIME_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.LIME_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.LIME_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.LIME_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.LIME_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.LIME_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_LIME_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_LIME_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_LIME_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_LIME_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.BLUE_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.BLUE_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.BLUE_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.BLUE_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.BLUE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.BLUE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_BLUE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_BLUE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_BLUE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_BLUE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.LIGHT_BLUE_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.LIGHT_BLUE_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.LIGHT_BLUE_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.LIGHT_BLUE_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.LIGHT_BLUE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.LIGHT_BLUE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_LIGHT_BLUE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_LIGHT_BLUE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_LIGHT_BLUE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_LIGHT_BLUE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.CYAN_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.CYAN_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.CYAN_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.CYAN_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.CYAN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.CYAN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_CYAN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_CYAN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_CYAN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_CYAN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.PURPLE_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.PURPLE_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.PURPLE_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.PURPLE_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.PURPLE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.PURPLE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_PURPLE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_PURPLE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_PURPLE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_PURPLE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.MAGENTA_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.MAGENTA_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.MAGENTA_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.MAGENTA_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.MAGENTA_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.MAGENTA_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_MAGENTA_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_MAGENTA_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_MAGENTA_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_MAGENTA_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.PINK_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.PINK_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.PINK_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.PINK_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.PINK_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.PINK_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_PINK_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_PINK_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_PINK_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_PINK_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.BLACK_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.BLACK_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.BLACK_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.BLACK_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.BLACK_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.BLACK_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_BLACK_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_BLACK_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_BLACK_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_BLACK_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.GRAY_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.GRAY_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.GRAY_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.GRAY_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.GRAY_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.GRAY_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_GRAY_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_GRAY_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_GRAY_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_GRAY_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.LIGHT_GRAY_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.LIGHT_GRAY_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.LIGHT_GRAY_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.LIGHT_GRAY_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.LIGHT_GRAY_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.LIGHT_GRAY_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_LIGHT_GRAY_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_LIGHT_GRAY_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_LIGHT_GRAY_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_LIGHT_GRAY_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.WHITE_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.WHITE_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.WHITE_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.WHITE_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.WHITE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.WHITE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_WHITE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_WHITE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_WHITE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_WHITE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.BROWN_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.BROWN_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.BROWN_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.BROWN_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.BROWN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.BROWN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_BROWN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_BROWN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_BROWN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_BROWN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.TINTED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.TINTED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.TINTED_TILED_GLASS);
            o.accept(CreateFramedBlocks.TINTED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.TINTED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.TINTED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_TINTED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_TINTED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_TINTED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_TINTED_FRAMED_GLASS_PANE);
        }
    }

	private static AllCreativeModeTabs.TabInfo register(String name, Supplier<CreativeModeTab> supplier) {
		ResourceLocation id = CreateFramedMod.asResource(name);
		ResourceKey<CreativeModeTab> key = ResourceKey.create(Registries.CREATIVE_MODE_TAB, id);
		CreativeModeTab tab = supplier.get();
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key, tab);
		return new AllCreativeModeTabs.TabInfo(key, tab);
	}

    public static void register() {

    }
}
