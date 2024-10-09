package ngay9thang10;

import java.util.Scanner;

public class KyTuThuKTrongXau {
    
    public static int kyTuThuKTrongXau(int n,int k) {
        int mid= (int) (Math.pow(2,n)/2)-1;
        if(k-1==mid){
            return n;
        }
        if(k-1<mid){
            return kyTuThuKTrongXau(n-1, k);
        }else{
            return kyTuThuKTrongXau(n-1, k-mid+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();    
            System.out.println((char)(kyTuThuKTrongXau(n, k)+64));
        }
    }
}