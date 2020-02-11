/**
 * 
 */
package com.capg.vijay.lab2;

import java.util.Scanner;

/**
 * @author a
 *
 */
public class JournalClass2 extends WrittenItemClass {

	public JournalClass2(int idNumber, String title, int noOfCopies, int publishedYear) {
		super(idNumber, title, noOfCopies);
		this.publishedYear = publishedYear;
		System.out.println("the book id is = "+idNumber+"\nthe book tittle = "+title+"\nthe noOfcopies = "+noOfCopies+"\npublishedYear ="+publishedYear);
		// TODO Auto-generated constructor stub
	}

	private int publishedYear;
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	void checkIn() {
		// TODO Auto-generated method 
		System.out.println("we are in checkIn journalclass");
	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("we are in checkOut journalclass");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the published year");
		Scanner sc = new Scanner(System.in);
		int publishedYear = sc.nextInt();
		ItemClass jcobj = new JournalClass2(1234,"Autonomous research paper",1,publishedYear);
		jcobj.checkIn();
		jcobj.checkOut();
		
	}

	

}
