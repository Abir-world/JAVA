//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//2024000000272
void main() {
//    int id =03;
//    String name= "sakib";
//    int password = 168564;
//    String program = "ME";
//    int  batch = 67;
//    double cgpa = 3.66;
//    String line = id+", "+name+", "+password+", "+program+", "+batch+", "+cgpa+", "+"\n";
//write(line);
    read();
}
public static void read(){
    try{
        RandomAccessFile ra = new RandomAccessFile("student.txt","r");
        String line;
        while((line = ra.readLine()) != null){
            String[] strings = line.split(",");
            for(int i =0; i< strings.length; i++){
                strings[i] = strings[i].trim();
            }
            int id = Integer.parseInt(strings[0]);
            String name = strings[1];
            int password = Integer.parseInt(strings[2]);
            String program = strings[3];
            int batch = Integer.parseInt(strings[4]);
            double cgpa = Double.parseDouble(strings[5]);
            IO.println(id+", "+name+", "+password+","+program+","+batch+", "+cgpa+" ");
        }
        IO.println(line);
    }catch(FileNotFoundException ff){
        IO.println("file not write");
        ff.printStackTrace();
    }catch(IOException ee){
        IO.println("failed to write");
        ee.printStackTrace();
    }

}

public static void write(String line){
    try{
        RandomAccessFile raf = new RandomAccessFile("student.txt", "rw");
        raf.seek(raf.length());
        raf.writeBytes(line);

    }catch(FileNotFoundException ex){
        IO.println("failed to write");
        ex.printStackTrace();
    }catch(IOException ep){
        IO.println("failed to write file");
        ep.printStackTrace();
    }

}
