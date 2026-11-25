import java.util.HashMap;

public class Frequency {

    public static void Frequencycount(int [] k){
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int num:k){
            h.put(num,h.getOrDefault(num,0)+1);
        }
        System.out.println(h);
    }

    public static void FindDuplicate(int [] k){
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int num:k){
            if(h.containsKey(num)){
            System.out.println("Duplicate:"+num);
        }
        h.put(num,1);
       
    }
     System.out.println(h);
        
}
//print the first non repeating character

public static void Nonrep(String s){
    HashMap<Character,Integer> h = new HashMap<>();
    char[] ch = s.toCharArray();
    for(char num:ch){
        h.put(num,h.getOrDefault(num,0)+1);
    }
    System.err.println(h);
    for(char num:ch){
    if(h.get(num)==1){
        System.out.println(num);
        break;
       

    }
}

}
//two sum

public static void SummmTwo(int[] arr,int key){
    HashMap<Integer,Integer> h = new HashMap<>();

    for(int i =0;i<arr.length;i++){      
        int complement = key -arr[i];
        if(h.containsKey(complement)){
            System.out.println(h.get(complement)+" "+i);
            return;

        }
        h.put(arr[i],i);
    }
    System.out.println(h);


}
//count both arrays are equal
public static void EqualArrayscount(int [] k, int[] n){
        HashMap<Integer,Integer> h = new HashMap<>();
        HashMap<Integer,Integer> g = new HashMap<>();

        for(int num:k){
            h.put(num,h.getOrDefault(num,0)+1);

        }
         for(int one:n){
                g.put(one,g.getOrDefault(one,0)+1);

            }
        if(h==g){
            System.out.println("arrays are quals");
        }
        
    }

    //count pair with given sum

    public static void CountPairGiven(int[] arr, int key) {

    HashMap<Integer,Integer> h = new HashMap<>();
    int count = 0;

    for(int num : arr) {

        int comple = key - num;

        if(h.containsKey(comple)) {
            count += h.get(comple);
        }

        h.put(num, h.getOrDefault(num, 0) + 1);

    }
    System.out.println(h);

    System.out.println(count);
}
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,10,20};
        String s ="aabbcdde";
        Frequencycount(arr);
        FindDuplicate(arr);
        Nonrep(s);
        int[] nums={2,9,7,8};
        int key = 9;
        SummmTwo(nums, key);

        int[] arrr = {1, 5, 7, -1, 5};
        int target = 6;
        CountPairGiven(arrr, target);

        
        
    }
    
}
