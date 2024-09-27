package ngay23thang9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ChiaMangThanhHaiMangConCoTongLonNhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) 
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int []a= new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a);
            int sum=0;
            for(int i=0;i<k;i++)sum-=a[i];
            for(int i=k;i<n;i++)sum+=a[i];
            System.out.println(sum);
        }
    }
}
