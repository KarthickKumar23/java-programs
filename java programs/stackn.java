import java.util.*;
class stackn{
    public static void main(String[] args){
        Stack<Integer> n = new Stack<>();
        n.push(1);
        n.push(2);
        n.push(3);
       
        System.out.println(n.peek());
        System.out.println(n.size());
        System.out.println(n.pop());
        System.out.println(n.peek());
        ListIterator<Integer> it = n.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
          

        



    }
    
}