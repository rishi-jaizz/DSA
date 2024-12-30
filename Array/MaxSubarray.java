package Array;

import java.sql.SQLOutput;

public class MaxSubarray {
    public static void maxSubarraySum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;


        for(int i=0; i<numbers.length;i++){
            for(int j=i;j<numbers.length; j++){
                currSum=0;
                for(int k=i; k<=j;k++){ //print
                    // Subarray Sum
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum = " +maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}
