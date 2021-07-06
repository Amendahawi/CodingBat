/*Credit to CodingBat.com
https://codingbat.com/prob/p185685

Question: Array-1 > firstLast6
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false

I strongly urge you not to copy as you will not learn by copying. The awnsers that I provide are strictly for learning purposes thus I added comments for 
you all to understand the purpose of each line.

Written by Abdulrahman Mendahawi.*/

public boolean firstLast6(int[] nums) {
  //Find the last element (position of the last element is the length of the array - 1).
  int lastElement = nums[nums.length - 1];
  //Find the first element (position of first element is 0).
  int firstElement = nums[0];
  //Check if the last or first element is equal to 6.
  if (lastElement == 6 || firstElement == 6){
    //if statement above is true, then we return true.
    return true;
  } else {
    //if statement above is false, then we return false.
    return false;
  }
}
