package com.epam.task4;

/**
 * @author Viktoriia Havryliuk
 *
 */
public class Person {

	private String firstName; 
	private String lastName; 
	private int dateOfBirth; 
	private long id ;
	Person boss;
	Person[] collegues;
	private static final int MIN_DATE_OF_BIRTH = 1900;

	static long counter = 0;

	{
		id = counter++;
	}

	public Person ( String firstName, String lastName, int dateOfBirth){ 
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.dateOfBirth = dateOfBirth;
		if (dateOfBirth < MIN_DATE_OF_BIRTH) {
			throw new IllegalArgumentException(
					"Date of birth must be >= " + MIN_DATE_OF_BIRTH);
		}
	}

	public Person (long id, Person boss){
		this.id = id;
		this.boss = boss;
	}

	public String getFullName(){ 
		return firstName + " " + lastName; 
	} 

	public int getAge(int curretnYear){ 
		return curretnYear - dateOfBirth; 
	} 
	
	public long getId(){
		return id;
	}

	static long getTotalNumber() {
		return counter;
	}

	@Override 
	public String toString() { 
		return firstName + " " + lastName; 
	} 
}
