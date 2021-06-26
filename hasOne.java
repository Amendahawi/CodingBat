/*
Credit to CodingBat.com
https://codingbat.com/prob/p165941

Question: AP-1 > hasOne
Given a positive int n, return true if it contains a 1 digit. 
Note: use % to get the rightmost digit, and / to discard the rightmost digit.

hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
I strongly urge you not to copy as you will not learn by copying. The awnsers that I provide are strictly for learning purposes thus I added comments for 
you all to understand the purpose of each line.

Written by Abdulrahman Mendahawi.*/

public boolean hasOne(int n) {
  //Create a boolean value so that we can return it later.
  boolean bool = false;
  //Create a int so that we can store the value of the right most digit.
  int rightMost = 0;
  //Create a int so that we can store the number after we discard the right most digit.
  int discard = n/10;
  //Create an if statement to check if n equals 1 because we can automatically tell that the digit 1 is in the int.
  if (n == 1){
    //Set the boolean "bool" to true if the statement above is true.
    bool = true;
    //else statement if n is greater than the digit 1.
  }else{
    //Use a while that loops as long as all the numbers aren't discarded.
    while (discard != 0){
      //Calculate the rightmost digit by discard%10.
      rightMost = discard%10;
      //Discarding the number by performing discard/10.
      discard = discard/10;
      //Checking if the right most digit is 1.
      if(rightMost == 1){
        //Setting bool to true.
        bool = true;
      }
    }
 }
  //Returning bool at the end.
 return bool;
}
