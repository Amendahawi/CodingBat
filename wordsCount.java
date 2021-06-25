/*Credit to CodingBat.com
https://codingbat.com/prob/p124620

Question: AP-1 > wordsCount
Given an array of strings, return the count of the number of strings with the given length.

wordsCount(["a", "bb", "b", "ccc"], 1) → 2
wordsCount(["a", "bb", "b", "ccc"], 3) → 1
wordsCount(["a", "bb", "b", "ccc"], 4) → 0

I strongly urge you not to copy as you will not learn by copying. The awnsers that I provide are strictly for learning purposes thus I added comments for 
you all to understand the purpose of each line.

Written by Abdulrahman Mendahawi.*/

public int wordsCount(String[] words, int len) {
  //Create a integer called counter so we can keep track of the number of strings with the given length.
  int counter = 0;
  //Create a for loop so that we can loop through all the integers in the array.
  for (int i = 0; i < words.length; i++){
    //If statement to check if the length of the item is the same as the integer len.
    if(words[i].length() == len){
      //If valid (length is same as len), then we add 1 to counter.
      counter++;
    }
  }
  //Return the counter.
  return counter;
}
