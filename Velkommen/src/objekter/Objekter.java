package objekter;

public class Objekter {
	public static void main(String[] args) {
		Student s1 = new Student(123, "Bjarne", "Bjarneson");
		System.out.println(s1);
		s1.skriv();
		System.out.println(s1.getStudNr());
	}
}