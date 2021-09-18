package tuan2;

import java.util.Scanner;

public class P2_bai2 {

	int tu,mau;
	Scanner sc = new Scanner(System.in);
	public P2_bai2() {
		super();
	}

	public P2_bai2(int tu, int mau) {
		super();
		this.tu = tu;
		this.mau = mau;
	}

	public int getTu() {
		return tu;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}

	public int getMau() {
		return mau;
	}

	public void setMau(int mau) {
		this.mau = mau;
	}

	public void nhapPS(String y) {
		System.out.println("Nhap vao tu so:");
		tu =sc.nextInt();
		System.out.println("Nhap vao mau so:");
		mau =sc.nextInt();
		System.out.println(y+ " " +tu +"/" +mau);
	}
	//Nghich dao phan so
	public void nghichdaoPS() {
		int tg;
		tg=tu;
		tu=mau;
		mau=tg;
		System.out.println( +tu +"/" +mau);
	}
	//Tong hai phan so
	public void congPS(P2_bai2 ps) {
		int ts = this.getTu()*ps.getMau() + ps.getTu()*this.getMau();
		int ms = this.getMau()*ps.getMau();
		P2_bai2 tongPhanso = new P2_bai2(ts,ms);
		System.out.println("Tong hai phan so = "+tongPhanso.tu +"/" +tongPhanso.mau);
	}
	
	//Hieu 2 phan so
	public void hieuPS(P2_bai2 ps) {
		int ts = this.getTu()*ps.getMau() - ps.getTu()*this.getMau();
		int ms = this.getMau()*ps.getMau();
		P2_bai2 hieuPhanso = new P2_bai2(ts,ms);
		System.out.println("Hieu hai phan so = "+hieuPhanso.tu +"/" +hieuPhanso.mau);
	}
	
	//Tich 2 phan so
	public void tichPS(P2_bai2 ps) {
		int ts = this.getTu()*ps.getTu();
		int ms = this.getMau()*ps.getMau();
		P2_bai2 tichPhanso = new P2_bai2(ts,ms);
		System.out.println("Tich hai phan so = "+tichPhanso.tu +"/" +tichPhanso.mau);
	}
	
	//Thuong hai phan so
	public void thuongPS(P2_bai2 ps) {
		int ts = this.getTu()*ps.getMau();
		int ms = this.getMau()*ps.getTu();
		P2_bai2 thuongPhanso = new P2_bai2(ts,ms);
		System.out.println("Thuong hai phan so = "+thuongPhanso.tu +"/" +thuongPhanso.mau);
	}
	
	
	public static void main(String[] args) {
	P2_bai2 ps1 = new P2_bai2();
	P2_bai2 ps2 = new P2_bai2();
		ps1.nhapPS("Phan so thu 1 la:\n");
		ps2.nhapPS("Phan so thu 2 la:\n");
		ps1.congPS(ps2);
		System.out.println("-----------------------------------\n");
		ps1.hieuPS(ps2);
		System.out.println("-----------------------------------\n");
		ps1.tichPS(ps2);
		System.out.println("-----------------------------------\n");
		ps1.thuongPS(ps2);
		System.out.println("-----------------------------------\n");
		System.out.println("Nghịch đảo phân số thứ 1 là");
		ps1.nghichdaoPS();
		System.out.println("-----------------------------------\n");
		System.out.println("Nghịch đảo phân số thứ 2 là");
		ps2.nghichdaoPS();
	}
}
