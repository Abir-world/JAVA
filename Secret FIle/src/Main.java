//2024000000272
void main() {
    int id = 272;
    String name = "Abdullah";
    String password = "12ABIR";
    String program = "CSE";
    int batch = 66;
    double cgpa = 3.88;

    String courseCode = "CSE261.2";

    String l =id+", "+name+", "+password+", "+program+", "+batch+", "+cgpa;
    String l2 = id+","+courseCode;
    write(l);
    read();
    adviceCourse(l2);

    IO.println("Search Student id:");
    Scanner sc = new Scanner(System.in);
    int studentid = sc.nextInt();
    searchCourse(studentid);

}
void write(String l){
    try{
        RandomAccessFile raf = new RandomAccessFile("student.txt","rw");
        raf.seek(raf.length());
        raf.writeBytes(l+"\n");

    }catch(FileNotFoundException fx){
        IO.println("failed to open");
        fx.printStackTrace();
    }catch(IOException ex){
        IO.println("failed to write");
        ex.printStackTrace();
    }
}

void read(){
    try{
        RandomAccessFile raf = new RandomAccessFile("student.txt","r");
        String l;
        while((l = raf.readLine()) != null ){
            String[] parts = l.split(", ");
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            String password = parts[2];
            String program = parts[3];
            int batch = Integer.parseInt(parts[4]);
            double cgpa = Double.parseDouble(parts[5]);

            IO.println(id+" ,"+name+" ,"+password+", "+program+", "+batch+", "+cgpa+"\n");
        }

    }catch(FileNotFoundException fx){
        IO.println("failed to open");
        fx.printStackTrace();
    }catch(IOException ex){
        IO.println("failed to write");
        ex.printStackTrace();
    }
}
void adviceCourse(String l2){
    try{
        RandomAccessFile raf = new RandomAccessFile("advising.txt", "rw");
        raf.seek(raf.length());
        raf.writeBytes(l2+"\n");

    }catch(FileNotFoundException fx){
        IO.println("failled to open");
        fx.printStackTrace();
    }catch(IOException ex){
        IO.println("failled to write");
        ex.printStackTrace();
    }
}
void  searchCourse(int studentid){
    try{
        RandomAccessFile raf = new RandomAccessFile("advising.txt", "r");
        String l2;
        while((l2 = raf.readLine()) != null){
            String[] parts = l2.split(",");
            int id = Integer.parseInt(parts[0]);
            String courseCode = parts[1];
            IO.println(id+", "+courseCode+" ,"+ studentid);
            if(id == studentid){
                IO.println("Course Code :"+parts[1]);
                break;
            }else {
                IO.println("Invalid id");
            }
        }
    }catch(FileNotFoundException fx){
        IO.println("failled to open");
        fx.printStackTrace();
    }catch(IOException ex){
        IO.println("failled to write");
        ex.printStackTrace();
    }
}



