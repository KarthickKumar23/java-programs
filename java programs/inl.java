import java.util.*;
public class inl {
   public static void main(String ar[]){

    int[] arr={5,14,3,2,1};
    int k=1;
    for(int i=1;i<=5;i++){
        int[] a=Arrays.copyOfRange(arr,0,i);
        Arrays.sort(a);
     if(k==1){
                System.out.println(a[0]);
            }
        if(k%2==0){
            if(k>1){
                System.out.println((a[k/2]+(a[k-1/2]))/2);
            }
       
        }if(k%2!=0&&k>2){
            System.out.println(a[k/2]);
        }
     k++;
    }

    }
}
