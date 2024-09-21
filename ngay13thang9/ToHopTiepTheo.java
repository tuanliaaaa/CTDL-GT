package ngay13thang9;

import java.util.Scanner;

public class ToHopTiepTheo {
    public static void toHopTiepTheo(int n,int k, int []a)
    {
       int i=k-1;
       while(i>0&&a[i]==n-k+i+1)i--;  
       if(i==0)
       {
            System.out.println(k);
            return;
       }
       if(i==k-1){
        System.out.println(1);
        return;
       }
       System.out.println(Math.min(a[i+1]-a[i]-1,n-a[i]));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t;
        int n,k;
        t=sc.nextInt();
        while(t-->0)
        {
            n=sc.nextInt();
            k=sc.nextInt();
            int []a = new int[k];
            for(int i=0;i<k;i++)a[i]=sc.nextInt();
            toHopTiepTheo(n, k, a);
        }
    }
}
