import java.util.*;
import java.util.stream.Collectors;

import static java.lang.StringTemplate.STR;

public class Test {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{5,2,6,4};
        List<Integer> integer = Arrays.asList(array);
        Collections.sort(integer);
        List<Integer> sortedList =integer.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        String name = "Sachin P";
        String message = String.format("Welcome %s", name);
        System.out.println(message);

        String message1 = STR."Welcome \{name}!";
        System.out.println(message1);
        int x = 50;
        int y = 20;
        String result = STR."\{x} + \{y} = \{x + y}";
        System.out.println(result);
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println("Love:"+list.get(list.iterator().next()));
// Fetch the first element (element at index 0)
        int firstElement = list.getFirst();
// Fetch the last element
        int lastElement = list.getLast();
        System.out.println("First:"+firstElement +",last:"+lastElement);
        String response = "yes";
        switch (response) {
            case "yes", "a" -> System.out.println("You said yes!");
            case "no", "b" -> System.out.println("You said no!");
            default -> System.out.println("Please choose.");
        }
        try {
            int number = Integer.parseInt(response);
// Use 'number'
        } catch (NumberFormatException _) {
            System.out.println("Invalid input: " + response);
        }

        Object obj = list; // Use Object type to accommodate different types

        String rst = switch (obj) {

            case Byte _, Short _, Integer _, Long _ -> "Input is a Number";
            case Float _, Double _ -> "Input is a floating-point number";
            case String _ -> "Input is a string";
            default -> "Object type not expected";
        };

        System.out.println(rst);

    }


}
