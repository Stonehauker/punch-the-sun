import java.util.Arrays;

public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    for (int i=0; i<words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }//end stringBuilder if
    }//end for
    return String.join(" ",words);
  }
}

/*
  [Takes a string, and reverses each word that is longer than five characters, and returns the entire string.]
  A more refined version of the code I actually did. This one utilizes StringBuilder to reverse the parts of the string, but instead of building a new string, simply reverses the words in place.
*/
