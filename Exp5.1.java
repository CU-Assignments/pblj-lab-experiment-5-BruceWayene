Question Explanation:

writing a Java program to calculate the sum of a list of integers using autoboxing and unboxing, along with methods to parse strings into their respective wrapper classes (e.g., Integer.parseInt()).

Steps to implement:
1. Create a List of Integers: Initialize a List<Integer> to hold the integers.
2. Autoboxing: Use autoboxing to convert primitive int values to Integer objects automatically when adding to the list.
3. Unboxing: Use unboxing to convert Integer objects back to int for sum calculation.
4. Parse Strings: Create a utility method to parse strings to integers using Integer.parseInt().
5. Calculate the Sum: Use a loop or Java 8 streams to calculate the sum of the list.

  
Java Program:

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerSumCalculator {

   
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str); 
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null; 
        }
    }

   
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num != null) {
                sum += num; 
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            Integer number = parseStringToInteger(input);
            if (number != null) {
                numbers.add(number);
            }
        }

        scanner.close();

        System.out.println("The sum of the list is: " + calculateSum(numbers));
    }
}
