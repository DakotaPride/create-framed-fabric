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
					.icon(CreateFramedBlocks.RED.getTiledGlassPane()::asStack)
					.displayItems(new ItemsGenerator()).build());

    public static class ItemsGenerator implements CreativeModeTab.DisplayItemsGenerator {

        @Override
        public void accept(CreativeModeTab.@NotNull ItemDisplayParameters p, CreativeModeTab.Output o) {
			o.accept(CreateFramedWindows.ANDESITE_ALLOY.getWindowBlock());
			o.accept(CreateFramedWindows.ANDESITE_ALLOY.getWindowPaneBlock());
			o.accept(CreateFramedWindows.ZINC.getWindowBlock());
			o.accept(CreateFramedWindows.ZINC.getWindowPaneBlock());
			o.accept(CreateFramedWindows.COPPER.getWindowBlock());
			o.accept(CreateFramedWindows.COPPER.getWindowPaneBlock());
			o.accept(CreateFramedWindows.BRASS.getWindowBlock());
			o.accept(CreateFramedWindows.BRASS.getWindowPaneBlock());
			o.accept(CreateFramedWindows.ROSE_QUARTZ.getWindowBlock());
			o.accept(CreateFramedWindows.ROSE_QUARTZ.getWindowPaneBlock());
			o.accept(CreateFramedWindows.INDUSTRIAL_IRON.getWindowBlock());
			o.accept(CreateFramedWindows.INDUSTRIAL_IRON.getWindowPaneBlock());

			o.accept(CreateFramedBlocks.RED.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.RED.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.RED.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.RED.getTiledGlassPane());
			o.accept(CreateFramedBlocks.RED.getGlassBlock());
			o.accept(CreateFramedBlocks.RED.getGlassPane());
			o.accept(CreateFramedBlocks.RED.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.RED.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.RED.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.RED.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.ORANGE.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.ORANGE.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.ORANGE.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.ORANGE.getTiledGlassPane());
			o.accept(CreateFramedBlocks.ORANGE.getGlassBlock());
			o.accept(CreateFramedBlocks.ORANGE.getGlassPane());
			o.accept(CreateFramedBlocks.ORANGE.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.ORANGE.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.ORANGE.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.ORANGE.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.YELLOW.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.YELLOW.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.YELLOW.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.YELLOW.getTiledGlassPane());
			o.accept(CreateFramedBlocks.YELLOW.getGlassBlock());
			o.accept(CreateFramedBlocks.YELLOW.getGlassPane());
			o.accept(CreateFramedBlocks.YELLOW.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.YELLOW.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.YELLOW.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.YELLOW.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.GREEN.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.GREEN.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.GREEN.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.GREEN.getTiledGlassPane());
			o.accept(CreateFramedBlocks.GREEN.getGlassBlock());
			o.accept(CreateFramedBlocks.GREEN.getGlassPane());
			o.accept(CreateFramedBlocks.GREEN.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.GREEN.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.GREEN.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.GREEN.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.LIME.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.LIME.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.LIME.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.LIME.getTiledGlassPane());
			o.accept(CreateFramedBlocks.LIME.getGlassBlock());
			o.accept(CreateFramedBlocks.LIME.getGlassPane());
			o.accept(CreateFramedBlocks.LIME.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.LIME.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.LIME.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.LIME.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.BLUE.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.BLUE.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.BLUE.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.BLUE.getTiledGlassPane());
			o.accept(CreateFramedBlocks.BLUE.getGlassBlock());
			o.accept(CreateFramedBlocks.BLUE.getGlassPane());
			o.accept(CreateFramedBlocks.BLUE.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.BLUE.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.BLUE.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.BLUE.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.LIGHT_BLUE.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.LIGHT_BLUE.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.LIGHT_BLUE.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.LIGHT_BLUE.getTiledGlassPane());
			o.accept(CreateFramedBlocks.LIGHT_BLUE.getGlassBlock());
			o.accept(CreateFramedBlocks.LIGHT_BLUE.getGlassPane());
			o.accept(CreateFramedBlocks.LIGHT_BLUE.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.LIGHT_BLUE.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.LIGHT_BLUE.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.LIGHT_BLUE.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.CYAN.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.CYAN.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.CYAN.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.CYAN.getTiledGlassPane());
			o.accept(CreateFramedBlocks.CYAN.getGlassBlock());
			o.accept(CreateFramedBlocks.CYAN.getGlassPane());
			o.accept(CreateFramedBlocks.CYAN.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.CYAN.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.CYAN.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.CYAN.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.PURPLE.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.PURPLE.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.PURPLE.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.PURPLE.getTiledGlassPane());
			o.accept(CreateFramedBlocks.PURPLE.getGlassBlock());
			o.accept(CreateFramedBlocks.PURPLE.getGlassPane());
			o.accept(CreateFramedBlocks.PURPLE.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.PURPLE.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.PURPLE.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.PURPLE.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.MAGENTA.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.MAGENTA.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.MAGENTA.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.MAGENTA.getTiledGlassPane());
			o.accept(CreateFramedBlocks.MAGENTA.getGlassBlock());
			o.accept(CreateFramedBlocks.MAGENTA.getGlassPane());
			o.accept(CreateFramedBlocks.MAGENTA.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.MAGENTA.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.MAGENTA.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.MAGENTA.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.PINK.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.PINK.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.PINK.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.PINK.getTiledGlassPane());
			o.accept(CreateFramedBlocks.PINK.getGlassBlock());
			o.accept(CreateFramedBlocks.PINK.getGlassPane());
			o.accept(CreateFramedBlocks.PINK.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.PINK.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.PINK.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.PINK.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.BLACK.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.BLACK.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.BLACK.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.BLACK.getTiledGlassPane());
			o.accept(CreateFramedBlocks.BLACK.getGlassBlock());
			o.accept(CreateFramedBlocks.BLACK.getGlassPane());
			o.accept(CreateFramedBlocks.BLACK.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.BLACK.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.BLACK.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.BLACK.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.GRAY.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.GRAY.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.GRAY.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.GRAY.getTiledGlassPane());
			o.accept(CreateFramedBlocks.GRAY.getGlassBlock());
			o.accept(CreateFramedBlocks.GRAY.getGlassPane());
			o.accept(CreateFramedBlocks.GRAY.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.GRAY.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.GRAY.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.GRAY.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.LIGHT_GRAY.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.LIGHT_GRAY.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.LIGHT_GRAY.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.LIGHT_GRAY.getTiledGlassPane());
			o.accept(CreateFramedBlocks.LIGHT_GRAY.getGlassBlock());
			o.accept(CreateFramedBlocks.LIGHT_GRAY.getGlassPane());
			o.accept(CreateFramedBlocks.LIGHT_GRAY.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.LIGHT_GRAY.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.LIGHT_GRAY.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.LIGHT_GRAY.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.WHITE.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.WHITE.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.WHITE.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.WHITE.getTiledGlassPane());
			o.accept(CreateFramedBlocks.WHITE.getGlassBlock());
			o.accept(CreateFramedBlocks.WHITE.getGlassPane());
			o.accept(CreateFramedBlocks.WHITE.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.WHITE.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.WHITE.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.WHITE.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.BROWN.getGlassDoorBlock());
			o.accept(CreateFramedBlocks.BROWN.getGlassTrapdoorBlock());
			o.accept(CreateFramedBlocks.BROWN.getTiledGlassBlock());
			o.accept(CreateFramedBlocks.BROWN.getTiledGlassPane());
			o.accept(CreateFramedBlocks.BROWN.getGlassBlock());
			o.accept(CreateFramedBlocks.BROWN.getGlassPane());
			o.accept(CreateFramedBlocks.BROWN.getHorizontalGlassBlock());
			o.accept(CreateFramedBlocks.BROWN.getHorizontalGlassPane());
			o.accept(CreateFramedBlocks.BROWN.getVerticalGlassBlock());
			o.accept(CreateFramedBlocks.BROWN.getVerticalGlassPane());

			o.accept(CreateFramedBlocks.TINTED.getTintedGlassDoor());
			o.accept(CreateFramedBlocks.TINTED.getTintedGlassTrapoor());
			o.accept(CreateFramedBlocks.TINTED.getTintedTiledGlass());
			o.accept(CreateFramedBlocks.TINTED.getTintedTiledGlassPane());
			o.accept(CreateFramedBlocks.TINTED.getTintedGlass());
			o.accept(CreateFramedBlocks.TINTED.getTintedGlassPane());
			o.accept(CreateFramedBlocks.TINTED.getHorizontalTintedGlass());
			o.accept(CreateFramedBlocks.TINTED.getHorizontalTintedGlassPane());
			o.accept(CreateFramedBlocks.TINTED.getVerticalTintedGlass());
			o.accept(CreateFramedBlocks.TINTED.getVerticalTintedGlassPane());
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
