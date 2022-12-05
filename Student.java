
public class Student implements Comparable<Student> {
	
	String name;
	int age;
	
	

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}



	@Override
	public int compareTo(Student o) {
		if (this.age == o.age)
			return 0;
		if (this.age > o.age)
			return 1;
		else
			return -1;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	
	
}
