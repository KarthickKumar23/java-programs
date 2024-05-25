import java.lang.*;
import java.util.*;
class arm{
    
        static boolean isArm(int n){
            int sum=0,last=0,digit=0;
            int temp=n;
        while(temp>0){
        temp=temp/10;
        digit++;

        }
        temp=n;
        while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digit));
            temp=temp/10;

        }
        if(sum==n){
        return true;}
        else{
        return false;
}}
    public static void main(String[] ar){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(isArm(a)){
            System.out.println("is armstrong");

        }else{
            System.out.println("not armstrong");
        }
    }
}