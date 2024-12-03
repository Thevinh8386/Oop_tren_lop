package De5;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
	private double luongCoBan;
	private double heSoLuong;
	private int thamNien;
	
	public GVCoHuu() {
		super();
		this.luongCoBan = 0.0;
		this.heSoLuong = 0.0;
		this.thamNien = 0;
	}
	
	public GVCoHuu(String hoTen, String ngaySinh, String diaChi, double luongCoBan, 
			double heSoLuong, int thamNien) {
		super(hoTen, ngaySinh, diaChi);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.thamNien = thamNien;
	}
	
	@Override
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("Nhập lương cơ bản: ");
		luongCoBan = sc.nextDouble();
		sc.nextLine();
		System.out.print("Nhập hệ số lương: ");
		heSoLuong = sc.nextDouble();
		sc.nextLine();
		System.out.print("Nhập thâm niên: ");
		thamNien = sc.nextInt();
		sc.nextLine();
	}

	@Override
	public double tinhLuong() {
		if (thamNien < 5) {
            return luongCoBan * heSoLuong;
        } else {
        	return luongCoBan * heSoLuong + (thamNien * 0.01 * luongCoBan);
        }
	}
	
	@Override
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Lương cơ bản: " + luongCoBan);
		System.out.println("Hệ số lương: " + heSoLuong);
		System.out.println("Thâm niên: " + thamNien);
		System.out.println("Lương tháng: " + tinhLuong());
	}
	
}
