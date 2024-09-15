package ngay15thang9;

import java.util.Scanner;

public class DatTen2 {
    private static Boolean check=true;
    public static void datTen2(int a[],int n,int k)
    {
        int i=k-1;
        while(i>=0&&a[i]==n-k+i+1)i--;
        if(i==-1){
            check=false;
            return;
        }
        a[i]++;
        for(int j=i+1;j<k;j++)a[j]=a[j-1]+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int n,k;
        while (t-->0) 
        {
            n=sc.nextInt();
            k=sc.nextInt();
            int a[]= new int[k];
            for(int i=0;i<k;i++)a[i]=i+1;
            check=true;
            while(check){
                for(int i=0;i<k;i++)System.out.print((char)((char)a[i]+64));
                System.out.println();
                datTen2(a,n,k); 
            }
        }
    }
}
