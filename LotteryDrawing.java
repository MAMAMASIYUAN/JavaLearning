import java.util.*;

/**
 * This program demonstrates array manipulation.
 * @version 1.10 2017-12-12
 * @author MA SI YUAN
 */

 public class LotteryDrawing
 {
     public static void main(String[] args)
     {
         Scanner in = new Scanner(System.in);

         System.out.print("How many number do you need to draw?");
         int k = in.nextInt();

         System.out.print("What is the highest number you can draw?");
         int n = in.nextInt();

         //fill an array with number 1 2 3 ...n

         int[] numbers = new int[n];
         for (int i = 0; i < numbers.length; i++)
         {
             numbers[i] = i + 1;
         }

         // draw k number and put them into a second array
         int[] result = new int[k];
         for (int i = 0; i < result.length; i++)
         {
             // make a random index between 0 and n-1
             int r = (int) (Math.random() * n);

             // pick the element at the random location
             result[i] = numbers[r];

             // move the last element into the random location
             numbers[r] = numbers[n - 1];
             n--;
         }

         // print the sorted array
         Arrays.sort(result);
         System.out.println("Bet the following comnination. It'll make you rich!");
         for (int r : result)
         {
             System.out.print(r);
         }
     }
 }