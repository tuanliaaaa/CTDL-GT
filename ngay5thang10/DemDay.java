package ngay5thang10;

import java.util.Scanner;

public class DemDay {
    private static final Long MOD = 123456789L;
    public   static Long countWays(long n) {
        if(n==0)return 1L;
        Long result=0L;
        for(int i=0;i<n;i++){
            result=(result%MOD+countWays(i)%MOD)%MOD;
        }
        return (Long)(result % MOD);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            System.out.println(countWays(sc.nextInt()));
        }
    }
}
