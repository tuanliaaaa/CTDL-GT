package ngay14thang10;

import java.util.Scanner;

public class SoBuocItNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int []a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int dem=0;
            for(int i=0;i<n-1;i++)
            {
                if(a[i]>a[i+1])
                {
                    dem++;
                    a[i+1]=a[i];
                }
            }
            System.out.println(dem);
        }
    }
}
