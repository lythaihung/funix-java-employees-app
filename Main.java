import java.util.*;

public class Main {
    //create input for all program
    static Scanner sc=new Scanner(System.in);

    // Main scroll
    public static void main(String[] args) {
        //create arg : employees
        ArrayList<Employee> employees = new ArrayList<Employee>();
        //create arg : managers
        ArrayList<Manager> managers = new ArrayList<Manager>();
        //test
//        managers.add(new Manager("A01", "Ng Van A", 35, 5.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        managers.add(new Manager("A01", "Ng Van A", 35, 2.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        managers.add(new Manager("A01", "Ng Van A", 35, 4.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        managers.add(new Manager("A01", "Ng Van A", 35, 4.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        employees.add(new Employee("A01", "Ng Van A", 35, 5.5, "5/6/2022", "Công nghệ thông tin", 8,3));
//        employees.add(new Employee("A01", "Ng Van A", 35, 2.5, "5/6/2022", "Công nghệ thông tin", 8,3));
//        employees.add(new Employee("A01", "Ng Van A", 35, 2.5, "5/6/2022", "Công nghệ thông tin", 8,3));
        //create arg : departments
        ArrayList<Department> departments = new ArrayList<Department>();
        departments.add(new Department("HC","Hành chính nhân sự",0));
        departments.add(new Department("IT","Công nghệ thông tin",0));
        departments.add(new Department("MKT","Marketing",0));
        //Main menu loop
        int menuSelection;
        do {
            do {
                menuSelection = menu();
                if (menuSelection==1) renderStaffList(employees, managers);
                else  if (menuSelection==2) renderDepartmentList(departments);
                else if (menuSelection==3) renderStaffByDepartment(departments,employees,managers);
                else if (menuSelection==4) newStaff(departments,employees,managers);
                else if (menuSelection==5) findStaff(employees,managers);
                else if (menuSelection==6) sortByDescreaseSalary(employees,managers);
                else if (menuSelection==7) sortByIncreaseSalary(employees,managers);
            } while (menuSelection>=1 && menuSelection<8);
            if (menuSelection!=8) System.out.println("Try again!");
        } while (menuSelection!=8);
        //<<end>> Main menu loop
//test
//        //1. Hiển thị danh sách nhân viên hiện có trong công ty.
//        managers.add(new Manager("A01", "Ng Van A", 35, 2.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        employees.add(new Employee("A01", "Ng Van A", 35, 2.5, "5/6/2022", "Công nghệ thông tin", 8,3));
//        renderStaffList(employees, managers);
//
//        //2. Hiển thị các bộ phận trong công ty.
//        departments.add(new Department("HC","Hành chính nhân sự",0));
//        departments.add(new Department("IT","Công nghệ thông tin",0));
//        departments.add(new Department("MKT","Marketing",0));
//        renderDepartmentList(departments);
//
//        //3. Hiển thị các nhân viên theo từng bộ phận
//        renderStaffByDepartment(departments,employees,managers);
//
//        //4. Thêm nhân viên mới vào công ty.
//        newStaff();
//
//        //5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên
//        findStaff(employees,managers);

        //6. Hiển thị bảng lương của nhân viên toàn công ty
//        ArrayList<Staff> list = new ArrayList<Staff>();
//        list.add(new Manager("A01", "Ng Van A", 35, 5.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        list.add(new Manager("A01", "Ng Van A", 35, 5.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        list.add(new Manager("A01", "Ng Van A", 35, 5.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        list.add(new Manager("A01", "Ng Van A", 35, 5.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        list.add(new Manager("A01", "Ng Van A", 35, 5.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        list.add(new Manager("A01", "Ng Van A", 35, 5.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        list.add(new Manager("A01", "Ng Van A", 35, 5.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        for (Staff obj: list) obj.displayInformation();
//        managers.add(new Manager("A01", "Ng Van A", 35, 5.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        managers.add(new Manager("A01", "Ng Van A", 35, 2.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        managers.add(new Manager("A01", "Ng Van A", 35, 4.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        managers.add(new Manager("A01", "Ng Van A", 35, 4.5, "5/6/2022", "Hành chính nhân sự", 8,"Technical Leader"));
//        employees.add(new Employee("A01", "Ng Van A", 35, 5.5, "5/6/2022", "Công nghệ thông tin", 8,3));
//        employees.add(new Employee("A01", "Ng Van A", 35, 2.5, "5/6/2022", "Công nghệ thông tin", 8,3));
//        employees.add(new Employee("A01", "Ng Van A", 35, 2.5, "5/6/2022", "Công nghệ thông tin", 8,3));
//        employees.add(new Employee("A01", "Ng Van A", 35, 4.5, "5/6/2022", "Công nghệ thông tin", 8,3));
//        Collections.sort(managers, new Comparator<Manager>() {
//            @Override
//            public int compare(Manager o1, Manager o2) {
//                if (o1.getSalary() > o2.getSalary()) return -1;
//                else if (o1.getSalary() < o2.getSalary()) return 1;
//                return 0; //or return (o1.getSalary() >= o2.getSalary())? -1 : 1 ;
//            }
//            });
//        sortByIncreaseSalary(employees,managers);
        //7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần.
//        sortByDescreaseSalary(employees,managers);
    }
    //Main menu
    private static int menu (){
        System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty.");
        System.out.println("2. Hiển thị các bộ phận trong công ty.");
        System.out.println("3. Hiển thị các nhân viên theo từng bộ phận.");
        System.out.println("4. Thêm nhân viên mới vào công ty.");
        System.out.println("5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên.");
        System.out.println("6. Hiển thị bảng lương của nhân viên toàn công ty.");
        System.out.println("7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần.");
        System.out.println("8. Thoát chương trình.");
        System.out.print("Lựa chọn của bạn: ");
        int menuSelection = sc.nextInt();
        return menuSelection;
    }
    //1. Hiển thị danh sách nhân viên hiện có trong công ty.
    private static void renderStaffList (ArrayList<Employee> employees, ArrayList<Manager> managers){
        String displayAlign = "%-15s | %-20s | %-10s | %-15s | %-15s | %-15s | %-20s | %-25s | %-30s%n";
        System.out.format(displayAlign,"Mã nhân viên", "Tên nhân viên", "Tuổi", "HS lương", "Ngày vào làm", "Ngày nghỉ phép",
                "Bộ phận", "Số giờ làm thêm/Chức vụ", "Lương");
        for (int i=0; i<175; i++) System.out.print("-");
        System.out.println();
        for (int i=0; i<employees.size(); i++) employees.get(i).displayInformation();
        for  (int i=0; i<managers.size(); i++) managers.get(i).displayInformation();
    }

    //2. Hiển thị các bộ phận trong công ty.
    private static void renderDepartmentList (ArrayList<Department> departments){
        String displayAlign = " %-20s | %-30s | %-20s %n";
        System.out.format(displayAlign, "Mã bộ phận","Tên bộ phận", "Số lượng nhân viên hiện tại");
        for (int i=0; i<departments.size(); i++) departments.get(i).toString();
    }

    //3. Hiển thị các nhân viên theo từng bộ phận
    private static void renderStaffByDepartment(ArrayList<Department> departments, ArrayList<Employee> employees, ArrayList<Manager> managers){
        for (int i=0; i < departments.size(); i++){
            String departmentName = departments.get(i).getDepartmentName();
            System.out.println(departmentName);
            System.out.println("---------------------------------------------------");
            String displayAlign = "%-15s | %-20s | %-10s | %-15s | %-15s | %-15s | %-20s | %-25s | %-30s%n";
            System.out.format(displayAlign,"Mã nhân viên", "Tên nhân viên", "Tuổi", "HS lương", "Ngày vào làm", "Ngày nghỉ phép",
                    "Bộ phận", "Số giờ làm thêm/Chức vụ", "Lương");
            for (int j=0; j<employees.size(); j++) {
                if (employees.get(j).getDepartment().equals(departmentName)) employees.get(j).displayInformation();
            }
            for  (int j=0; j<managers.size(); j++) {
                if(managers.get(j).getDepartment().equals(departmentName)) managers.get(j).displayInformation();
            }
            System.out.println();
        }
    }

    //4. Thêm nhân viên mới vào công ty.
    //select employee or manager
    private static void newStaff(ArrayList<Department> departments, ArrayList<Employee> employees, ArrayList<Manager> managers){
        int staffType;
        do {
            System.out.println("1. Thêm nhân viên thông thường");
            System.out.println("2. Thêm nhân viên là cấp quản lý (Có thêm chức vụ)");
            System.out.print("Bạn chọn: ");
            staffType = sc.nextInt();
            if (staffType!=1 && staffType!=2) System.out.println("Chỉ chọn 1 hoặc 2, vui lòng thử lại...");
        } while (staffType!=1 && staffType!=2);
        fillInformationStaff(staffType,departments,employees,managers);

    }
    //input general staff information
    private static void fillInformationStaff(int staffType, ArrayList<Department> departments, ArrayList<Employee> employees, ArrayList<Manager> managers){
        System.out.print("Nhập mã nhân viên: ");
        String staffId = sc.next();
        sc.nextLine(); //nextLine() need input "enter" because if it hasn't that next nextLine() will input "enter" and appear error same pass away input needed.
        System.out.print("Nhập tên nhân viên: ");
        String staffName= sc.nextLine();
        System.out.print("Nhập tuổi nhân viên: ");
        int staffAge = sc.nextInt();
        System.out.print("Nhập hệ số lương của nhân viên: ");
        double salaryRate = sc.nextDouble();
        System.out.print("Nhập ngày vào làm của nhân viên: ");
        String dateStart = sc.next();
        System.out.print("Nhập số ngày nghỉ phép của nhân viên: ");
        int dayOff = sc.nextInt();
        System.out.println("1. HC - Hành chính nhân sự");
        System.out.println("2. IT - Công nghệ thông tin");
        System.out.println("3. MKT -  Marketing");
        int departmentNumber=0;
        String department = "";
        do {
            System.out.print("Bạn chọn bộ phận: ");
            departmentNumber = sc.nextInt();
            if (departmentNumber<1 || departmentNumber>3) System.out.println("Chỉ chọn 1, 2 hoặc 3, vui lòng thử lại...");
        } while (departmentNumber<1 || departmentNumber>3);
        if (departmentNumber==1) department="Hành chính nhân sự";
        else if (departmentNumber==2) department="Công nghệ thông tin";
        else if (departmentNumber==3) department="Marketing";
        //increasing staff +1 in department
        departments.set(departmentNumber-1,
                new Department(departments.get(departmentNumber-1).getDepartmentId(),department,departments.get(departmentNumber-1).getStaffNumbers()+1));
        if (staffType==1) {
            int overTimeHours = fillInformationOnlyEmployee();
            employees.add(new Employee(staffId,staffName,staffAge,salaryRate,dateStart,department,dayOff,overTimeHours));

        } else if (staffType==2) {
            String staffTitle= fillInformationOnlyManager();
            managers.add(new Manager(staffId,staffName,staffAge,salaryRate,dateStart,department,dayOff,staffTitle));

        }
    }
    //input employee info
    private static int fillInformationOnlyEmployee(){
        System.out.print("Nhập số giờ làm thêm: ");
        int overTimeHours = sc.nextInt();
        return overTimeHours;
    }
    //input manager info
    private static String fillInformationOnlyManager(){
        int staffTitleNumber = 0;
        String staffTitle = "";
        do {
            System.out.println("Chức danh:");
            System.out.println("1. Business Leader");
            System.out.println("2. Project Leader");
            System.out.println("3. Technical Leader");
            System.out.print("Nhập chức danh: ");
            staffTitleNumber = sc.nextInt();
            if (staffTitleNumber<1 || staffTitleNumber>3) System.out.println("Chỉ chọn 1, 2 hoặc 3, vui lòng thử lại...");
        } while (staffTitleNumber<1 || staffTitleNumber>3);
        if (staffTitleNumber==1) staffTitle = "Business Leader";
        else if (staffTitleNumber==2) staffTitle = "Project Leader";
        else if (staffTitleNumber==3) staffTitle = "Technical Leader";
        return staffTitle;
    }

    //5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên
    //Select find staff by name or id
    private static void findStaff(ArrayList<Employee> employees, ArrayList<Manager> managers){
        int findStaffSelection=0;
        do{
            System.out.println("1. Tìm nhân viên bằng tên:");
        System.out.println("2. Tìm nhân viên bằng mã nhân viên:");
        System.out.print("Bạn chọn: ");
        findStaffSelection = sc.nextInt();
        if (findStaffSelection!=1 && findStaffSelection!=2) System.out.println("Chỉ chọn 1 hoặc 2, vui lòng thử lại...");
        } while (findStaffSelection!=1 && findStaffSelection!=2);
        if (findStaffSelection==1) findStaffByName(employees,managers);
        else if (findStaffSelection==2) findStaffById(employees,managers);
    }
    //find staff by name
    private static void findStaffByName(ArrayList<Employee> employees, ArrayList<Manager> managers){
        System.out.println("\nNhập tên nhân viên cần tìm:");
        sc.nextLine();
        String findName = sc.nextLine();
        String displayAlign = "%-15s | %-20s | %-10s | %-15s | %-15s | %-15s | %-20s | %-25s | %-30s%n";
        System.out.format(displayAlign,"Mã nhân viên", "Tên nhân viên", "Tuổi", "HS lương", "Ngày vào làm", "Ngày nghỉ phép",
                "Bộ phận", "Số giờ làm thêm/Chức vụ", "Lương");
        for (int i=0; i<employees.size(); i++) {
            if (employees.get(i).getStaffName().contains(findName)) employees.get(i).displayInformation();
        }
        for  (int i=0; i<managers.size(); i++) {
            if (managers.get(i).getStaffName().contains(findName)) managers.get(i).displayInformation();
        }

    }
    //find staff by id
    private static void findStaffById(ArrayList<Employee> employees, ArrayList<Manager> managers){
        System.out.println("\nNhập mã nhân viên cần tìm:");
        String findId = sc.next();
        String displayAlign = "%-15s | %-20s | %-10s | %-15s | %-15s | %-15s | %-20s | %-25s | %-30s%n";
        System.out.format(displayAlign,"Mã nhân viên", "Tên nhân viên", "Tuổi", "HS lương", "Ngày vào làm", "Ngày nghỉ phép",
                "Bộ phận", "Số giờ làm thêm/Chức vụ", "Lương");
        for (int i=0; i<employees.size(); i++) {
            if (employees.get(i).getStaffId().contains(findId)) employees.get(i).displayInformation();
        }
        for  (int i=0; i<managers.size(); i++) {
            if (managers.get(i).getStaffId().contains(findId)) managers.get(i).displayInformation();
        }

    }

    //6-7 Hiển thị bảng lương của nhân viên toàn công ty
    //sorting staff by ascending salary order
    private static void sortByIncreaseSalary(ArrayList<Employee> employees, ArrayList<Manager> managers){
        //create clone args prevent change on original args
        ArrayList<Employee> employees1 = new ArrayList<>(employees);
        ArrayList<Manager> managers1 = new ArrayList<>(managers);
        //sorting each arg
        Employee.sortEmployeeBySalary(employees1);
        Manager.sortManagerBySalary(managers1);
        //sorting by compare 2 args instance
        int i = 0;
        int j = 0;
        if (!employees.isEmpty() && !managers.isEmpty()) {
            do {
                double minValue = employees1.get(i).getSalary();
                if (j<managers.size() && managers1.get(j).getSalary() <= minValue) {
                            managers1.get(j).displayInformation();
                            j++;
                } else {
                    employees1.get(i).displayInformation();
                    i++;
                }
            } while (i < employees1.size());
            for (j=j; j<managers.size(); j++) managers1.get(j).displayInformation();
        } else if (employees.isEmpty()) for (Manager obj : managers1) obj.displayInformation();
        else if (managers.isEmpty()) for (Employee obj : employees1) obj.displayInformation();
    }
    // Hiển thị bảng lương của nhân viên theo thứ tự giảm dần
    //sorting staff by descending salary order
    private static void sortByDescreaseSalary(ArrayList<Employee> employees, ArrayList<Manager> managers){
        //create clone args prevent change on original args
        ArrayList<Employee> employees1=new ArrayList<>(employees);
        ArrayList<Manager> managers1=new ArrayList<>(managers);
        //sorting each arg
        Employee.sortEmployeeBySalary(employees1);
        Manager.sortManagerBySalary(managers1);
        //sorting by compare 2 args instance
        int i=employees.size()-1;
        int j=managers.size()-1;
        if (!employees.isEmpty() && !managers.isEmpty()){
            do {
                double maxValue = employees1.get(i).getSalary();
                if (j>=0 && managers1.get(j).getSalary() >= maxValue) {
                    managers1.get(j).displayInformation();
                    j--;
                } else {
                    employees1.get(i).displayInformation();
                    i--;
                }
            } while (i>=0);
            for (j=j; j>=0; j--) managers1.get(j).displayInformation();
        } else if (managers.isEmpty()) for (i=i; i>=0;i-- ) employees1.get(i).displayInformation();
        else if (employees.isEmpty()) for (j=j; j>=0; j--) managers1.get(j).displayInformation();
    }

}
