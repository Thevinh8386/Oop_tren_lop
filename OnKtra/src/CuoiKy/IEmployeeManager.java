package CuoiKy;

import java.util.List;

public interface IEmployeeManager {
	public boolean addEmployee(Employee e);
	public boolean editEmployee(Employee e);
	public List<Employee> searchEmployee(String fullName);
	public double getTotalSalary();
	public void displayEmployee();
}
