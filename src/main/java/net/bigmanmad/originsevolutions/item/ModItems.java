package net.bigmanmad.originsevolutions.item;

import net.bigmanmad.originsevolutions.Originsevolutions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WHITE_STIMULANT = registerItem("white_stimulant", new Item(new FabricItemSettings().food(ModFoodComponents.WHITE_STIMULANT)));
    public static final Item ORB_FRAGMENT_1 = registerItem("orb_fragment_1", new Item(new FabricItemSettings()));
    public static final Item ORB_FRAGMENT_2 = registerItem("orb_fragment_2", new Item(new FabricItemSettings()));
    public static final Item ORB_FRAGMENT_3 = registerItem("orb_fragment_3", new Item(new FabricItemSettings()));
    public static final Item ORB_FRAGMENT_4 = registerItem("orb_fragment_4", new Item(new FabricItemSettings()));
    public static final Item STIMULATED_MILK = registerItem("stimulated_milk", new Item(new FabricItemSettings()));
    public static final Item BEJEWELED_STEAK = registerItem("bejeweled_steak", new Item(new FabricItemSettings().food(ModFoodComponents.BEJEWELED_STEAK)));
    public static final Item LUSCIOUS_TREAT = registerItem("luscious_treat", new Item(new FabricItemSettings().food(ModFoodComponents.LUSCIOUS_STEAK)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Originsevolutions.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Originsevolutions.LOGGER.info("Registering Mod Items for " + Originsevolutions.MOD_ID);
    }

}
