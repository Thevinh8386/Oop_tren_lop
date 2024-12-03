package CuoiKy;

import java.util.List;
import java.util.Scanner;

public class Main {
	static IEmployeeManager manager = new IEmployeeManagerImpl();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Khởi tạo sẵn một số thông tin
		manager.addEmployee(new Employee(1, "user1", "Nguyễn Văn A", 1.2f, 5000000, "Kỹ thuật"));
		manager.addEmployee(new Employee(2, "user2", "Trần Thị B", 1.5f, 7000000, "Kinh doanh"));
		manager.addEmployee(new Employee(3, "user3", "Phạm Văn C", 1.1f, 6000000, "Quản trị"));
		manager.addEmployee(new Employee(4, "user4", "Lê Thị D", 1.3f, 8000000, "Nhân sự"));
		manager.addEmployee(new Employee(5, "user5", "Hoàng Văn E", 1.4f, 7500000, "Kỹ thuật"));

		while (true) {
			System.out.println("\n--------------MENU------------------");
			System.out.println("1. Thêm nhân sự mới");
			System.out.println("2. Thay đổi thông tin nhân sự");
			System.out.println("3. Tìm kiếm theo tên đầy đủ");
			System.out.println("4. Tính tổng tiền lương của mọi người");
			System.out.println("5. Hiển thị danh sách nhân sự");
			System.out.println("6. EXIT");
			System.out.println("Lựa chọn của bạn: ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1:
					try {
						System.out.println("Nhập ID: ");
						int user_id = sc.nextInt();
						sc.nextLine();
						
						System.out.println("Nhập tên đăng nhập: ");
						String user_name = sc.nextLine();
					
						System.out.println("Nhập tên đầy đủ: ");
						String user_fullname = sc.nextLine();
					
						System.out.println("Nhập hệ số lương: ");
						float user_cosalary = sc.nextFloat();
						sc.nextLine();
					
						System.out.println("Nhập lương cơ bản: ");
						int employee_basic_salary = sc.nextInt();
						sc.nextLine();
					
						System.out.println("Nhập phòng ban: ");
						String employee_department = sc.nextLine();
						
						Employee employee = new Employee(user_id, user_name, user_fullname, 
								user_cosalary, employee_basic_salary, employee_department);
			         	
						if (manager.addEmployee(employee)) {
							System.out.println("Thêm nhân sự thành công!");
							manager.displayEmployee();
						} else {
							System.out.println("Thêm nhân sự thất bại!");
						}
					} catch (NumberFormatException ex) {
						System.err.println("Lỗi nhập sai định dạng số: " + ex.getMessage());
					}
					break;
				case 2:
					try {
						//Chỉnh sửa thông tin
						System.out.println("Nhập ID cần sửa: ");
						int user_id = sc.nextInt();
						sc.nextLine();
				
						System.out.println("Nhập tên đăng nhập mới: ");
						String user_name = sc.nextLine();
				
						System.out.println("Nhập tên đầy đủ mới: ");
						String user_fullname = sc.nextLine();
				
						System.out.println("Nhập hệ số lương mới: ");
						float user_cosalary = sc.nextFloat();
						sc.nextLine();
				
						System.out.println("Nhập lương cơ bản mới: ");
						int employee_basic_salary = sc.nextInt();
						sc.nextLine();
				
						System.out.println("Nhập phòng ban mới: ");
						String employee_department = sc.nextLine();
				
						Employee employee = new Employee(user_id, user_name, user_fullname, user_cosalary, employee_basic_salary, employee_department);
						if (manager.editEmployee(employee)) {
							System.out.println("Thay đổi thông tin nhân sự thành công!");
						} else {
							System.out.println("Thay đổi thông tin nhân sự thất bại.");
						}
					} catch (NumberFormatException ex) {
						System.err.println("Lỗi nhập sai định dạng số: " + ex.getMessage());
					}
					break;
				case 3: 
					System.out.print("Nhập tên đầy đủ cần tìm: ");
                    String fullName = sc.nextLine();
                    List<Employee> employees = manager.searchEmployee(fullName);
                    if (!employees.isEmpty()) {
                        for (Employee e : employees) {
                        	System.out.println("Tồn tại nhân sự có tên đầy đủ là: " + fullName);
                        	System.out.println("Thông tin của nhân sự cần tìm là: ");
                            System.out.println(e.toString());
                        }	
                    }
                    break;   
				case 4:
					 System.out.println("Tổng lương của mọi người là: " + manager.getTotalSalary());
					break;
				case 5:
					manager.displayEmployee();
					break;
				case 6:
					System.out.println("Thoát chương trình!");
                    return;
				default:
					System.out.println("Invalid choice! Vui lòng nhập lại");
			}
		}
	}
}



//Nhập thông tin từ bàn phím
//int n = 0;
//while (true) {
//    try {
//        System.out.print("Nhập số lượng nhân sự (n <= 5): ");
//        n = sc.nextInt();
//        sc.nextLine(); 
//        if (n <= 5) {
//        	for (int i = 0; i < n; i++)  {
//    	        System.out.println("Nhập thông tin nhân sự thứ " + (i + 1) + ":");
//    	        Employee e = new Employee();
//    	        e.nhap(sc);
//    	        manager.addEmployee(e);
//    	    }
//            break;
//        } else {
//            System.out.println("Số lượng nhân sự phải <= 5.");
//        }
//    } catch (InputMismatchException ime) {
//        System.err.println("Lỗi nhập dữ liệu: Vui lòng nhập một số nguyên hợp lệ.");
//        sc.nextLine(); // Xóa dữ liệu không hợp lệ trong bộ nhớ đệm -> tránh lặp vô hạn
//    } catch (Exception e1) {
//        System.err.println("Lỗi không xác định: " + e1.getMessage());
//        sc.nextLine();
//    }
//}

//for (int i = 0; i < n; i++) {
//    System.out.println("Nhập thông tin nhân sự thứ " + (i + 1) + ":");
//    Employee e = new Employee();
//    e.nhap(sc);
//    manager.addEmployee(e);
//}