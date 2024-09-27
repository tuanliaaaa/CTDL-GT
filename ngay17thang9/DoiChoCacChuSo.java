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
            int dem=0;
            for(int i=0;i<b.length()-1;i++)
            {
                max=b.charAt(i);
                int index=i;
                for(int j=i+1;j<b.length();j++)
                {
                    if(max<=b.charAt(j))
                    {
                        max=b.charAt(j);
                        index=j;
                    }
                }
                if(max>b.charAt(i)){
                    char temp=b.charAt(i);
                    b.setCharAt(i, b.charAt(index));
                    b.setCharAt(index, temp);
                    dem++;
                }
                if(dem==n)break;
            }  
            System.out.println(b); 
        }
    }
}
