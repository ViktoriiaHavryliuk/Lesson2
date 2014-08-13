package com.epam.task4;

/**
 * @author Viktoriia Havryliuk
 *
 */
public class Person {

	private String firstName;
	private String lastName;
	private int dateOfBirth;
	
	public Person ( String firstName, String lastName, int dateOfBirth){
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getFullName(){
		return firstName + " " + lastName;
	}
	
	public int getAge(int curretnYear){
		return curretnYear - dateOfBirth;
	}
	
	@Override
    public String toString() {
        return firstName + " " + lastName;
    }
	
	
}
