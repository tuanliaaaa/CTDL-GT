package ngay19thang9;

import java.util.Scanner;

public class NguoiDuLich {
    public static int a[][];
    public static int min=100000,n;
    public static void nguoiDuLich(Boolean b[],int sohang,int tong,int value)
    {
        if(sohang==n-1)
        {
            min=Math.min(min,tong+a[value][0]);
        }else{
            for(int i=1;i<n;i++)
            {
                if(!b[i])
                {
                    b[i]=true;
                    nguoiDuLich(b,sohang+1,tong+a[value][i],i);
                    b[i]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        a= new int[n][n];
        Boolean b[]= new Boolean[n];
        for(int i=0;i<n;i++)
        {
            b[i]=false;
            for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
        }
        b[0]=true;
        nguoiDuLich(b,0,0,0);
        System.out.println(min);
    }
}
