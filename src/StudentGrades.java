import java.util.HashMap;
import java.util.Map;
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

        while (!name.equalsIgnoreCase("exit")) {
            System.out.print("Enter the name of a student (or type 'list' to see all, 'exit' to quit): ");
            name = sc.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!!!");
            } else if (name.equalsIgnoreCase("list")) {
                System.out.println("📋 All students and their grades:");
                for (Map.Entry<String, Integer> entry : grades.entrySet()) {
                    System.out.println(entry.getKey() + " → " + entry.getValue());
                }
            } else if (grades.containsKey(name)) {
                System.out.println("The student's grade is: " + grades.get(name));
            } else {
                System.out.println("Student not found. Do you want to add this student? (yes/no)");
                String answer = sc.nextLine();

                if (answer.equalsIgnoreCase("yes")) {
                    System.out.print("Enter the student's grade: ");
                    int newGrade = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    grades.put(name, newGrade);
                    System.out.println(name + " has been added with grade: " + newGrade);
                }
                else if (name.equalsIgnoreCase("list")) {
                    System.out.println("📋 All students and their grades:");
                    for (Map.Entry<String, Integer> entry : grades.entrySet()) {
                        System.out.println(entry.getKey() + " → " + entry.getValue());
                    }
                }

            }
        }
    }
}
