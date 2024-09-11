package lamthem;

import java.util.Scanner;

public class insertedSort {
    public static void sapXepChen(int n,int []a)
    {
        for(int i =0;i<n-1;i++)
        {
            int j=i+1;
            while(a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
                if(j==0)break;
            }
        }
        for(int i =0;i<n;i++) System.out.print(a[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] a = new int [n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        sapXepChen(n,a);
        sc.close();
    }
}
