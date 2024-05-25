import java.util.*;
class kar{
    public static void main(String ar[]){
        ArrayList<Integer> a=new ArrayList<>();
            a.add(44);
            ArrayList<Integer> a1=new ArrayList<Integer>();
            a1.add(44);
            a1.add(4);
            a1.add(55);
            a1.add(66);
            a.addAll(a1);
            a.remove(1);
            a.lastIndexOf(77);
            a.set(2,88);
            String li=a.toString();
               Object[] arr=a.toArray();
               System.out.println(Arrays.toString(arr));



          }
}