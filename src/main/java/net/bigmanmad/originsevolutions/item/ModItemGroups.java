package net.bigmanmad.originsevolutions.item;

import net.bigmanmad.originsevolutions.Originsevolutions;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ORIGINS_EVOLUTIONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Originsevolutions.MOD_ID, "originsevolutions"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.originsevolutions"))
                    .icon(() -> new ItemStack(ModItems.WHITE_STIMULANT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WHITE_STIMULANT);
                        entries.add(ModItems.ORB_FRAGMENT_1);
                        entries.add(ModItems.ORB_FRAGMENT_2);
                        entries.add(ModItems.ORB_FRAGMENT_3);
                        entries.add(ModItems.ORB_FRAGMENT_4);
                        entries.add(ModItems.STIMULATED_MILK);
                        entries.add(ModItems.BEJEWELED_STEAK);
                        entries.add(ModItems.LUSCIOUS_TREAT);
                    }).build());

    public static void registerItemGroups() {
        Originsevolutions.LOGGER.info("Registering Item Groups for" + Originsevolutions.MOD_ID);
    }
}
