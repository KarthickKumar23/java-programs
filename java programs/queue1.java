import java.util.*;
class queue1{

    public static void main(String[] args){

     LinkedList<person> lin=new LinkedList<>();
     lin.add(new person("vini",22));
     lin.add(new person("hari",21));
     System.out.println(lin.peek());
     ListIterator<person> it=lin.listIterator();
     while(it.hasNext()){
        System.out.println(it.next());
     }
    }

        private static void queue() {
            
        
        Queue<person> h=new LinkedList<>();
         h.add(new person("karthick",21));
         h.add(new person("kishan",21));
         h.add(new person("syed",21));
        System.out.println(h.peek());
        System.out.println(h.poll());
        System.out.println(h.peek());
        

    }
        static record person(String name,int n){}
    
}