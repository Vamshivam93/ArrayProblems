package ArrayProblems;

public class FindPairs {
    int[] arr = {1,2,3,4,5,6,7};
    int sum =9;

    int a= 0;
    int b= arr.length-1;

    while(low<high){
        if((arr[a]+arr[b])>sum){
            b--;
        }
        else if(arr[a]+arr[b]<sum){
            a++;
        }else if(arr[a]+arr[b]==sum){
            System.out.println("pair("+arr[a]+","+arr[b]+")");
            b--;
            a++;
        }
    }
}
