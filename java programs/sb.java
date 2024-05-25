class sb{
    public static void main(String[] ar){
        StringBuffer s=new StringBuffer("Welcome to Java class");
       // s.insert(5,456);
      // s.insert(5,true);
      //s.insert(5,23.333);
      //s.insert(5,'d');
     // char[] ch={'2','d','d','f'};
     // s.insert(5,ch);

    
    //   s.deleteCharAt(4);
     //  s.delete(3, 6);
    
     for(int i=0;i<s.length();i++){
        s.delete(i+1, i+2);
     }

        System.out.println(s);
    }
}