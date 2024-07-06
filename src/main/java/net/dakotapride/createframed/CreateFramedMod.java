package net.dakotapride.createframed;

import com.mojang.logging.LogUtils;
import com.simibubi.create.Create;

import com.simibubi.create.foundation.data.CreateRegistrate;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.dakotapride.createframed.registry.CreateFramedBlocks;
import net.dakotapride.createframed.registry.CreateFramedEntityTypes;
import net.dakotapride.createframed.registry.CreateFramedTabs;
import net.fabricmc.api.ModInitializer;
import com.tterrag.registrate.util.nullness.NonNullSupplier;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;

public class CreateFramedMod implements ModInitializer {
	public static final String ID = "createframed";
	private static final Logger LOGGER = LogUtils.getLogger();
	public static final NonNullSupplier<CreateRegistrate> REGISTRATE =
			NonNullSupplier.lazy(() -> CreateRegistrate.create(ID));

	@Override
	public void onInitialize() {
		CreateFramedBlocks.register();
		CreateFramedEntityTypes.register();
		CreateFramedTabs.register();
		REGISTRATE.get().register();

		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", ID.toUpperCase(), Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), ID.toUpperCase());
	}

	public static ResourceLocation asResource(String path) {
		return new ResourceLocation(ID, path);
	}
}
