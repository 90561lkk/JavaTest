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
import java.util.ArrayList;
	public class JavaTest1{
	public static void main(String []args){
            
	ArrayList<Book> arr=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	while(true){
	String user=sc.nextLine();

	if(user.isEmpty()){
                        break;
                    }

	String[] detail=user.split(",");

                      String title=detail[0];
	int page=Integer.valueOf(detail[1]);
	int year=Integer.valueOf(detail[2]);
        
	arr.add(new Book(title,page,year));
	
	}

	for(Book display:arr){
	System.out.print(display);
	}

	
	}


}