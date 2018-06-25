package com.zxhuaman;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(String.valueOf(i), i);
        }

        Iterator iterator = map.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
