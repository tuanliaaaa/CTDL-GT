package ngay14thang10;

import java.util.Scanner;

public class DayConTangDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a = new int[n];
        int []b = new int[n];
        int max=0;
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            b[i]=1;
            for(int j=0;j<i;j++)
            {
                if(a[i]>a[j])
                {
                    b[i]=Math.max(b[i],b[j]+1);
                }
            }
            max=Math.max(max, b[i]);
        }
        System.out.println(max);
    }
}
