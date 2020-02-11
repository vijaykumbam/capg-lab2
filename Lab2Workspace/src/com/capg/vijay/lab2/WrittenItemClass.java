/**
 * 
 */
package com.capg.vijay.lab2;

/**
 * @author a
 *
 */
public abstract class WrittenItemClass extends ItemClass {

	private String authorName;
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public WrittenItemClass(int idNumber, String title, int noOfCopies) //constructor
	{
		super(idNumber, title, noOfCopies);
		this.authorName = authorName;
		// TODO Auto-generated constructor stub
	}
	void addItem() {
		 System.out.println("Item is added successfully");
	 }
}
