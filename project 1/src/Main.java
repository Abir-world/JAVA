import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

//2024000000272
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        if(authenticate()){
            while(true){
                IO.println("1.Add Student:");
                IO.println("2.Search Student Information:");
                IO.println("3.view student ID:");
                IO.println("4.Assign advised course:");
                IO.println("5.View Advised Courses: ");
                IO.println("6. Exit");
                IO.println("Enter choice:");
                String nx = sc.nextLine();

                switch (nx){
                    case "1": addStudent();
                        break;
                    case "2": studentInformation();
                        break;
                    case "3": searchStudent();
                        break;
                    case "4":assignCourse();
                        break;
                    case "5" :viewCourses();
                        break;
                    case "6" :System.exit(0);

                }
            }
        }
    }
    static boolean authenticate(){
        while(true) {
            IO.println("Username:");
            String user = sc.nextLine();
            IO.println("Password: ");
            String pass = sc.nextLine();

            try{
                RandomAccessFile raf = new RandomAccessFile("users.txt", "r");
                String line;
                while((line = raf.readLine()) != null){
                    String[] parts = line.split(",");
                    if(user.equals(parts[0]) && pass.equals(parts[1])){
                        raf.close();
                        return true;
                    }
                }raf.close();

            }catch(FileNotFoundException fx){
                IO.println("FAilled to write");
                fx.printStackTrace();
            }catch(IOException ex){
                IO.println("Failled to write");
                ex.printStackTrace();
            }
        }
    }

    static void addStudent() {
    try {
        RandomAccessFile raf = new RandomAccessFile("student.txt", "rw");
        raf.seek(raf.length());
        IO.println("Student ID :");
        String id = sc.nextLine();
        IO.println(" Name :");
        String name = sc.nextLine();
        IO.println("Program: ");
        String program = sc.nextLine();
        IO.println("Batch :");
        String batch = sc.nextLine();
        IO.println("Password: ");
        String password = sc.nextLine();
        IO.println("CGPA : ");
        String cgpa = sc.nextLine();

        raf.writeBytes(id+ ", "+name+", "+program+", "+batch+", "+password+", "+cgpa+"\n");
        raf.close();
        IO.println("Student Added");

    }catch(FileNotFoundException fx){
        IO.println("Failled to open");
        fx.printStackTrace();
    }catch(IOException ex){
        IO.println("Failled to write");
        ex.printStackTrace();
    }
}
static void studentInformation(){
        try {
            RandomAccessFile raf = new RandomAccessFile("student.txt", "r");
            String line;
            IO.println("\n Students information");
            while((line = raf.readLine()) != null){
                String [] parts = line.split(",");
                IO.println("ID :" + parts[0]);
                IO.println("Name: "+ parts[1]);
                IO.println("Program: "+parts[2]);
                IO.println("Batch: "+parts[3]);
                IO.println("CGPA: "+ parts[5]);
            }raf.close();

        }catch(FileNotFoundException fx){
            IO.println("falled to open");
            fx.printStackTrace();
        }catch (IOException ex){
            IO.println("failed to write");
            ex.printStackTrace();
        }
    }
    static void searchStudent(){
        IO.println("Enter Student ID : ");
        String id = sc.nextLine();

        try {
            RandomAccessFile raf = new RandomAccessFile("student.txt", "r");
            String line;
            while((line = raf.readLine()) != null) {
                String[] p = line.split(",");
                IO.println("ID: "+ p[0]);
                IO.println("Name:"+ p[1]);
                IO.println("Program:"+ p[2]);
                IO.println("Batch:"+ p[3]);
                IO.println("CGPA:"+ p[5]);
            }
        }catch(FileNotFoundException fx){
            IO.println("failled to open");
            fx.printStackTrace();
        }catch(IOException ex){
            IO.println("failed to write");
            ex.printStackTrace();
        }
    }

    static void assignCourse() {
        IO.println("Enter student ID: ");
        String id = sc.nextLine();
        IO.println("Enter courses : ");
        String courses = sc.nextLine();

        try {
            RandomAccessFile raf = new RandomAccessFile("courses.txt", "rw");
            raf.seek(raf.length());
            raf.writeBytes(id + ", "+ courses+"\n");
            IO.println("Courses assigned");

        }catch(FileNotFoundException fx){
            IO.println("failled to open");
            fx.printStackTrace();
        }catch(IOException ex){
            IO.println("failed to write");
            ex.printStackTrace();
        }
    }
    static void viewCourses(){
        IO.println("Enter student id :");
        String id = sc.nextLine();

        try {
            RandomAccessFile raf = new RandomAccessFile("courses.txt", "r");
            String line;
            boolean found = false;
            while((line = raf.readLine()) != null){
                if(line.startsWith(id + ":")) {
                    IO.println("Courses: "+ line.split(":")[1]);
                    found = true;
                    break;
                }
            }
        }catch(FileNotFoundException fx){
            IO.println("failled to open");
            fx.printStackTrace();
        }catch(IOException ex){
            IO.println("failed to write");
            ex.printStackTrace();
        }
    }
}
