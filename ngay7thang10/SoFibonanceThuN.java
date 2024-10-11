package ngay7thang10;

import java.util.Scanner;

public class SoFibonanceThuN {
    private static Long [][]a;
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
                    c[i][j] =((c[i][j]%l)+ (((a[i][k]%l) * (b[k][j]%l))%l))%l;
                }
            }
        }
        return c;
    }
    public static Long[][] soFibonanceThuN(int n) 
    {
        if(n==1)return a;
        Long b[][]=soFibonanceThuN(n/2);
        if(n%2==0)return nhan(b, b);
        else return nhan(nhan(b, b),a);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        a=new Long[2][2];
        a[0][0]=1L;
        a[0][1]=1L;
        a[1][0]=1L;
        a[1][1]=0L;
        while (t-->0)
        {
            System.out.println(soFibonanceThuN(sc.nextInt())[0][1]);
        }
    }
}