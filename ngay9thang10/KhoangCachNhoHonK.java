package ngay9thang10;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class KhoangCachNhoHonK {
    public static int khoangCachNhoHonK(int[]a,int k,int left,int right)
    {
        if(left>=a.length-1)return 0;
        if(right>=a.length)
        return khoangCachNhoHonK(a, k, left+1, left+2);
        int count =0;
        if(a[right]-a[left]<k)count=1;
        return count+khoangCachNhoHonK(a, k, left, right+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int []a= new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            System.out.println(khoangCachNhoHonK(a, k, 0, 1));
        }
    }
}