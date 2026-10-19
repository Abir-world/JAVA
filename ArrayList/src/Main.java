
void main() {
//    int x[] = {1,2,3,45,6};
//    IO.println(x[2]);

//    for(int i=0;i<x.length;i++){
//        IO.println(x[i]);
//    }
//    for(int it : x){
//        IO.println(it);
//    }
//    List<String> nameList = new ArrayList<>();
//    nameList.add("uhfc");
//    nameList.add("uhfc");
//    nameList.add("uhfc");
//    nameList.add("uhfc");
//    nameList.add("uhfc");
//
//    for(String name : nameList){
//        IO.println(name);
//    }

//collection famework
    //initializie er jonno new, hashset
    //set superclass... hashset,treeset eigula subclass
//    Set<String> nameSet = new HashSet<>();
//    nameSet.add("abir");
//    nameSet.add("kakol");
//    nameSet.add("abir");
//    nameSet.add("alvi");
//    nameSet.add("khf");
//IO.println("For SEt :");
//    for(String k : nameSet){
//        IO.println(k);
//    }
//    IO.println(nameSet.size());
//key 10 no page er 2nd oddhai
//    Map<Integer, String> idNameMap = new HashMap<>();
//    idNameMap.put(1001, "Abir");
//    idNameMap.put(1002, "hfvui");
//    idNameMap.put(1001, "kaka");
//
//    List<Student> studentList = new ArrayList<>();
//    IO.println(idNameMap.get(1001));
//bangladesh,india,pakistan;--> Arraylist
//
//    List<String> nameList = new ArrayList<>();
//    nameList.add("uhfc");
//    nameList.add("uhfc");
//    nameList.add("uhfc");

    // Create an ArrayList to store country names
    Scanner sc = new Scanner(System.in);
    ArrayList<String> countries = new ArrayList<>();
    IO.println("Enter 3 country names:");
    for (int i = 1; i <= 3; i++) {
        IO.println("country " + i + ": ");
        String country = sc.nextLine();
        countries.add(country);
    }
    for(String country : countries){
        IO.println(country);
    }

IO.println("enter 3 fruits:");
    String fruit1 = sc.nextLine();
    String fruit2 = sc.nextLine();
    String fruit3 = sc.nextLine();
    Set<String> fruitSet = new HashSet<>();
    fruitSet.add(fruit1);
    fruitSet.add(fruit2);
    fruitSet.add((fruit3));

    for(String it : fruitSet){
        IO.println(fruitSet);
}
    Map<String,Double> nameCgpamap = new HashMap<>();
    String name = sc.next();
    double cgpa = sc.nextDouble();
    nameCgpamap.put(name, cgpa);

    IO.println(nameCgpamap.get(name));




}
