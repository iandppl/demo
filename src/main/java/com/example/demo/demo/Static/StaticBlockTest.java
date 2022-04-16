package com.example.demo.demo.Static;

import java.util.LinkedList;
import java.util.List;

public class StaticBlockTest {
    // As rank list is an overridden method in the java collection class
    // static block has to be used to maintain the integrity of the class pointer to LinkedList class;
    public static List<String> rankList = new LinkedList<>();

    static {
        rankList.add("Captain");
    }
}
