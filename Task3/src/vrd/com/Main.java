package vrd.com;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Tom","LE", 18, "M", "NAU");
		Student student2 = new Student("Jhon","BE", 18, "M", "NAU");
		Student student3 = new Student("aA","RU", 18, "M", "NAU");
		Student student4 = new Student("Alex","GUL", 18, "M", "NAU");
		Student student5 = new Student("aa","Ivan", 18, "M", "NAU");
		Student student6 = new Student("Ab","Gre", 18, "W", "NAU");
		Student student7 = new Student("Alla","Bre", 18, "W", "NAU");
		Student student8 = new Student("Kate","Den", 18, "W", "NAU");
		Student student9 = new Student("Lili","Gen", 18, "W", "NAU");
		Student student10 = new Student("Kira","Jan", 18, "W", "NAU");
		Student student11 = new Student("Juli","Int", 18, "W", "NAU");
		Group groupOne = new Group("A17");
		// check 1st student and group after creation
		System.out.println(student1);
		System.out.println(groupOne);
		System.out.println();

		// add 10 students to the group
		groupOne.addStudent(student1);
		groupOne.addStudent(student2);
		groupOne.addStudent(student3);
		groupOne.addStudent(student4);
		groupOne.addStudent(student5);
		groupOne.addStudent(student6);
		groupOne.addStudent(student7);
		groupOne.addStudent(student8);
		groupOne.addStudent(student9);
		groupOne.addStudent(student10);
		System.out.println();

		// trying to add 11th student or same student again

		groupOne.addStudent(student1);
		groupOne.addStudent(student11);
		System.out.println();

		// check 1st student and group after adding

		System.out.println(student1);
		System.out.println(groupOne);
		System.out.println();

		// remove 2 students

		groupOne.removeStudent(student2);
		groupOne.removeStudent(student6);

		// trying remove student2 again

		groupOne.removeStudent(student2);

		// trying remove not presented student

		groupOne.removeStudent(student11);
		System.out.println();

		// check student after removal

		System.out.println(student2);
		System.out.println();
		// check group after removal SORTED by name
		System.out.println(groupOne);
		System.out.println();

		// find student by name
		groupOne.findStudent("Alex");

	}

}
