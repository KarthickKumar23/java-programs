public class prime {
    static void checkPrime(int n)
    {
        int i ,m = 0,flag = 0;
        m =n/2;
        if(n==1||n==0){
            System.out.println(n+ "It is not a prime number");
            }
            else {
                for(i=2;i<=n;i++){
                 if (n%i==0) {
                    System.out.println(n+ "It is not a prime number");
                    flag=1;
                    break;
                 }
                }
                    if(flag==0) {
                    System.out.println(n+ " It is  a prime number");
                 }
                
            }
        
    }
        public static void main(String args[])
        {
            checkPrime(3);
        }
}
