/*
 * Activity 4.9.7
 */
public class StudentRunner {
    public static void main(String args[]) {
        Student s = new Student("Jim", 12345, 11);
        Student t = new Student("Bob", 54321, 10);
        Student r = new Student("Jake", 12345, 12);

        // Print out each of the students' attributes
        System.out.println(s.toString());
        System.out.println(t.toString());
        System.out.println(r.toString());

        // Print out if s's ID equals t's ID
        System.out.println(s.equals(t));

        // Print out if s's ID equals r's ID
        System.out.println(s.equals(r));
    }
}