package com.epam.task4;

import java.util.Comparator;

/**
 * @author Viktoriia Havryliuk
 *
 */
public class Compare implements Comparator<Person> {

	private static final int CURRENT_YEAR = 2014;

	public int compare(Person o1, Person o2) {
        if (o1.getAge(CURRENT_YEAR) > o2.getAge(CURRENT_YEAR))
            return 1;
        if (o1.getAge(CURRENT_YEAR) < o2.getAge(CURRENT_YEAR))
            return -1;
        return 0;
    }

}
