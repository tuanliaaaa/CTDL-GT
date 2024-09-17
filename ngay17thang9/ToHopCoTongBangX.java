package ngay17thang9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToHopCoTongBangX {
    private static int n;
    public static void toHopCoTongBangX(int[] a,int sum,List<Integer> c)
    {
        if(sum==0){
            System.out.print("[");
            for(Integer i:c)System.out.print(i+" ");
            System.out.print("] ");
        }else
        for(int i=0;i<n;i++)
        {
            if(c.size()==0)
            {
                int x=sum-a[i];
                if(x>=0){
                    List<Integer> l= new ArrayList<>();
                    l.addAll(c);
                    l.add(a[i]);
                    toHopCoTongBangX(a, x, l);
                }
            }else if(a[i]>=c.get(c.size()-1)){
                int x=sum-a[i];
                if(x>=0){
                    List<Integer> l= new ArrayList<>();
                    l.addAll(c);
                    l.add(a[i]);
                    toHopCoTongBangX(a, x, l);
                } 
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            n=sc.nextInt();
            int k=sc.nextInt();
            int []a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }   
            toHopCoTongBangX(a,k,new ArrayList<>());
        }
    }
}
