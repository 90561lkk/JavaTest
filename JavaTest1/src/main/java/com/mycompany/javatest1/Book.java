/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javatest1;

 public class Book {
	private String title;
	private int page;
	private int year;

public Book(String name,int pages,int years){
this.title=name;
this.page=pages;
this.year=years;
}

public String getTitle(){
	return this.title;
}
public int getPage(){

	return this.page;
}
public int getYear(){
	return this.year;
}

public String toString(){

	return title + page + year;

}

}