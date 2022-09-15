import java.util.ArrayList;

public class Employee extends Staff implements ICalculator{
//    //    //test
//    public static void main(String[] args) {
//        Employee test = new Employee("A01", "Ng Van A", 35, 2.5, "5/6/2022", "Bộ Phận", 8,3);
//        Employee test1 = new Employee("A01", "Ng Văn A BC", 24, 3.5, "5/7/2022", "Bộ Phận ABC", 3,2);
//        test.displayInformation();
//        test1.displayInformation();
//    }
    //Thuộc tính: số giờ làm thêm
    double overTimeHours;
    //constructor
    public Employee(String staffId, String staffName, int staffAge, double salaryRate, String dateStart, String department, int dayOff, double overTimeHours){
        super(staffId, staffName, staffAge, salaryRate, dateStart, department, dayOff);
        this.overTimeHours=overTimeHours;
    }
    //Phương thức: calculateSalary() trả về lương nhân viên, displayInformation() hiển thị thông tin nhân viên.
    public double calculateSalary(){
        return salaryRate*3000000+overTimeHours*200000;
    }
    //  Phương thức: displayInformation() hiển thị thông tin bao gồm cả giờ làm thêm
    @Override
    public void displayInformation(){
        String displayAlign = "%-15s | %-20s | %-10s | %-15s | %-15s | %-15s | %-20s | %-25s | %.2f%n";
        System.out.format(displayAlign,staffId,staffName,staffAge,salaryRate,dateStart,dayOff,department,overTimeHours,calculateSalary());
    }
    //method : get salary
    @Override
    public double getSalary(){
        return calculateSalary();
    }
    //sort a ArrayList<Employee> to get max and min value
    public static ArrayList<Employee> sortEmployeeBySalary  (ArrayList<Employee> employees){
        for (int i=0; i<employees.size(); i++){
            double minValue = employees.get(i).getSalary();
            int minIndex=i;
            for (int j=i;j<employees.size(); j++){
                if (employees.get(j).getSalary()<=minValue) {
                    minValue= employees.get(j).getSalary();
                    minIndex=j;
                }
            }
            employees.add(i,employees.get(minIndex));
            employees.remove(minIndex+1);
        }
        return employees;
    }

}