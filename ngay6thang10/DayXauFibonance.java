package ngay6thang10;

import java.util.Scanner;

public class DayXauFibonance {
    private static Long []a;
    public static String dayXauFibonance(int n,Long k) {
        if(n==1)return "A";
        if(n==2)return "B";
        if(k<=a[n-2])return dayXauFibonance(n-2, k);
        else return dayXauFibonance(n-1, k-a[(int)(n-2)]);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        a =new Long[93];
        a[2]=1L;
        a[1]=1L;
        for(int i=3;i<93;i++)a[i]=a[i-2]+a[i-1];
        while (t-->0)
        {
            int n=sc.nextInt();
            Long k=sc.nextLong();
            System.out.println(dayXauFibonance(n,k));
        }    
    }
}