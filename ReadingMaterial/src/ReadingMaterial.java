
public class ReadingMaterial {
	
	private String title;
	private int numOfPages;
	private int id;
	public final String DEFAULT_STRING = "Unknown";
	
	
	//CONSTRUCTOR
	
	public ReadingMaterial(int id, String title, int numOfPages) {
		setId(id);
		setTitle(title);
		setNumOfPages(numOfPages);
	}
	
	
	//GETTER
		
	/*
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/*
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/*
	 * @return numOfPages
	 */
	public int getNumOfPages() {
		return numOfPages;
	}
	
	
	// SETTER

	/*
	 * @param title
	 */
	public void setTitle(String title) {	
		if (!title.isEmpty() && !title.equalsIgnoreCase(null)) {
			this.title = title;
		} else {
			this.title = DEFAULT_STRING;
		}	
	}
	/*
	 * @param numOfPages
	 */
	public void setNumOfPages(int numOfPages) {
		if (numOfPages > 0) {
			this.numOfPages = numOfPages;
		} else {
			this.numOfPages = 1;
		}		
	}
	/*
	 * @param id
	 */
	public void setId(int id) {
		if (id > 1000 && id < 10000) {
			this.id = id;
		} else {
			this.id = 1000;
		}		
	}
	
	
	
	@Override
	public String toString() {
		return "Title : " + getTitle() + 
				"Number of pages : " + getNumOfPages();
	}
}
