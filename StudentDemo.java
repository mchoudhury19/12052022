import java.util.Arrays;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student ("Kate", 12);
		Student s2 = new Student ("Kate", 13);
		Student s3 = new Student ("John", 10);
		
//		System.out.println(s1.compareTo(s2));
		
		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		System.out.println("Before Sort:");
		for (Student s: students)
			System.out.println(s);
		
		Arrays.sort(students);

		System.out.println("After Sort:");
		for (Student s: students)
			System.out.println(s);

		
	}

}
