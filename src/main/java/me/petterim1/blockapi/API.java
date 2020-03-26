package me.petterim1.blockapi;

import cn.nukkit.block.Block;

import java.util.Map;

public class API {

    /**
     * Register a custom block
     * @param blockId block id
     * @param blockClass block class
     */
    public static void registerBlock(int blockId, Class<? extends Block> blockClass) {
        Loader.registeredBlocks.put(blockId, blockClass);
        Loader.update();
    }

    /**
     * Register multiple custom blocks
     * @param blocks Map<block id, block class>
     */
    public static void registerBlocks(Map<Integer, Class<? extends Block>> blocks) {
        Loader.registeredBlocks.putAll(blocks);
        Loader.update();
    }

    /**
     * Unregister a custom block
     * @param blockId block id
     */
    public static void unregisterBlock(int blockId) {
        Loader.registeredBlocks.remove(blockId);
        Loader.update();
    }

    /**
     * Unregister all custom blocks
     */
    public static void unregisterAll() {
        Loader.registeredBlocks.clear();
        Loader.update();
    }

    /**
     * Get all registered custom blocks
     * @return map of all registered custom blocks
     */
    public static Map<Integer, Class<? extends Block>> getAllCustomBlocks() {
        return Loader.registeredBlocks;
    }
}
