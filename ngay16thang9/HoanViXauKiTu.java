package ngay16thang9;

import java.util.Scanner;

public class HoanViXauKiTu {
    private static Boolean check=true;
    public static void hoanViDaySo(int n, int[] a)
    {
        int i=n-2;
        while(i>=0&&a[i]>a[i+1]){
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
        sc.nextLine();
        while(t-->0)
        {
            String b=sc.nextLine();
            int a[]= new int[b.length()];
            for(int i=0;i<b.length();i++)
            {
                a[i]=i;
            }
            check=true;
            while (check) 
            {
                for(int i=0;i<a.length;i++)System.out.print(b.charAt(a[i])+"");
                System.out.print(" ");
                hoanViDaySo(a.length, a);
            }
            System.out.println();
        }
    }
}
