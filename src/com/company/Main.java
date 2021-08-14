package com.company;
import java.util.*;
class Main {

    public static boolean isUgly(int n){
        if(n%2==0 || n%3==0 || n%5==0 || n==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of test cases: ");
        int numberOfCases = Sc.nextInt();
        Vector <Integer> cases = new Vector<>();
//        Vector <Integer> result = new Vector<>();

        System.out.println("Enter the test cases");
        for(int i = 0; i<numberOfCases; i++){
            cases.add(Sc.nextInt());
        }
        for(int i: cases){
            int count = 0;
            int res = 0;
            int j = 1;
            while (true){
                if(isUgly(j)){
                    count++;
                    res = j;
                }
                if(count == i){
                    System.out.println(res);
                    break;
                }
                j++;
            }
        }
    }
}