package ngay14thang9;

import java.util.Scanner;

public class SoThuTuToHop {
    public static int count=1;
    public static int []b;
    public static Boolean check=true;
    public static Boolean checkEqual(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])return false;
        }
        return true;
    }
    public static void soThuTuToHop(int n,int k, int []a)
    {
        int i=k-1;
        while(i>=0&&a[i]==n-k+i+1){
            i--;  
            if(i==-1)
            {
                check=false;
                return;
            }
        }
       a[i]++;
       for(int j=1+i;j<k;j++)
       {
        a[j]=a[j-1]+1;
       }
       if(checkEqual(a))
       {
        check=false;
        return;
       }
       count++;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t;
        int n,k;
        t=sc.nextInt();
        while(t-->0)
        {
            n=sc.nextInt();
            k=sc.nextInt();
            int []a = new int[k];
            b= new int[k];
            count=1;
            for(int i=0;i<k;i++){
                b[i]=sc.nextInt();
                a[i]=i+1;
            }
            check=true;
            if(!checkEqual(a))
            {
                count++;
                while(check)soThuTuToHop(n,k,a);
            }
            System.out.println(count);
        }
    }
}
