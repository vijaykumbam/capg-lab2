/**
 * 
 */
package com.capg.vijay.lab2;

/**
 * @author a
 *
 */
public abstract class ItemClass {

	private int idNumber;
	private String title;               
	private int noOfCopies;
	
	
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	public ItemClass(int idNumber,String title,int noOfCopies)
	{
		this.idNumber = idNumber;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	
	
	abstract void addItem();
	abstract void checkIn();
	abstract void checkOut();
	
	
}
