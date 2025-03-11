package highrails.mod;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.ItemConvertible;
import org.mtr.mapping.holder.ItemStack;
import org.mtr.mapping.registry.CreativeModeTabHolder;

public final class CreativeModeTabs {

	static {
		HIGHRAILS_STUFF = Init.REGISTRY.createCreativeModeTabHolder(new Identifier(Init.MOD_ID, "highrails_item"), () -> new ItemStack(new ItemConvertible(Items.RAIL_CONNECTOR_700.get().data)));
	}

	public static final CreativeModeTabHolder HIGHRAILS_STUFF;

	public static void init() {
		Init.LOGGER.info("Registering HighSpeed Rails Addon creative mode tabs...");
	}
}
