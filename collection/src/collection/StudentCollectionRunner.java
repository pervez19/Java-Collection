package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {

	public static void main(String[] args) {

		List<Student> students= List.of(new Student(200,"Sakib","gmail.com"),
										new Student(500,"tahmina","gmail.com"),
										new Student(100,"pervez","gmail.com"));
		List <Student> studentAll = new ArrayList<Student>(students);
		System.out.println(studentAll);
		Collections.sort(studentAll);
		System.out.println(studentAll);
	}
}
