import java.util.*;



public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(30);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(0,50);
         System.out.println(l);
         System.out.println(l.contains(30));
         System.out.println(l.isEmpty());
         System.out.println(l.size());
         l.clear();
         System.out.println(l);
        
    }
    
}
