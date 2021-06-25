/*Credit to CodingBat.com
https://codingbat.com/prob/p183837

Question: AP-1 > wordsFront
Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.

wordsFront(["a", "b", "c", "d"], 1) → ["a"]
wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]

I strongly urge you not to copy as you will not learn by copying. The awnsers that I provide are strictly for learning purposes thus I added comments for 
you all to understand the purpose of each line.

Written by Abdulrahman Mendahawi.*/

public String[] wordsFront(String[] words, int n) {
  String[] values = new String[n];
  for(int i = 0; i < n; i++){
    values[i] = words[i];
  }
  return values;
}
