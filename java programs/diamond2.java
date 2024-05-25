class diamond2{
    public static void main(String[] ar){
        int i,j,k;
        for(i=1;i<=5;i++){
            System.out.println();
            for(j=1;j<=5-i;j++){
                System.out.print(" ");

            }
            for(k=1;k<=i*2-1;k++){
                System.out.print(j);
            }
        }
        for(i=5-1;i>0;i--){
            System.out.println();
            for(j=1;j<=5-i;j++){
                System.out.print(" ");

            }
            for(k=1;k<=i*2-1;k++){
                System.out.print(j);
            }
        }
    }
}