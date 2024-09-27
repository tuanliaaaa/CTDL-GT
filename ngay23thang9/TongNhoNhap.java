package ngay23thang9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TongNhoNhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int []a= new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            String c="",b="";
            for(int i=0;i<n;i++)
            {
                if(i%2==0)c+=String.valueOf(a[i]);
                else b+=String.valueOf(a[i]);
            }
            System.out.println(Integer.parseInt(b)+Integer.parseInt(c));
        }
    }
}
