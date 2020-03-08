public class Kata {
  public static String highAndLow(String numbers) {
    int high = 0;
    int low = 0;
    String[] numArray = numbers.split(" ");
    for(String i : numArray){//start for loop
      if (high == 0){high = Integer.parseInt(i);}
      if (low == 0){low = Integer.parseInt(i);}
      if (Integer.parseInt(i)>high){high = Integer.parseInt(i);}
      if (Integer.parseInt(i)<low){low = Integer.parseInt(i);}
    }//end for loop
    return high +" "+ low;
  }//end method
}//end class

/*
  [Takes a string of space seperated numbers and returns the highest and lowest numbers in a string.]
  Figured this one out pretty easily. Split the string, check the integer value while making sure the return variables have value.
*/

// THE VERSION BELOW IS THE BEST PRACTICE VERSION ON CODEWARS

import java.util.Arrays;

public class Kata {
    public static String HighAndLow(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .min()
                        .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .max()
                        .getAsInt();

        return String.format("%d %d", max, min);
    }
}

/*
  [This piece of code uses the Array.stream() method to analyze each seperated number and assigns the highest or lowest value in the stream as the respective value, and then returns a formatted string.]
  A useful example of .stream() and .format() 
*/
