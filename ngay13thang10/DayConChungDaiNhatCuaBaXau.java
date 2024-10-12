package ngay13thang10;
import java.util.*;

import ngay18thang9.MayATM;
public class DayConChungDaiNhatCuaBaXau {
    public static int dayConChungDaiNhatCuaBaXau(String a,String b,String c) {
        int max=0;
        int [][][]d=new int[a.length()+1][b.length()+1][c.length()+1];
        for(int i=0;i<=a.length();i++)
            for(int j=0;j<=b.length();j++)
                for(int k=0;k<=c.length();k++)
                    d[i][j][k]=0;
        for(int i=1;i<=a.length();i++)
        {
            for(int j=1;j<=b.length();j++)
            {
                for(int k=1;k<=c.length();k++)
                {
                    if(a.charAt(i-1)==b.charAt(j-1)&&a.charAt(i-1)==c.charAt(k-1))
                    {
                        d[i][j][k]=d[i-1][j-1][k-1]+1;
                    }else{
                        d[i][j][k]=Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(d[i-1][j][k], d[i][j-1][k]),d[i][j][k-1]),d[i-1][j-1][k]),d[i-1][j][k-1]),d[i][j-1][k-1]),d[i-1][j-1][k-1]);
                    }
                    max=Math.max(max, d[i][j][k]);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            sc.nextInt();
            sc.nextInt();
            sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            String c= sc.next();
            System.out.println(dayConChungDaiNhatCuaBaXau(a,b,c));
        }
    }
}
