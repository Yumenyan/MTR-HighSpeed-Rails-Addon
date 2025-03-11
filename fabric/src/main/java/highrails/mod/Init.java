package highrails.mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mtr.mapping.registry.Registry;
import org.mtr.mapping.tool.DummyClass;

public class Init {

	public static final String MOD_ID = "highrails";
	public static final Logger LOGGER = LogManager.getLogger("MTRHighSpeedRailsAddon");
	public static final Registry REGISTRY = new Registry();

	public static void init() {
		Items.init();
		CreativeModeTabs.init();
		// Finish registration
		REGISTRY.init();
	}
}
