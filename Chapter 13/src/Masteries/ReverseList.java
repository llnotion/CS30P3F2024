package Masteries;

import java.util.Scanner;
import java.util.Stack;

public class ReverseList {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        
        int counter = 0;

        System.out.println("Enter a number (999 to quit):  ");
        while (counter < 10) {
            
            int number = input.nextInt();
            
            if (number == 999) {
                break;
            }
            
            stack.push(number);
            counter++;
            
            if (counter < 10) {
                System.out.println("Enter a number (999 to quit):  ");
            }
        }
        
        input.close();
        
        System.out.print("The list reversed is:  ");
        
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
