package net.larsn.portalbound.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.larsn.portalbound.Portalbound;
import net.larsn.portalbound.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PORTALBOUND_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Portalbound.MOD_ID, "portalbound_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.portalbound.portalbound_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                    })
                    .build());

    public static void registerItemGroups() {
        Portalbound.LOGGER.info("Registering Item Groups for "+ Portalbound.MOD_ID);
    }
}
