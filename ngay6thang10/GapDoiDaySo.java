package ngay6thang10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GapDoiDaySo {
    private static  int n=0,k=0;
    private static int kq=0;

    public static void gapDoiDaySo(List<Integer> a,int i) {
        if(i==n+1){
            kq=a.get(k-1);
            return;
        }
        List<Integer> b = new ArrayList<>();
        b.addAll(a);
        b.add(i);
        b.addAll(a);
        gapDoiDaySo(b, i+1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
             n=sc.nextInt();
             k=sc.nextInt();    
            
            List<Integer> a = new ArrayList<>();
            a.add(1);
            gapDoiDaySo(a,2);
            System.out.println(kq);
        }
    }
}
