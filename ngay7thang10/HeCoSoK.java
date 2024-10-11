package ngay7thang10;

import java.util.Scanner;

public class HeCoSoK {
    private static int charToValue(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else {
            return c - 'A' + 10;
        }
    }

    public static char valueToChar(int value) {
        if (value >= 0 && value <= 9) {
            return (char) (value + '0');
        } else {
            return (char) (value - 10 + 'A');
        }
    }
    public static String heCoSoK(String a,String b,int k)
    {
        String result="";
        int maxLen=Math.max(a.length(), b.length());
        if(maxLen==a.length())
        {
            int count=maxLen-b.length();
            for(int i=1;i<=count;i++)b="0"+b;
        }
        else{
            int count=maxLen-a.length();
            for(int i=1;i<=count;i++)a="0"+a;
        }
        int nho=0;
        for (int i = maxLen - 1; i >= 0; i--) {
            int digitSum = charToValue(a.charAt(i)) + charToValue(b.charAt(i)) + nho;
            result = valueToChar((digitSum % k)) + result;
            nho = digitSum / k;
        }

        if (nho > 0)
        result = nho + "" + result;

        return result;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int k=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(heCoSoK(String.valueOf(a),String.valueOf(b), k));
        }
 }   
}
