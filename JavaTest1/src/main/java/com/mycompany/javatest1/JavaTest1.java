/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javatest1;

/**
 *
 * @author willi
 */
import java.util.Scanner;
public class JavaTest1 {
int x;
    public JavaTest1(){ //default constructor 
        x=5;
    }
    public static void main(String[] args) {
        	Scanner sc =new Scanner(System.in);
			int year=Integer.valueOf(sc.nextLine());
		if(year % 100 ==0 ){
			System.out.print("It leap year");
                }
    }
}
