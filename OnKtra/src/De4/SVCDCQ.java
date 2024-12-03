package De4;

import java.util.Scanner;

public class SVCDCQ extends Nguoi implements SVCD{
	private double TDKT;
    private double SMKT;
    private double DTKTHP;
    
	public SVCDCQ() {
		super();
		this.TDKT = 0;
		this.SMKT = 0;
		this.DTKTHP = 0;
	}
	
    public SVCDCQ(String hoTen, String ngaySinh, String diaChi, double TDKT, double SMKT, double DTKTHP) {
        super(hoTen, ngaySinh, diaChi);
        this.TDKT = TDKT;
        this.SMKT = SMKT;
        this.DTKTHP = DTKTHP;
    }
 
	public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        try {
        	System.out.print("Nhap TDKT: ");
        	this.TDKT = sc.nextDouble();
        	System.out.print("Nhap SMKT: ");
        	this.SMKT = sc.nextDouble();
        	System.out.print("Nhap DTKTHP: ");
        	this.DTKTHP = sc.nextDouble();
        	sc.nextLine();
        } catch (Exception e) {
            System.out.println("Loi khi nhap TDKT, SMKT hoac DTKTHP: " + e.getMessage());
            sc.nextLine();  
        }
    }

	@Override
	public double tinhDiem() {
		return (TDKT / SMKT + DTKTHP) / 3;
	}
	
	@Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Diem trung binh: " + tinhDiem());
    }
}
