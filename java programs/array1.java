import java.io.*;
import java.util.Arrays;

class array1{
    public static void main(String[] ar){
        int[] a= new int[]{1,2,3,6,5};
        int[] b= new int[10];

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //toString()
       System.out.println(Arrays.toString(a));
         //arraycopy
        System.arraycopy(a,1,b,4,3);
        
        System.out.println(Arrays.toString(b));
        //sorting
       Arrays.sort(a);
       System.out.println(Arrays.toString(a));
       //copyOf
       int[] copy=Arrays.copyOf(a, 7);
       System.out.println(Arrays.toString(copy));
       //copyOfRange
       int[] range=Arrays.copyOfRange(a, 1, 4);
       System.out.println(Arrays.toString(range));
       //Arrays.equalsOf
       System.out.println(Arrays.equals(a,b));
       
    }
}