package ngay16thang9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LietkeToHop {
    private static Boolean check=false;
    public static void lietkeToHop(int []b,int n,int k) 
    {
        int i=k-1;
        while(i>=0&&b[i]==n-k+i+1){
            i--;
            if(i==-1){
                check=true;
                return;
            }
        }
        b[i]++;
        for(int j=i+1;j<k;j++)b[j]=b[j-1]+1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int []a= new int [n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int []b= new int[n];
        int dem=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1]){
                a[dem]=a[i];
                b[dem]=dem+1;
                dem++;
            }
        }
        if(a[n-2]!=a[n-1]){
            a[dem]=a[n-1];
            b[dem]=dem+1;
            dem++;
        }
        check=false;
        while(!check)
        {
            for(int i=0;i<k;i++)System.out.print(a[b[i]-1]+" ");
            System.out.println();
            lietkeToHop(b,dem,k);
        }

    }
}
