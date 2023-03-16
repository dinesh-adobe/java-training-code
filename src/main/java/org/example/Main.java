package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

                String a = "a";
                String b = "a";
                String c = new String("a");
                String d = "c";

                System.out.println(a == b); // it refering same value with different variables
                System.out.println(a.equals(b)); // it refering checking whether  variable having  same value or not
                System.out.println(c == b); // it reffering all the way new variable with new new values
                System.out.println(c.intern() == b); // it reffering all the way new variable with new  values , c.inter() again check canoical representation
    }
}