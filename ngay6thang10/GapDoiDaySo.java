package ngay6thang10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GapDoiDaySo {

    public static int gapDoiDaySo(int n,int k) {
        int mid= (int) (Math.pow(2,n)/2)-1;
        if(k-1==mid){
            return n;
        }
        if(k-1<mid){
            return gapDoiDaySo(n-1, k);
        }else{
            return gapDoiDaySo(n-1, k-mid+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();    
            System.out.println(gapDoiDaySo(n, k));
        }
    }
}
