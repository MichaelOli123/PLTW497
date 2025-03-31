/*
 * Activity 4.9.7
 */ 
public class Student { 
    private String name = "";
    private int id;
    private int year;

    // Constructor 
    Student(String inputName, int id, int year) { 
        this.name = inputName;
        this.id = id;
        this.year = year;
    }

    public String toString() {
        return String.format("Name: %s, ID: %d, Year: %d", name, id, year);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return id == student.id;
    }

}