import java.util.*;
import java.ArraysList;

class listv{
    public static void main(String[] args){
        List<String> color = new ArrayList();
        color.add("blue");
        color.add("red");
        System.out.println(color);
        System.out.println(color.size());
        for(String colors:color){
            System.out.println(colors);
        }
        
    }
}