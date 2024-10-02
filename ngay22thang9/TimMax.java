package ngay22thang9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l=1000000007;
        int t=sc.nextInt();
        while (t-->0) 
        {
            int n=sc.nextInt();
            int []a= new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum=sum%l+((a[i]*i)%l);
            }
            System.out.println(sum%l);
        }
    }
}
