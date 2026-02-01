package com.nithin;

public class InvertedRAT2 {
    public static void main(String[] args){
        for (int i=5;i>=1;i--){
            for ( int j = i;j>=1;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
