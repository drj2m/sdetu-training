package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice="oval";
		bookTitle="The Lord of The Rings.";
		if(bookTitle.contains(wordChoice))
		System.out.println("the book title contains" + wordChoice);
		else
		 System.out.println("none");
		
		String browser= "Chrome";
		if(browser.equals("Chrome"))
			System.out.println("The browser is " + browser);
		//######################
		String Name="Tim";
		String Last="Short";
		String SSN="1234567";
		System.out.println(Name.substring(1,2));
		System.out.println(Last.substring(1,2));
		System.out.println(SSN.length());
		System.out.println(SSN.substring(5));


		

	}

}
