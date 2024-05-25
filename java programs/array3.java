class array3{
    public static void main(String[] ar){
        int[] arr={1,4,34,56,7};
        //int search_ele=90;
        int search_ele=56;
        boolean flag = false;
        int found=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search_ele){
               found =i;
               flag=true;
            }
            }
            if(flag==true){
                System.out.println(found);

            }else{
                System.out.println("-1");
            }
        
    }
}