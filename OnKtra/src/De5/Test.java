package De5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import De4.SVCDCQ;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<GVCoHuu> gvCoHuuList = new ArrayList<>();
		
		try {
			int n = 0;
            while (true) {
                try {
                    System.out.print("Nhập số lượng GV cơ hữu (2 <= n <= 4): ");
                    n = sc.nextInt();
                    sc.nextLine();
                    if (n >= 2 && n <= 4) {
                        break;
                    } else {
                        System.out.println("Số lượng GV phải nằm trong đoạn từ 2 đến 4.");
                    }
                } catch (Exception e) {
                    System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
                    sc.nextLine(); 
                }
            }
            
            //Nhập thông tin GVCoHuu
            for (int i = 1; i <= n; i++) {
            	System.out.println("Nhập thông tin của GV cơ hữu thứ " + i + ": ");
            	GVCoHuu gvch = new GVCoHuu();
            	gvch.nhapThongTin(sc);
            	System.out.println();
            	gvCoHuuList.add(gvch);
            }
            
            System.out.println("--------------------------------------");
            //Hiển thị danh sách ra màn hình
            System.out.println("Danh sách các GV cơ hữu: ");
           	for (GVCoHuu gvch : gvCoHuuList) {
           		gvch.inThongTin();
           		System.out.println();
           	}
            
            //Kiểm tra maGV cần tìm có tồn tại ko
            System.out.println("Nhập mã giảng viên cần tìm: ");
            //maGV as hoTen
            String maGV = sc.nextLine(); 
            boolean found = false;
            for (GVCoHuu gvch : gvCoHuuList) {
            	if (gvch.hoTen.equals(maGV)) {
            		System.out.println("Tồn tại giảng viên cơ hữu có maGV là: " + maGV);
            		gvch.inThongTin();
            		found = true;
            		break;
            	}
            } if (!found) {
            	System.out.println("Không tồn tại giảng viên cơ hữu có maGV là: " + maGV);
            }
            
            //Sort lương tháng by DESCENDING
            gvCoHuuList.sort(Comparator.comparingDouble(GVCoHuu::tinhLuong).reversed());
            System.out.println("\nDanh sách giảng viên cơ hữu sau khi sắp xếp lương tháng giảm dần: ");
            for (GVCoHuu gvch : gvCoHuuList) {
                gvch.inThongTin();
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Xảy ra lỗi: " + e.getMessage());
        } finally {
            sc.close();
        }
	}
}
