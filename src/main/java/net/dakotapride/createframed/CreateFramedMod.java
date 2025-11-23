package net.dakotapride.createframed;

import net.dakotapride.createframed.registry.CreateFramedPackageStyles;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;

import net.dakotapride.createframed.registry.CreateFramedBlocks;
import net.dakotapride.createframed.registry.CreateFramedEntityTypes;
import net.dakotapride.createframed.registry.CreateFramedTabs;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class CreateFramedMod implements ModInitializer {
	public static final String ID = "createframed";
	private static final Logger LOGGER = LogUtils.getLogger();
	public static final NonNullSupplier<CreateRegistrate> REGISTRATE =
			NonNullSupplier.lazy(() -> CreateRegistrate.create(ID));

	@Override
	public void onInitialize() {
		CreateFramedBlocks.register();
		CreateFramedPackageStyles.Items.register();
		CreateFramedEntityTypes.register();
		CreateFramedTabs.register();
		REGISTRATE.get().register();
	}

	public static ResourceLocation asResource(String path) {
		return new ResourceLocation(ID, path);
	}
}
