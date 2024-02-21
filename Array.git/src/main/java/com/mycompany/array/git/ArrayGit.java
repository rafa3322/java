/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array.git;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class ArrayGit {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);  
      int [] n = new int [5];
      for (int i = 0; i < 5; i++) {
        System.out.println("Digite um numero: ");
        n[i] = scanner.nextInt();
      }
      for (int i = 0; i < 5; i++) {
      System.out.println(n[i]);  
      }
      for (int i = 4; i >=0; i--) {
      System.out.println(n[i]);  
      }
    }
}
