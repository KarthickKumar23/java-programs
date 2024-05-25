import java.util.*;
class set1{
    public static void main(String[] args){
        Set<String> set= new HashSet<>();
        set.add("white");
        set.add("red"); 
        set.add("ink");
        set.forEach(System.out::println);
    }
}