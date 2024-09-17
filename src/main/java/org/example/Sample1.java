package org.example;

import java.util.HashMap;

public class Sample1 {

    public static String solve(String A) {
        StringBuilder sb = new StringBuilder();
        for (int i=A.length()-1;i>=0;i--){
            sb.append(A.charAt(i));
        }

        return sb.toString();
    }

    public static String solve1(String A){
        char [] arr=A.toCharArray();
        int i=0;
        int j=A.length()-1;

        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        return new String((arr));
    }

    //function to add 2 integers
    public static int solve3(int A, int B) {
        return A + B;
    }



    //program to detect prime number , divisible by 1 and only that number

    public static boolean solve5(int A){
        int count =0 ;
        for(int i=1;i<A;i++){
            if (A%i== 0 ){
                 count++;
            }
        }
        if (count >1) return false;
        return true;
    }

    //function to check if anagram or not

    public static boolean solve6(String A, String B){
        int N=A.length(), M=B.length();
        if (N!=M ) return false;

        HashMap<Character, Integer> hm= new HashMap<>();

        for (int i=0;i<N;i++){
            char c= A.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);
            }
            else {
                hm.put(c, 1);
            }
        }

        for (int i=0;i<N;i++){
            char c=B.charAt(i);
            if (hm.containsKey(c)){
                hm.put(c, hm.get(c)-1);
                if(hm.get(c)==0){
                    hm.remove(c);
                }
            }
            else {
                return false;
            }
        }
        if(hm.size()>0){
            return false;
        }
        return true;
    }

    //Program to check if number is pallindrome or not
    public static boolean solve7(int A){
        int temp= Math.abs(A);
        int rem= 0;
        int num=0;
        while (temp>0){
            num=num*10+ temp%10;
            temp=temp/10;
        }
        if (num==Math.abs(A)) return true;
        return false;
    }

    //Program to check if String pallindrome or not
    public static boolean solve8(String B){

        if (B.length()==1) return true;
        String A= B.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0;
        int j=A.length()-1;

        while (i<j){
            if (A.charAt(i)!=A.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }

    public static int fib(int N){
        if(N==0) return 1;
        if (N==1) return 2;
        return fib(N-1)+fib(N-2);
    }





    public static void main(String[] args) {
//        String A="Hello";
//        System.out.println(solve(A));
//
//        System.out.println("give some break bro ..  ");
//        System.out.println(solve1(A));
//
//
//        int n= 4;
//        System.out.println(solve5(n));
//
        String one= "aabbc";
        String two= "cbbaaA";

        System.out.println(solve6(one, two));

        System.out.println("is this pallindromic nubmer-- "+ solve7(123));


        String pal="A man a plan a canal Panama";

        System.out.println("Bro casually checking is string pallindrom --"+ solve8(pal));
    }
}
