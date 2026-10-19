import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class STUDENTCOURSEMANAGEMENT {
    Scanner sc = new Scanner(System.in);
void main() {

    if (functionality()) {
        while (true) {
            IO.println("ADD STUDENT");
            IO.println("ASSINGED COUSES TO STUDENT");
            IO.println("VIEW STUDENT COURSE");
            String nx = sc.nextLine();

            switch (nx) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    assignCourse();
                    break;
                case "3":
                    viewCourses();
                    break;
            }
        }
    }
    public void addStudent () {
    try {
        RandomAccessFile raf = new RandomAccessFile("student.txt", "rw");
        raf.seek(raf.length());
        IO.println("Student ID:");
        String id = sc.nextLine();
        raf.writeBytes(id);

    } catch (FileNotFoundException e) {
        IO.println("file not found");
        e.printStackTrace();
    } catch (IOException ex) {
        IO.println("fail;ed to write");
        ex.printStackTrace();
    }
    }
    public static void assignCourse () {
        IO.println("enter student id:");
        String id = sc.nextLine();
        IO.println("Enter course:");
        String courses = sc.nextLine();
        try {
            RandomAccessFile raf = new RandomAccessFile("courses.txt", "rw");
            raf.seek(raf.length());
            raf.writeBytes(id + ":" + courses + "\n");
        } catch (FileNotFoundException e) {
            IO.println("file not found");
            e.printStackTrace();
        } catch (IOException ex) {
            IO.println("failed to write");
            ex.printStackTrace();
        }
    }

}