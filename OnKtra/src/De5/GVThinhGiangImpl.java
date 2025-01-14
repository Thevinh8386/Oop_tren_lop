package De5;

import java.util.Scanner;

public class GVThinhGiangImpl extends GiangVien implements GVThinhGiang {
	 private int soTietDay;
	 private double donGia;
	 
	public GVThinhGiangImpl() {
		super();
		this.soTietDay = 0;
		this.donGia = 0.0;
	}

	public GVThinhGiangImpl(String hoTen, String ngaySinh, String diaChi, int soTietDay, double donGia) {
		super(hoTen, ngaySinh, diaChi);
		this.soTietDay = soTietDay;
		this.donGia = donGia;
	}

	@Override
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("Nhập số tiết dạy: ");
		soTietDay = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập đơn giá: ");
		donGia = sc.nextDouble();
		sc.nextLine();
	}

	@Override
	public double tinhLuong() {
		return soTietDay * donGia * (1 - 0.15);
	}
	
	@Override
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Số tiết dạy: " + soTietDay);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Lương tháng: " + tinhLuong());
	}
 
}
