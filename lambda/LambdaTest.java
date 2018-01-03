
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demonstrates the use of lambda expressions
 * @version 1.01 2017-12-28
 * @author MA SI YUAN
 */

 public class LambdaTest
 {
     public static void main(String[] args) 
     {
         String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
         System.out.println(Arrays.toString(planets));
         System.out.println("Sorted in dictionary order;");
         Arrays.sort(planets);
         System.out.println("Sorted by length");
         Arrays.sort(planets, (first, secend) -> first.length() - secend.length());
         System.out.println(Arrays.toString(planets));

         Timer t = new Timer(10000, event -> System.out.println("This time is " + new Date()));
         t.start();

         // keep program running until user selects "OK"
         JOptionPane.showMessageDialog(null, "Quit program?");
         System.exit(0);
         
     }
 }