package ro.mirodone;

import java.util.function.Supplier;

public class Challenge3 {

    public static void main(String[] args) {

//        Supplier<String> supplier = () -> {
//            String s = "I love Java !";
//            return s;
//        };
//
//        String iLoveJava = supplier.get();
//        System.out.println(iLoveJava);

        Supplier<String> iLoveJava = () -> "I love Java !";
         System.out.println(iLoveJava.get());

    }

}
