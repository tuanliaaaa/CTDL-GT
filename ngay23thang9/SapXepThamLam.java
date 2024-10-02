package ngay23thang9;

import java.util.Scanner;

public class SapXepThamLam {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int []a = new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            Boolean check=true;
            for(int i=0;i<n/2-1;i++)
            {
                int  min=a[i+1], max=a[n-i-2];
                if(a[i+1]>=a[n-i-2])
                {
                    max=a[i+1];
                    min=a[n-i-2];
                }
                if(Math.min(a[i],a[n-1-i])>=min ||Math.max(a[i],a[n-1-i])<=max)
                {
                    check=false;
                    break;
                }
            }    
            if(check)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
