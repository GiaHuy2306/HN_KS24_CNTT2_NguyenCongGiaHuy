package managerStudent;

import managerStudent.model.Student;

import java.util.ArrayList;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do {
            System.out.print("===== QUẢN LÝ ĐIỂM SINH VIÊN =====\n" +
                    "1. Nhập danh sách sinh viên \n" +
                    "2. Hiển thị danh sách sinh viên \n" +
                    "3. Tìm kiếm sinh viên theo Học lực \n" +
                    "4. Sắp xếp theo học lực giảm dần\n" +
                    "5. Thoát \n" +
                    "==================================\n" +
                    "Chọn chức năng: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1: {
                    String id;
                    String name = "";
                    double score = 0;

                    System.out.print("Nhập id sinh viên (VD:SV000): ");
                    id = input.nextLine();
                    if (id.matches("^SV\\d{3}$")) {
                        System.out.print("Nhập tên sinh viên: ");
                        name = input.nextLine();
                        System.out.print("Nhập điểm của sinh viên: ");
                        score = Double.parseDouble(input.nextLine());
                    }else {
                        System.out.print("Sai định dạng id\n");
                    }

                    students.add(new Student(id, name, score));
                    break;
                }
                case 2: {
                    if (students.isEmpty()) {
                        System.out.print("Danh sách sinh viên trống\n");
                        return;
                    }
                    System.out.println("Danh sách sinh viên:");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
                }
                case 3: {
                    String searchRank;
                    System.out.print("Nhập xếp loại muốn tìm: ");
                    searchRank = input.nextLine();

                    for (Student student : students) {
                        if (student.getRank().equals(searchRank)) {
                            System.out.println(student.toString());
                        }
                    }
                    break;
                }
                case 4: {
                    for (int i = 0; i < students.size(); i++) {
                        for (int j = 0; j < students.size(); j++) {
                            if (students.get(i).equals(students.get(j))) {}
                        }
                    }
                    break;
                }
                case 5: {
                    break;
                }
                default: {
                    break;
                }
            }
        } while (choice != 5);
    }
}
