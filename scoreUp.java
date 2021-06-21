/*Credit to CodingBat.com
https://codingbat.com/prob/p180365

Question: AP-1 > scoreUp
The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, 
with "?" representing a question left blank. The two arrays are not empty and are the same length. Return the score for this array of answers, 
giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.

scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16

I strongly urge you not to copy as you will not learn by copying. The awnsers that I provide are strictly for learning purposes thus I added comments for 
you all to understand the purpose of each line.
Written by Abdulrahman Mendahawi.*/

public int scoreUp(String[] key, String[] answers) {
  //Creating a variable called score to store the value of the score so that we can return it later.
  int score = 0;
  //Creating a for loop statement that loops through all the items in the array.
  for(int i = 0; i < key.length; i++){
    //If statement checks if the value in the key and awnser are equal.
    if(key[i].equals(answers[i])){
      //If equal, than we add 4 points to the score.
      score += 4;
      //If the awnser is "?", we remove 0 points.
    } else if(answers[i].equals("?")){
      //Remove 0 points, we could also remove this line of code as it is not necessary.
      score -= 0;
      //If the top true statements are false(awnser is wrong) than we subtract a point from the score.
    } else {
      //Subctract one point.
      score -= 1;
    }
  }
  //We return the final score.
  return score;
}
