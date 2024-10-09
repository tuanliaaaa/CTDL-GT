package ngay9thang10;

import java.util.Scanner;

public class DayXauNhiPhan {
    private static Long []a;
    public static int dayXauNhiPhan(int n,Long k) {
        if(k==1)return 0;
        if(k==2)return 1;
        if(k<=a[n-2])return dayXauNhiPhan(n-2, k);
        else return dayXauNhiPhan(n-1, k-a[n-2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        a=new Long[93];
        a[1]=1L;
        a[2]=1L;
        for(int i=3;i<93;i++)a[i]=a[i-2]+a[i-1];
        while(t-->0)
        {
            int n=sc.nextInt();
            Long k=sc.nextLong();
            System.out.println(dayXauNhiPhan(n,k));
            
        }
    }
}
