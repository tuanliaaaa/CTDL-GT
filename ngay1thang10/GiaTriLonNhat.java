package ngay1thang10;

import java.util.Scanner;

public class GiaTriLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int t=sc.nextInt();
            if(t>0)sum+=t*2;
        }
        System.out.println(sum);
    }
}
