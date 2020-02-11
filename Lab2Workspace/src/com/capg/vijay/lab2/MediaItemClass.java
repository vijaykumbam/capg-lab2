/**
 * 
 */
package com.capg.vijay.lab2;

/**
 * @author a
 *
 */
public abstract class MediaItemClass extends ItemClass{

	public MediaItemClass(int idNumber, String title, int noOfCopies) {
		super(idNumber, title, noOfCopies);
		// TODO Auto-generated constructor stub
	}
	void checkIn() {
		System.out.println("we are in the checkIn method in MediaItem");
	}
}
