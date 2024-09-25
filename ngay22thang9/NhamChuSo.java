package ngay22thang9;

import java.util.Scanner;

public class NhamChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a= String.valueOf(sc.nextInt());
        String minA="",maxA="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='6')
            {
                minA+='5';
            }else{
                minA+=a.charAt(i);
            }
            if(a.charAt(i)=='5')
            {
                maxA+='6';
            }else{
                maxA+=a.charAt(i);
            }
        }
        String b= String.valueOf(sc.nextInt());
        String minB="",maxB="";
        for(int i=0;i<b.length();i++)
        {
            if(b.charAt(i)=='6')
            {
                minB+='5';
            }else{
                minB+=b.charAt(i);
            }
            if(b.charAt(i)=='5')
            {
                maxB+='6';
            }else{
                maxB+=b.charAt(i);
            }
        }
        System.out.println((Integer.valueOf(minA)+Integer.valueOf(minB))+" "+(Integer.valueOf(maxB)+Integer.valueOf(maxA)));

    }
}
