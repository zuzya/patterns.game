package me.zuzya.patterns.structural.lightweight;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {

    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String color) {

        TreeType treeType = treeTypes.get(color);
        if (treeType == null) {
            TreeType created = new TreeType(color);
            treeTypes.put(color, created);
            treeType = created;
        }

        return treeType;
    }
}
