package ngay14thang9;
import java.util.*;
public class DatTen1 {
        private static Boolean check=false;
        public static void datTen1(int n,int k, int[] c,String []a) 
        {
            
           int i=k-1;
           while(i>=0&&c[i]==n-k+i+1)i--;
           if(i==-1){
            check=true;
            return;
           }
           c[i]++;
           for(int j=i+1;j<k;j++)
           {
             c[j]=c[j-1]+1;
           }
   
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            sc.nextLine();
            String a[]=sc.nextLine().split(" ");
            int c[]= new int[a.length];
            Set<String> b= new TreeSet<>();
            for(String aString:a)b.add(aString);
            int i=0;
            for(String bString:b)
            {
                a[i]=bString;
                c[i]=i+1;
                i++;
            }
            while (!check) {
                for( int m=0;m<k;m++)System.out.print(a[c[m]-1]+" ");
                System.out.println();
                datTen1(i,k,c,a);  
            }
        }
}
