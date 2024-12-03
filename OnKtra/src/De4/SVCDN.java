package De4;

import java.util.Scanner;

public class SVCDN extends Nguoi implements SVCD{
	private double TDKT;
    private double SMKT;
    
	public SVCDN() {
		super();
		this.TDKT = 0;
		this.SMKT = 0;
	}
	
    public SVCDN(String hoTen, String ngaySinh, String diaChi, double TDKT, double SMKT) {
        super(hoTen, ngaySinh, diaChi);
        this.TDKT = TDKT;
        this.SMKT = SMKT;
    }
    
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        try {
        	System.out.print("Nhap TDKT: ");
        	this.TDKT = sc.nextDouble();
        	System.out.print("Nhap SMKT: ");
        	this.SMKT = sc.nextDouble();
        	sc.nextLine(); 
        } catch (Exception e) {
            System.out.println("Loi khi nhap TDKT hoac SMKT: " + e.getMessage());
            sc.nextLine(); 
        }
    }
    
    @Override
	public double tinhDiem() {
		return TDKT / SMKT;
	}
    
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Diem trung binh: " + tinhDiem());
    }
}

