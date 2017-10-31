package com.lyq3;

public class FxTest {
    public static void main(String[] args) {
        Fx x = new Fx();
        Integer[] s = {1,2,3};
        x.setFirst("ss");
        x.setSecod(3);
        x.setTree(5);
        x.min(s);
        System.out.println(x.getFirst());
        System.out.println(x.getSecod());
        System.out.println(x.getTree());


        x.testDt("sd");
    }
}
