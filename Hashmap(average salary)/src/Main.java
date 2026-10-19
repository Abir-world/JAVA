//2024000000272
void main() {
    HashMap<Integer, Double > employeeData = new HashMap<>();

    employeeData.put(1001, 56000.0);
    employeeData.put(1002,785656.0);
    employeeData.put(1003,82648.0);
    employeeData.put(1004, 37856.0);
    employeeData.put(1005, 28364.0);

    for(Map.Entry<Integer , Double> entry : employeeData.entrySet()){
        int id = entry.getKey();
        double salary = entry.getValue();
        IO.println(String.format("%5d         ||      %.2f", id, salary));
    }

    double avarage = AvarageSalary(employeeData);
    IO.println(String.format("Avarage Salary : %.2f", avarage));

}
public static double AvarageSalary(HashMap<Integer,Double> map){
    double totalSalary = 0;
    for(Double salary : map.values()){
        totalSalary += salary;
    }
    return totalSalary / map.size();
}
