/*Credit to CodingBat.com
https://codingbat.com/prob/p173469

Question: Recursion-1 > array220
Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. 
We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. 
The initial call will pass in index as 0.

I strongly urge you not to copy as you will not learn by copying. The awnsers that I provide are strictly for learning purposes thus I added comments for 
you all to understand the purpose of each line.

Written by Abdulrahman Mendahawi.*/

public boolean array220(int[] nums, int index) {
  //If statement to check if the length of the array is less than or equal to 1 because if their is only 1 or less items in the 
  //array than we have to return false, no matter the value of the item.
  if(nums.length <= 1){
    //Return false.
    return false;
    //Else statement which functions if their is more than one item in the array.
  } else {
    //For loop which is used to loop through all the items in the array.
    for (index = 0; index < nums.length - 1; index++){
      //index + 1 is used to check the number next to the index, if it's equal to index * 10, then we return true.
      if (nums[index + 1] == nums[index]*10){
        //Return true.
        return true;
      }
    }
    //Return false if the value isnt times 10.
    return false;
  }
}
