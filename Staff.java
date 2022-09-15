public abstract class Staff {
    //Thuộc tính: mã nhân viên, tên nhân viên, tuổi nhân viên, hệ số lương, ngày vào làm, bộ phận làm việc, số ngày nghỉ phép
    String staffId;
    String staffName;
    int staffAge;
    double salaryRate;
    String dateStart;
    String department;
    int dayOff;
    public Staff(String staffId, String staffName, int staffAge, double salaryRate, String dateStart, String department, int dayOff) {
        this.staffId = staffId;
        this.staffName=staffName;
        this.staffAge=staffAge;
        this.salaryRate=salaryRate;
        this.dateStart=dateStart;
        this.department=department;
        this.dayOff=dayOff;
    }

    //class abstract chứa các thông tin cơ bản của nhân viên
    //hàm displayInformation() là hàm abstract
    abstract void displayInformation();
    //method: get staffName
    public String getStaffName(){
        return staffName;
    }
    //method: get staffId
    public String getStaffId(){
        return staffId;
    }
    // Method : get department
    public String getDepartment(){
        return department;
    }
    //method : get salary
    abstract double getSalary();


}
