package tuan2;
import java.util.Scanner;
public class Cau2 {
    public static void main(String[] args) {
        int temp;
        boolean isPrime=true;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra:");
        int num=sc.nextInt();
        sc.close();
        for(int i=2;i<=num/2;i++){
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
    }
        if(isPrime)
            System.out.println(num + " Là số nguyên tố!");
        else
            System.out.println(num + " Không phải là số nguyên tố!");
    }
    
}
