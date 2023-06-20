package ArrayProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate {
    
    public static void main(String[] args) {
         int [] arr = {1,5,4,2,1,4,7};
    //     Map<Integer, Integer> dup = new HashMap<>();

    //     for(int i=0;i<arr.length; i++){
    //         if(dup.containsKey(arr[i])){

    //            dup.put(arr[i],dup.get(arr[i]+1));

    // }
    // else{
    //      dup.put(arr[i], 1);
    // }
    //     System.out.println(dup);
        
    // }

    Set <Integer> dup = new HashSet<>();
     boolean isDuplicateExist = false;

     for(int i=0; i<arr.length; i++){
        if(dup.contains(arr[i])){
            isDuplicateExist=true;
            System.out.println("Duplicate Element "+ arr[i]);
        }else{
            dup.add(arr[i]);
        }
     }
     if(!isDuplicateExist){
        System.out.println(-1);
     }
    
}
}