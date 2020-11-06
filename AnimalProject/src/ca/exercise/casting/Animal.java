package ca.exercise.casting;

public class Animal {
	private String name;
	
	/*
	 * constructor
	 */
	public Animal(String name) {
		setName(name);
	}
	
	/*
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
