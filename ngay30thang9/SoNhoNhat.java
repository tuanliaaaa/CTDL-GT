package ngay30thang9;

import java.util.Scanner;

public class SoNhoNhat {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            String a="";
            int count=0;
            int i=1;
            Boolean check=true;
            while(a.length()!=k&&i<10)
            {
                if(a.length()==1&&check){
                    i=0;
                    check=false;
                }
                if((k-a.length()-1)*9+count+i>=n)
                {
                    a=a+String.valueOf(i);
                    count+=i;
                }else{
                    i++;
                }
            }    
            System.out.println(a);
        }
    }
}
