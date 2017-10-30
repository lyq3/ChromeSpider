package com.lyq3;

public class Fx<T,K,M extends  Number & Comparable & Lyq> {
    private T first;
    private K secod;
    private M tree;
    public <T extends Number> T min(T[] a){
        if(a == null || a.length < 0) return null;
        T s = a[0];
        for(int i = 0 ; i<a.length ; i++){
            System.out.println(a[i]);
        }
        return s;
    }

    public void testDt(Object a){
        System.out.println("Object");
    }
    public void testDt(String s){
        System.out.println("String");
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public K getSecod() {
        return secod;
    }

    public void setSecod(K secod) {
        this.secod = secod;
    }

    public M getTree() {
        return tree;
    }

    public void setTree(M tree) {
        this.tree = tree;
    }
}
