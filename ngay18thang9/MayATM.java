package ngay18thang9;
import java.util.Scanner;

public class MayATM {
    private static int n;
    private static int min=100000;
    public static void mayATM(int[] a,int sum,int so,int sohang)
    {
        if(sum==0){
            min=Math.min(min,so);
        }else
        for(int i=sohang+1;i<n;i++)
        {
           
                int x=sum-a[i];
                if(x>=0){
                    mayATM(a, x, so+1, i);
                }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0)
        {
            n=sc.nextInt();
            int k=sc.nextInt();
            int []a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            mayATM(a,k,0,0);
            System.out.println(min);
        }
    }
}
