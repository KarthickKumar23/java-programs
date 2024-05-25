import java.util.*;
class array2{
    public static void main(String[] ar){
     
        int arr[];
           arr= new int[5];
        arr[0]=65;
        arr[1]=66;
        arr[2]=67;
        arr[3]=68;
        arr[4]=69;
           //sum and average
        /* 

                int sum=0;
        int n=arr.length;
        int average=0;
       for(int i= 0;i<arr.length;i++){
                sum+=arr[i];
       }
       average = sum/n;
       System.out.println("averge = "+average);
       System.out.println("sum = "+sum);

      */

     
      //max and min value of array
     
      /* 

      int max=arr[0];

      for(int i= 0;i<arr.length;i++){
        if(arr[i]>max) max=arr[i];
      }
      System.out.println(max);

      int min=arr[0];
      for(int i= 0;i<arr.length;i++){
        if(arr[i]>min) min=arr[i];
      }
      System.out.println(min);


      */

      //Integer to char value
     /* 

      for(int i=0;i<arr.length;i++){
        char c=(char) arr[i];
        System.out.println(c);
            
      }  

      */

      //find the second largest and secon minimum
      /* 

      Arrays.sort(arr);
      int n=arr.length;
      System.out.println("largest 2 elements :"+ arr[n-2] +" "+arr[n-1]);
      System.out.println("largest 2 elements :"+ arr[0] +" "+arr[1]);
      
      */
       // Sorting
        
       /* 
       int[] b= {3,4,5,1};
       System.out.println("Before Sorting :"+Arrays.toString(b));
       Arrays.sort(b);
       System.out.println("After Sorting :"+Arrays.toString(b));


       */

    }
}