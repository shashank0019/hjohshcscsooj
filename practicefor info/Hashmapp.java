import java.util.*;

public class Hashmapp {

    
    public static void main(String[] args) {

        HashMap<Integer,String> h = new HashMap<>();
        h.put(1,"shashi");
        h.put(2,"king");
        h.put(4,"man");
        h.put(3,"maker");
        System.out.println(h);
        System.out.println(h.get(1));
        System.out.println(h.containsKey(1));
        System.out.println(h.containsValue("shash"));
        h.replace(4,"mmmm");
         System.out.println(h);
         System.out.println(h.keySet());
         System.out.println(h.values());
         h.clear();
         System.out.println(h);
        
    }
    
}
