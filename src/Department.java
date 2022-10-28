public class Department {
    public int departmentId;
    public String departmentName;

    public Department (int _departmentId, String _departmentName) {
        departmentId = _departmentId;
        departmentName = _departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
