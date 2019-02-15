package ro.mirodone;

import java.util.function.Function;

public class Challenge2 {
    public static void main(String[] args) {

        String result = everySecondChar("aabbccddeeffgghh");
        System.out.println(result);





        Function<String, String> lambdaMethod = (String source) -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i=0; i<source.length(); i++){
                if(i% 2 ==1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(lambdaMethod.apply("0123456789"));

        everySecondCharacter(lambdaMethod, "1234567890");


    }
    private static String everySecondChar (String source){
        StringBuilder returnVal = new StringBuilder();
        for(int i=0; i<source.length(); i++){
            if(i% 2 ==1){
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }


     private static void everySecondCharacter (Function<String, String> lambdaParameter , String text){
                System.out.println(lambdaParameter.apply(text));
    }
}
