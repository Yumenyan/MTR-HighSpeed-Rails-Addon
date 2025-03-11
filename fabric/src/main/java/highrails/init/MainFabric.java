package highrails.init;

import net.fabricmc.api.ModInitializer;
import highrails.mod.Init;

public class MainFabric implements ModInitializer {

	@Override
	public void onInitialize() {
		Init.init();
	}
}
