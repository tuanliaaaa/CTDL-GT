package lamthem;

import java.util.Scanner;

public class selectedSort {
    public static void sapXepChon(int n,int []a)
    {
        int min,inxMin;
        for(int i =0;i<n-1;i++)
        {
            min=a[i];
            inxMin=i;
            for( int j=i+1;j<n;j++)
            {
                if(min>a[j]){
                    min=a[j];
                    inxMin=j;
                }
            }
            int temp=a[i];a[i]=a[inxMin];a[inxMin]=temp;
        }
        for(int i =0;i<n;i++) System.out.print(a[i]+" ");
        System.out.println();
    }
    public static void main(String h [])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] a = new int [n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        sapXepChon(n,a);
        sc.close();
    }
}
