package ngay22thang9;

import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a ={1000,500,200,100,50,20,10,5,2,1};
        int t=sc.nextInt();
        while (t-->0) 
        {
            int n=sc.nextInt();
            int dem=0,i=0;
            while(n!=0)
            {
                if(a[i]<=n)
                {
                    int m=n/a[i];
                    n-=a[i]*m;
                    dem+=m;
                }else i++;
            }    
            System.out.println(dem);
        }
    }
}
