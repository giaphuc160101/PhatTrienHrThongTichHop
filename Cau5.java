package tuan2;
import java.util.Scanner;
public class Cau5 {
    
        public static void main(String[] args) {
          
            float sum=0;
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào n:");
            n = sc.nextInt();
            for(int i=0; i<n ; i++) {
                float number;
                System.out.println("Nhập số thứ "+(i+1)+":" );
                number = sc.nextFloat();
                if(number > 0 ) {
                    sum += number;
                }
            }
            System.out.println("Tổng số dương:" +sum);
            sc.close();
    }
}
