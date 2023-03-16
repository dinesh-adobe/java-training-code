package org.example;

public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("");

       try {
           System.out.println("start 1 try...");
           int a = 1/0;

           System.out.println("end 1 try...");
       }

       catch (ArithmeticException e){
           System.out.println(e);
       }


        try {
            System.out.println("start try...");
            String s = null;
            System.out.println(s.length());
            System.out.println("end try...");
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("rest of code...");
    }

}
