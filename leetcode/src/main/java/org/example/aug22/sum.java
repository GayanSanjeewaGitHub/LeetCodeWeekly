package org.example.aug22;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a_pointer = 0;
        int b_pointer  = numbers.length -1;


       while(a_pointer <= b_pointer){

           if (numbers[a_pointer] + numbers[b_pointer] ==target){
               return  new int[] {a_pointer +1 , b_pointer +1};
           } else if (numbers[a_pointer] + numbers[b_pointer]  < target) {
               a_pointer +=1;
           }else {
               b_pointer -=1;
           }
       }
        return  new int[] {a_pointer, b_pointer};

    }
}