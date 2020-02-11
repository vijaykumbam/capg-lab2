/**
 * 
 */
package com.capg.vijay.lab2;

/**added private data for artist and genre
 * @author a
 *
 */
public class VideoClass extends MediaItemClass{

	private String artistName;
	private String genre;
	
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public VideoClass(int idNumber, String title, int noOfCopies, String artistName, String genre) {
		super(idNumber, title, noOfCopies);
		this.artistName=artistName;
		this.genre = genre;
		// TODO Auto-generated constructor stub
		System.out.println("the book id is = "+idNumber+"\nthe book tittle = "+title+"\nthe noOfcopies = "+noOfCopies);
		System.out.println("the artist name="+artistName+"\nthe genre ="+genre);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemClass vcobj = new VideoClass(12345,"sonofsathyamurthi",1,"alluarjun","crime");

	}

	@Override
	void addItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		
	}

}
