package ngay6thang10;

import java.util.Scanner;

public class DayXauFibonance {
    public static String dayXauFibonance(int a) {
        if(a==1)return "A";
        if(a==2)return "B";
        return dayXauFibonance(a-2)+dayXauFibonance(a-1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int a=sc.nextInt();
            int k=sc.nextInt();
            System.out.println(dayXauFibonance(a).charAt(k-1));
        }    
    }
}