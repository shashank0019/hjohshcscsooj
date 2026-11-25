import java.util.HashMap;
import java.util.HashSet;

public class HashProblems {

    //majority element means
    public static void majorityEekment(int[] arr){
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int num: arr){
            h.put(num,h.getOrDefault(num, 0)+1);
        }
        System.out.println(h);
        int max =0;
        int maj =-1;

        for(int hum :h.keySet()){
           if(h.get(hum)>max){
            max =h.get(hum);
            maj =hum;
           }


        }
        if (max >=arr.length / 2) {
            System.out.println("Majority Element: " + maj);
            System.out.println("Frequency: " + max);
        } else {
            System.out.println("No Majority Element");
        }

    }

    // read again it means the how many sequence of elememts are there check by using hashset and first check if num --1 is there if it is there that is the starting point
    //the how many sequences are there by incresing count 
    public static void LongConsecutivesequences(int [] arr){
        HashSet<Integer> h = new HashSet<>();
        
        for(int num:arr){
            h.add(num);

        }
        int max =0;
        
        for(int num: h){
            if(!h.contains(num-1)){
                int count =1;
                int curr = num;
                while(h.contains(curr+1)){
                    count++;
                    curr++;
                }
                if(count>max){
                    max = count;
                }

                
            }
        }
        System.out.println(max);

        
    }
    public static void SubarraySumK(int[] arr, int k) {

    HashMap<Integer, Integer> h = new HashMap<>();

    int sum = 0;
    int count = 0;

    h.put(0, 1);

    for (int num : arr) {

        sum += num;

        int comple = sum - k;

        if (h.containsKey(comple)) {
            count += h.get(comple);
        }

        h.put(sum, h.getOrDefault(sum, 0) + 1);
    }

    System.out.println("Subarray count: " + count);
}
    public static void main(String[] args) {
        int[] arr ={5,3,3,2,1,3,2,2,6,2,2};
        int [] num={4,2,6,1,5,3,100};
        majorityEekment(arr);
        LongConsecutivesequences(num);
         int[] arr2 = {2, 1, 4, 3, 2};
    SubarraySumK(arr2, 7);
        
    }
    
}
