import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Welcome to the Advanced Student System!");

        boolean running = true;
        while(running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Edit Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // تنظيف السطر بعد الرقم

            switch(choice) {
                case 1: // إضافة طالب
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student major: ");
                    String major = scanner.nextLine();
                    students.add(new Student(name, id, major));
                    System.out.println("Student added!");
                    break;

                case 2: // عرض الطلاب
                    System.out.println("\nList of Students:");
                    for(Student s : students) {
                        s.displayStudent();
                    }
                    break;

                case 3: // تعديل بيانات الطالب
                    System.out.print("Enter the ID of the student to edit: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    boolean foundEdit = false;
                    for(Student s : students) {
                        if(s.getId() == editId) {
                            System.out.print("Enter new name: ");
                            s.setName(scanner.nextLine());
                            System.out.print("Enter new major: ");
                            s.setMajor(scanner.nextLine());
                            System.out.println("Student updated!");
                            foundEdit = true;
                            break;
                        }
                    }
                    if(!foundEdit) System.out.println("Student not found!");
                    break;

                case 4: // حذف الطالب
                    System.out.print("Enter the ID of the student to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    boolean foundDelete = false;
                    for(int i = 0; i < students.size(); i++) {
                        if(students.get(i).getId() == deleteId) {
                            students.remove(i);
                            System.out.println("Student deleted!");
                            foundDelete = true;
                            break;
                        }
                    }
                    if(!foundDelete) System.out.println("Student not found!");
                    break;

                case 5: // البحث عن طالب
                    System.out.print("Enter the ID of the student to search: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    boolean foundSearch = false;
                    for(Student s : students) {
                        if(s.getId() == searchId) {
                            s.displayStudent();
                            foundSearch = true;
                            break;
                        }
                    }
                    if(!foundSearch) System.out.println("Student not found!");
                    break;

                case 6: // خروج
                    running = false;
                    System.out.println("Exiting Student System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        scanner.close();
    }
}