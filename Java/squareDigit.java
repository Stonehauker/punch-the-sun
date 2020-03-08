public class SquareDigit {

  public int squareDigits(int n) {
    String nString = String.valueOf(n);
    String resultString = "";System.out.println(nString);
    for (int i = 0; i < nString.length(); i++) {
      int y = nString.charAt(i)-'0'; //ASCII code magic
      int x = y*y;
      resultString = resultString + (String.valueOf(x));
      System.out.println(resultString);
    }
    return (Integer.parseInt(resultString));
  }
}

/*
  [Takes integer, turns every singular digit into its square and returns the concatenated string.]
  An interesting bit of work with the 'charAt' function; subtracting '0'
  from the ASCII code. Only works specifically Unicode languages.
*/
