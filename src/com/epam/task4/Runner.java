package com.epam.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Viktoriia Havryliuk
 *
 */
public class Runner {
	
	private static final int CURRENT_YEAR = 2014;
	
	static Comparator<Person> compareName = new Comparator<Person>() {

        public int compare(Person o1, Person o2) {
            return o1.getFullName().compareTo(o2.getFullName());
        }
    };
    static Comparator<Person> compareAge = new Comparator<Person>() {

        public int compare(Person o1, Person o2) {
        	if (o1.getAge(CURRENT_YEAR) > o2.getAge(CURRENT_YEAR))
                return 1;
            if (o1.getAge(CURRENT_YEAR) < o2.getAge(CURRENT_YEAR))
                return -1;
            return 0;
        }
    };

	public static void main(String[] args) {
		Person husband = new Person ("Ivan", "Ivanov",1980);
		Person wife = new Person("Olya", "Ivanova", 1982);
		Person firstChild = new Person("Vasya", "Ivanov", 2000);
		Person secondChild = new Person("Oleg", "Ivanov", 42);
		ArrayList<Person> family = new ArrayList<>();
		family.add(husband);
		family.add(wife);
		family.add(firstChild);
		family.add(secondChild);
		System.out.println("Sorted by name list:\n");
		Collections.sort(family, compareName);
		 for (Person person : family) {
	            System.out.println(person);
	        }
		System.out.println("\nSorted by age list:\n");
		Collections.sort(family, compareAge);
		 for (Person person : family) {
	            System.out.println(person);
	        }

	}

}
