package ngay5thang10;

import java.util.Scanner;

public class LuyThua {
    public static Long luyThua(int n,int k) {
        if(k==0)return 1L;
        Long m=luyThua(n, k/2);
        if(k%2==0)return m*m;
        else return m*m*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            System.out.println(luyThua(n, k));
               
        }
    }
}
