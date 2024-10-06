package ngay5thang10;

import java.util.Scanner;

public class DemDay {
    private static Long l=1000000007L;
    public static Long demDay(Long n,Long k) {
        if(k==0)return 1L;
        Long m=demDay(n, k/2)%l;
        Long p=(m*m)%l;
        if(k%2==0)return p;
        else return (p*(n%l))%l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            System.out.println(demDay(2L,sc.nextLong()-1));
        }
    }
}
