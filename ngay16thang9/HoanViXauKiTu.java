package ngay16thang9;

import java.util.Scanner;

public class HoanViXauKiTu {
    private static Boolean check=true;
    public static void hoanViXauKiTu(StringBuffer a) 
    {
        int i=a.length()-2;
        while(i>=-1&&a.charAt(i)>a.charAt(i+1)){
            i--;
            if(i==-1)
            {
                check=false;
                return;
            }
        }
        int j=a.length()-1;
        while(a.charAt(j)<a.charAt(i))j--;
        char temp =a.charAt(i);
        a.setCharAt(i, a.charAt(j));;
        a.setCharAt(j,temp);
        int r=i+1,g=a.length()-1;
        while(r<g)
        {
            temp =a.charAt(r);
            a.setCharAt(r, a.charAt(g));
            a.setCharAt(g, temp);
            r++;
            g--;
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            StringBuffer a= new StringBuffer(sc.nextLine());
            check=true;
            while(check){
                System.out.print(a+" ");
                hoanViXauKiTu(a);
            }
            System.out.println();
        }
    }
}
