package com.lyq3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class generalTest {
    private static  String a;
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("sds",123);
        boolean flg = map.containsKey("sds");
        Objects.requireNonNull(a,"a是空的");
        System.out.println(flg);
    }
}
