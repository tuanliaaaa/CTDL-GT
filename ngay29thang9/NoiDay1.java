package ngay29thang9;
import java.util.*;;
public class NoiDay1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t= sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int []a= new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int sum=0;
             while (n > 1) {
                Arrays.sort(a, 0, n);
                
                int first = a[0];
                int second = a[1];
                
                int newLength = first + second; 
                sum += newLength;        
                
                a[0] = newLength;
                for (int i = 1; i < n - 1; i++) {
                    a[i] = a[i + 1];
                }
                
                n--; 
            }
            
            System.out.println(sum);
        }
    }
}
