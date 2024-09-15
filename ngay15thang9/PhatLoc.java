package ngay15thang9;

import java.util.Scanner;

public class PhatLoc {
    private static int n;
    public static void phatLoc(String st,int so6,int so8)
    {
        if(st.length()==0)phatLoc("8", 0, 1);
        else if(st.length()==n)System.out.println(st);
        else if(st.length()==n-1)phatLoc(st+"6", so6+1, 0);
        else if(st.length()==n-2){
            if(so6>=2)phatLoc(st+"8", 0, 1);
            else {phatLoc(st+"6", so6+1, 0);
                if(so8==0){
                    phatLoc(st+"8", 0, 1);
                }
            }
            
        }
        else {
            if(so6<3){
                phatLoc(st+"6", so6+1, 0);
                
            }
            if(so8==0){
                phatLoc(st+"8", 0, 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        phatLoc("",0,0);
    }
}
