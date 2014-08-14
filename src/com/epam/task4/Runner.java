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

	public static void main(String[] args) {
		Person husband = new Person ("Ivan", "Ivanov",1980);
		Person wife = new Person("Olya", "Ivanova", 1982);
		Person firstChild = new Person("Vasya", "Ivanov", 2000);
		Person secondChild = new Person("Oleg", "Ivanov", 1999);
		ArrayList<Person> family = new ArrayList<>();
		family.add(husband);
		family.add(wife);
		family.add(firstChild);
		family.add(secondChild);
		System.out.println("Sorted by name list:\n");
		Collections.sort(family, new Comparator<Person>() {

			public int compare(Person o1, Person o2) {
				return o1.getFullName().compareTo(o2.getFullName());
			}
		});
		for (Person person : family) {
			System.out.println(person);
		}
		System.out.println("\nSorted by age list:\n");
		Collections.sort(family, new Comparator<Person>() {

			public int compare(Person o1, Person o2) {
				if (o1.getAge(CURRENT_YEAR) > o2.getAge(CURRENT_YEAR))
					return 1;
				if (o1.getAge(CURRENT_YEAR) < o2.getAge(CURRENT_YEAR))
					return -1;
				return 0;
			}
		});
		for (Person person : family) {
			System.out.println(person);
		}
		Person bossMain = new Person ("Ivan", "Petrov",1958);  
		Person emplCleaner = new Person("Olya", "Olya", 1982);
		emplCleaner.boss = bossMain;
		Person emplAccounter = new Person("Vasya", "Ivanov", 2000);
		emplAccounter.boss = bossMain;
		Person empEngineer = new Person(124, bossMain);
		empEngineer.boss = bossMain;
		empEngineer.collegues = new Person[3];
		empEngineer.collegues[0] = bossMain;
		empEngineer.collegues[1] = emplCleaner;
		empEngineer.collegues[2] = emplAccounter;
		System.out.println("\nEngineer's collegues are: \n");
		for (Person p: empEngineer.collegues){
			System.out.println(p);
		}

	}
}
