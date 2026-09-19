
package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        boolean check = false;
        int n=0;
        String id,name;
        int age=0;
        double gpa=0;
        do {            
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number student: ");
                n = Integer.parseInt(sc.nextLine());
                if(n<=0) throw new Exception();
                check = false;
            } catch (Exception e) {
                System.out.println("Please enter number > 0");
                check = true;
            }
        } while (check);
        
        for (int i = 0; i < n; i++) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter id: ");
            id = sc.nextLine();
            
            System.out.print("Enter name: ");
            name = sc.nextLine();
            
            boolean check1 = false;
            do {                
                try {
                    System.out.print("Enter age: ");
                    age = Integer.parseInt(sc.nextLine());
                    if(age<=0) throw new Exception();
                    check1 = false;
                } catch (Exception e) {
                    System.out.println("Error! Please enter age again");
                    check1 = true;
            }
            } while (check1);
            
            boolean check2 = false;
            do {                
                try {
                    System.out.print("Enter gpa: ");
                    gpa = Double.parseDouble(sc.nextLine());
                    if(gpa<0 || gpa > 10) throw new Exception();
                    check2 = false;
                } catch (Exception e) {
                    System.out.println("Error! Please enter age again");
                    check2 = true;
            }
            } while (check2);

            
            
            Student std = new Student(id,name,age,gpa);
            studentList.add(std);
            System.out.println();
        }
        System.out.println();
        System.out.println("===== DANH SÁCH SINH VIÊN =====");
        for (int j = 0; j < n; j++) {
            studentList.get(j).display();
            System.out.println();
        }
    }
    
}
