package ngay1thang10;

import java.util.Arrays;
import java.util.Scanner;

public class GiaTriNhoNhatCuaXau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
           int n= sc.nextInt();
           sc.nextLine();
           String a= sc.nextLine();
           int []b= new int[26];
           for(int i=0;i<26;i++)b[i]=0;
           for(int i=0;i<a.length();i++)
           {
                b[a.charAt(i)-'A']++;
           }
           Arrays.sort(b);
           Long sum=0L;
           while (n-->0) {
            b[24]--;
            int i=24;
            while(b[i]<b[i-1])
            {
                int temp=b[i];
                b[i]=b[i-1];
                b[i-1]=temp;
                i--;
            }
           }
           for(int i=0;i<=25;i++)if(b[i]!=0)sum+=b[i]*b[i];
           System.out.println(sum);
        }
    }
}
