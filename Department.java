public class Department {
    //test
    public static void main(String[] args) {
        Department test = new Department("HR", "Human Resource", 5);
        Department test1 = new Department("PR", "Marketing", 20);
        test.toString();
        test1.toString();
    }

    //Thuộc tính: mã bộ phận, tên bộ phận, số lượng nhân viên hiện tại
    private String departmentId;
    private String departmentName;
    private int staffNumbers;
    public Department(String departmentId,   String departmentName,    int staffNumbers){
        this.departmentId=departmentId;
        this.departmentName=departmentName;
        this.staffNumbers=staffNumbers;
    }
    //Phương thức: toString() hiển thị thông tin về bộ phận.
    @Override
    public String toString (){
        String displayAlign = " %-20s | %-30s | %-20s %n";
        System.out.format(displayAlign,departmentId,departmentName,staffNumbers);
        return null;
    }
    //Method : set staffNumber
    public void setStaffNumbers(int staffNumbers){
        this.staffNumbers=staffNumbers;
    }
    //Method : get staffNumber
    public int getStaffNumbers(){
        return staffNumbers;
    }
    //Method : get departmentId
    public String getDepartmentId(){
        return departmentId;
    }
    //Method : get departmentName
    public String getDepartmentName(){
        return departmentName;
    }
}
