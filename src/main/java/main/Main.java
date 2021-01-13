package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i;
        int[] array = new int[5];
        int sum = 0;
        int product = 1;
      //  int num =0;
        //int max = num[0];
        int maxNum = 9;
        int minNum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        for(i=0; i<5; i++) {
            array[i] = scanner.nextInt();
        }
        for(int number: array) {
            sum = sum + number;
            product = product * number;

        for(i = 1; i<5; i++){
            if(number >= maxNum)
                maxNum = number;
            } if (number <= minNum){
            minNum = number;
            }
           }

        System.out.println("Sum of number is: " +sum);
        System.out.println("Product of number is: " +product);
        System.out.println("Max number is:" +maxNum);
        System.out.println("Min number is:" +minNum);
        }
}
