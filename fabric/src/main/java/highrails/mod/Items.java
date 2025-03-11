package highrails.mod;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.Item;
import org.mtr.mapping.registry.ItemRegistryObject;
import org.mtr.mod.data.RailType;
import org.mtr.mod.item.ItemRailModifier;

public class Items {

	static {
		RAIL_CONNECTOR_450 = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "connector_450"), itemSettings -> new Item(new ItemRailModifier(true,false,true,true, RailType.CREATIVE450,itemSettings)), CreativeModeTabs.HIGHRAILS_STUFF);
		RAIL_CONNECTOR_500 = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "connector_500"), itemSettings -> new Item(new ItemRailModifier(true,false,true,true, RailType.CREATIVE500,itemSettings)), CreativeModeTabs.HIGHRAILS_STUFF);
		RAIL_CONNECTOR_600 = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "connector_600"), itemSettings -> new Item(new ItemRailModifier(true,false,true,true, RailType.CREATIVE600,itemSettings)), CreativeModeTabs.HIGHRAILS_STUFF);
		RAIL_CONNECTOR_700 = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "connector_700"), itemSettings -> new Item(new ItemRailModifier(true,false,true,true, RailType.CREATIVE700,itemSettings)), CreativeModeTabs.HIGHRAILS_STUFF);
		RAIL_CONNECTOR_800 = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "connector_800"), itemSettings -> new Item(new ItemRailModifier(true,false,true,true, RailType.CREATIVE800,itemSettings)), CreativeModeTabs.HIGHRAILS_STUFF);
		RAIL_CONNECTOR_1000 = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "connector_1000"), itemSettings -> new Item(new ItemRailModifier(true,false,true,true, RailType.CREATIVE1000,itemSettings)), CreativeModeTabs.HIGHRAILS_STUFF);

	}
	public static final ItemRegistryObject RAIL_CONNECTOR_450;
	public static final ItemRegistryObject RAIL_CONNECTOR_500;
	public static final ItemRegistryObject RAIL_CONNECTOR_600;
	public static final ItemRegistryObject RAIL_CONNECTOR_700;
	public static final ItemRegistryObject RAIL_CONNECTOR_800;
	public static final ItemRegistryObject RAIL_CONNECTOR_1000;


    public static void init() {
		org.mtr.mod.Init.LOGGER.info("Registering HighSpeed Rails Addon items");
	}
}
