package ngay11thang9;

import java.util.Scanner;

public class TapConKeTiep {
    public static void tapConKeTiep(int n,int k, int []a)
    {
        int i=k-1;
        while(i>=0&&a[i]==n-k+i+1){
            i--;  
            if(i==-1)
            {
                for(int j=1;j<k+1;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
                return;
            }
        }
       a[i]++;
       for(int j=1+i;j<k;j++)
       {
        a[j]=a[j-1]+1;
       }
       for(int j=0;j<k;j++)
       {
            System.out.print(a[j]+" ");
       }
       System.out.println();
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
            tapConKeTiep(n,k,a);
        }
    }
}
