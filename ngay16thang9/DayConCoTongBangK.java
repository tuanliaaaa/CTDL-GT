package ngay16thang9;

import java.util.Scanner;

public class DayConCoTongBangK {
    private static Boolean check=true;
    public static void dayConCoTongBangK(int[] a){
        int i=a.length-1;
        while(i>=0&&a[i]==0){
            i--;
            if(i==-1){
                check=false;
                return;
            }
        }
        a[i]=0;
        for(int j=i+1;j<a.length;j++)a[j]=1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            check=true;    
            int[]a= new int[n];
            int []b= new int [n];
            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextInt();
                a[i]=1;
            }
            while (check)
            {
                int sum=0;
                for(int i=0;i<n;i++)if(a[i]!=0)sum+=b[i];
                if(sum==k){
                    System.out.print("[");
                    for(int i=0;i<n;i++)if(a[i]!=0)System.out.print(b[i]+" ");
                    System.out.print("] ");
                }
                dayConCoTongBangK(a);
            }
            System.out.println();
        }
    }
}
