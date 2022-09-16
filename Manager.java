import java.util.ArrayList;

//Thừa kế: Manager cũng là nhân viên, nên sẽ thừa kế từ class Staff và implements interface ICalculator
public class Manager extends Staff implements  ICalculator {
//    //test
//    public static void main(String[] args) {
//        Manager test = new Manager("A01", "Ng Van A", 35, 2.5, "5/6/2022", "Bộ Phận", 8,"Technical Leader");
//        Manager test1 = new Manager("A01", "Ng Văn A BC", 24, 3.5, "5/7/2022", "Bộ Phận ABC", 3,"Project Leader");
//        test.displayInformation();
//        test1.displayInformation();
//    }
    //constructor
    //Thuộc tính: chức danh
    String staffTitle;
    public Manager(String staffId, String staffName, int staffAge, double salaryRate, String dateStart, String department, int dayOff, String staffTitle){
        super(staffId, staffName, staffAge, salaryRate, dateStart, department, dayOff);
        this.staffTitle=staffTitle;
    }
    //get salary (manager)

    @Override
    public double calculateSalary() {
        double responsibleSalary = 0.0;
        if (staffTitle.equalsIgnoreCase("Business Leader")) responsibleSalary=8000000;
        else if (staffTitle.equalsIgnoreCase("Project Leader")) responsibleSalary=5000000;
        else if (staffTitle.equalsIgnoreCase("Technical Leader")) responsibleSalary=6000000;
        return salaryRate*5000000 + responsibleSalary;
    }
    //  Phương thức: displayInformation() hiển thị thông tin bao gồm cả chức danh
    @Override
    public void displayInformation() {
        String displayAlign = "%-15s | %-20s | %-10s | %-15s | %-15s | %-15s | %-20s | %-25s | %.2f%n";
        System.out.format(displayAlign,staffId, staffName, staffAge, salaryRate, dateStart, dayOff, department, staffTitle, calculateSalary());
    }
    //method : get salary
    @Override
    public double getSalary(){
        return calculateSalary();
    }
    //sort a ArrayList<Manager> to get max and min value
    public static ArrayList<Manager> sortManagerBySalary  (ArrayList<Manager> managers){
        for (int i=0
             ; i<managers.size(); i++){
            double minValue = managers.get(i).getSalary();
            int minIndex=i;
            for (int j=i;j<managers.size(); j++){
                if (managers.get(j).getSalary()<=minValue) {
                    minValue= managers.get(j).getSalary();
                    minIndex=j;
                }
            }
            managers.add(i,managers.get(minIndex));
            managers.remove(minIndex+1);
        }
        return managers;
    }
}
