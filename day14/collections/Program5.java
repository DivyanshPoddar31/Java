package day14.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Program5 {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();

		students.add(new Student(2, "Pratik", 60.0));
		students.add(new Student(3, "Ram", 30.0));
		students.add(new Student(4, "Sham", 10.0));
		students.add(new Student(4, "Sham", 65.0));

		Iterator<Student> itr = students.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(fail(students));

	}

	public static ArrayList<Student> fail(ArrayList<Student> list) {
		int size = list.size();
		ArrayList<Student> student = new ArrayList<Student>();
		for (int i = 0; i < size; i++) {
			double marks = list.get(i).getperc();
			if (marks < 40.0) {
				student.add(list.get(i));

			}
		}
		return student;

	}
}
