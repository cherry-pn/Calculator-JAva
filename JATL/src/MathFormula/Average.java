/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathFormula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author barlasch_sd2081
 */
public class Average {

     public static void main(String[] args) {
       int x; double result = 0;

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number of value to calculate average:");
  
      x = sc.nextInt();

      int a[] = new int[x];

      System.out.println("enter " + x + " numbers:");

      for(int i=0; i<x; i++)
  a[i] = sc.nextInt();

      for(int i=0; i<x; i++)
  result = result + a[i];
   
       System.out.println("average="+ result/x);

   }
   
}