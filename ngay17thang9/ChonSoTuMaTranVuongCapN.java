package ngay17thang9;

import java.util.Arrays;
import java.util.*;

public class ChonSoTuMaTranVuongCapN {
    private static Boolean check=false;
    public static void chonSoTuMaTranVuongCapN(int n, int[] a)
    {
        int i=n-2;
        while(i>=-1&&a[i]>a[i+1]){
            i--;
            if(i==-1)
            {
                check=false;
                return;
            }
        }
        int j=n-1;
        while(a[j]<a[i])j--;
        int temp =a[i];a[i]=a[j];a[j]=temp;
        int r=i+1,g=n-1;
        while(r<g)
        {
            temp =a[r];a[r]=a[g];a[g]=temp;
            r++;
            g--;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [][]a= new int[n][n];
        int []b= new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
            b[i]=i+1;
        }
        check=true;
        List<List<Integer>> answerList= new ArrayList<>();
        while (check) 
        {
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=a[i][b[i]-1];
            }
            if(sum==k)
            {
                List<Integer> answer= new ArrayList<>();

                for(int i=0;i<n;i++){
                    answer.add(b[i]);
                }
                answerList.add(answer);
            }
            chonSoTuMaTranVuongCapN(n,b );
        }
        System.out.println(answerList.size());
        for(List<Integer> answer:answerList)
        {
            for(Integer i:answer)System.out.print(i+" ");
            System.out.println();
        }
    }
}
