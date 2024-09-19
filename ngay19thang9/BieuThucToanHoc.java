package ngay19thang9;
import java.util.*;
public class BieuThucToanHoc {
    private static Boolean check=false;
    public static void bieuThucToanHoc(int[] a,int sum,Boolean[] checkes)
    {
        if(sum==23)
        {
            Boolean l = true;
            for(int i=0;i<checkes.length;i++){
                if(!checkes[i]){
                    l=false;
                    break;
                }
            }
            if(l)check=true;
            return;
        }
        for(int i=0;i<checkes.length;i++){
            if(!checkes[i]){
               Boolean [] checkl = new Boolean[checkes.length];
               for(int j=0;j<checkes.length;j++)checkl[j]=checkes[j];
               checkl[i]=true;
               bieuThucToanHoc(a, sum+a[i], checkl);
               bieuThucToanHoc(a, sum*a[i], checkl);
               bieuThucToanHoc(a, sum-a[i], checkl);

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc. nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String []n= sc.nextLine().split(" ");   
            int []a = new int[n.length];
            check=false;
            Boolean [] checkes= new Boolean[n.length];
            for(int i=0;i<n.length;i++)
            {
                a[i]=Integer.parseInt(n[i]);
                checkes[i]=false;
            }
            bieuThucToanHoc(a,0,checkes);    
            if(check)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
