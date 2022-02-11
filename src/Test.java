import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập lớp: ");
        String classes = scanner.nextLine();
        Student student1 = new Student();
        student1.setName(name);
        student1.setClasses(classes);
    }
}
