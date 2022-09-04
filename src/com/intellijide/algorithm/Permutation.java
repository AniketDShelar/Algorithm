package com.intellijide.algorithm;

public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        int length = str.length();
        System.out.println("All possible permutation of String " +str+ "is " );
        generatePermutation(str,0,length);
    }
    public static String swapString(String str, int i, int j){
        char[] temp = str.toCharArray();
        char ch;
        ch = temp[i];
        temp[i] = temp[j];
        temp[j] = ch;
        return String.valueOf(temp);
    }
    public static void generatePermutation(String str,int start, int end){
        if(start == end-1){
            System.out.println(str);
        }else{
            for(int i = start; i < end; i++){
                str = swapString(str,start,i);
                generatePermutation(str,start + 1, end);
                str = swapString(str,start,i);
            }
        }
    }
}
