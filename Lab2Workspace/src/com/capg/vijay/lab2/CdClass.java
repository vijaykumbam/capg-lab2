/**
 * 
 */
package com.capg.vijay.lab2;
import java.util.*;
/**added private data for director, genre and year released.
 * @author a
 *
 */
public class CdClass extends MediaItemClass {

	private String directorName;
	private String genre;
	private int year;

	public String getDirectorName() {
		return directorName;
	}
	
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public CdClass(int idNumber, String title, int noOfCopies, String directorName, String genre, int year) //constructor
	{
		super(idNumber, title, noOfCopies);
		// TODO Auto-generated constructor stub
		this.directorName = directorName;
		this.genre = genre;
		this.year = year;
		System.out.println("the book id is = "+idNumber+"\nthe book tittle = "+title+"\nthe noOfcopies = "+noOfCopies);
		System.out.println("the director name ="+directorName+"\ngenre is ="+genre+"\nyear ="+year);
		
	} 
	
	@Override
	void addItem() {
		// TODO Auto-generated method stub
		System.out.println("we are in addItem cdClass");
	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("we are in checkOut cdClass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		CdClass cdobj = new CdClass(1234,"wallsofwolf street",1,"james","comedy",1999);
	}

	

}
