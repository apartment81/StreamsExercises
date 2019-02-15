package ro.mirodone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge9 {

    public static void main(String[] args) {

        List<String>  listOfNames = Arrays.asList(
                "Alina",
                "Oana",
                "elena",
                "Irina",
                "andreea",
                "ovidiu",
                "John",
                "Cosmin",
                "george",
                "Silviu"
        );

        //solution 1
//        listOfNames.stream()
//                .map((String s)->s.substring(0,1).toUpperCase() +s.substring(1))
//                .sorted()
//                .forEach(System.out::println);

        //solution 2

//        List<String> upperCaseNames = new ArrayList<>();
//        listOfNames.forEach((String name) ->upperCaseNames.add(name.substring(0,1).toUpperCase() +name.substring(1)));
//        upperCaseNames.sort((s1, s2) ->s1.compareTo(s2));
//        upperCaseNames.forEach( s -> System.out.println(s));

        // convert the code to use method references

//        List<String> upperCaseNames = new ArrayList<>();
//        listOfNames.forEach((String name) ->upperCaseNames.add(name.substring(0,1).toUpperCase() +name.substring(1)));
//        upperCaseNames.sort(String::compareTo);
//        upperCaseNames.forEach( System.out::println);

        //print out how many names begin with letter "a"

//        long countNames = listOfNames
//                .stream()
//                .map((String s)->s.substring(0,1).toUpperCase() +s.substring(1))
//                .filter(s -> s.startsWith("A"))
//                .count();
//        System.out.println(countNames);

        //debug with peek()

        listOfNames.stream()
                .map(s -> s.substring(0,1).toUpperCase() +s.substring(1))
                .peek(System.out::println)
                .sorted()
                .collect(Collectors.toList());


    }
}
