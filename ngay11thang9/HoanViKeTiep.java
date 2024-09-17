package ngay11thang9;

import java.util.Scanner;

public class HoanViKeTiep {
    public static void hoanViKeTiep(int n, int[] a)
    {
        int i=n-2;
        while(i>=-1&&a[i]>a[i+1]){
            i--;
            if(i==-1)
            {
                for(int j=1;j<=n;j++)System.out.print(j+" ");
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
        for( j=0;j<n;j++)System.out.print(a[j]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-->0)
        {
            int n;
            n=sc.nextInt();
            int []a= new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            hoanViKeTiep(n, a);
        }
    }
}
