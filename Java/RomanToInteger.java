import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = romanToInt(romanNumeral);
        if (result != -1)
        {
            System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
        } else {
            System.out.println("Invalid Roman numeral input.");
        }
        scanner.close();
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--)
        {
            char currentChar = s.charAt(i);
            if (!romanMap.containsKey(currentChar)) 
            {
                return -1;
            }
            int currentValue = romanMap.get(currentChar);

            if (currentValue < prevValue)
            {
                result -= currentValue;
            } 
            else 
            {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}
