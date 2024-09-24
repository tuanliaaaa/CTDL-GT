package ngay13thang9;
import java.util.Scanner;

public class TapConLienkePhiaTruoc {
    public static void tapConLienkePhiaTruoc(int n,int k, int []a)
    {
       int i=k;
       while(i>=0)
       {
        if(a[i]>a[i-1]+1)break;
        i--;
        if(i==-1)
        {
             for(int j=n-k+1;j<=n;j++)
             {
                 System.out.print(j+" ");
             }
             System.out.println();
             return;
        }
       }  
      
       a[i]--;
       for(int j=1+i;j<=k;j++)
       {
            a[j]=n-k+j;
       }
       for(int j=1;j<=k;j++)
       {
            System.out.print(a[j]+" ");
       }
       System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-->0)
        {
            int n,k;
            n=sc.nextInt();k=sc.nextInt();
            int []a = new int[k+1];
            a[0]=0;
            for(int i=1;i<=k;i++)a[i]=sc.nextInt();
            tapConLienkePhiaTruoc(n, k, a);
        }
    }
}
