package ngay15thang9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HoanViDaySo {
    private static Boolean check=false;
    public static void hoanViDaySo(int n, int[] a)
    {
        int i=n-2;
        while(i>=-1&&a[i]>a[i+1]){
            i--;
            if(i==-1)
            {
                check=false;
                return;
            }
        }
        int j=n-1;
        while(a[j]<a[i])j--;
        int temp =a[i];a[i]=a[j];a[j]=temp;
        int r=i+1,g=n-1;
        while(r<g)
        {
            temp =a[r];a[r]=a[g];a[g]=temp;
            r++;
            g--;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int a[]= new int[t];
        for(int i=0;i<t;i++)a[i]=sc.nextInt();
        check=true;
        Arrays.sort(a);
        while (check) 
        {
            for(int i=0;i<t;i++)System.out.print(a[i]+" ");
            System.out.println();
            hoanViDaySo(a.length, a);
        }
    }
}
