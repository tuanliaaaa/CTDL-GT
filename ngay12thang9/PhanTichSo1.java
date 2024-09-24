package ngay12thang9;
import java.util.Scanner;

public class PhanTichSo1 {
    private static Boolean check;
    public static void phanTichSo1(int n,int []a)
    {
        int i=n-1;
        int sum=0;
        while(a[i]==0||a[i]==1&&i>=0)
        {
            sum+=a[i];
            a[i]=0;
            i--;
            if(i==-1){
                check=true;
                return;
            }
        }
        int ne= a[i]-1;
        sum+=a[i];
        int k=sum/ne;
        int j;
        for( j=i;j<i+k;j++)
        {
            a[j]=ne;
        }
        if(sum%ne!=0){
            a[j]=sum%ne;
        }
        System.out.print("(");
        j=0;
        while(j<=n-2&&a[j+1]!=0)
        {
            System.out.print(a[j]+" ");
            j++;
        }
        if(a[j]!=0)System.out.print(a[j]);
        System.out.print(") ");
       
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) 
        {
            int n=sc.nextInt();
            int []a = new int[n];
            a[0]=n;
            for(int i=1;i<n;i++)a[i]=0;
            check=false;
            System.out.print("("+n+") ");
            while(!check)phanTichSo1(n,a);
            System.out.println();
        }
    }
}
