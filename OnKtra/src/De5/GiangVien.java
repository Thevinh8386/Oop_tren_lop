package De5;

import java.util.Scanner;

public abstract class GiangVien {
	protected String hoTen;
	protected String ngaySinh;
	protected String diaChi;
	
	//Khởi tạo thông tin ban đầu
	public GiangVien() {
		this.hoTen = "None";
		this.ngaySinh = "None";
		this.diaChi = "None";
	}
	
	public GiangVien(String hoTen, String ngaySinh, String diaChi) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhập họ tên: ");
		this.hoTen = sc.nextLine();
		System.out.print("Nhập ngày sinh: ");
		this.ngaySinh = sc.nextLine();
		System.out.print("Nhập địa chỉ: ");
		this.diaChi = sc.nextLine();
	}
	
	public double tinhLuong() {
		return 0;
	}
	
	public void inThongTin() {
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Ngày sinh: " + ngaySinh);
		System.out.println("Địa chỉ: " + diaChi);
	}
}
