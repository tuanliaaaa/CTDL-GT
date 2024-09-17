package ngay12thang9;

import java.util.Scanner;

public class XauNhiPhanCoKBit1 
{
    private static int n,k;
    public static void xauNhiPhanCoKBit1(String a,int soBit1) 
    {
        int soBit0=a.length()-soBit1;
        if(a.length()==n){
            System.out.println(a);
        }else{
            if(soBit0+k==n)xauNhiPhanCoKBit1(a+"1", soBit1+1);
            else
            for(int i=0;i<=1;i++)
            {
                if(i==0)
                {
                    xauNhiPhanCoKBit1(a+"0", soBit1);
                }else if(soBit1<k){
                    xauNhiPhanCoKBit1(a+"1", soBit1+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            n=sc.nextInt();
            k=sc.nextInt();
            xauNhiPhanCoKBit1("",0);
        }
    }
}
