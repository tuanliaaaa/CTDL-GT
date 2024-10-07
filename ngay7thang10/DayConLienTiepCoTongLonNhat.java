package ngay7thang10;

import java.util.Scanner;

public class DayConLienTiepCoTongLonNhat {
    public static int dayConLienTiepCoTongLonNhat(int []a) {
        int max=0,sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            max=Math.max(max,sum);
            if(sum<0)sum=0;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int []a = new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            System.out.println(dayConLienTiepCoTongLonNhat(a));
        }
    }
}
