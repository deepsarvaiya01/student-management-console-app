package com.tss.sms.teacher.main;

import com.tss.sms.teacher.controller.TeacherController;

import java.util.Scanner;

public class TeacherMain {

    private final TeacherController controller = new TeacherController();

    public void show() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Teacher Menu ---");
            System.out.println("1. Add Teacher");
            System.out.println("2. View All Teachers");
            System.out.println("3. Delete Teacher");
            System.out.println("0. Back");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> controller.addTeacher();
                case 2 -> controller.viewTeachers();
                case 3 -> controller.deleteTeacher();
                case 0 -> System.out.println("Returning to main menu.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
