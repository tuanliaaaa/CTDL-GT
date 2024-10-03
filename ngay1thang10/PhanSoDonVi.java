package ngay1thang10;

import java.util.Scanner;

public class PhanSoDonVi {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0)
        {
            Long a=sc.nextLong();
            Long b=sc.nextLong();
            while(a!=0)
            {
              Long x=(a+b-1)/a;
              
              System.out.print("1/"+x+" ");
              a=a*x-b;
              b=b*x;
              
            }
            System.out.println();
        }
    }
}
