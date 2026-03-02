package net.dakotapride.createframed;

import net.dakotapride.createframed.registry.CreateFramedPackageStyles;
import net.fabricmc.api.ClientModInitializer;

public class CreateFramedModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		CreateFramedPackageStyles.register();
	}
}
