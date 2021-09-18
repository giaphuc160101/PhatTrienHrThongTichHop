package tuan2;

import java.util.Scanner;

public class P2_bai1 {
	int x,y; 
	Scanner sc = new Scanner(System.in);
	
	public P2_bai1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public P2_bai1() {
		super();
		this.x = 0;
		this.y = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public float gettinhKC() {
		return (float)(Math.sqrt(x*x+y*y));
	}

	public void nhapPoint() {
		System.out.println("Nhap vao hoanh do x:");
		x = sc.nextInt();
		System.out.println("Nhap vao tung do y:");
		y = sc.nextInt();
		System.out.println("Điểm vừa nhập:"+"("+x +","+y+")");
	}

	public String toString() {
		return String.format("%10.2f",gettinhKC());
	}
	
	public static void main(String[] args) {
		P2_bai1 point = new P2_bai1();
		point.nhapPoint();
		System.out.println("Khoảng cách từ điểm đến gốc tọa độ:"+point);
	}

}