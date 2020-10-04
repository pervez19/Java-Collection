package collection;

import java.util.Comparator;

public class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare( o2.getId(),o1.getId());
	}

}
