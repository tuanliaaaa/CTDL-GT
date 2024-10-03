package ngay1thang10;

import java.util.Scanner;

public class SoMayMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int []a={0,4,8,12,16,20,24};
        while (t-->0)
        {
           int n=sc.nextInt();
           Boolean check=false;
           int i;
           for( i=0;i<a.length;i++)
           {
               if((n-a[i])%7==0&&n-a[i]>=0){
                check=true;
                break;
               }
           }
           if(!check)System.out.println(-1);
           else {
            for(int j=0;j<i;j++)System.out.print("4");
            for(int j=0;j<(n-a[i])/7;j++)System.out.print("7");
            System.out.println();
           }
        }
    }
}
