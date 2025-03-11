package highrails.init;

import net.fabricmc.api.ClientModInitializer;
import highrails.mod.InitClient;

public class MainFabricClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		InitClient.init();
	}
}
