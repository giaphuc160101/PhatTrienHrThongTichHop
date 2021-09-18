package tuan2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        int a, b, c;
        float x1, x2, detail;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a= "); a = sc.nextInt();
        System.out.println("Nhap b= "); b = sc.nextInt();
        System.out.println("Nhap c= "); c = sc.nextInt();
        
        detail = (b*b - (4*a*c))/(2*a);
        if (detail<0) {
            System.out.println("Phương trình vô nghiệm");
        } else if(detail==0) {
            x1=x2= (-b/(2*a));
            System.out.println("Phương trình có nghiệm kép x1 = x2= " + x1);
        }
        else {
            x1 = (float) ((-b + sqrt(detail))/(2*a));
            x2 = (float) ((-b - sqrt(detail))/(2*a));
            System.out.println("PT co 2 nghiem x1 = " + x1 + "x2 = " + x2);
        } 
                
            
    } 
}