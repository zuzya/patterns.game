package me.zuzya.patterns.structural.lightweight;

import java.util.stream.IntStream;

public class Runner {

    public static void main(String[] args) {

        TreeType treeType = TreeTypeFactory.getTreeType("qewrty");
        IntStream.of(999999999).forEach((i) -> new Tree(i * 2, 15, treeType));

    }
}
