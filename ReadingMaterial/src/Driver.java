import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void displayNovelDetails(Novel n) {
		System.out.println("*** Your Novel Information ***\n" + n.toString());
		System.out.println("To Return or get this novel, Please go to the third floor");
	}

	public static void displayTextBookDetails(TextBook tb) {
		System.out.println("*** Your TextBook Information ***\n" + tb.toString());
		System.out.println("To Return or get this textbook, Please go to the second floor");
	}
	
	public static ReadingMaterial findMaterial(ArrayList<ReadingMaterial> library) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the ID of Book");
		int id = input.nextInt();
		for (ReadingMaterial o : library) {
			if (o.getId() == id) {
				return o;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		
		ArrayList<ReadingMaterial> library = new ArrayList<ReadingMaterial>();
		
		TextBook b1 = new TextBook(1234, "Introduction to Java", 500, "Programming", 2);
		TextBook b2 = new TextBook(1235, "Introduction to JS", 300, "Programming", 1);
		Novel n1 = new Novel(1236, "The Great Gatsby", 200, "Mr Gatsby", "Drama");
		Novel n2 = new Novel(1237, "Lolita", 450, "John Doe", "Drama");
			
		library.add(b1);
		library.add(b2);
		library.add(n1);
		library.add(n2);
		
		ReadingMaterial rm = findMaterial(library);
		if (rm instanceof TextBook) {
			TextBook tb = (TextBook)rm;
			displayTextBookDetails(tb);
		} else if (rm instanceof Novel) {
			Novel n = (Novel)rm;
			displayNovelDetails(n);
		} else {
			System.out.println("ID is not correct. Please go to the reception.");
		}
	
	}
}
