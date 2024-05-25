import java.util.*;
class map1{
     public static void main(String[] args){
        Map<Integer,Integer>m=new HashMap<>();
        m.put(1,22);
       // m.put(2,new person("kk"));
    
        System.out.println(m.get(1));
        m.get(1);
    }
   static record person(String name){}
  }
    


