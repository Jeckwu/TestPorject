package com;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        System.out.println("1");
        List<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        boolean add = arrayList.add(new Object());
        System.out.println("1");
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
//    private static final int SUM = 1;
}
