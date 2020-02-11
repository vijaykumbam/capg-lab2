/**
 * 
 */
package com.capg.vijay.lab2;

/**
 * @author a
 *
 */
public class BookClass extends WrittenItemClass{

	public BookClass(int idNumber, String title, int noOfCopies) {
		super(idNumber, title, noOfCopies);
		// TODO Auto-generated constructor stub
		System.out.println("the book id is = "+idNumber+"\nthe book tittle = "+title+"\nthe noOfcopies = "+noOfCopies);
	}
	@Override
	void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("checkin method of bookclass");
	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("checkout method of bookclass");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to bookClass module");
		ItemClass bcobj = new BookClass(12345,"LifeOfPie",1);
	}


}
