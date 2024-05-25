class paliint{
    public static void main(String[] ar){
         int sum=0,rem=0;
         int n=232;
         int tem=n;
         while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;

         }
         if(sum==tem){
            System.out.println("pali");

         }else{
            System.out.println("not pali");
         }
    }
    
}