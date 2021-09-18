package tuan2;

import java.util.Scanner;
public class Cau4 {
    public static void main(String[] args) {
        long sum = 0;
        int n;
        Scanner sc;
        do {
            System.out.println("Nhập n (n là tổng số tự nhiên từ 1 đến n) ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tổng từ 1 đến "+n+" = " + sum);
        sc.close();
    }
}