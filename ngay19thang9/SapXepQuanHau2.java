package ngay19thang9;
import java.util.Scanner;

public class SapXepQuanHau2 {
    private static int[]a;
    private static int [][]b;
    private static int []DCX;
    private static int[]DCN;
    private static int max=0;
    public static void sapXepQuanHau1(int i,int n,int sum) {
        for(int j=1;j<=n;j++)
        {
            if(a[j]==0&&DCX[i-j+n]==0&&DCN[i+j-1]==0)
            {
                DCX[i-j+n]=1;
                DCN[i+j-1]=1;
                a[j]=1;
                if(i==n){
                    max= Math.max(max,sum+b[i][j]);
                }
                else if(i<n) sapXepQuanHau1(i+1,n,sum+b[i][j]);
                DCX[i-j+n]=0;
                DCN[i+j-1]=0;
                a[j]=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc. nextInt();
        while(t-->0)
        {
            int n=8;
            a = new int[n+1];
            b= new int[n+1][n+1];
            DCN = new int[2*n+1];
            DCX = new int[2*n+1];
            for(int i=1;i<2*n;i++)
            {
                DCN[i]=0;
                DCX[i]=0;
            }
            for(int i=1;i<=n;i++){
                a[i]=0;
            }
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++)b[i][j]=sc.nextInt();
            }
            max=0;
            sapXepQuanHau1(1,n,0);
            System.out.println(max);
        }
    }
}
