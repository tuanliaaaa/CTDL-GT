package ngay7thang10;

import java.util.Scanner;

public class SoFibonanceThuN {
    private static final Long l=1000000007L;
    public static Long dayXauFibonance(int a) {
        if(a==0)return 0L;
        if(a==1)return 1L;
        return (dayXauFibonance(a-2)%l+dayXauFibonance(a-1)%l)%l;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0)
        {
                System.out.println(dayXauFibonance(sc.nextInt()));
        }
    }
}