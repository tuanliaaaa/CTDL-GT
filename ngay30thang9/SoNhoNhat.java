package ngay30thang9;

import java.util.Scanner;

public class SoNhoNhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            String a="";
            int count=0;
            int i=9;
            while(a.length()!=k)
            {
                
                if((k-a.length()-1)+count+i<=n)
                {
                    a=String.valueOf(i)+a;
                    count+=i;
                }else{
                    i--;
                }
            }    
            System.out.println(a);
        }
    }
}
