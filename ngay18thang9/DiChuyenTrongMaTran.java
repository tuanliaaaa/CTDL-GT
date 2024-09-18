package ngay18thang9;
import java.util.Scanner;

public class DiChuyenTrongMaTran {
    private static int count,n,k;
    public static void diChuyenTrongMaTran(int [][]a,int hang,int cot) {
        if(hang==n-1&&cot==k-1){
            count++;
        }
        if(hang<n-1)diChuyenTrongMaTran(a, hang+1, cot);
        if(cot<k-1)diChuyenTrongMaTran(a, hang, cot+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            count=0;
            n=sc.nextInt();
            k=sc.nextInt();
            int [][]a= new int[n][k];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<k;j++)a[i][j]=sc.nextInt();
            }
            diChuyenTrongMaTran(a,0,0);
            System.out.println(count);
        }
    }
}
