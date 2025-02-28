package Conditions.Unconditional;

public class SumofEven {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};       
        int sum = 0;       
        for (int num : numbers) {          
            if (num % 2 != 0) {
                continue;
            }           
            sum += num;
        }      
        System.out.println("The sum of even numbers is: " + sum);
    }
}

