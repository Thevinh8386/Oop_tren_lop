package De4;

import java.util.Scanner;

public abstract class Nguoi {
	protected String hoTen;
	protected String ngaySinh;
	protected String diaChi;
	
	public Nguoi() {
		this.hoTen = "None";
		this.ngaySinh = "None";
		this.diaChi = "None";
	}
	
	public Nguoi(String hoTen, String ngaySinh, String diaChi) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		this.ngaySinh = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		this.diaChi = sc.nextLine();
	}
	
	public void inThongTin() {
		System.out.println("Ho ten: " + hoTen);
		System.out.println("Ngay sinh: " + ngaySinh);
		System.out.println("Dia chi: "+ diaChi);
	}
}
