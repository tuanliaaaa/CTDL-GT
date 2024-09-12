package ngay12thang9;

import java.util.Scanner;

public class XauABDoDaiN {
    private static int n;
    public static void xauABDoDaiN(String a)
    {
        
        if(a.length()==n)
        {
            System.out.print(a+" ");
            return;
        }
        for(char b='A';b<='B';b++)xauABDoDaiN(a+b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            n=sc.nextInt();
            xauABDoDaiN(""); 
            System.out.println();
        }
    }
}
