package com;

public class PrefixSumCode {
    public static void main(String[] args){
        int[] arr = {2,5,8,10,25};

        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];

        for (int i =1;i<arr.length;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for (int i = 0;i<arr.length;i++){
            System.out.print(prefixSum[i] + " ");
        }
    }
}
