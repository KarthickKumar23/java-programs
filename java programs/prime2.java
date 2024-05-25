class prime2{
    public static void main(String[] ar){
        int n=7;
        int m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.print("it is not prime");
        }else{
         for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("it is not prime");
                flag=1;
                break;
            }
            }
            if(flag==0){
                System.out.println("it is prime");
            }
         }
    }
}