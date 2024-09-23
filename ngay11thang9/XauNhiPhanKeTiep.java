package ngay11thang9;

import java.util.Scanner;

public class XauNhiPhanKeTiep {
    public static void xauNhiPhanKeTiep(String xau)
    {
        StringBuffer buffer = new StringBuffer(xau);
        int i=buffer.length()-1;
        while(buffer.charAt(i)=='1'&&i>=0){
            i--;
            if(i==-1){
                for(int j=0;j<buffer.length();j++)
                {
                    buffer.setCharAt(j, '0');
                }
                System.out.println(buffer);
                return;
            }
        }
        buffer.setCharAt(i,'1');
        for(int j=i+1;j<buffer.length();j++)
        {
            buffer.setCharAt(j, '0');
        }
        System.out.println(buffer);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t;
        t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            xauNhiPhanKeTiep(sc.nextLine());
        }
    }
}