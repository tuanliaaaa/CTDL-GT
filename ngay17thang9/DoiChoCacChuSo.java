package ngay17thang9;

import java.util.Scanner;

public class DoiChoCacChuSo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            sc.nextLine();
            StringBuffer b=new StringBuffer(sc.nextLine()); 
            char max;
            for(int i=0;i<n;i++)
            {
                max=b.charAt(i);
                for(int j=i+1;j<b.length();j++)
                {
                    if(max<b.charAt(j))
                    {
                        max=b.charAt(j);
                        char temp=b.charAt(i);
                        b.setCharAt(i, b.charAt(j));
                        b.setCharAt(j, temp);
                    }
                }
            }  
            System.out.println(b); 
        }
    }
}
