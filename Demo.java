package ArrayProblems;
public class Demo {
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5};
         int[] nums1 = new int[5];

         for(int i=2; i<nums.length; i=i+2){
           
                nums1[i] = nums[i];
                System.out.println(nums1[i]);
            }
           
         }

    }

