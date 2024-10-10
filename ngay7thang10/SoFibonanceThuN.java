package ngay7thang10;

import java.util.Scanner;

public class SoFibonanceThuN {
    private static final Long l=1000000007L;
   

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        Long []a = new Long[1000000000];
        a[0]=0L;
        a[1]=1L;
        for(int i=2;i<1000000000;i++){
            a[i]=((a[i-2]%l)+(a[i-1]%l))%l;
        }
        while (t-->0)
        {
            System.out.println(a[sc.nextInt()]);
        }
    }
}