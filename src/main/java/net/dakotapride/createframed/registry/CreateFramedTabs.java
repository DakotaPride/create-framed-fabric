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


			for (CreateFramedWindows windows : CreateFramedWindows.values()) {
				o.accept(windows.getWindowBlock());
				o.accept(windows.getWindowPaneBlock());
			}

			for (CreateFramedBlocks blocks : CreateFramedBlocks.values()) {
				if (blocks != CreateFramedBlocks.TINTED) {
					o.accept(blocks.getGlassDoorBlock());
					o.accept(blocks.getGlassTrapdoorBlock());
					o.accept(blocks.getTiledGlassBlock());
					o.accept(blocks.getTiledGlassPane());
					o.accept(blocks.getGlassBlock());
					o.accept(blocks.getGlassPane());
					o.accept(blocks.getHorizontalGlassBlock());
					o.accept(blocks.getHorizontalGlassPane());
					o.accept(blocks.getVerticalGlassBlock());
					o.accept(blocks.getVerticalGlassPane());
				}
			}

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


			for (CreateFramedBlocks blocks : CreateFramedBlocks.values())
				if (blocks != CreateFramedBlocks.TINTED) {
					o.accept(blocks.getCardboardBlock());
					o.accept(blocks.getBoundCardboardBlock());
				}

			o.accept(MiscBlocks.KARPBOARD_BLOCK.asItem());
			o.accept(MiscBlocks.SHINY_KARPBOARD_BLOCK.asItem());
			for (CreateFramedPackageStyles.Items items : CreateFramedPackageStyles.Items.values())
				o.accept(items.getPackageItem());
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
