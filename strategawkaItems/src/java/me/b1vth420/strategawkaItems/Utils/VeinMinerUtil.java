package me.b1vth420.strategawkaItems.Utils;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class VeinMinerUtil {

    private static void getConnectedblocks(Block block, Set<Block> results, List<Block> todo) {
        Set<Block> result = results;
        for (BlockFace face : BlockFace.values()) {
            if (!face.equals(BlockFace.SELF)) {
                Block b = block.getRelative(face);
                if (b.getType() == block.getType()) {
                    if (result.add(b)) {
                        todo.add(b);
                    }
                }
            }
        }
    }
    private static void getConnectedblocksWOOD(Block block, Set<Block> results, List<Block> todo) {
        Set<Block> result = results;
        for (BlockFace face : BlockFace.values()) {
            if (!face.equals(BlockFace.SELF) && !face.equals(BlockFace.DOWN)) {
                Block b = block.getRelative(face);
                if (b.getType() == block.getType()) {
                    if (result.add(b)) {
                        todo.add(b);
                    }
                }
            }
        }
    }

    public static Set<Block> getConnectedblocksWOOD(Block block) {
        Set<Block> set = new HashSet<>();
        LinkedList<Block> list = new LinkedList<>();
        list.add(block);
        while((block = list.poll()) != null) {
            if(set.size() >= 30) return set;
            getConnectedblocksWOOD(block, set, list);
        }
        return set;
    }

    public static Set<Block> getConnectedblocks(Block block) {
        Set<Block> set = new HashSet<>();
        LinkedList<Block> list = new LinkedList<>();
        list.add(block);
        while((block = list.poll()) != null) {
            if(set.size() >= 30) return set;
            getConnectedblocks(block, set, list);
        }
        return set;
    }
}
