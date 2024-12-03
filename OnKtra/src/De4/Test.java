package De4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SVCDCQ> sinhVienList = new ArrayList<>();
		
		try {
            int n = 0;
            while (true) {
                try {
                    System.out.print("Nhap so luong sinh vien (2 <= n <= 4): ");
                    n = sc.nextInt();
                    sc.nextLine(); 
                    if (n >= 2 && n <= 4) {
                        break;
                    } else {
                        System.out.println("So luong sinh vien phai nam trong khoang 2 den 4.");
                    }
                } catch (Exception e) {
                    System.out.println("Loi nhap du lieu: " + e.getMessage());
                    sc.nextLine(); 
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
                SVCDCQ sv = new SVCDCQ();
                sv.nhapThongTin(sc);
                sinhVienList.add(sv);
            }

            // Display all students
            System.out.println("\nDanh sach sinh vien:");
            for (SVCDCQ sv : sinhVienList) {
                sv.inThongTin();
                System.out.println("------------------------------------------------------");
            }

            // Search for a student by ID
            System.out.print("Nhap ma sinh vien can tim: ");
            String maSV = sc.nextLine();
            boolean found = false;
            for (SVCDCQ sv : sinhVienList) {
                if (sv.hoTen.equals(maSV)) {
                    System.out.println("Tim thay thong tin sinh vien: ");
                    sv.inThongTin();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Khong ton tai sinh vien co maSV vua nhap.");
            }

            // Sort students by descending average score
            sinhVienList.sort(Comparator.comparingDouble(SVCDCQ::tinhDiem).reversed());
            System.out.println("\nDanh sach sinh vien sau khi sap xep theo diem trung binh giam dan: ");
            for (SVCDCQ sv : sinhVienList) {
                sv.inThongTin();
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Xay ra loi: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}