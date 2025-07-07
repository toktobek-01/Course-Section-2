import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> grades = new HashMap<>();

        // Predefined students
        grades.put("John", 89);
        grades.put("Emmy", 98);
        grades.put("Alice", 87);
        grades.put("Alex", 90);

        String name = "";

        while(!name.equalsIgnoreCase("exit")) {
            System.out.println("Enter the name of a student (or type 'exit' to quit): ");
            name = sc.nextLine();

            if(name.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!!!");
            } else if ( grades.containsKey(name)) {
                System.out.println("The student's grade is: " + grades.get(name));
            } else {
                System.out.println("Students not found. Do you want to add this student? (yes/no)");
                String asnwer = sc.nextLine();

                if(asnwer.equalsIgnoreCase("yes")) {
                    System.out.println("Enter the student's grade: ");
                    int newGrade = sc.nextInt();
                    sc.nextLine();
                    grades.put(name, newGrade);
                    System.out.println(name + " has been added with grade: " + newGrade);
                }
            }
            }
        }
    }