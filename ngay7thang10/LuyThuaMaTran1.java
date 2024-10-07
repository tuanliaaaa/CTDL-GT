package ngay7thang10;

import java.util.Scanner;

public class LuyThuaMaTran1 {
    private static final Long l=1000000007L;
    public static Long [][] nhan(Long [][]a,Long [][]b) 
    {
        Long [][]c =new Long[a.length][a.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                c[i][j] = 0L;
                for (int k = 0; k < a.length; k++) {
                    c[i][j] =((c[i][j]%l)+ ((a[i][k]%l) * (b[k][j]%l)))%l;
                }
            }
        }
        return c;
    }
    public static Long[][] luyThuaMaTran1(int n,int k,Long [][]a) 
    {
        if(k==1)return a;
        Long b[][]=luyThuaMaTran1(n, k/2, a);
        if(k%2==0)return nhan(b, b);
        else return nhan(nhan(b, b),a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();  
            Long [][]a = new Long[n][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    a[i][j]=sc.nextLong();
            a=luyThuaMaTran1(n,k,a);
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
